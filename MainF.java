class Figure{
    double dim1, dim2;
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;

    }
    double area(){
        System.out.println("Area not defined");
        return 0;
    }
}
class Rentagle extends Figure{
    Rentagle(double a , double b){
        super(a,b);
    }
    double area(){
        System.out.println("Area square");
        return dim1 * dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Area of triangle");
        return (dim1 * dim2) / 2;
    }
}


public class MainF {
    public  static void main(String[]args){
    Figure f = new Figure(10,10);
    Rentagle r = new Rentagle(9,5);
    Triangle t = new Triangle(2,3);

    Figure figreg;

    figreg = r;
    System.out.println("Area = " + figreg.area());
    figreg = t;
    System.out.println("Area = " + figreg.area());
    figreg = f;
    System.out.println("Area = " + figreg.area());



    }
 }
