package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//放进去 5 个喜欢的水果 🍎🍉🍊🍇🍌,然后依次：打印所有水果、修改第3个水果、删除第5个水果、输出剩下的水果数量
public class FruitList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("strawberry");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("pear");

        //打印所有水果
        System.out.println("我喜欢的水果有：" + fruits);
        //修改第3个水果
        fruits.set(2, "🍌");
        //删除第5个水果
        fruits.remove(4);
        //输出剩 下的水果数量
        System.out.println("剩下的水果数量:" + fruits.size());

        //第一种遍历
        System.out.print("第一种遍历:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
        System.out.println();


        //第二种遍历
        System.out.print("第二种遍历:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        //第三种遍历
        System.out.print("第三种遍历:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.print(fruit + " ");
        }
    }
}
