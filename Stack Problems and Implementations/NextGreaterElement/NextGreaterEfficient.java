package stack.NextGreaterElement;

// O(n) time and aux. space

// using arraylist to store values and reverse them.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class NextGreaterEfficient {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 15, 10, 8, 6, 12, 9, 18};
        ArrayList<Integer> nextGreaterEff = nextGreaterEff(arr, arr.length);
        for (int i = 0; i < nextGreaterEff.size(); i++) {
            int x = nextGreaterEff.get(i);
            System.out.print(x + " ");
        }
    }
    private static ArrayList<Integer> nextGreaterEff(int[] arr, int n){
        ArrayList<Integer> al =  new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        al.add(-1);

        for (int i = n-2; i>=0; i--){
            while (st.isEmpty() == false && st.peek() <= arr[i]){
                st.pop();
            }
            int nxtGreater = st.isEmpty() ? -1 : st.peek();
            al.add(nxtGreater);
            st.push(arr[i]);
        }
        Collections.reverse(al);
        return al;
    }
}
