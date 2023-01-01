package array.RemoveDuplicatesSortedArray;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 30, 30, 40, 40};

         removeDuplicates(arr);

        // Printing updated array
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static int removeDuplicates(int arr[]) {
        int n = arr.length;
        int j = 1; //maintaining a separate tracker for no. of unique elements in beginning

        for(int i = 1 ; i < n; i++){
            if(arr[i] != arr[j-1]){
                arr[j] = arr[i];
                j++;
            }
        }

        return j;
    }
}
