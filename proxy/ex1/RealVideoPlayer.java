package proxy.ex1;

public class RealVideoPlayer implements IVideoPlayer{

    private String name;

    public RealVideoPlayer(String name) {
        this.name = name;
    }
    private void loadVideoFromDisk(){
        System.out.println("loading video file: "+name);
    }
    @Override
    public void play() {
        System.out.println("playing video: "+name);

    }
}
