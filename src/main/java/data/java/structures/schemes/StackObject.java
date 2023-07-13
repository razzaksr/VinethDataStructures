package data.java.structures.schemes;

public class StackObject {
    private class Pack{
        Object data;
        Pack connect;
    }
    private Pack peek;

    public StackObject(){
        peek=null;
    }

    public void push(Object content){
        Pack pack=new Pack();
        pack.data=content;

        if(peek==null) {
            System.out.println("Stack is empty");
//            peek=pack;
            System.out.println(content + " has set as Peek");
        }
        else{
            System.out.println(content+" has pushed over "+peek.data);
        }
        pack.connect=peek;
        peek=pack;
    }

    public void traverse(){
        Pack explorer = new Pack();
        explorer=peek;
        while(explorer!=null){
            System.out.println(explorer.data+" is current value");
            explorer=explorer.connect;
        }
    }

    public void pop(){
        if(peek==null){
            System.out.println("Underflow, can't pop anything");
        }
        else{
            Object toBeDeleted=peek.data;
            peek=peek.connect;
            System.out.println(toBeDeleted+" has popped off stack");
        }
    }

    public void clear(){
        peek=null;
        System.out.println("Whole stack has cleared");
    }

    public Object getPeek(){
        return peek.data;
    }

    public void search(Object obj){
        int count=0;
        Pack explorer = new Pack();
        explorer=peek;
        while(explorer!=null){
            count++;
            if(explorer.data.equals(obj)){
                System.out.println(count+" is the poistion where the "+obj+" exists");
                return;
            }
            explorer=explorer.connect;
        }
        System.out.println(obj+" not exists in the stack");
    }

    public static void main(String[] args) {
       StackObject stk=new StackObject();
       stk.push("Razak");
       stk.push(29);
       stk.push(8.9);
       stk.push(true);

       //stk.traverse();
       //stk.clear();
       //stk.traverse();
//
       stk.pop();
       stk.pop();
//
//       stk.traverse();

        System.out.println(stk.getPeek());

        stk.search(true);
        stk.search("Razak");

    }
}
