package cwh_full_2023;

/*
    abstract class a abstract method take
    abstract class holo main class tai main ki function dorkar ta akane take
    ai function guloo akane define na kora alada class a ovrridde kora define kora hoii
*/
abstract class parent2{
    public parent2(){
        System.out.println("i an a constructor of parrent2");
    }
    public void sayHallow(){
        System.out.println("hellow");
    }
    abstract public void greed();
    abstract public void greed2();
}
class child2 extends parent2{
    @Override
    public void greed(){
        System.out.println("greed 1");
    }
    public void greed2(){
        System.out.println("greed 2");
    }
}
abstract class child3 extends parent2{
    public void th(){
        System.out.println("i am good");
    }
}
public class cwh_53_AbstractClassAbstractMethods {
    public static void main(String[] args) {
        //parent2 p2 =new parent2(); ->not possible
        child2 ch=new child2();
        //child3 ch3=new child3();   ->not possible
    }
}
