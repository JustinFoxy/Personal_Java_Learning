package Generics.GenericsPractice;

public class Toolbox<T> {
    private T tool;

    //放工具
    public void setTool(T tool) {
        this.tool = tool;
    }
    //取工具
    public T getTool() {
        return tool;
    }
    //打印工具信息（使用 toString()）
    public void showToolInfo() {
        if(tool==null){
            System.out.println("工具箱为空");
        }else System.out.println("工具为：" + tool);
    }
}
