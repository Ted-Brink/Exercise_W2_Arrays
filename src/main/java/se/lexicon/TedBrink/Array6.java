package se.lexicon.TedBrink;

public class Array6 {
    public static void main(String[] args) {
        int[]arr = new int [] {43, 5, 23, 17, 2, 14};
        double total= 0;

        for( int i = 0; i < arr.length; i++ ) {
            total = total + arr[i];
        }
        System.out.println(total/arr.length);
    }
}
