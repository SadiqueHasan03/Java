public class LinearSearching {
    public static void main(String[] args) {
        int[] nums = {23,45,6,7,56,87,65,-1};
        int target = 87;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        int ans2 = linearSearch2(nums, target);
        System.out.println(ans2);
        int ans3 = linearSearch3(nums, target);
        System.out.println(ans3);
        boolean ans4 = linearSearch4(nums, target);
        System.out.println(ans4);


    }
    // search the array: return the index if item found
    // otherwise return -1
    static int linearSearch(int[] arr , int target){
        if(arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
        // this line will execute if none of the return
        // hence the target not found
        return -1;
    }

    static int linearSearch2(int[] arr , int target){
        if(arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return element;
            }

        }
        // this line will execute if none of the return
        // hence the target not found
        return -1;
    }

    static int linearSearch3(int[] arr , int target){
        if(arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return element;
            }

        }
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch4(int[] arr , int target){
        if(arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return true;
            }

        }
        return false;
    }
}
