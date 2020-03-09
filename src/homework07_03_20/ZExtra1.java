package homework07_03_20;
/**
 * @author Crunchify.com
 * How to iterate through Java List? Seven (7) ways to Iterate Through Loop in Java.
 * 1. Simple For loop
 * 2. Enhanced For loop
 * 3. Iterator
 * 4. ListIterator
 * 5. While loop
 * 6. Iterable.forEach() util
 * 7. Stream.forEach() util
 */
import java.util.*;

public class ZExtra1 {

        public static void main(String[] argv) {

            // Other way to define list is - we will not use this list :)
            List<String> aList = Arrays.asList("Facebook", "Paypal", "Google", "Yahoo");

            // Simple For loop
            System.out.println("=> 1. Simple For loop Example.");
            for (int i = 0; i < aList.size(); i++) {
                System.out.println(aList.get(i));
            }

            // New Enhanced For loop
            System.out.println("\n=> 2. New Enhanced For loop Example..");
            for (String temp : aList) {
                System.out.println(temp);
            }

            // Iterator - Returns an iterator over the elements in this list in proper sequence.
            System.out.println("\n=> 3. Iterator Example...");
            Iterator aIterator = aList.iterator();
            while (aIterator.hasNext()) {
                System.out.println(aIterator.next());
            }

            // ListIterator - traverse a list of elements in either forward or backward order
            // An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration,
            // and obtain the iterator's current position in the list.
            System.out.println("\n=> 4. ListIterator Example...");
            ListIterator aListIterator = aList.listIterator();
            while (aListIterator.hasNext()) {
                System.out.println(aListIterator.next());
            }

            // while loop
            System.out.println("\n=> 5. While Loop Example....");
            int i = 0;
            while (i < aList.size()) {
                System.out.println(aList.get(i));
                i++;
            }

            // Iterable.forEach() util: Returns a sequential Stream with this collection as its source
            System.out.println("\n=> 6. Iterable.forEach() Example....");
            aList.forEach((temp) -> {
                System.out.println(temp);
            });

            // collection Stream.forEach() util: Returns a sequential Stream with this collection as its source
            System.out.println("\n=> 7. Stream.forEach() Example....");
            aList.stream().forEach((crunchifyTemp) -> System.out.println(crunchifyTemp));
        }
    }

