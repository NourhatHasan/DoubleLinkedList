package com.company;

public class DoubleLinkedList {
    Node head= new Node();

    Node tail= new Node();
    int size=0;
    public void create(int value){
        Node node= new Node();
        node.value=value;
        head=tail=node;
        node.next=null;
        node.prev=null;
        size=1;

    }
    public void insertion(int value, int index){
        Node node= new Node();
        node.value=value;

        if(head==null){
            create(value);
        }
        else{
            if(index==0){
                Node temp=head;
                head=node;
                node.next=temp;
                temp.prev=node;

                size+=1;

            }
           else if(index>=size){
                Node temp=tail;
                tail=node;
                node.prev=temp;
                temp.next=node;
                size+=1;

           }
           else{
               int l=0;
                Node t= head;
               while (l<index-1){
                   t=t.next;
                   l=l+1;
               }

               Node temp=t.next;
               t.next=node;
               node.next=temp;
                node.prev=t;
              temp.prev=node;
               size+=1;

            }
        }


    }
    public void traverse(){
        Node current = head;
        while (current!=null){
            System.out.print( current.value+" ->");
            current=current.next;
        }
        System.out.println();

    }

    public void reverce(){
        Node Current= tail;
        while (Current!=null){
            System.out.print(Current.value +" ->");
            Current=Current.prev;
        }
        System.out.println();
    }

    public void search(int value){
        Node current= head;
        boolean found = false;

        int l=0;
        while (current!=null){
            if (current.value ==value){
                System.out.println("Value " + value + " found at index " + l);
                found=true;
                break;

            }
          else {
                l=l+1;
                current=current.next;
            }
        }
        if (!found) {
            System.out.println("Value " + value + " not found in the list.");
        }

    }


    public void delete(int index){
        if(index==0){
            if(size==1){
                head=tail=null;
                size-=1;
            }
            else{
                Node temp= head.next;
                temp.prev=null;
                head=temp;
                size-=1;
            }

        }
        else if(index>= size){
            if(size==1){
                head=tail=null;
                size-=1;
            }
            else{
                Node temp=tail.prev;
                temp.next=null;
                tail=temp;
                size-=1;
            }

        }
        else{
            Node temp=head;
            int l=0;
            while (l< index-1){
                temp=temp.next;
                l=l+1;
            }

            temp.next= temp.next.next;
            temp.next.next.prev=temp;
            size-=1;
        }
    }
    public void clear() {
      /*  while (head!=null){


            Node temp=head;
            head=temp.next;
           if(head!=null){
               head.prev=null;
           }
           else{
               tail=null;
               System.out.println("the list is empty");
           }


*/
        Node temp=head;
        for (int i=0;i<size;i++){
           temp.prev=null;
           temp=temp.next;
        }
        head=null;
        tail=null;
        System.out.println("the list is empty");
    }
}
