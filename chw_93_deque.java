package cwh_full_2023;

import java.util.ArrayDeque;
import java.util.Deque;

public class chw_93_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> de1=new ArrayDeque<>();
        de1.add(12);
        de1.add(15);
        de1.add(14);
        System.out.print(de1);

        System.out.println();
        de1.addFirst(10);
        de1.addLast(20);
        System.out.print(de1);
        System.out.println(de1.size());
        de1.removeFirst();
        System.out.println(de1);
        de1.removeLast();
        System.out.println(de1);
    }
}
