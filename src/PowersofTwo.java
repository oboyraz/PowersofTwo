import java.util.Scanner;

public class PowersofTwo {
    /*
    Using the Java language, have the function PowersofTwo(num) take the num parameter being passed which will be an integer
       *and return the string true if it's a power of two.
       *If it's not return the string false.
       *for example if the input is 16 then your program should return the string true
       *but if the input is 22 then the output should be the string false.
       */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sayi = scan.nextInt();
        System.out.println(powersOfTwo(sayi));
    }
    private static String powersOfTwo(int sayi) {
        String out = "false";
        while (sayi%2==0){
            sayi/=2;
            if (sayi==1){
                out = "true";
                break;
            }
        }
        return out;
    }
}