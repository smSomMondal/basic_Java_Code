// package cwh_full_2023;
class my_runnable_thrades1 implements Runnable{
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("my thrade 1");
            i++;
        }
    }
}
class my_runnable_thrades2 implements Runnable{
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("thrade 2");
            i++;
        }
    }
}
public class cwh_71_runnable_threads {
    public static void main(String[] args) {
        my_runnable_thrades1 bullate1 =new my_runnable_thrades1();
        Thread gun1=new Thread(bullate1);
        my_runnable_thrades2 bullate2 =new my_runnable_thrades2();
        Thread gun2=new Thread(bullate2);
        gun1.start();
        gun2.start();

    }
}
