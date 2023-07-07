package data.java.structures.schemes;

import java.util.Scanner;

public class StackArray {
    private Object[] stack;
    private int peek;

    public StackArray(){
        stack=new Object[10];// 0-9
        peek=-1;
    }

    public void push(Object obj){
        // stack is empty
        if(peek==-1){
            stack[0]=obj;
            peek=0;
            System.out.println(obj+" has pushed @ 0");
        }
        else if(peek==stack.length-1){
            System.out.println(obj+" couldn't push due to stack overflow");
        }
        // stack is not empty, find peek and add new value to peek + 1
        else{
            //peek=peek+1;
            ++peek;
            stack[peek]=obj;
            System.out.println(obj+" has pushed @ "+peek);
        }
    }

    public int top(){
        return peek;
    }

    public void traverse(){
        int point=peek;
        while(point!=-1){
            System.out.println(stack[point]+" exists @ "+point);
            point--;
        }
    }

    public void pop(){
        // check stack against underflow
        if(peek==-1){
            System.out.println("Stack is underflow, can't perform pop");
        }
        else{
            System.out.println(stack[peek]+" is about to pop");
            stack[peek]=null;
            --peek;
            System.out.println("Pop operation done");
        }
    }

    public void search(Object obj){
        int point=peek;
        while(point!=-1){
            if(stack[point].equals(obj)) {
                System.out.println(stack[point] + " exists @ " + point);
                return;
            }
            point--;
        }
        System.out.println(obj+" wasn't available in Stack");
    }

    public void clear(){
        stack=new Object[10];
        peek=-1;
    }

    public static void main(String[] args) {
        StackArray stk=new StackArray();
        Scanner scanner=new Scanner(System.in);
        String operation="";Object obj=null;
        System.out.println("------------------Welcome to TODO List--------------");
        do{
            System.out.println("Push\nPop\nTop\nSearch\nClear");
            System.out.println("Tell us what you wish to perform");
            operation= scanner.next();
            switch(operation){
                case "push":
                    System.out.println("Enter the data to push ");break;
                default:return;
            }
        }while(true);
//        stk.push(34);
//        stk.push(9.2);
//        stk.push("Razak");
//        stk.push(true);
//        stk.push('R');
//        System.out.println("Top position "+stk.top());
//        stk.traverse();
//        System.out.println("Top position "+stk.top());
//        stk.pop();
//        stk.pop();
//        System.out.println("Top position "+stk.top());
//        stk.search(2.1);
//        stk.search("Razak");
//        stk.search('R');
//        stk.clear();
//        stk.search("Razak");
//        System.out.println("Top position "+stk.top());
    }
}
