package Set;


import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        //  HashSet 去重
        Set<String> fruits = new HashSet<>();
        fruits.add("🍎");
        fruits.add("🍌");
        fruits.add("🍊");
        fruits.add("🍎");  // 重复添加！
        fruits.add("🍌");
        System.out.println(fruits);
    }

}
