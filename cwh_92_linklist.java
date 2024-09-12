package cwh_full_2023;

import java.util.ArrayList;
import java.util.LinkedList;

public class cwh_92_linklist {
    public static void main(String[] args) {
        LinkedList<Integer> obj =new LinkedList<>();
        LinkedList<Integer> obj2 =new LinkedList<>();
        obj.add(5);
        obj.add(3);
        obj.add(0,9);
        obj.add(4);
        obj2.add(54);
        obj2.add(94);
        obj2.add(46);
        obj2.add(87);
        obj.addAll(2,obj2);
        obj.set(4,5);
        obj.addLast(420);
        obj.addFirst(520);
        for (int i=0;i< obj.size();i++){
            System.out.println(obj.get(i));
        }
    }
}
