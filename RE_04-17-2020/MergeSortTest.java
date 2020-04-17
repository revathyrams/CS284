import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    void testMerge(){
        int[] nums = {10, 8, 5, 3, 4, 6};
        int[] expected = {3, 4, 5, 6, 8, 10};
        MergeSort m = new MergeSort();
         m.mergeSortHelper(nums);

        assertEquals(nums.length, expected.length);
        int i = 0;
        while(i < nums.length) assertEquals(expected[i], nums[i++]);
    }

    @Test
    void testEmptyArray(){
        int[] nums = {};
        MergeSort m = new MergeSort();

        m.mergeSortHelper(nums);

        assertEquals(nums.length, 0);

    }



}
