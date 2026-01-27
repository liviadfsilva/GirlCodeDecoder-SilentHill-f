package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String exit = "";

        System.out.println("Welcome to the Girl Code Decoder! Inspired by Silent Hill f");

        while(!exit.equals("Q")){

            System.out.println("What word would you like to decode?");
        
            String word = scanner.nextLine();

            for(char letter : word.toCharArray()){

                if(Code.map.containsKey(letter)){
                    System.out.print(Code.map.get(letter));
                } else{
                    System.out.print("?");
                }
            }

            System.out.println();
            System.out.println("Press Q to quit, or Enter to continue.");
            exit = scanner.nextLine().trim().toUpperCase();

        }

        scanner.close();
        System.out.println("Goodbye & Good luck!");
        
    }
}