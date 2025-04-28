package Exception.Exception_01;

public class Main {
    public static void main(String[] args) {
        BoilWater bw = new BoilWater();
        try {
            bw.boilWater();
        } catch (Exception e) {
            System.out.println("出错了：" + e.getMessage());
        }
        System.out.println("程序继续运行...");
    }
}
