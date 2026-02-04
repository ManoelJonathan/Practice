package Lists.PlayerMusic;

public class Player {
    Node<String> musicNode;
    DoubleLinkedList<String> playlist = new DoubleLinkedList<>();

    public void addMusic(String name) {
        Node<String> music = new Node<>(name);
        playlist.append(music);
    }

    public void play() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist vazia!");
            return;
        }

        /*
         * while (musicNode != null) {
         * System.out.println("Tocando agora" + musicNode.data);
         * try {
         * Thread.sleep(2000);
         * } catch (InterruptedException e) {
         * System.out.println("Opa, Playes interrompido");
         * }
         * musicNode = musicNode.next;
         * }
         */

        musicNode = this.playlist.head;
        System.out.println("▶s Play: " + musicNode.data);
    }

    public void next() {
        if (playlist.isEmpty())
            return;

        if (musicNode.next != null) {
            setMusicNode(musicNode.next);
        } else {
            musicNode = playlist.head;
        }
        System.out.println("⏭ Next: " + musicNode.data);

    }

    public void previous() {
        if (playlist.isEmpty())
            return;

        if (musicNode.prev != null) {
            setMusicNode(musicNode.prev);
        } else {
            musicNode = playlist.tail;
        }
        System.out.println("⏮ Previous: " + musicNode.data);

    }

    public Node<String> getMusicNode() {
        return musicNode;
    }

    public void setMusicNode(Node<String> musicNode) {
        this.musicNode = musicNode;
    }

}
