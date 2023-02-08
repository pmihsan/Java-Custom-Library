package ArrayClass;

import java.util.Arrays;

public class ArrayImplementation {
    public static void main(String[] args) {

        // Array Copy
        String s = "decaffeinated";
        char[] arr = s.toCharArray();
        char[] arrCopy = new char[7];
        System.arraycopy(arr, 2, arrCopy, 0, 7);
        System.out.println(String.valueOf(arrCopy));

        // Cloning
        char[] arrClone = arr.clone();
        System.out.println(String.valueOf(arrClone));

        System.out.println(Arrays.compare(arr, arrClone));
        System.out.println(Arrays.compare(arr, arrCopy));

        System.out.println(Arrays.copyOf(arrCopy,3));
        System.out.println(Arrays.copyOfRange(arrCopy, 1, 7));

        int[] a = new int[3];
        Arrays.fill(a, -1);
        System.out.println(Arrays.toString(a));

        // Sorting
        int[] nums = {4, 5, 3, 1, 6, 7};
        int[] num0 = new int[nums.length];
        int[] num1 = new int[nums.length];
        System.arraycopy(nums, 0, num0, 0, nums.length);
        System.arraycopy(nums, 0, num1, 0, nums.length);

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Arrays.parallelSort(num0);
        System.out.println(Arrays.toString(num0));
        Arrays.sort(num1, 0, 3);
        System.out.println(Arrays.toString(num1));

    }
}
