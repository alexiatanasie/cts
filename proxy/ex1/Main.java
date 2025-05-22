package proxy.ex1;

public class Main {
    public static void main(String[] args) {
        IVideoPlayer player=new ProxyVideoPlayer("m.mp4");
        player.play();
        player.play();
    }
}
