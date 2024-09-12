class employe {
    int id;
    String mane;
    public void printInformaion(){
        System.out.println("the id number is " + id);
        System.out.println("the name is " + mane);
    }
}
public class cwh_38_castomClass{
    public static void main(String[] args) {
        System.out.println("wellcome to objecr class");
        employe som=new employe();
        som.id=101;
        som.mane="Som Mondal";
        employe joy=new employe();
        joy.id=161;
        joy.mane="joy Biswas";
        /*System.out.println(som.id);
        System.out.println(som.mane);*/
        som.printInformaion();
        joy.printInformaion();
    }
}
