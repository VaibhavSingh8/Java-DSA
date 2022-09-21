package stack.TwoStacksInArray;

// O(1) solution

public class TwoStacksInArrayEfficient {
    public static void main(String[] args) {
        TwoStacksEff tsEff =new TwoStacksEff(5);
        tsEff.push1(2);
        tsEff.push2(12);
        tsEff.push1(14);
        System.out.println(tsEff.pop1());
        tsEff.push2(22);
        System.out.println(tsEff.size2());
        System.out.println(tsEff.size1());
        System.out.println(tsEff.peek1());
        System.out.println(tsEff.peek2());

    }

    public static class TwoStacksEff{
        int arr[];
        int size;
        int top1;
        int top2;

        TwoStacksEff(int n){
            size = n;
            arr = new int[n];
            top1 = -1;
            top2 = n;
        }

        void push1(int x){
            if (top1 < top2 - 1){
                top1++;
                arr[top1] = x;
            }
            else {
                System.out.println(" Stack Overflow");
            }
        }

        void push2(int x){
            if (top1 < top2 - 1){
                top2--;
                arr[top2] = x;
            }
            else {
                System.out.println(" Stack Overflow");
            }
        }

        int pop1(){
            if (top1 > -1){
                int ans = arr[top1];
                top1--;
                return ans;
            }
            else{
                System.out.println("Stack Underflow");
            }
            return 0;
        }

        int pop2(){
            if (top1 >= 0){
                int ans = arr[top2];
                top2++;
                return ans;
            }
            else {
                System.out.println(" Stack Underflow");
            }
            return 0;
        }

        int size1(){
            return (top1+1);
        }

        int size2(){
            return (size - top2);
        }

        int peek1(){
            return arr[top1];
        }

        int peek2(){
            return arr[top2];
        }

    }
}
