package stack.StockSpan;

import java.util.Stack;

public class StockSpanEfficient {
    public static void main(String[] args) {
        int [] arr = new int[]{ 13,15,12,14,16,8,6,4,10,30};
        StockSpan(arr, arr.length);
    }
    private static void StockSpan(int arr[], int n){
        Stack<Integer> st = new Stack<>();
        st.add(0);
        System.out.println(1 + " ");
        for (int i = 1; i < n; i++){
            while (st.isEmpty() == false && arr[st.peek()]<= arr[i]){
                st.pop();
            }
            int span = st.isEmpty() ? i+1 : i-st.peek();
            System.out.println(span + " ");
            st.push(i);
        }
    }
}
