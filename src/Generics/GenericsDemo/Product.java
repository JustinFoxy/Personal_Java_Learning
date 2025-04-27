package Generics.GenericsDemo;

public class Product {
    //初始化名字和价格
    private String name;
    private double price;

    //构造方法（名字和价格）
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //获取名字
    public String getName() {
        return name;
    }

    //获取价格
    public double getPrice() {
        return price;
    }

    //打印内容
    public void showInfo() {
        System.out.println("商品名称：" + name + "，价格：" + price);
    }
}