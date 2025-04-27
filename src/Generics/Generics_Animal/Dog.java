package Generics.Generics_Animal;
//创建动物类的子类狗狗
public class Dog extends Animal{
    //重写speak方法 command+0
    @Override
    public void speak() {
        System.out.println("狗在汪汪叫");
    }
}
