interface byCycle{
    void speedUp(int i);
    void slowDown(int d);
}
interface horn{
    void horn1();
    void horn2();
}
/* we can empliment more than one interface in one class*/
class harculis implements byCycle,horn{
    public void speedUp(int i){System.out.println("u lala u lala");}
    public void slowDown(int d){System.out.println("hay garmi");}
    public void horn1(){System.out.println("haila haila hua hua poo poo poo");}
    public void horn2(){System.out.println("uri uri baba pee pee pee");}
}
public class cwh_54_Interfaces {
    public static void main(String[] args) {
        harculis bySom=new harculis();
        bySom.slowDown(74);
        bySom.horn1();
    }
}
