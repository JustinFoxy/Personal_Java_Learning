package Map;

import java.util.HashMap;
import java.util.Map;

//Map 的遍历方式（三种经典写法）
public class Three_types_of_Map {
    public static void main(String[] args) {
        //HashMap
        Map<String,String> map = new HashMap<>();
        map.put("Justin","abc123");
        map.put("UwU","1145");
        map.put("Alice", "123456");

        //遍历方式 1：用 keySet() 拿 key，再 get() 值
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " 的密码是：" + value);
        }
        System.out.println();

        // 遍历方式 2：用 entrySet() 一次拿出 key 和 value（推荐 ✅）
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " 的密码是：" + value);
        }

        //遍历方式 3：用 Lambda 表达式（简洁现代）
        map.forEach((key, value) -> {
            System.out.println(key + " 的密码是：" + value);
        });
    }
}
