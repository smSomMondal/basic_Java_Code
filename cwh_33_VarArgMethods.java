package cwh_full_2023;

import java.util.Scanner;

public class cwh_33_VarArgMethods {
    static int sum(int ...arr){
//        int []ar=
        int sum=0;
        for (int ele:arr) {
            sum+=ele;
        }
        return sum;
    }
    //function over loadding....
    static int sum(int x,int ...arr){
//        int []ar=
        int sum=0;
        for (int ele:arr) {
            sum+=ele;
        }
        return sum/x;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("enter the number of element to be sum: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []ar =new int[n];
        System.out.println("enter the elements : ");
        for (int i=0;i<n;i++){
            ar[i]= sc.nextInt();
        }
        System.out.println("the sum is "+sum(ar));
        System.out.println("the avarage is "+sum(n,ar));
    }
}
