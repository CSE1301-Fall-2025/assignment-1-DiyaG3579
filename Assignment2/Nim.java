import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sticks = 7;
        while (sticks > 0) {
        System.out.print("There are " + sticks + " in the pile? You can draw one or two, how many will you draw?");
        int draw = scan.nextInt();
        if (draw == 2) {
            sticks = sticks - 2;
            System.out.println("There are " + sticks + " sticks in the pile now");
            if (sticks == 0) { 
                System.out.println("You drew the last two sticks. You won!");
            }
            if (sticks != 0) {
                int cdraw = (int)(Math.random()*2 + 1);
                sticks = sticks - cdraw;
                System.out.println("The computer drew " + cdraw + " sticks. There are " + sticks + " in the pile now.");
                    if (sticks == 0) {
                        if (cdraw == 1) {
                        System.out.println("The computer drew the last stick. You lost");
                        }
                        else {
                        System.out.println("The computer drew the last two sticks. You lost");
                        }
                    }   
            }
        }
        else if (draw == 1) {
        sticks = sticks - 1;
        System.out.println("There are " + sticks + " sticks in the pile now");
            if (sticks == 0) {
                System.out.println("You drew the last stick! You won!");
            }
            if (sticks != 0) {
            int cdraw = (int)(Math.random()*2 + 1);
            sticks = sticks - cdraw;
            System.out.println("The computer drew " + cdraw + " sticks. There are " + sticks + " in the pile now.");
                if (sticks == 0) {
                    if (cdraw == 1) {
                    System.out.println("The computer drew the last stick. You lost");
                    }
                else {
                    System.out.println("The computer drew the last two sticks. You lost");
                    }
                }
            }
        else {
            System.out.println("That is an invalid move. Please choose to draw 1 or 2 sticks.");
            System.out.println("There are " + sticks + " sticks in the pile still");
            System.out.println("Please choose a valid move");
            draw = scan.nextInt();
            if (draw == 2) {
             sticks = sticks - 2;
             System.out.println("There are " + sticks + " sticks in the pile now");
                if (sticks == 0) { 
                    System.out.println("You drew the two last sticks! You won!");
                }
                if (sticks != 0) {
                int cdraw = (int)(Math.random()*2 + 1);
                sticks = sticks - cdraw;
                System.out.println("The computer drew " + cdraw + " sticks. There are " + sticks + " in the pile now.");
                    if (sticks == 0) {
                        if (cdraw == 1) {
                            System.out.println("The computer drew the last stick. You lost");
                        }
                        else {
                            System.out.println("The computer drew the last two sticks. You lost");
                        }
                    }
                }
            }
            else if (draw ==1) {
                sticks = sticks -1;
                System.out.println("There are " + sticks + " sticks in the pile now");
                if (sticks == 0) { 
                    System.out.println("You drew the last stick! You won!");
                }
                if (sticks != 0) {
                    int cdraw = (int)(Math.random()*2 + 1);
                    sticks = sticks - cdraw;
                    System.out.println("The computer drew " + cdraw + " sticks. There are " + sticks + " in the pile now.");
                        if (sticks == 0) {
                            if (cdraw == 1) {
                            System.out.println("The computer drew the last stick. You lost");
                            }
                            else {
                            System.out.println("The computer drew the last two sticks. You lost");
                            }
                        }
                    }
            }
                else {
                System.out.println("After two illegal moves the computer will go now");
                if (sticks != 0) {
                    int cdraw = (int)(Math.random()*2 + 1);
                    sticks = sticks - cdraw;
                    System.out.println("The computer drew " + cdraw + " sticks. There are " + sticks + " in the pile now.");
                    if (sticks == 0) {
                        if (cdraw == 1) {
                        System.out.println("The computer drew the last stick. You lost");
                        }
                        else {
                        System.out.println("The computer drew the last two sticks. You lost");
                        }
                    }
                }        
            }
            

    


        }

    }
        }
    }
}

