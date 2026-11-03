public class Bicycle {
    private int wheel = 2;
    private String seat;

    public void move(){
        IO.println(String.format("Go! Let's Go!!"));
    }

    public void stop(){
        IO.println(String.format("Break...."));
    }
}
