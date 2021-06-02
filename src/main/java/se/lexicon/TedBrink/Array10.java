package se.lexicon.TedBrink;

public class Array10 {

    public static void main(String[] args) {

        /*int [][] arr;                     // Egentligen skulle faktorena lagras i en array men jag kom inte på
        arr = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10} , // hur jag ska göra för att skapa multiPtabellen.
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}}; */

        int num = 10;   // Antal faktorer.
        int[][] multiP = new int[num][num]; // plats för lagring av multiplikationstabellen.

        for (int i = 0; i < num; i++)       // fyllning av tabellen
            for (int j = 0; j < num; j++)
                multiP[i][j] = (i + 1) * (j + 1);   // lägger till 1 för det är lägsta faktorn som används.


        for (int i = 0; i < num; i++) {     // Uskrift av tabellen.
            for (int j = 0; j < num; j++)
                if (multiP[i][j] < 10)       // Om produkten < 10, lägg till blanksteg
                    System.out.print((" " +multiP[i][j]) + " ");
                else
                System.out.print((multiP[i][j]) + " ");
            System.out.println();
        }
    }
}
