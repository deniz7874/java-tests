import java.util.Scanner;

public class test2 {


   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

     System.out.println("grade");
     int grade = scan.nextInt();

     if (grade >= 50 && grade < 60 ) {
        System.out.println("you got a level 1");
       } else if (grade >= 60 && grade < 70 ) {
        System.out.println("you got a level 2");
       } else if (grade >= 70 && grade < 80 ) {
        System.out.println("you got a level 3");
       } else if (grade >= 80 && grade < 90 ) {
        System.out.println("you got a level 4");
       } else if (grade >= 90 && grade < 100 ) {
        System.out.println("you got a level 4+");
       } else if (grade >= 0 && grade < 50 ) {
        System.out.println("you got a level R");
       } else {
          System.out.println("Invalid grade");
         }



 }
}