package main.java.cz.cvut.fel.pjv;
 
import java.util.Scanner;
 
public class Lab01 {
 
    public void homework(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
        int operator;
        operator = input.nextInt();
        double num1, num2;
        int des_mist;
 
        switch (operator) {
            case (1):
                System.out.println("Zadej scitanec: ");
                num1 = input.nextDouble();
                System.out.println("Zadej scitanec: ");
                num2 = input.nextDouble();
                System.out.println("Zadej pocet desetinnych mist: ");
                des_mist = input.nextInt();
                if (des_mist < 0) {
                    System.err.println("Chyba - musi byt zadane kladne cislo!");
                    System.exit(101);
                }
                System.out.format("%."+des_mist+"f + %."+des_mist+"f = %."+des_mist+"f%n", num1, num2, num1 + num2);
                break;
            case (2):
                System.out.println("Zadej mensenec: ");
                num1 = input.nextDouble();
                System.out.println("Zadej mensitel: ");
                num2 = input.nextDouble();
                System.out.println("Zadej pocet desetinnych mist: ");
                des_mist = input.nextInt();
                if (des_mist < 0) {
                    System.err.println("Chyba - musi byt zadane kladne cislo!");
                    System.exit(101);
                }
                System.out.format("%."+des_mist+"f - %."+des_mist+"f = %."+des_mist+"f%n", num1, num2, num1 - num2);
                break;
            case (3):
                System.out.println("Zadej cinitel: ");
                num1 = input.nextDouble();
                System.out.println("Zadej cinitel: ");
                num2 = input.nextDouble();
                System.out.println("Zadej pocet desetinnych mist: ");
                des_mist = input.nextInt();
                if (des_mist < 0) {
                    System.err.println("Chyba - musi byt zadane kladne cislo!");
                    System.exit(101);
                }
                System.out.format("%."+des_mist+"f * %."+des_mist+"f = %."+des_mist+"f%n", num1, num2, num1 * num2);
                break;
            case (4):
                System.out.println("Zadej delenec: ");
                num1 = input.nextDouble();
                System.out.println("Zadej delitel: ");
                num2 = input.nextDouble();
                if (num2 == 0) {
                    System.err.println("Pokus o deleni nulou!");
                    System.exit(103);
                }
                System.out.println("Zadej pocet desetinnych mist: ");
                des_mist = input.nextInt();
                if (des_mist < 0) {
                    System.err.println("Chyba - musi byt zadane kladne cislo!");
                    System.exit(101);
                }
                System.out.format("%."+des_mist+"f / %."+des_mist+"f = %."+des_mist+"f%n", num1, num2, num1 / num2);
 
                break;
            default:
                System.err.println("Chybna volba!");
                System.exit(102);
                input.close();
        }
    }
}
