package Interface_Flyable;

public class Main {
    public static void main(String[] args) {
        /*
        //利用接口实例化对象plane和bird
        Flyable plane = new Plane();
        Flyable bird = new Bird();
        //调用各自的fly方法
        plane.fly();
        bird.fly();
         */

        Flyable[] flyable = {new Plane(), new Bird(),new Superman()};
        for (Flyable f : flyable) {
            f.fly();
        }

        Runnable[] runnable = {new Superman()};
        for (Runnable r : runnable) {
            r.run();
        }
    }
}
