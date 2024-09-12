class a{
    public void method1(){
        System.out.println("i am method 1 of class A");
    }
    public void method2(){
        System.out.println("i am method 2 of class A");
    }
}
class b extends a{
    @Override
    public void method1() {
        System.out.println("i am method 1 of class B");
        System.out.println("along this i am many function");
    }
    public void method3(){
        System.out.println("i am method 3 of class A");
    }
}
public class cwh_48_methodOverwrite {
    public static void main(String[] args) {
        a som=new a();
        som.method1();
        b somNew=new b();
        somNew.method1();
    }
}
