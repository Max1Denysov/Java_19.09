class box{
    int width;
    int height;
    int depth;

    box(int w, int h,int d){
        width = w;
        height = h;
        depth = d;

    }

    box(box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    box(int w,int h){
        width = w;
        height = h;
    }

    box(int len){
        width = height = depth = len;
    }
    public String volume(){
        return   " Volume box level 1: " + width * height * depth ;
    }



}

class BoxColor extends box{
    String color;
    BoxColor(int w,int h , int d, String c){
        super(w,h,d);
        color = c;

    }
    BoxColor(){
        super();
        color = "-1";
    }

    BoxColor(int w, int h, String c){
        super(w,h);
        color = c;

    }

    BoxColor( BoxColor ob,String c){
        super(ob);
        color = ob.color;
    }

    BoxColor(int len, String c){
        super(len);
        color = c;
    }
    public String volume(){
        return   " Volume boxcolor level 2: " + super.width * super.height * super.depth ;
    }

}

class BoxExistence extends BoxColor{
    boolean exist;
    BoxExistence(){
        super();
        exist = false;

    }
    BoxExistence(BoxExistence ob,String c,boolean e){
        super(ob,c);
        exist = e;

    }
    BoxExistence(int w,int h,int d,String c,boolean e){
        super(w, h, d, c);
        exist = e;
    }
    BoxExistence(int w,int h, String c,boolean e){
        super(w, h, c);
        exist = e;
    }
    BoxExistence(int len,String c ,boolean e){
        super(len,c);
        exist = e;

    }
    public String volume(){
        return ("Box exist = 3 LEVEL: " + super.width * super.height * super.depth);
    }
}




public class three {
    public static void main(String []args){
        box mybox = new box(3,4,7);
        BoxColor myBoxcolor = new BoxColor(4,5,8,"RED");
        BoxExistence myBoxExistence = new BoxExistence(4,9,2,"Red",true);


        box A = mybox ;
        BoxColor B = myBoxcolor;
        BoxExistence C = myBoxExistence;
        System.out.println(A.volume()  );
        System.out.println(B.volume()  );
        System.out.println(C.volume()  );



    }
}
