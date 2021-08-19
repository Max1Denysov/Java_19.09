class stack{
    private int ArSteck[];
    private int LastEmNum;
    stack(int size){
        ArSteck = new int[size];
        LastEmNum = -1;
    }

    void push(int item){
        if(LastEmNum==ArSteck.length - 1){
            System.out.println("Full stack");
        }
        else{
            ArSteck[++LastEmNum] = item;
        }
    }
    public int pop(){
        if (LastEmNum < 0){
            System.out.println("Empty stack");
            return 0 ;
        }
        else{
            return ArSteck[LastEmNum--];
        }
    }
}

public class two {
    public static void main(String []args){
        stack mystack = new stack(10);

        for(int i = 20; i <30 ; i++ ){
            mystack.push(i);
        }
        System.out.println("Stack Have:");
        for(int i = 0 ;i < 10;i++){

            System.out.print( mystack.pop() + " ");
        }
    }
}
