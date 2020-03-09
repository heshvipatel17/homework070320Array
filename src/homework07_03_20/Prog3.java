package homework07_03_20;
//3.Write a Java program to iterate through all elements in a arraylist.import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Prog3 {
    public static void main(String[] args) {
        String arr[] = { "Blue", "Red","Orange","Green","Yellow"};
        List aList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            aList.add(arr[i]);
        }
        ListIterator< String > itr = aList.listIterator();
        System.out.println("\nUsing List Iterator:");
        while (itr.hasNext()) {
            System.out.println("colour is : " +
                    itr.next());
        }
    }
}


