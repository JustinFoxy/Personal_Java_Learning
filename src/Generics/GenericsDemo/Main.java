package Generics.GenericsDemo;

public class Main {
    public static void main(String[] args) {
        // ✅创建一个商品对象（名字是“苹果”，价格是 3.5）
        Product apple = new Product("苹果", 3.5);
        // ✅创建一个装商品的盒子，指定盒子类型为 Product (其中Box中只装了商品，没有价格)
        Box<Product> box = new Box<>();
        // ✅将苹果放入盒子中（只能放水果，不能放价格）
        box.set(apple);
        // 从盒子中取出商品
        Product fromBox = box.get();
        // 调用商品的方法打印商品信息
        fromBox.showInfo();
    }
}