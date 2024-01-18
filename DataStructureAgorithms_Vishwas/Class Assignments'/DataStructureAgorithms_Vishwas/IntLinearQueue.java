package DataStructureAgorithms_Vishwas;

public class IntLinearQueue {
    private int []arr;
    private int front,rear;
    public IntLinearQueue(){
            arr=new int[15];
            front=rear=-1;
    }
    public IntLinearQueue(int s){
        arr=new int[s];
        front=rear=-1;
    }
    public boolean isFull(){
        if(rear==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if((front ==-1)|| ((front-rear)==1)){
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
        if(front==-1)
            front=0;
        rear++;
        arr[rear]=d;
    }
    public int deQueue(){
        if(isEmpty()){
            return 0;
        }
        int d=arr[front];
        front++;
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
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
