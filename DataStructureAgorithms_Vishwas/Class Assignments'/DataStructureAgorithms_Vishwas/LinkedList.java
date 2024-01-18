package DataStructureAgorithms_Vishwas;

public class LinkedList {
    private IntNode head;
    LinkedList(){
         head=null;
    }
//    public void insertFirst(int d){
//        IntNode newNode=new IntNode(d);
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        newNode.setNext(head);
//        head=newNode;
//        return;
//    }
//    public void insertLast(int d){
//        IntNode newNode=new IntNode(d);
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        IntNode itr=head;
//        while(itr.getNext()!=null)
//            itr=itr.getNext();
//        itr.setNext(newNode);
//        return;
//    }
    public void Display(){
        if(head==null){
            System.out.println("List Is Empty ! ");
            return;
        }
        IntNode itr =head;
        while(itr!=null){
            System.out.print(itr.getData()+" ");
            itr=itr.getNext();
        }
        return;
    }
    public void insertFirst(int d){
        IntNode newNode=new IntNode(d);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.setNext(head);
        head=newNode;
        return;
    }
    public void insertLast(int d){
        IntNode newNode=new IntNode(d);
        if(head==null){
            head=newNode;
            return;
        }
        IntNode itr=head;
        while(itr.getNext()!=null){
            itr=itr.getNext();
        }
        itr.setNext(newNode);
    }
    public void insertByPosition(int d,int position){
        IntNode newNode=new IntNode(d);
        if(head==null){
            head=newNode;
            return;
        }
        if(position==1){
            newNode.setNext(head);
            head=newNode;
            return;
        }
        int i;
        IntNode itr=head;
        for(i=1;i<position-1 && itr.getNext()!=null;i++){
            itr=itr.getNext();
        }
        newNode.setNext(itr.getNext());
        itr.setNext(newNode);
    }
    public int deleteFirst(){
        IntNode deletor;
        int d;
        if(head==null){
            System.out.println("NullList ! ");
            return -999;
        }
        deletor=head;
        head=head.getNext();
        d= deletor.getData();
        deletor=null;
        return d;
    }
    public int deleteLast(){
        IntNode deletor;
        int d;
        if(head==null){
            System.out.println("Empty/Null List");
            return -999;
        }
        if(head.getNext()==null){
            d=head.getData();
            deletor=head;
            head=null;
            deletor=null;
            return d;
        }
        IntNode itr=head;
        while(itr.getNext().getNext()!=null){
            itr=itr.getNext();
        }
        deletor=itr.getNext();
        d=deletor.getData();
        itr.setNext(null);
        deletor=null;
        return d;
    }
    public int deleteByPosition(int position){
        int d;
        IntNode delete;
        if(head==null){
            System.out.println("List Is Empty");
            return -999;
        }
        if(position==1){
            delete=head;
            head=head.getNext();
            d=delete.getData();
            delete=null;
            return d;
        }
        if(head.getNext()==null){
            System.out.println("Inalid Position !");
            return -999;
        }
        int i;
        IntNode itr;
        for(i=1,itr=head;i<position-1 && itr.getNext()!=null ;i++,itr=itr.getNext());
        if(itr.getNext()==null){
            System.out.println("Invalid Position");
            return -999;
        }
        delete=itr.getNext();
        d=delete.getData();
        itr.setNext(delete.getNext());
        return d;
    }
    public String to_String(){
        String str=new String();
        if(head==null){
            str=str+"List Is Empty";
            return str;
        }
        IntNode itr=head;
        str=str+"List...";
        while(itr!=null){
            str=str+itr.getData()+"->";
            itr=itr.getNext();
        }
        str=str+"Null\n";
        return str;
    }
    public void insertSorted(int d){
        IntNode newNode=new IntNode(d);
        if((head==null)||(d<head.getData())){
            newNode.setNext(head);
            head=newNode;
            return;
        }
        IntNode itr=head;
        while(itr.getNext()!=null && d>itr.getNext().getData()){
            itr= itr;
        }
        newNode.setNext(itr.getNext());
        itr.setNext(newNode);
        return;
    }
    public void reverse(){
        IntNode itr=head;
        IntNode prev= null;
        IntNode next;
        while(itr!=null){
            next=itr.getNext();
            itr.setNext(prev);
            itr=next;
        }
        head=prev;
    }
    //MyTries....

    public int CountElements(){
        int c=0;
        if(head==null){
            System.out.println("0 , as This Linked List Is Empty !");
            return 0;
        }
//        IntNode itr=head,next;
//        while(itr!=null){
//           next=itr
//        }
        IntNode itr=head;
        IntNode prev= null;
        IntNode next;
        while(itr!=null){
            next=itr.getNext();
            itr.setNext(prev);
            itr=next;
            c=c+1;
        }
        return c;
    }
}
