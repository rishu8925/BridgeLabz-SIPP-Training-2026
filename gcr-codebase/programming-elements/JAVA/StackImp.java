class StackImp {
    private int[] data;
    private int top;
    StackImp(int capacity) {
    data = new int[capacity];
    top = -1;
    }
    void push(int x) {
    if (top == data.length - 1) throw new RuntimeException("Stack overflow");
        data[++top] = x;
    }
    int pop() {

    if (isEmpty()) throw new RuntimeException("Stack underflow");
        return data[top--];
    }
    int peek() {
    if (isEmpty()) throw new RuntimeException("Stack is empty");
    return data[top];
    }
    boolean isEmpty() {
    return top == -1;
    }
}