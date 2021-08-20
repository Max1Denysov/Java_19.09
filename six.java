class q{
    int i;
    int j;
    q(int i, int j){
        this.i = i;
        this.j = j;

    }
    void show(){
        System.out.println("i,j" + i + " " + j);
    }
}
class w extends q{
    int c;
    w(int i,int j, int c){
        super(i,j);
        this.c = c;
    }
    void show(){
        super.show();
        System.out.println("c: " + c);
    }
}




public class six {
    public static void main(String []args){
    w subob = new w(12,42,2);
    subob.show();
    }
}
