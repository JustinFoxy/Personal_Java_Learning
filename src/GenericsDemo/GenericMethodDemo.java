package GenericsDemo;

public class GenericMethodDemo {

    // 定义范型方法
    //	<T> 写在方法名前，表示这是一个泛型方法；

    //  <T> 放在方法返回类型前面是告诉Java编译器：“从这里开始我要用一个叫 T 的类型变量，请记住它是泛型。”
    public static <T> void printItem(T item) {
        if (item == null) {
            System.out.println("打印的内容是：null");
        } else {
            System.out.println("打印的内容是：" + item.toString());
        }
    }

    public static void main(String[] args) {
        //打印输出
        printItem("Hello 泛型方法！");
        printItem(123);
        printItem(3.14);
        printItem(true);
        printItem(null);
    }
}