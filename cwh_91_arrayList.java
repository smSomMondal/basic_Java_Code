package cwh_full_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class cwh_91_arrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array1");
        int a=sc.nextInt();
        System.out.println("enter the size of the array2");
        int b=sc.nextInt();
        ArrayList<Integer> obj =new ArrayList<>(a);
        ArrayList<Integer> obj2 =new ArrayList<>(b);
        /*obj.add(5);
        obj.add(3);
        obj.add(0,9);
        obj.add(4);
        obj2.add(54);
        obj2.add(94);
        obj2.add(46);
        obj2.add(87);
        obj.addAll(2,obj2);
        obj.remove(obj.indexOf(4)); //do remove
        obj.set(4,5);
        for (int i=0;i< obj.size();i++){
            System.out.println(obj.get(i));
        }*/

        System.out.println("enter element for array 1:");
        for (int i=0;i<a;i++){
            obj.add(i, sc.nextInt());
        }
        System.out.println("enter element for array 2:");
        for (int i=0;i<b;i++){
            obj.add(i, sc.nextInt());
        }
        obj.addAll(obj2);
        System.out.println("the element are:");
        for (int i=0;i<b+a;i++){
            System.out.print(" "+obj.get(i));
        }
        System.out.println(obj.indexOf(4/*scarch element*/));

    }
}
