/* 
Name:Elizabeth Pursell
Date: 2/18/2022
CSE 007 Spring 2022: Lab 4
Produce Respect program that will output a given word or phrase in a chosen format
IDE Used: Visual Studio Code
*/
import java.util.Scanner;
public class Respect {
    public static void main(String[] args){
        //create scanner and initiate variables
        Scanner myScan = new Scanner(System.in);
        char inputChar = 0;
        String word;

        do{
            //prompt user for word to format
            System.out.println("Enter word to be used in your pattern selection.");
            word = myScan.nextLine();

            //prompt user to choose format for word
            System.out.println("Enter an A, B, C, or D to choose a pattern for your word or an X to quit.");
            inputChar = Character.toUpperCase(myScan.nextLine().charAt(0));

            //switch statement to assign for loops to create patterns for each choice
            switch (inputChar){
                //for loops to create left triangle R to RESPECT
                case 'A':
                    for(int row = 0; row < word.length(); row++){
                        for(int column = 0; column <= row; column++){
                            System.out.print(word.charAt(column));
                        }
                        System.out.println();
                    }
                    break;
                //for loops to create left triangle RESPECT to R
                case 'B':
                    for(int row = word.length() - 1; row >= 0; row--){
                        for(int column = 0; column <= row; column++){
                            System.out.print(word.charAt(column));
                        }
                        System.out.println();
                    }
                    break;
                //for loops to create right triangle R to RESPECT
                case 'C':
                    for(int row = 0; row < word.length(); row++){
                        for(int blanks = word.length()-1; blanks >= row; blanks--){
                            System.out.print(" ");
                        }
                        for(int column = row; column >= 0; column--){
                            System.out.print(word.charAt(column));
                        }
                        System.out.println();
                    }
                    break;
                //for loops to create left triangle TCEPSER to R
                case 'D':
                    for(int row = word.length() - 1; row >= 0; row--){
                        for(int column = row; column >= 0; column--){
                            System.out.print(word.charAt(column));
                        }
                        System.out.println();
                    }
                    break;
                //quit if X inputted
                case 'X':
                    break;
                //print error message if invalid input
                default:
                    System.out.println("You entered an invalid pattern choice");
            }
        } while(inputChar != 'X');   //stops asking for new input if X is inputted

    }
}
