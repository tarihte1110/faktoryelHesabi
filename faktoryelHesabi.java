import java.util.Scanner;
public class faktoryelHesabi {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        long faktoryel=1;

        System.out.print("Bir tam sayı giriniz:");
        long a=input.nextLong();

        while(a>0){
            faktoryel=faktoryel*a;
            a--;
        }
        System.out.print("SONUÇ: "+faktoryel);
    }
}
