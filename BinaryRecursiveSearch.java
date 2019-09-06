public class BinaryRecursiveSearch implements Practice03Search{

    public String searchName() {
        return "binary recursive";
    }

    public int search(int [] arr, int target){
        return search(arr, 0, arr.length - 1, target);
    }

    private int search(int [] arr, int low, int high, int target){
		if (low > high){
			return -1;
		}
		int mid = (high + low)/2;
		if (arr[mid] == target) {
			return mid;
		}
		else if (arr[mid] < target){
			return search(arr, mid + 1, high, target );
		}
		else {
			return search(arr, low, mid - 1, target);
		}
	}

}
