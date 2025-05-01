package List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //
        List<String> students = new ArrayList();
        students.add("小明");
        students.add("小张");
        students.add("小红");

        //输出ArrayList中的全部内容
        System.out.println(students);

        //取出第一个学生
        System.out.println("第一个学生是：" + students.get(0));
        // 修改第二个学生的名字
        students.set(1, "小丽");
        System.out.println("修改后：" + students.get(1));
        //删除第三个学生
        students.remove(2);
        System.out.println("删除后：" + students);
        // 查询集合大小
        System.out.println("当前学生人数：" + students.size());
    }
}
