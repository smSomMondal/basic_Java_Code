class base{
    private int id;
    public void setId(int id) {
        System.out.println("i am setting id from base "+id);
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
class derived extends base{
    private String nm;

    public void setNm(String nm) {
        System.out.println("setting name from derived class");
        this.nm = nm;
    }

    public String getNm() {
        return nm;
    }
}
public class cwh_45_inheritance {
    public static void main(String[] args) {
        //making a object of bass class
        base a=new base();
        a.setId(5);
        System.out.println(a.getId());
        //making a object of derived class
        derived b=new derived();
        b.setId(420);
        b.setNm("i am som");
        System.out.println(b.getNm());
        System.out.println(b.getId());

    }
}
