import java.util.Scanner;

public class GradeCalculator {
public static void main(String[] args) {
    int studios;
    int quizgrade;
    int examgrade;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scan.nextLine();
    System.out.println("How many studios did you attend? Type a Number Between 0 - 8");
    studios = scan.nextInt();
    double studiopercentage = (studios/8.0)*15.0;
    System.out.println("What was your average quiz grade (With the lowest two dropped)?");
    quizgrade = scan.nextInt();
    double quizpercentage = ((quizgrade/100.0)*25.0);
    System.out.println("What was your average exam grade?");
    examgrade = scan.nextInt();
    double exampercentage = (examgrade/100.0)*60.0;
    double finalgrade = studiopercentage + quizpercentage + exampercentage;
    System.out.println("Hello " + name +" your CSE 1301 results are below");
    System.out.println("Studio Percentage: " + studiopercentage + "%");
    System.out.println("Quiz Percentage: " + quizpercentage + "%");
    System.out.println("Exam Percentage: " + exampercentage + "%");
    System.out.println("Your final grade is " + finalgrade + "%");
} 
}
