package homework07_03_20;
//2.Write a Java program to create a new array list, add some colours (string) and printout the collection.

import java.util.ArrayList;
import java.util.List;

public class Prog2 {
    public static void main(String[] args) {
        jitu();
    }

    public static void jitu() {

        String arr[] = {"Blue", "Red", "Orange", "Green", "Yellow"};
        List a = new ArrayList();
        for (int i = 0; i < 5; i++) {
            a.add(arr[i]);
            System.out.println(a + " Colour of this array " + a.size());
        }
    }
}


