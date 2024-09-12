package cwh_full_2023;
import java.util.*;
public class cwh_80_Try_and_Catch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.print("enter a =");
        a= sc.nextInt();
        System.out.print("enter b =");
        b= sc.nextInt();
        try {
            c=a/b;
            System.out.println("value is " +c);
        }catch (Exception e){
            System.out.println("we fail to calculate :reason->");
            System.out.println(e);
        }
    }
}
