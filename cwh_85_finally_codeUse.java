package cwh_full_2023;

public class cwh_85_finally_codeUse {
    static int gred(){
        int a=34,b=0;
        try {
            System.out.println(a/b);
            return 1;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("ram is cleared");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(gred());
        int a=76,b=8;
        while (true){
            try {
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
            //after brake the loop the code under the finally will be executed
            finally {
                System.out.println("value of b is "+b);
            }
            b--;
        }
    }
}
