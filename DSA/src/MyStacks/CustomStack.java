package MyStacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack(int size){
        this.data = new int[size];
    }

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
      ptr++;
      data[ptr] = item;
      return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot not perform pop from an empty stack");
        }
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
          throw new Exception("Cannot not perform pop from an empty stack");
        }
        return data[ptr];
    }

    protected boolean isFull(){
        return ptr == data.length -1;
    }
    protected boolean isEmpty(){
        return ptr == -1;
    }
    
}
