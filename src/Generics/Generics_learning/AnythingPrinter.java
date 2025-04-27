package Generics.Generics_learning;

public class AnythingPrinter<T, K> {
    T content;
    K content2;

    AnythingPrinter(T content, K content2) {
        this.content = content;
        this.content2 = content2;
    }

    public void print() {
        System.out.println(content);
        System.out.println(content2);
    }
}
