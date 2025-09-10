import java.util.Scanner;

public class NimOG {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sticks = 7;
    while (sticks > 0) {
    System.out.println("There are " + sticks + " sticks in the pile. How many will you draw?");
    int draw = scan.nextInt();
        if (draw == 2) {
        sticks = sticks - 2;
        System.out.println("There are " + sticks + " sticks in the pile now");
        }
        else if (draw == 1) {
        sticks = sticks - 1;
        System.out.println("There are " + sticks + " sticks in the pile now");
        }
        else {
            System.out.println("That is an invalid move. Please choose to draw 1 or 2 sticks.");
            System.out.println("There are " + sticks + " sticks in the pile still");
            System.out.println("Please choose a valid move");
            draw = scan.nextInt();
                if (draw == 2) {
        sticks = sticks - 2;
        System.out.println("There are " + sticks + " sticks in the pile now");
        }
        else if (draw == 1) {
        sticks = sticks - 1;
        System.out.println("There are " + sticks + " sticks in the pile now");
        }
        else {
            System.out.print("After two illegal moves, you lose a turn. The computer will go first now");
        }
    if (sticks != 1) {
    int cdraw = (int) (Math.random()*2 + 1);
    System.out.println("The computer drew " + cdraw + " sticks.");
    sticks = sticks - cdraw;
    System.out.println("There are " + sticks + " in the pile now");
        if (sticks == 0) {
            if (cdraw == 2){
                System.out.println("Since the computer drew the last two sticks, the Computer Won!");
            }

        }

    }
    else {
        sticks = sticks - 1;
        System.out.println("There are now " + sticks + "in the pile");
        System.out.println("Since the computer drew the last stick, the Computer Won!");
    }
}
    }

} 
}
