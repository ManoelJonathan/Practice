from Player import Player

if __name__ == "__main__":
    p = Player()
    p.addMusic("2025")
    p.addMusic("back sit")
    p.addMusic("No pole")

    p.play()

    print("\n Advancing")
    p.next()
    p.next()

    print("\n Returning")
    p.previous()