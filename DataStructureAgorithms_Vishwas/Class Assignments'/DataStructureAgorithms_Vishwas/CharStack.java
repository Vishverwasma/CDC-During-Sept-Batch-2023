package DataStructureAgorithms_Vishwas;

public class CharStack {
    private char arr[];
    private int top;
    public CharStack(){
        arr=new char[10];
        top=-1;
    }
    public CharStack(int s){
        arr=new char[s];
        top=-1;
    }
    public boolean isFull(){
        if(top==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(char d){
        if(isFull()){
            System.out.println("\n OverFlow");
            return;
        }
        top++;
        arr[top]=d;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void Display(){
        char i;
        for(i=0;i<arr.length;i++) {
            System.out.println(" " + arr[i]);
        }
    }
    public char pop(){
        char d=0;
        if(isEmpty()){
            System.out.println("\n UnderFlow");
        }
        else{
            d=arr[top];
            top=top-1;
        }
        return d;
    }
    public char peek(){
        char d=0;
        if(isEmpty()){
            System.out.println("\n UnderFlow");
        }
        else{
            d=arr[top];
        }
        return d;
    }
}
