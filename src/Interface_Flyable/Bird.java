package Interface_Flyable;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("鸟儿在空中展翅翱翔");
    }
}
