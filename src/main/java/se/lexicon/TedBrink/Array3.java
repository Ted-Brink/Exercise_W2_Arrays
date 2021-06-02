package se.lexicon.TedBrink;
import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {

        String cities[] = new String[]{"Paris", "London", "New York", "Stockholm"};

        System.out.print("String array: [");

        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i]);

            if (i < cities.length-1) {
                System.out.print(", ");
            }
            if (i == cities.length-1)
                System.out.print("]");
        }
        Arrays.sort(cities);                // Sortera i bokstavsordning

      //  System.out.printf("Modified arr[] : %s", Arrays.toString(cities)); // För test
        System.out.println();
        System.out.print("Sort string array: [");

        for (int j = 0; j < cities.length; j++) {
            System.out.print(cities[j]);

            if (j < cities.length-1) {      // för att inte ha kommatecken efter sista staden --- length-1
                System.out.print(", ");
            }
            if (j == cities.length-1)       // Efter sista staden ]
                System.out.print("]");
        }
    }
}
