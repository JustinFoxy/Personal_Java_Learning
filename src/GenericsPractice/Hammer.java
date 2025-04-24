package GenericsPractice;

public class Hammer {
    private String brandName;
    private String texture;
    private double price;

    public Hammer(String brandName, String texture, double price) {
        this.brandName = brandName;
        this.texture = texture;
        this.price = price;
    }

    public String getbrandName(){
        return brandName;
    }
    public String gettexture(){
        return texture;
    }
    public double getprice(){
        return price;
    }

    //主动控制打印方式
    public void printInfo(){
        System.out.println(brandName+"品牌的 "+texture+"制锤子 "+price+"元");
    }

    //更简洁统一，用 toString() ，这里需要重写toString()方法
    @Override
    public String toString() {
        return brandName + "品牌的 " + texture + "制锤子，价格：" + price + "元";
    }

}
