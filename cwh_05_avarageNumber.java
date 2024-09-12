package cwh_full_2023;

import java.util.Scanner;

public class cwh_05_avarageNumber {
    public static void main(String[] args) {
        int ma,phy,che;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of");
        System.out.print("math : ");
        ma= sc.nextInt();
        System.out.print("phy : ");
        phy= sc.nextInt();
        System.out.print("che : ");
        che= sc.nextInt();
        float ava=(ma+phy+che)/3f;
        System.out.println("avarage number is "+ava);


    }
}
