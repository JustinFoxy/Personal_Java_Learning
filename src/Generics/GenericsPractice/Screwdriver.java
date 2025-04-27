package Generics.GenericsPractice;

public class Screwdriver {
    private String brandName;
    private String texture;
    private double price;

    public Screwdriver(String brandName, String texture, double price) {
        this.brandName = brandName;
        this.texture = texture;
        this.price = price;
    }

    /*
    public String getbrandName(){
        return brandName;
    }
    public String gettexture(){
        return texture;
    }
    public double getprice(){
        return price;
    }
     */

    public void printInfo(){
        System.out.println(brandName+"品牌的 "+texture+"制螺丝刀 "+price+"元");
    }

    @Override
    public String toString() {
        return brandName + "品牌的 " + texture + "制螺丝刀，价格：" + price + "元";
    }
}
