package Generics.Generics_Animal;
//创建动物的子类猫猫
public class Cat extends Animal{
    //重写speak方法
    @Override
    public void speak() {
        System.out.println("猫在喵喵叫");
    }
}
