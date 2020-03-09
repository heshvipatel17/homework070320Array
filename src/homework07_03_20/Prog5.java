package homework07_03_20;
//5.	Write a Java program to test an array list is empty or not.
import java.util.ArrayList;

public class Prog5 {

    public static void main(String[] args) {

        // creating an Empty Integer ArrayList
        ArrayList arr = new ArrayList();

        // check if the list is empty or not using fucntion
        boolean ans = arr.isEmpty();
        if (ans == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");

    }
}