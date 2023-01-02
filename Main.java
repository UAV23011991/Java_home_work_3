package Java.h_w_3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        Collections.addAll(digits, 23,-65,8,-14,47,21,9,31,7,4,-8);
        System.out.println("h_w_3_1 Ответ: " + h_w_3.task1(digits));
        System.out.println("h_w_3_2 Ответ: " + h_w_3.task2(digits));
    }
}
