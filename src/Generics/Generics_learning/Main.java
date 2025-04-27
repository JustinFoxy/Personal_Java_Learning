package Generics.Generics_learning;

public class Main {
    public static void main(String[] args) {
        AnythingPrinter<String,Integer> AnythingPrinter = new AnythingPrinter<>("This is AnythingPrinter using String!",123);
        AnythingPrinter.print();
    }
}
