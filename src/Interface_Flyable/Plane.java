package Interface_Flyable;

public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞机利用发动机和滑翔翼在天空中飞行");
    }
}
