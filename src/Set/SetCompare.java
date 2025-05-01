package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCompare {
    public static void main(String[] args) {
        String[] items = {"A", "B", "O", "B", "G", "O", "P"};
        // HashSet：无序、去重
        Set<String> HashSet = new HashSet<>();
        // LinkedHashSet：有顺序、去重
        Set<String> LinkedHashSet=new LinkedHashSet<>();
        // TreeSet：自动排序、去重
        Set<String> TreeSet=new TreeSet<>();
        // 把数据放进三个Set里
        for (String item:items){
            HashSet.add(item);
            LinkedHashSet.add(item);
            TreeSet.add(item);
        }

        // 输出结果
        System.out.println("🔹 HashSet（无序、去重）：" + HashSet);
        System.out.println("🔹 LinkedHashSet（保留顺序、去重）：" + LinkedHashSet);
        System.out.println("🔹 TreeSet（自动排序、去重）：" + TreeSet);

    }
}
