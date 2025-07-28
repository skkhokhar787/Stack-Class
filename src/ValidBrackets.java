import java.util.ArrayList;

public class ValidBrackets {
    static class Stack {
        static ArrayList<String> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.isEmpty();
        }
        // Push
        public static void push (String data) {
            list.add(data);
        }
        // Pop
        public static String pop() {
            if (isEmpty()) {
                return "";
            }
            String top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        // Peek
        public static String peek() {
            if (isEmpty()) {
                return "";
            }
            return list.getLast();
        }
    }

    public static boolean isValidBrackets(String str) {
        ArrayList<Character> stack = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.add(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.get(stack.size() - 1);
                if ((ch == ')' && last == '(') ||
                        (ch == ']' && last == '[') ||
                        (ch == '}' && last == '{')) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test = "(Hello [I] am {Java})";
        System.out.println(isValidBrackets(test));
    }
}
