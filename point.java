public class point {
    private int x,y,a1,a2,b1,b2;


    public String plus( int a1, int a2, int b1 , int b2){
        x = a1 + a2;
        y = b1 + b2;
        return  x + " + "+ y + " j ";
    }
    public String minus( int a1, int a2, int b1 , int b2){
        x = a1 - a2;
        y = b1 - b2;
        return  x + " + "+ y + " j ";
    }
}
