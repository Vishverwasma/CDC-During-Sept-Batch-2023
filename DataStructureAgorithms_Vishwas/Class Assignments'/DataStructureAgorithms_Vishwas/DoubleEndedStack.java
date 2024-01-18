package DataStructureAgorithms_Vishwas;

import java.util.*;

public class DoubleEndedStack {
    private int []arr;
    private int topA,topB;

    public DoubleEndedStack(){
        arr=new int[15];
        topA=-1;topB=arr.length;
    }
     public DoubleEndedStack(int s){
        arr=new int[s];
        topA=-1;topB=arr.length;
     }
     public int SizeOfArray(){
        return arr.length;
     }
     public boolean isFull(){
        if((topA-topB)==1){
            return true;
        }
        else{
            return false;
        }
     }
     public boolean isEmptyA(){
        if(topA==-1){
            return true;
        }
        else{
            return false;
        }
     }
     public boolean isEmptyB(){
        if(topB==arr.length){
            return true;
        }
        else{
            return false;
        }
     }
     public void pushA(int d){
        if(isFull()){
            System.out.println("\nOverFlow");
            return;
        }
        topA++;
        arr[topA]=d;
     }
    public void pushB(int d){
        if(isFull()){
            System.out.println("\nOverFlow");
            return;
        }
        topB--;
        arr[topB]=d;
    }
    public int popA(){
        int d=arr[arr.length-1];
        if(isEmptyA()){
            System.out.println("\nUnderFlow");
        }
        else{
            d=arr[topA];
            topA--;
        }
        return d;
    }
    public int popB(){
        int d=arr[arr.length-1];
        if(isEmptyB()){
            System.out.println("\nUnderFlow");
        }
        else{
            d=arr[topB];
            topB++;
        }
        return d;
    }
    public int peekA(){
        int d=arr[arr.length-1];
        if(isEmptyA()){
            System.out.println("\nUnderFlow");
        }
        else{
            d=arr[topA];
        }
        return d;
    }
    public int peekB(){
        int d=arr[arr.length-1];
        if(isEmptyB()){
            System.out.println("\nUnderFlow");
        }
        else{
            d=arr[topB];
        }
        return d;
    }
}
