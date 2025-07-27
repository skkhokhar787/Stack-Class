import java.util.ArrayList;

public class StackArray {
    class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push
        public static void push (int data) {
            list.add(data);
        }

        // Pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.getLast();
            list.removeLast();
            return top;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.getLast();
        }
    }

    public static void main (String [] args) {
        StackClass.Stack s = new StackClass.Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }


    }
}
