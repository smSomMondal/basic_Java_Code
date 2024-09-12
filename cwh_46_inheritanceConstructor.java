class base1{

    public base1(){
        System.out.println("i am base1 clsss");
    }
    public base1(int x){
        System.out.println("i am base1 clsss with overlodad value "+x);
    }

}
class derived1 extends base1{
    public derived1() {
        super(0);
        System.out.println("i am derived1");
    }
    public derived1(int x,int y) {
        super(x);
        System.out.println("i am derived1 class with ovelodad value "+y);
    }
}
class childOfDerived1 extends derived1{
    public childOfDerived1(){
        System.out.println("i am childOfDerived1 class");
    }
    public childOfDerived1(int x,int y,int z){
        super(x,y);
        System.out.println("i am childOfDerived1 class ovelodad value "+z);
    }
}
public class cwh_46_inheritanceConstructor {
    public static void main(String[] args) {
//        base1 a=new base1();
//        derived1 b=new derived1();
//        derived1 c=new derived1(45,54);
        childOfDerived1 d=new childOfDerived1(45,58,64);
    }
}
