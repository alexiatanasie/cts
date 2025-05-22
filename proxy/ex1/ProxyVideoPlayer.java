package proxy.ex1;

public class ProxyVideoPlayer implements IVideoPlayer{
    private String name;
    private RealVideoPlayer realVideoPlayer;

    public ProxyVideoPlayer(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        if(realVideoPlayer==null){
            realVideoPlayer=new RealVideoPlayer(name);
        }
        realVideoPlayer.play();
    }
}
