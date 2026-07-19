class UndoBuffer {

    private String[] data;
    private int top;

    
    public UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

  
    public boolean push(String edit) {
    
        if (top == data.length - 1) {
            return false;
        }

        data[++top] = edit;
        return true;
    }

    
    public String pop() {
      
        if (isEmpty()) {
            throw new RuntimeException("Nothing to undo");
        }

        return data[top--];
    }


    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return data[top];
    }

   
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Undo Buffer is Empty");
            return;
        }

        System.out.println("Undo Buffer:");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {

        UndoBuffer ub = new UndoBuffer(5);

        ub.push("Typed Hello");
        ub.push("Deleted World");
        ub.push("Inserted Java");

        ub.display();

        System.out.println("Peek : " + ub.peek());

        System.out.println("Undo : " + ub.pop());

        ub.display();
    }
}