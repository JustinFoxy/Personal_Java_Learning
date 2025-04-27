package Generics.Generics_Animal;
//导Arrays，List包

//主函数
public class Main {
    public static void main(String[] args) {
        /* 范型学习
        //实例化dog1，dog2，cat1
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Dog dog2 = new Dog();

        List<Animal> myPets = Arrays.asList(dog1, cat1, dog2);

        //调用makeAnimalsSpeak范型类（规定范型必须是Animal或者Animal的子类），把myPets中存放的dog1, cat1, dog2全部打印各自对应的speak方法
        AnimalTrainer.makeAnimalsSpeak(myPets);
         */


        /*多态学习*/
        // 多态：父类引用指向子类对象
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // 调用同一个方法，但表现不同
        a1.speak(); // 输出：狗在汪汪叫
        a2.speak(); // 输出：猫在喵喵叫

        System.out.println("    --多态的调用和实现");

        // 用一个数组演示多态
        Animal[] animals = {new Dog(), new Cat(), new Animal()};
        for (Animal a : animals) {
            a.speak(); // 依次输出：狗在汪汪叫、猫在喵喵叫、动物在叫
        }
        System.out.println("    --数组演示多态");
    }
}