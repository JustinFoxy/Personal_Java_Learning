package Exception.Exception_03;

public class DoorChecker {
    //先声明这个checkDoorIsLocked方法是要抛出异常的throws Exception（会报警，中止后面的代码运行）
    public void checkDoorIsLocked() throws Exception {
        boolean doorIsOpen = true;
        if (doorIsOpen) {
            throw new Exception("门没锁住，数据不安全！");
        }
        System.out.println("门锁住了");
    }
}
