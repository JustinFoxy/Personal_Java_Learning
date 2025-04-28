package Exception.Exception_03;

public class Main {
    public static void main(String[] args) {
        DoorChecker dc = new DoorChecker();
        try {
            dc.checkDoorIsLocked();
        } catch (Exception e) {
            System.out.println("发生异常：" + e.getMessage());
        }
        System.out.println("程序继续执行...");

    }
}
