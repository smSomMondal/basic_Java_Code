package cwh_full_2023;
import java.util.*;
public class cwh_81_classification_of_exception {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 78;
        a[1] = 45;
        a[2] = 14;
        int indx, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter tne index : ");
        indx = sc.nextInt();
        System.out.println("enter the number");
        num = sc.nextInt();
        try {
            System.out.println("element of " + indx + " is " + a[indx]);
            System.out.println("ans is " + (a[indx] / num));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException :exception ->");
            System.out.println(e);
        }catch(ArithmeticException e) {
            System.out.println("ArithmeticException :exception ->");
            System.out.println(e);
        }
    }
}
