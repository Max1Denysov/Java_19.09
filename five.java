class A{
    int i;
    int j;
    A(){
        i = 20;
        j = 100;


    }
    void show(){
        System.out.println("i,j outside = " + i + "/" + j);
    }
    class B{
        int i;
        int j;
        B(){
            i = 50;
            j = 25;
        }
        void show(){
            System.out.println("i,j A inside = " + i + "/" + j);
        }
    }
}

class AA extends A{
    int i;
    int j;
    AA(){
        i = 100;
        j = 200;
    }
    void show(){
        System.out.println("i,j AA outside = " + i + "/" + j);
    }
    class BB{
        int i;
        int j;
        BB(){
            i = 1000;
            j = 2000;
        }
        void show(){
            System.out.println("i,j out = " + i + "/" + j);
        }
    }
}


public class five {
    public  static void main (String []args){
    A myAoutside = new A();
    A.B myBinside = myAoutside.new B();

    AA myAAoutside = new AA();
    AA.BB myBBinside = myAAoutside.new BB();
    myAoutside.show();
    myBinside.show();
    myAAoutside.show();
    myBBinside.show();
    }
}
