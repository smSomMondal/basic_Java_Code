package cwh_full_2023;
class mythe extends Thread{
    public mythe(String name){
        super(name);
    }
    public void run(){
        System.out.println("this is thread ");
    }
}
public class cwh_73_Constructors_fromThreadclass {
    public static void main(String[] args) {
        mythe t1=new mythe("som");
        mythe t2=new mythe("joy");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());
    }
}
