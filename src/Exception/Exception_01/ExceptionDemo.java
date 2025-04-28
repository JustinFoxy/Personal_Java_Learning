package Exception.Exception_01;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.print("请输入2个数字：");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            int result = a / b;  // 这里会出现分母为0的异常
            System.out.println(a + "/" + b + "的结果是：" + result);
        } catch (Exception e) {
            System.out.println("出错了！");
        }
        System.out.println("这一条语句就算报错也依然执行");
        sc.close();
    }
}