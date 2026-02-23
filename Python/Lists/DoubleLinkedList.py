from typing import TypeVar, Generic, Optional
from Node import Node

T = TypeVar('T')

class DoubleLinkedList(Generic[T]):
    def __init__(self):
        self.head: Optional[Node[T]] = None
        self.tail: Optional[Node[T]] = None
        self.lenght: int = 0
    

    def isEmpty(self) -> bool:
        return self.lenght == 0


    def prepend(self, node : Node):
        if(self.isEmpty()):
            self.head = node
            self.tail = node
            self.lenght+=1
            return
            
        node.next = self.head
        self.head.prev = node

        node.prev = None
        self.head = node
        self.lenght += 1
        return

    def append(self, node: Node):
        if (self.isEmpty()):
            self.head = node
            self.tail = node
            self.lenght+=1
            return
            
        node.prev = self.tail
        self.tail.next = node

        node.next = None
        self.tail = node
        self.lenght+=1
        return
    
    def insertAt(self, node: Node, index : int):
        if(index > self.lenght):
            print("This index does not exist")
            return
        
        if(index == 1):
            self.prepend(node)
            return
        
        if(index == self.lenght):
            self.append(node)
            return
        
        curr = self.head
        lenghtIndex = 1

        while(curr.next != None):
            if(index == lenghtIndex + 1):
               curr.next.prev = node
               node.prev = curr
               node.next = curr.next
               curr.next = node
               self.lenght += 1
               return

            curr = curr.next            
            lenghtIndex += 1

    def removeFirst(self):
        if(self.isEmpty()):
            print("This list is empty")
            return
        
        if(self.lenght == 1):
            self.head = None
            self.tail = None
            self.lenght -= 1
            return
        
        self.head = self.head.next
        self.head.prev = None
        self.lenght -= 1
        return
    
    def removeLast(self):
        if(self.isEmpty()):
            print("This list is empty")
            return
        
        if(self.lenght == 1):
            self.head = None
            self.tail = None
            self.lenght -= 1
            return
        
        self.tail = self.tail.prev
        self.tail.next = None
        self.lenght -= 1
        return
    
    def removeAt(self, index : int):
        if(self.isEmpty()):
            print("This list is empty")
            return
        
        if (index == 1):
            self.removeFirst()
            return

        if( index == self.lenght):
            self.removeLast()
            return

        curr = self.head
        lenghtIndex = 1

        while(curr.next != None):
            if(index == lenghtIndex+1):
               curr.next = curr.next.next
               curr.next.prev = curr
               self.lenght -= 1
               return
            
            curr = curr.next
            lenghtIndex += 1


    def remove(self, node: Node):
        if(self.isEmpty()):
            print("This list is empty")
            return
        
        if(node == self.head):
            self.removeFirst()
            return
        
        if(node == self.tail):
            self.removeLast()
            return
        
        node.prev.next = node.next
        node.next.prev = node.prev
        self.lenght -= 1
        return
    

    def printList(self):
        if self.isEmpty():
            print("This list is empty")

        curr  = self.head

        print("Going")
        while(curr != None):
            print(f"{curr.data}", end="")
            if(curr.next == None):
                print(" <-> END")
            else:
                print(" <-> ", end="")
            curr = curr.next
        
        print("")
        last = self.tail
        print("Returning")
        while(last != None):
            print(f"{last.data}", end="")
            if(last.prev == None):
                print(" <-> END")
            else:
                print(" <-> ", end="")
            last = last.prev
        
        print(f"Tamanho total: {self.lenght}")

        

    
    



