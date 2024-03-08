package myQueues;

public class CustomQueues {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;
    

    public CustomQueues(int size){
        this.data = new int[size];
    }

    public boolean enqueue(int val){
        if(isFull()){
            System.out.println("The queue is full");
            return false;
        }
        data[end++] = val;
        return true;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
        int removed = data[0];

        for(int i = 1; i < end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front(){
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
        return data[0];
    }
    public int last(){
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
        return data[data.length - 1];
    }

    public CustomQueues(){
        this(DEFAULT_SIZE);
    }

    protected boolean isFull(){
        return end == data.length - 1;
    }

    protected boolean isEmpty(){
        return end == 0;
    }
   
}
