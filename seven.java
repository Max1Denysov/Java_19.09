class P{
    int i,j;
    P(int i, int j){
        this.i = i;
        this.j = j;
    }

    void show(){
        System.out.println("i and j " + i + " and " + j);
    }
}

class D extends P{
    int k;
    D(int i, int j , int k){
        super(i,j);
        this.k = k;

    }
    void show(String msg){
        System.out.println(msg + k);
    }

}


public class seven {
    public static  void main(String []args){
    D sub = new D(1 ,2,4);
    sub.show();
    sub.show("K: ");
    }
}
