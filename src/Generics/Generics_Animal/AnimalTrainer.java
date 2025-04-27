package Generics.Generics_Animal;
//导入List
import java.util.List;
//创建AnimalTrainer类
public class AnimalTrainer {
    //创建makeAnimalsSpeak范型类，并规定范型必须是Animal或者Animal的子类
    public static void makeAnimalsSpeak(List<? extends Animal> animals) {
        //创建一个变量a，这个变量a存放到makeAnimalsSpeak范型类中传入的范型名字
        for (Animal a : animals) {
            //变量a调用重写的speak方法，例如传入dog，则a就是dog.speak()
            a.speak();
        }
    }
}
