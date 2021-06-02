package se.lexicon.TedBrink;

public class Array7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 7, 9, 12};
        // int antalUdda; Vet inte om det var meningen  att man skulle skapa en array med udda tal.
      /*  for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2 > 0)
                antalUdda = antalUdda+1;  // Hur många udda? För att veta storlek på udda arrayen.
                       */
        System.out.print("Array: ");
        for (int i : arr) System.out.print(i + " ");

        System.out.println();

        System.out.print("Odd Array: ");

        for (int j : arr)
            if (j % 2 > 0)
                System.out.print(j + " ");

    }
}
