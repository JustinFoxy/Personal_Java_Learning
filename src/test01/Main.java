package test01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Score<? extends Integer> score=new Score<>("","",10);
        Integer value = score.getValue();


    }


}
