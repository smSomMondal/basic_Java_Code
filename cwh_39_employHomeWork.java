class employe1{
    int id;
    String nm;
    int sal;
    public String getName(){
        return nm;
    }
    public int getId(){
        return id;
    }
    public void setSal(int x){
        sal = x;
    }
}
public class cwh_39_employHomeWork{
    public static void main(String[] args) {
        employe1 som=new employe1();
        som.id=148;
        som.nm="Som Mondal";
        som.setSal(1000);
        System.out.println(som.getName());
        System.out.println(som.getId());
        System.out.println(som.sal);
    }
}
