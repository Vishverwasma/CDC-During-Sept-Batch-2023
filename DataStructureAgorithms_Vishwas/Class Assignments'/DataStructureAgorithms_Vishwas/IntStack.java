package DataStructureAgorithms_Vishwas;
import java.util.*;
public class IntStack {
    private int arr[];
    private int top;
    public IntStack(){
        arr=new int[10];
        top=-1;
    }
    public IntStack(int s){
        arr=new int[s];
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
    public void push(int d){
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
        int i;
        for(i=0;i<arr.length;i++) {
            System.out.println(" " + arr[i]);
        }
    }
    public int pop(){
        int d=0;
        if(isEmpty()){
            System.out.println("\n UnderFlow");
        }
        else{
            d=arr[top];
            top=top-1;
        }
        return d;
    }
    public int peek(){
        int d=0;
        if(isEmpty()){
            System.out.println("\n UnderFlow");
        }
        else{
            d=arr[top];
        }
        return d;
    }
}
