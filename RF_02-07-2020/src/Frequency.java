public class Frequency {
    int[] arr;

    public Frequency(int[] arr){
        int length = arr.length;
        this.arr = new int[length];
        for (int i = 0; i < length; i++) {
            this.arr[i] = arr[i];
        }
    }

    public int countOf(int num){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) count++;
        }
        return count;
    }

}
