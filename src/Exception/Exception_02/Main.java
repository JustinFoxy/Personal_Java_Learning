package Exception.Exception_02;

public class Main {
    public static void main(String[] args) {
        TheAgeChecker checker = new TheAgeChecker();
        try {
            checker.checkAge();
        } catch (Exception e) {
            System.out.println("发生异常：" + e.getMessage());
        }

        System.out.println("程序继续执行...");

    }
}
