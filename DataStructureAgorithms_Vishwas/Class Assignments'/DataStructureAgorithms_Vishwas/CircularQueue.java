package DataStructureAgorithms_Vishwas;

public class CircularQueue {
    private int arr[];
    private int front,rear;
    public CircularQueue(){
        arr=new int[50];
        front=rear=-1;
    }
    public CircularQueue(int s){
        arr=new int[s];
        front=rear=-1;
    }
    public boolean isFull(){
        if(((front==0)&&(rear==arr.length-1)) ||(front-rear==1)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void enQueue(int d){
        if(isFull()){
            System.out.println("\nOverFlow");
            return;
        }
        if(front==-1){
            front=0;
        }
        if(rear==arr.length-1){
            rear=0;
        }
        else{
            rear=rear+1;
        }
        arr[rear]=d;
    }
    public int deQueue(){
        int d=-999;
        if(isEmpty()){
            System.out.println("\nUnderFlow");
            return d;
        }
        d=arr[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else if(front==arr.length-1){
            front=0;
        }
        else{
            front=front+1;
        }
        return d;
    }
    public int peek(){
        if(isEmpty()){
            return 0;
        }
        int d=arr[front];
        return d;
    }
    public void Display(){
        int i;
        System.out.println("Your Elements in This Queue is ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
