package proxy.ex2;

public class Main {
    public static void main(String[] args) {
        Photo photo=new ProxyPhoto("image.png");
        System.out.println("\nUser opens photo: ");
        photo.display();
        System.out.println("\nUser opens photo again:");
        photo.display();
    }
}
