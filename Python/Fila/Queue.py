from typing import Generic, Optional, TypeVar
from Node import Node
T = TypeVar("T")

class Queue(Generic[T]):

    def __init__(self):
        self.head:Optional['Node[T]'] = None
        self.tail:Optional['Node[T]'] = None
        self.length = 0
    
    def isEmpty(self) -> bool:
        return self.head is None
    

    def enqueue(self, data : T):
        node = Node(data)

        if(self.isEmpty()):
            self.head = node
            self.tail = node
            self.length += 1
            return
        
        self.tail.next = node
        self.tail = node
        self.length += 1
        return
    
    def dequeue(self) -> T:
        if(self.isEmpty()):
            print("This queue is empty")
            return None
        nodeData = self.head.data
        if(self.length == 1):
            self.head = None
            self.tail = None
            self.length -= 1
            return nodeData
        
        self.head = self.head.next
        self.length -= 1
        return nodeData
    
    def peek(self) -> T:
        if(self.isEmpty()):
            print("This queue is empty")
            return None

        nodeData = self.head.data
        return nodeData