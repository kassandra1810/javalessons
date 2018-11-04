package javalessons.algorithms.arrayrotation;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {3, 6, 5, 8, 9, 0, 2};
        Task1.printArray(array);
        int[] rArray = Task1.rotation(array, 2);
        Task1.printArray(rArray);

    }

    public static int[] rotation(int[] arr, int times) {
        int[] rotatedArray = arr.clone();
        times = times % arr.length;
        for (int i = 0; i < arr.length; i++) {
            rotatedArray[(i + times) % arr.length] = arr[i];
        }

        return rotatedArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
