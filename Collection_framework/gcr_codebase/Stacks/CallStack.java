class CallStack {

    
    private static class Frame {

        String functionName;
        Frame next;

        Frame(String functionName) {
            this.functionName = functionName;
            this.next = null;
        }
    }

    private Frame top;

    public CallStack() {
        top = null;
    }

 
    public void push(String functionName) {

        Frame newNode = new Frame(functionName);

        
        newNode.next = top;

        top = newNode;
    }

    
    public String pop() {

        if (isEmpty()) {
            throw new RuntimeException("No active function");
        }

        String name = top.functionName;

  
        top = top.next;

        return name;
    }

   
    public String peek() {

        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return top.functionName;
    }

  
    public boolean isEmpty() {
        return top == null;
    }

   
    public void display() {

        if (isEmpty()) {
            System.out.println("Call Stack Empty");
            return;
        }

        System.out.println("Current Call Stack:");

        Frame temp = top;

        while (temp != null) {
            System.out.println(temp.functionName);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        CallStack cs = new CallStack();

        cs.push("main()");
        cs.push("login()");
        cs.push("validate()");
        cs.push("encrypt()");

        cs.display();

        System.out.println("Current Function : " + cs.peek());

        System.out.println("Returned From : " + cs.pop());

        cs.display();
    }
}