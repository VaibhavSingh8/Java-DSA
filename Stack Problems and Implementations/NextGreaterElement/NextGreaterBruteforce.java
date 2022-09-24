package stack.NextGreaterElement;

// O(n^2) Quadratic time

public class NextGreaterBruteforce {
    public static void main(String[] args) {
        int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};
        nextGreater(arr, arr.length);
    }
    private static void nextGreater(int[] arr, int n){
        for (int i = 0; i<n; i++){
            int j;
            for (j = i+1; j < n; j++){
                if (arr[i] < arr[j]){
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j == n){
                System.out.print(-1 + " ");
            }
        }
    }
}
