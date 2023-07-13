package data.java.structures.schemes;

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

    public void addAtLast(Object obj){
        Node userNode=new Node(obj);

        if(head==null){
            System.out.println("Head is Null, so "+obj+" is first node in the list");
        }
        else{
            System.out.println(obj+" has added as last");
            userNode.beside=head;
        }
        head=userNode;
    }

    public void traverse(){
        Node manage=head;
        while(manage!=null){
            System.out.println(manage.data);
            manage=manage.beside;
        }
    }

    public static void main(String[] args) {
        LinkedObject linkedObject=new LinkedObject();
        linkedObject.addAtLast(90.5);
        linkedObject.addAtLast(false);
        linkedObject.addAtLast('Q');
        linkedObject.addAtLast("Zealous");

        linkedObject.traverse();

    }
}
