
from typing import TypeVar, Generic, Optional

T = TypeVar('T')

class Node(Generic[T]):
    def __init__(self, data: T):
        self.data = data
        self.next:Optional['Node[T]'] = None
        self.prev:Optional['Node[T]'] = None


