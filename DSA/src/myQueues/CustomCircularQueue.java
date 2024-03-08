package myQueues;

public class CustomCircularQueue{
  protected int[] data;
  private static final int DEFAULT_SIZE = 10;
  protected int end = 0;
  protected int front = 0;
  private int size = 0;

  public CustomCircularQueue(){
    this(DEFAULT_SIZE);
  }
  public CustomCircularQueue(int size){
    this.data = new int[size];
  }

  protected boolean isFull(){
    return size == data.length;
  }
  protected boolean isEmpty() throws Exception{
    return size == 0;
  }

  public boolean add(int val){
    if (isFull()) {
        return false;
    }
    data[end++] = val;
    end = end % data.length;
    size++;
    return true;
  }

  protected int remove() throws Exception{
    if(isEmpty()){
        throw new Exception("The queue sis empty");
    }
    int removed = data[front++];
    front = front % data.length;
    size--;
    return removed;


  }
  public int front() throws Exception{
    if(isEmpty()){
        throw new Exception("The queue is empty");
    }
    return data[front];
  }

  public void display() throws Exception{
    if(isEmpty()){
       System.out.println("Empty");
    }
   int i = front;
   do{
     System.out.print(data[i] + " -> ");
     i++;
     i %= data.length;
  }while(i != end);
  System.out.println("END");
}
}