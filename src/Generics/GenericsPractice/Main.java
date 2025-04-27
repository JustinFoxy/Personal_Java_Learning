package Generics.GenericsPractice;

public class Main {
    public static void main(String[] args) {

        // ✅创建锤子和螺丝刀
        Hammer hammer = new Hammer("德里希", "钢", 25);
        Screwdriver screwdriver = new Screwdriver("南旗", "金属", 10.5);
        // 创建装锤子的工具箱
        Toolbox<Hammer> hammerBox = new Toolbox<>();
        hammerBox.setTool(hammer);
        hammerBox.showToolInfo();  // 调用 showToolInfo 方法
        // 创建装螺丝刀的工具箱
        Toolbox<Screwdriver> screwdriverBox = new Toolbox<>();
        screwdriverBox.setTool(screwdriver);
        screwdriverBox.showToolInfo();  // 调用 showToolInfo 方法
    }
}
