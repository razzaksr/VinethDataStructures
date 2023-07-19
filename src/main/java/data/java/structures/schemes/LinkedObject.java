package data.java.structures.schemes;

/*
FiFo >> default adding at last
        default remove at begin
 */

public class LinkedObject {
    private class Node{
        Object data;
        Node beside;

        public Node(){}
        public Node(Object obj){
            this.data=obj;
            this.beside=null;
        }
    }
    private Node head;

    public LinkedObject(){
        head=null;
    }

    public void addAtBegin(Object obj){
        Node userNode=new Node(obj);

        if(head==null){
            System.out.println("Head is Null, so "+obj+" is first node in the list");
        }
        else{
            System.out.println(obj+" has added as Beginning");
            userNode.beside=head;
        }
        head=userNode;
    }

    // add / addLast
    public void add(Object obj){
        Node userNode=new Node(obj);
        if(head==null){
            head=userNode;
            System.out.println(obj+" has inserted first since no origin data/link");
        }
        else{
            Node manage=head;
            while(manage.beside!=null){
                manage=manage.beside;
            }
            manage.beside=userNode;
            System.out.println(obj+" has inserted @ last");
        }
    }

    public void addAtPosition(Object obj, int position){
        Node userNode=new Node(obj);
        if(head==null){
            head=userNode;
            System.out.println("Since list is empty "+obj+" has added @ begin irrespective with "+position);
        }
        else{
            int counter=1;
            Node manage=head;
            while(counter==position){
                manage=manage.beside;
                counter++;
            }
            userNode.beside=manage.beside;
            manage.beside=userNode;
            System.out.println(obj+" has added @ "+position);
        }
    }

    public void traverse(){
        Node manage=head;
        while(manage!=null){
            System.out.println(manage.data);
            manage=manage.beside;
        }
    }

    // remove/ removeFirst
    public void remove(){
        if(head==null){
            System.out.println("List in underflow, can't perform deletion");
        }
        else{
            head=head.beside;
            System.out.println("Removal has done @ beginning of the list");
        }
    }

    public void removeLast(){
        if(head==null){
            System.out.println("can't perform deletion @ last");
        }
        else{
            Node manage=head;
            while(manage.beside.beside!=null){
                manage=manage.beside;
            }
            manage.beside=null;
            System.out.println("deletion done @last");
        }
    }

    public void removeAtPosition(int position){
        if(head==null){
            System.out.println("Can't perform remove by position since list is underflow");
        }
        else{
            int counter=1;
            Node pointer=head;
            while(counter<position-1){
                pointer=pointer.beside;
                counter++;
            }
//            Node next=pointer.beside.beside;
//            pointer.beside=next;
            pointer.beside=pointer.beside.beside;
            System.out.println("deletion @ "+position+" has done");
        }
    }

    public void readBegin(){
        if(head==null){
            System.out.println("Nothing to read at beginning since list is empty");
        }
        else{
            System.out.println(head.data+" is data @ beginning");
        }
    }

    public void readLast(){
        if(head==null){
            System.out.println("Nothing to read at last since list is empty");
        }
        else{
            Node manage=head;
            while(manage.beside!=null){
                manage=manage.beside;
            }
            System.out.println(manage.data+" is in the last of the list");
        }
    }

    public void readAtPosition(int position){
        if(head==null){
            System.out.println("Nothing to read at "+position+" since list is empty");
        }
        else{
            int counter=1;
            Node manage=head;
            while(counter<position){
                manage=manage.beside;
                counter++;
            }
            System.out.println(manage.data+" exists @ "+position);
        }
    }

    public static void main(String[] args) {
        LinkedObject linkedObject=new LinkedObject();
        linkedObject.addAtBegin(90.5);
        linkedObject.addAtBegin(false);
        linkedObject.addAtBegin('Q');
        linkedObject.addAtBegin("Zealous");

        linkedObject.traverse();
        // add at last
        linkedObject.add(true);
        linkedObject.add("Vineth");

        linkedObject.traverse();

        linkedObject.addAtPosition("Spring",2);

        linkedObject.traverse();

        linkedObject.remove();

        linkedObject.traverse();

        linkedObject.removeLast();

        linkedObject.traverse();

        linkedObject.removeAtPosition(4);

        linkedObject.traverse();

        linkedObject.readBegin();

        linkedObject.readLast();

        linkedObject.readAtPosition(3);
    }
}
