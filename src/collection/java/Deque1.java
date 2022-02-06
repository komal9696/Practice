package collection.java;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {

    public static void main(String[] args) {
      
        Deque<Integer> numbers = new ArrayDeque<Integer>();

      
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println(numbers);

        
        int first = numbers.peekFirst();
        System.out.println( first);

        int last = numbers.peekLast();
        System.out.println(last);

       
        int removef = numbers.pollFirst();
        System.out.println(removef);

        int removel = numbers.pollLast();
        System.out.println( removel);

        System.out.println("Updated Deque: " + numbers);
    }
}