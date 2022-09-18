package Stack_Problems.ArrayImplementationOfStack;

public class ArrayImplementationOfStack {
    public static void main(String[] args) {
        NewStack s = new NewStack(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }

    private static class NewStack {
        int arr[];
        int cap;
        int top;

        NewStack(int c) {
            top = -1;
            cap = c;
            arr = new int[cap];
        }

        //push function
        void push(int x) {
            if (top == cap - 1) {
                System.out.println("Stack is Full");
            }
            top++;
            arr[top] = x;
        }

        //pop function
        int pop() {
            if (top == -1) {
                System.out.println("Empty Stack!");
            }
            int res = arr[top];
            top--;
            return res;
        }

        //size function returns size of the stack
        int size() {
            return top + 1;
        }

        // isEmpty function return boolean value i.e., true if stack is empty and false if not empty
        boolean isEmpty() {
            return (top == -1);
        }

        //peek function returns top element in the stack
        int peek() {
            if (top == -1) {
                System.out.println("Empty Stack! Cannot peek");
            }
            return arr[top];
        }
    }
}
