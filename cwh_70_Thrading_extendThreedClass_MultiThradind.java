package cwh_full_2023;
class myThradind1 extends Thread{
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("chatting with her");
            System.out.println("hooo");
            i++;
        }
    }
}
class myThradind2 extends Thread{
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("coocking my teffine");
            System.out.println("ffff");
            i++;
        }
    }
}
public class cwh_70_Thrading_extendThreedClass_MultiThradind {
    public static void main(String[] args) {
        myThradind1 obj1=new myThradind1();
        myThradind2 obj2=new myThradind2();
        obj1.start();
        obj2.start();
    }
}
