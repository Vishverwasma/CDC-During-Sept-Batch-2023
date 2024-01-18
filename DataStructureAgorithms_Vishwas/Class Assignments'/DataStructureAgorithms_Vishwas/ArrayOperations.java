package DataStructureAgorithms_Vishwas;
import java.util.*;
public class ArrayOperations {
    private int arr[];
    public ArrayOperations(){
        arr=new int[10];
    }
    public ArrayOperations(int s){
        arr=new int[s];
    }
    public void ReadArray(){
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void printArrayElements(){
        int i;
        System.out.println("\n");
        for(i=0;i< arr.length;i++){
            System.out.print(" "+ arr[i]+" ");
        }
        System.out.println(" ");
    }
    public void leftShift(){
        int i;
        for(i=0;i< arr.length-1;i++){
            arr[i]= arr[i+1];
        }
        arr[i]=0;
    }
    public void rightShift(){
        int i;
        for(i= arr.length-1;i>0;i--){
            arr[i]= arr[i-1];
        }
        arr[i]=0;
    }
    public void leftRotate(){
        int i;
        int temp= arr[0];
        for(i=0;i< arr.length-1;i++){
            arr[i]= arr[i+1];
        }
        arr[i]=temp;
    }
    public void rightRotate(){
        int i;
        int temp= arr[ arr.length-1];
        for(i= arr.length-1;i>0;i--){
            arr[i]= arr[i-1];
        }
        arr[i]=temp;
    }
    public void insert_by_position(int position,int value){
        int i;
        int temp=value;
        for(i= arr.length-1;i>=position;i--){
            arr[i]= arr[i-1];
        }
        arr[i]=temp;
    }
    public int delete_by_position(int position){
        int i,data=arr[position-1];
        for(i=position-1;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=0;
        return data;
    }
    public void removeDuplicateVersion01(){  // TimeComplexity = O(n^2)
        int tar[]=new int[ arr.length-1];
        int i,flag=0,j,tar_index=-1;
        for(i=0; i<arr.length;i++) {
            flag=0;
            for (j = 0; j <= tar_index; j++) {
                if ( arr[i] == tar[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                tar_index = tar_index + 1;
                tar[tar_index] =  arr[i];
            }
        }
        //int m=arr.length;
            arr=tar;
    }

    public void removeDuplicateVersion02(){ // TimeComplexity = O(n^2)
        int i,j;
        for(i=0; i<arr.length-1;i++){
            for(j=i+1; j<arr.length-1;j++){
                if( arr[i]== arr[j] && arr[i]!=0){
                    delete_by_position(j+1);
                    System.out.println("---");
                    j--;
                }
            }
        }
    }
    public void removeDuplicateVersion03(){ // TimeComplexity = O(n)
        int chk[]=new int[101];
        int i,j,n;
        for(i=0; i<arr.length-1;i++){
            n= arr[i];
            chk[n]++;
        }
        for(i=0,j=-1; i<arr.length-1;i++){
            n= arr[i];
            if(chk[n]>0){
                j=j+1;
                arr[j]=n;
                chk[n]=0;
            }
        }
        for(i=j+1;i<arr.length;i++){
            arr[i]=0;
        }
    }
}