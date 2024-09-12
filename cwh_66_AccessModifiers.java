package cwh_full_2023;
class myAcessModifier{
public int a=45;                     //class   pacage  subclass    world
    private int b=25;       //  public  yes     yes     yes         yes
    protected int c=67;     //  protect yes     yes     yes         no
    int d=87;               //  default yes     yes     no          no
    public void just(){     //  privet  yes     no      no          no
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
public class cwh_66_AccessModifiers {
    public static void main(String[] args) {
        myAcessModifier obj=new myAcessModifier();
        obj.just();
    }
}
