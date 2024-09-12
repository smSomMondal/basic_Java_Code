interface sample1{
    void meth1();
    void meth2();
}
interface extendSample extends sample1{
    void meth3();
    void meth4();
}
class mySampleClass implements extendSample{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class cwh_58_Inheritance_In_Interfaces {
    public static void main(String[] args) {
        mySampleClass obj=new mySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
