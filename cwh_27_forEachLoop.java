package cwh_full_2023;

import java.util.Scanner;

public class cwh_27_forEachLoop {
    public static void main(String[] args) {
        int []ar=new int[5] ;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter five elements");
        for (int i=0;i<5;i++){
            ar[i]= sc.nextInt();
        }
        for (int element:ar) {
            System.out.println(element);
        }
        String []nm=new String[3];
        System.out.println("enter five name");
        for (int i=0;i<3;i++){
            nm[i]= sc.next();
        }
        for (String ch:nm) {
            System.out.println(ch);

        }
    }
}
