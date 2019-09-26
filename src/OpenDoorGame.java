import java.util.Scanner;

public class OpenDoorGame {
    public static void main(String[] args){
        int doorChoice;
        String result = null;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the door you choose. >>> ");
        doorChoice = input.nextInt();

        if (doorChoice == 1)
            result = "$100";
        else if (doorChoice == 2)
            result = "$200";
        else if (doorChoice == 3)
            result = "$300";

        System.out.println(result);

    }
}
