package Polymorphism_Vehicle;
//  如果类中包含了抽象方法，那么这类必须标记为 抽象类（abstract），并且不能实例化，只能被继承并由子类实现它的抽象方法。
public abstract class Vehicle {
    //抽象方法
    public abstract void move();
}
