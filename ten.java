abstract class figure{
    double dim1,dim2;
    figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}
class rentagle extends figure{
    rentagle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Quarter");
        return dim1 * dim2;
    }
}
class triangl extends figure{
    triangl(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Triangle");
        return (dim1 * dim2) / 2;
    }
}
public class ten {
    public static void main(String []args){
    rentagle r = new rentagle(12,44);
    triangl t = new triangl(5,66);
    figure f;

    f = r;
    System.out.println("Area of rentagle: " + f.area() );
    f = t;
    System.out.println("Area of triangle: " + f.area() );


    }
}
