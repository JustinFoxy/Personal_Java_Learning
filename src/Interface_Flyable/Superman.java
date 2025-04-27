package Interface_Flyable;

public class Superman implements Flyable, Runnable {
    @Override
    public void fly() {
        System.out.println("超人利用超能力飞行");
    }

    @Override
    public void run() {
        System.out.println("超人用双腿快速的奔跑");
    }
}
