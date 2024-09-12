class phone{
    public void showTime(){
        System.out.println("it is show time of phone");
    }
    public void call(){
        System.out.println("it is calling..... of phone");
    }
}
class smartPhone extends phone{
    public void music(){
        System.out.println("it is playing music..... smart phone");
    }
    @Override
    public void call(){
        System.out.println("it is calling..... of phone");
    }
}
public class cwh_49_DynamicMethodDispatch {
    public static void main(String[] args) {
        phone meme=new smartPhone();
        /*
        আমরা স্মার্টফোনকে ফোন বলতে পারি কিন্তু কোন ফোনকে স্মার্টফোন বলতে পারিনা
        তাই স্মার্ট ফোনকে ফোন বললে তখন শুধু সেটা ফোনের ফাংশনে করবে স্মার্টফোনের ফাংশন করবে না
        */
        //smartPhone meow=new phone();  not allowed
        meme.call();
        meme.showTime();
        //meme.music(); not allowed
    }
}
