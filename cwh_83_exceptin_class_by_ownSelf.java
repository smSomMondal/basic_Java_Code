package cwh_full_2023;

import java.util.Scanner;

class myexceptin extends Exception{
    @Override
    public String toString() {
        return "i to sring";
    }

    @Override
    public String getMessage() {
        return "i am get massage";
    }
}
class myMaxExceptin extends Exception{
    @Override
    public String toString() {
        return "i can not be getter than 286";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}
public class cwh_83_exceptin_class_by_ownSelf {
    public static void main(String[] args) {
        int a=4;
        Scanner sc = new Scanner(System.in);
        //a = sc.nextInt();
        if (a<9){
            try{
                 //throw new myexceptin();
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                e.printStackTrace();
//                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
