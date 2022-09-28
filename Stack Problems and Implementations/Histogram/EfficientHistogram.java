package stack.Histogram;

import java.util.Stack;

public class EfficientHistogram {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr, arr.length));
    }
    private static int largestRectangleArea(int[] heights, int n) {


        Stack<Integer> st = new Stack<>();

        int res = 0, temp, curr;

        for(int i = 0 ; i < n ; i++){
            while(st.isEmpty() == false && heights[st.peek()] >= heights[i]){
                temp = st.pop();
                curr = heights[temp]*(st.isEmpty() ? i:(i- st.peek() - 1));

                res = Math.max(res, curr);
            }
            st.push(i);
        }

        while(st.isEmpty() == false){
            temp = st.pop();
            curr = heights[temp]*(st.isEmpty()?n:(n- st.peek() - 1));
            res = Math.max(res, curr);
        }
        return res;
    }
}
