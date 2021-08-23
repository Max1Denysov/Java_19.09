abstract class Ane {
    abstract void callme();
    void callmeto(){
        System.out.println("brr brr brrr");

    }
}

class Bane extends Ane{
    void callme(){
        System.out.println("Call me from Bane");

    }
}



public class Abstr {
    public static void main(String []args){
        Bane myBane = new Bane();
        myBane.callme();
        myBane.callmeto();

    }
}
