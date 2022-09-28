package stack.NextGreaterElement;

//https://leetcode.com/problems/next-greater-element-ii/

import java.util.Stack;

public class LeetcodeNextGreater2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] a = nextGreaterElements(nums);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static int[] nextGreaterElements(int[] nums) {
        int res[] = new int[nums.length];
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        for(int i = n-2; i>=0 ; i--){
            while(st.isEmpty() == false && st.peek() <= nums[i]){
                st.pop();
            }
            st.push(nums[i]);
        }

        for(int i = n-1 ; i>=0 ; i--){
            while(st.isEmpty() == false && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return res;
    }
}
