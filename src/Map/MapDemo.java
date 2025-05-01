package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //最常用的 Map 实现类：HashMap:最常用，键不能重复，值可以重复，查找快
        Map<String, String> userMap = new HashMap<>();
        // 添加数据：用户名 ➜ 密码
        userMap.put("Alice", "123456");
        userMap.put("Ben", "abc123");
        userMap.put("Justin", "abc123");
        //输出整个Map
        System.out.println("输出整个Map: "+userMap);
        // 查找某个用户的密码
        String pwd = userMap.get("Justin");
        System.out.println("Justin's password is: " + pwd);
        // 修改密码
        userMap.put("Justin","newpwd");
        //重新get一下新的密码（刷新）
        System.out.println("Justin's new password now is: " + userMap.get("Justin"));
        // 删除用户
        userMap.remove("Ben");
        System.out.println(userMap);

        // 获取所有用户名（key）
        System.out.println("所有用户名：" + userMap.keySet());
        // 获取所有密码（value）
        System.out.println("所有密码：" + userMap.values());

    }
}
