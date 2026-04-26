public class BinarySearch {

    static int search(int arr[], int key) {

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {

            int mid = (left + right) / 2;

            if(arr[mid] == key)
                return mid;

            else if(arr[mid] < key)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,3,5,7,9};
        int key = 7;

        int result = search(arr, key);

        if(result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}
