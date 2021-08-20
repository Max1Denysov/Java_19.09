class a{
    a(){
        System.out.println("Inside A");
    }

}
class b extends a{
    b(){
        System.out.println("Inside B");    }
}

class c extends b{
    c(){
        System.out.println("Inside C");
    }
}

public class four {
    public static void main(String []args){
    c ob = new c();
    }
}
