package se.lexicon.TedBrink;

public class Array4 {
    public static void main(String[] args) {
        int arr1 [] = new int[] {1, 15, 20};
        int arr2 [] = new int[arr1.length];

        System.out.print("Elements first array: ");
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
        System.out.println();
        System.out.print("Elements from second array: ");
        for (int i = 0; i < arr1.length; i++){
            arr2[(i)] = arr1[(i)];
            System.out.print(arr2[(i)] + " ");
        }
    }
}
