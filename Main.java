//Napisz program, który odwróci tablicę z wartościami całkowitymi.
import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static int[] readArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość elementów tablicy:");
        int n = scan.nextInt();
        int[] tab = new int[n];
        System.out.println("Podaj elementy tablicy:");
        for (int i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
        }
        return tab;
    }
  public static void printArray(int []tab ){
    System.out.println("Składniki tablicy:");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
  }

  
  public static int []ReversTab(int [] tab){
int[] revTab = Arrays.copyOf(tab, tab.length);
        int i = 0;
        int j = revTab.length - 1;

        while (i < j) {
            int temp = revTab[i];
            revTab[i] = revTab[j];
            revTab[j] = temp;

            i++;
            j--;
        }
    return revTab;
  }
  public static void main(String[] args) {
  
         int[] tab = readArray();
         printArray(tab);

        int [] revTab=ReversTab(tab);
        printArray(revTab);
    
  }
}