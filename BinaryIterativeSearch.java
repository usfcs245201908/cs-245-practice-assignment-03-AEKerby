public class BinaryIterativeSearch implements Practice03Search{

    public String searchName() {
        return "binary iterative";
    }

    public int search(int [] arr, int target){

        int low = 0;
        int upper = arr.length - 1;

        while (low <= upper) {

            int mid = (low + upper) / 2;

            if(target == arr[mid]){
                return mid;
            }
            else if (target < arr[mid]){
                upper = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
