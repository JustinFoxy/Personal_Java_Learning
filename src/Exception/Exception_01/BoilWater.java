package Exception.Exception_01;

public class BoilWater {
    public void boilWater() throws Exception{
        boolean isKettleBroken = false;
        if (isKettleBroken) {
            throw new Exception("水壶坏了，无法烧水！");
        }
        System.out.println("水烧开了，准备泡茶！");
    }
}
