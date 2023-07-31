package data.java.structures.schemes;

/*
Queue >> FiFo
front   >> beginning    >> deletion>> dequeue
rear    >> end          >> insertion> enqueue
traverse
search
sort
 */

public class QueueList {
    class Queue{
        double data;
        Queue dataLink;
        public Queue(){}
        public Queue(double data){
            this.data=data;
            this.dataLink=null;
        }
    }

    Queue front,rear=null;// initialize front and rear

    public void enqueue(double data){
        Queue queue=new Queue(data);
        if(rear==null){
            System.out.println("It's empty queue so "+data+" is going to be front and rear");
            front=rear=queue;
            return;
        }
        rear.dataLink=queue;
        rear=queue;
        System.out.println(data+" has added in the rear");
    }

    public void traverse(){
        Queue explorer=front;
        while(explorer!=null){
            System.out.println(explorer.data);
            explorer=explorer.dataLink;
        }
    }

    public void dequeue(){
        if(front==null){
            System.out.println("Queue is empty can't perform the dequeue");
            return;
        }
        Queue queue=front;
        front=front.dataLink;
        System.out.println(queue.data+" is dequeued from queue");
    }

    public static void main(String[] args) {
        QueueList list=new QueueList();
        list.enqueue(4.5);list.enqueue(9.2);list.enqueue(14.5);list.enqueue(7.4);
        //list.traverse();
        list.dequeue();
        list.traverse();
    }

}
