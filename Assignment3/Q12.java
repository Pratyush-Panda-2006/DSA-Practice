public class Q12 {
    public static int search(int[] arr, int left, int right, int key) {
        if (left > right){
            return -1;
        } 
        int mid = (left + right) / 2;
        if (arr[mid] == key){
            return mid;
        } 
        if (key < arr[mid]){
            return search(arr, left, mid - 1, key);
        } 
        return search(arr, mid + 1, right, key);
    }
    public static void main(String[] args) {
        int[]k={2,5,4,8,6,2,1};
        search(k, 2, 1, 8);
    }
}