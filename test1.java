import java.util.Scanner;

public class test1 {


    public static void main(String[] args) {
     Scanner mica = new Scanner(System.in);
     //String x = mica.next();
     //String y = mica.nextline();
     System.out.println("Enter length");
     int a = mica.nextInt();
     System.out.println("Enter width");
     int b = mica.nextInt();
     System.out.println("Enter height");
     int c = mica.nextInt();


     //double b = mica.nextDouble();
     System.out.println("The area of " + a + ", " + b + " and " + c + " is " + (a * b * c));



    }



}