import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();

        System.out.println("4'ün Kuvvetleri");
        for(int i=1; i<=sayi; i*=4){
            System.out.println(i);
        }

        System.out.println("5'in Kuvvetleri");
        for(int i=1; i<=sayi; i*=5){
            System.out.println(i);
        }

    }
}