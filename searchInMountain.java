public class searchInMountain {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in dec part of the array
                // this may be the ans, but we look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // we are in asc part of the array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of 2
        // checks above
        return start; // or return end as both are equal
    }

    static int orderAgnosticBS(int[] arr, int target, int start , int end) {

            boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if( arr[mid] == target){
                return mid;
            }
            if(isAsc) {
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
           
        }
        return -1;
    }
}
