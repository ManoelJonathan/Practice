from DoubleLinkedList import DoubleLinkedList
from Node import Node

class Player:
    def __init__(self):
        self.playlist = DoubleLinkedList[str]()
        self.musicNode = None

    def addMusic(self, name: str):
        music = Node(name)
        self.playlist.append(music)
    
    def play(self):
        if(self.playlist.isEmpty()):
            print("This playlist is empty")
            return
        
        self.musicNode = self.playlist.head
        print(f"▶ Play: {self.musicNode.data}" )

    def next(self):
        if(self.playlist.isEmpty()):
            print("This list is empty")
            return
        
        if(self.musicNode.next != None):
            self.musicNode = self.musicNode.next
        else:
            self.musicNode = self.playlist.head
        
        print(f"Next music is: {self.musicNode.data}")

    def previous(self):
        if(self.playlist.isEmpty()):
            print("This list is empty")
            return

        if(self.musicNode.prev != None):
            self.musicNode = self.musicNode.prev
        else:
            self.musicNode = self.playlist.tail

        print(f"Previous music is: {self.musicNode.data}")
     

    def setMusic(self, musicNode: Node):
        self.musicNode = musicNode
    
    def getMusic(self):
        return self.music.data


