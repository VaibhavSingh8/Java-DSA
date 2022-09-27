package stack.Histogram;

// O(n)

import java.util.Stack;

public class LargestAreaBetter {
    public static void main(String[] args) {
        int[] arr = new int[]{6,2,5,4,1,5,6};
        System.out.println(getMaxRectArea(arr, arr.length));
    }
    private static int getMaxRectArea(int [] arr, int n){
        int res = 0;

        int[] prevSmaller = new int[n]; // to store previous smaller elements for saving the time of traversal and reduce complexity
        int[] nextSmaller = new int[n]; // to store next smaller elements for saving the time of traversal and reduce complexity

        Stack<Integer> st = new Stack<>();

        //store prev Smaller
        st.push(0);
        for (int i = 0; i<n; i++){
            while (st.isEmpty() == false && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            int pse = st.isEmpty()?-1:st.peek();
            prevSmaller[i] = pse;
            st.push(i);
        }

        while (st.isEmpty() == false){
            st.pop();
        }

        // store next Smaller
        st.push(n-1);
        for (int  i = n-1; i >0; i-- ){
            while (st.isEmpty()==false && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            int nse = st.isEmpty() ? n : st.peek();
            nextSmaller[i] = nse;
            st.push(i);
        }

        for (int i = 0 ; i < n; i++){
            int curr =arr[i];
            curr += (i - prevSmaller[i] - 1)*arr[i];
            curr += (nextSmaller[i] -i -1)*arr[i];
            res = Math.max(res, curr);
        }
    return res;
    }
}
