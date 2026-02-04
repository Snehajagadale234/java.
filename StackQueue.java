import java.util.Scanner;

class StackQueue {
    int stack[], queue[];
    int top = -1;
    int front = 0, rear = -1;
    int size;

    StackQueue(int size) {
        this.size = size;
        stack = new int[size];
        queue = new int[size];
    }

    // ===== STACK OPERATIONS =====
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }

    // ===== QUEUE OPERATIONS =====
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front++] + " removed from queue");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackQueue obj = new StackQueue(5);

        // Stack demo
        obj.push(10);
        obj.push(20);
        obj.pop();

        // Queue demo
        obj.enqueue(30);
        obj.enqueue(40);
        obj.dequeue();
    }
}
