from typing import TypeVar,Generic, Optional
from Node import Node

T = TypeVar('T')
class Stack(Generic[T]):

    def __init__(self):
        self.topo:Optional[Node[T]] = None
        self.length = 0    

    def isEmpty(self) -> bool:
        return self.topo is None
    
    def push(self, data:T):
        newNode = Node(data)
        if(self.isEmpty()):
            self.topo = newNode
            self.length += 1
            return
        
        newNode.next = self.topo
        self.topo = newNode
        self.length += 1
        return
    
    def pop(self) -> T:
        if (self.isEmpty()): return None

        nodeData = self.topo.data
        self.topo = self.topo.next
        self.length -= 1
        return nodeData

    def peek(self) -> T:
        if(self.isEmpty()): return None
        nodeData = self.topo.data
        return nodeData 