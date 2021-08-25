import java.util.Scanner;
public class Calculus {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String []args){
        point pointer = new point();
        System.out.println("First Real number:  ");
        int a1 = sc.nextInt();
        System.out.println("Second Real number:  ");
        int a2 = sc.nextInt();
        System.out.println("First Imagine number:  ");
        int b1 = sc.nextInt();
        System.out.println("Second Imagine number:  ");
        int b2 = sc.nextInt();
        System.out.println("Plus : "+ pointer.plus(a1,a2,b1,b2));
        System.out.println("Minus : "+ pointer.minus(a1,a2,b1,b2));
    }
}
