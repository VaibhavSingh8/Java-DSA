package stack.PreviousGreaterElement;

// O(n)

import java.util.Stack;

public class PreviousGreaterEfficient {
    public static void main(String[] args) {
        int [] arr = new int[]{ 13,15,12,14,16,8,6,4,10,30};
        PrevGreatEle(arr, arr.length);
    }
    private static void PrevGreatEle(int[] arr, int n){
        Stack<Integer> st = new Stack<>();
        st.add(arr[0]);
        System.out.print(-1 + " ");
        for (int i = 1; i < n; i++){
            while(st.isEmpty() == false && st.peek() <= arr[i] ){
                st.pop();
            }
            int prevGreat = st.isEmpty() ? -1 : st.peek();
            System.out.print(prevGreat + " ");
            st.push(arr[i]);
        }
    }
}
