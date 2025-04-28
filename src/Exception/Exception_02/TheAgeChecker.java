package Exception.Exception_02;

import java.util.Scanner;

public class TheAgeChecker {
    public void checkAge() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的年龄：");
        int age = scanner.nextInt();
        if (age <= 18) {
            throw new Exception("你没有年满18周岁，禁止进入！");
        }
        System.out.println("欢迎进入成年人的世界！");
    }
}
