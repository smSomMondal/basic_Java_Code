package cwh_full_2023;
interface MyCamera1{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi1{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone1 extends MyCellPhone1 implements MyWifi1, MyCamera1{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    //    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        return new String[]{"Harry", "Prashanth", "Anjali5G"};
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class cwh_59_cwh_Polymorphism_in_Interfaces {
    public static void main(String[] args) {
        MyCamera1 obj=new MySmartPhone1();
        //obj.pickcall();   ->ERROR we only can use the object as a camera
        //obj.getNetworks();   ->ERROR we only can use the object as a camera
        obj.record4KVideo();
    }
}
