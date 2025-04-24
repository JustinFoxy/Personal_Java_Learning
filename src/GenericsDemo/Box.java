package GenericsDemo;

// 泛型类，T 可以是任何类型
//范型box类
public class Box<T> {
    //初始化item为任意类型
    private T item;

    //构造方法
    public void set(T item) {
        this.item = item;
    }

    //获取item
    public T get() {
        return item;
    }

    //打印内容
    public void printItem() {
        System.out.println("当前盒子装的是：" + item.toString());
    }
}

