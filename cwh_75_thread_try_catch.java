package cwh_full_2023;
class myThrade1 extends Thread{
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("this is 1");
            i++;
        }
    }
}
class myThrade2 extends Thread{
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("2");
            i++;
        }
    }
}

public class cwh_75_thread_try_catch {
    public static void main(String[] args) {
        myThrade1 ob1=new myThrade1();
        myThrade2 ob2=new myThrade2();
        ob1.start();
        //ob1.join();
        try {
            ob1.join();
        }
        catch (Exception e){
            System.out.println("e");
        }
        ob2.start();
    }
}
