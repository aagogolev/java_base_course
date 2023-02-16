package lesson18;

public class Array {
    public static void sortirovra(int[] ar1) {

        for (int j = 0; j < ar1.length; j++) {
            System.out.print(ar1[j] + " ");
        }

        int step_sort = ar1.length;

        while (step_sort > 0) {
            for (int i = ar1.length - 1; i != 0; i--) {
                if (ar1[i] > ar1[i - 1]) {
                    int tmp = ar1[i];
                    ar1[i] = ar1[i - 1];
                    ar1[i - 1] = tmp;
                }
            }
            step_sort--;
        }
        System.out.println();
        for (int j = 0; j < ar1.length; j++) {
            System.out.print(ar1[j] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6};
        sortirovra(arr1);

        int[] arr2 = {8, 9, 16, 23, 45, 64, 1};
        sortirovra(arr2);
    }
}
