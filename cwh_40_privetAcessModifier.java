import java.util.Scanner;

class myemp{
    private int id;
    private String nm;

    public void setId(int id) {
        this.id = id;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public int getId() {
        return id;
    }

    public String getNm() {
        return nm;
    }
}
public class cwh_40_privetAcessModifier {
    public static void main(String[] args) {
        myemp som=new myemp();
        Scanner sc=new Scanner(System.in);
        //int a= sc.nextInt();
        int a;
        String b;
        System.out.println("enter id :");
        som.setId(a= sc.nextInt());
        System.out.println("enter name :");
        som.setNm(b= sc.next());
        System.out.println(som.getId());
        System.out.println(som.getNm());
    }
}
