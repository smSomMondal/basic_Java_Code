package cwh_full_2023;
import java.util.*;
public class cwh_82_nested_try {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 78;
        a[1] = 45;
        a[2] = 14;
        int indx;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter tne index : ");
        indx = sc.nextInt();
        boolean flaf=true;
        while (flaf){
            System.out.print("enter tne index : ");
            indx = sc.nextInt();
            try {
                System.out.println("wellcome");
                try {
                    System.out.println("the element of "+indx+" is "+a[indx]);
                    flaf=false;
                }catch (Exception e){
                    System.out.println("cach of 2");
                    System.out.println("index is not presrnt");
                }
            }catch (Exception e){
                System.out.println("cach of 1");
            }
        }
    }
}
