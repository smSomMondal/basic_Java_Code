package cwh_full_2023;

class myEmployyeMain{
    private int id;
    private String nm;
    public myEmployyeMain(){
        id=420;
        nm="som mondal";
    }
    public myEmployyeMain(String myNM){
        id=420;
        nm=myNM;
    }
    public myEmployyeMain(String myNM,int i){
        id=i;
        nm=myNM;
    }
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
    public void out(){
        System.out.println(getId());
        System.out.println(getNm());
    }
}
public class cwh_42_consrtactotOverloding {
    public static void main(String[] args) {
//        myEmployyeMain som=new myEmployyeMain("hallow som",45);
        myEmployyeMain som=new myEmployyeMain("hallow som");
//        myEmployyeMain som=new myEmployyeMain();
        som.out();
    }
}
