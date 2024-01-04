package difficult_programming_answers;

import java.util.Stack;

class QueueUsingTwoStacks {
    private Stack<Integer> stack1; 
    private Stack<Integer> stack2; 

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int data) {
        
        stack1.push(data);
        System.out.println(data + " enqueued to the queue");
    }

    public void dequeue() {
        if (stack2.isEmpty()) {
           
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
        
            System.out.println(stack2.pop() + " dequeued from the queue");
        }
    }

    public void display() {
        if (stack2.isEmpty()) {
       
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
           
            System.out.println("Queue is empty.");
        } else {
        
            System.out.print("Queue: ");
            for (Integer item : stack2) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}

public class QueueUsingTwoStacksExample {
    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        queue.dequeue();
        queue.display();

        queue.enqueue(40);
        queue.display();
    }
}

