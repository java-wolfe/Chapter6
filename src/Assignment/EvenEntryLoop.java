package Assignment;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int userEntry = 0;

        while (userEntry != 999){
            System.out.println("Please enter a number >>>");
            userEntry = input.nextInt();

        }
    }
}
