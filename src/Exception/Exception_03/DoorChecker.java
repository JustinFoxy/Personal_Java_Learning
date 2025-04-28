package Exception.Exception_03;

public class DoorChecker {
    public void checkDoorIsLocked() throws Exception {
        boolean doorIsOpen = true;
        if (doorIsOpen) {
            throw new Exception("门没锁住，数据不安全！");
        }
        System.out.println("门锁住了");
    }
}
