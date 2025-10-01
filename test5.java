import java.util.Scanner;
public class test5 {

    public static int num2;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scan.nextInt();
        test2(num1);


}
    public static void test2(int num){
        num2 = num;

}
}