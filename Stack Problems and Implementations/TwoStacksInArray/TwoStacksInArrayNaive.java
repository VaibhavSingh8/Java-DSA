package stack.TwoStacksInArray;


public class TwoStacksInArrayNaive {
    public static void main(String[] args) {
        TwoStacks ts=new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Pop from stack1 is: " + ts.pop1());
        ts.push2(40);
        System.out.println("Pop from stack2 is: " + ts.pop2());
    }

    public static class TwoStacks{
        int arr[];
        int size;
        int top1, top2;

        TwoStacks(int n){
            size = n;
            arr = new int[n];
            top1 = n/2 + 1;
            top2 = n/2;
        }

        void push1(int x){
            if(top1 > 0){
                top1 --;
                arr[top1] = x;
            }
            else{
                System.out.println("Stack full");
                return;
            }
        }

        void push2(int x){
            if(top2 < size -1){
                top2++;
                arr[top2] = x;
            }
            else{
                System.out.println("Stack full");
                return;
            }
        }

        int pop1()
        {
            if (top1 <= size / 2) {
                int x = arr[top1];
                top1++;
                return x;
            }
            else {
                System.out.println("Stack UnderFlow");
                System.exit(1);
            }
            return 0;
        }

        int pop2()
        {
            if (top2 >= size / 2 + 1) {
                int x = arr[top2];
                top2--;
                return x;
            }
            else {
                System.out.println("Stack UnderFlow");
            }
            return 0;
        }
    }

}
