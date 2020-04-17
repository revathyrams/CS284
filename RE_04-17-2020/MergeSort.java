public class MergeSort {
    public  int[] mergeSortHelper(int[] nums) {
        if (nums.length <= 1) return nums;
        mergeSort(nums, nums.length);
        for (int n : nums) System.out.println(n);
        return nums;
    }

    private  void mergeSort(int[] nums, int n) {
       if(n < 2) return;

       int mid = n / 2;
       int[] l = new int[mid];
       int[] r = new int[n - mid];
       //copy first half of the elements to left array
       for(int i = 0; i < mid; i++) {
            l[i] = nums[i];
        }
       //copy second half of the elements to right array
       for(int j = mid; j < n; j++) {
           r[j - mid] = nums[j];
       }

       mergeSort(l, mid);
       mergeSort(r, n - mid);

       merge(nums, l, r, mid, n - mid);

    }

    private void merge(int[] nums, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                nums[k] = l[i];
                i++;
                k++;
            } else {
                nums[k] = r[j];
                j++;
                k++;
            }
        }
        while (i < left) {
            nums[k++] = l[i++];
        }
        while (j < right) {
            nums[k++] = r[j++];
        }
    }

}

