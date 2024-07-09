package conjectura.de.collatz;

import java.math.BigInteger;
import java.util.Scanner;

public class ConjecturaDeCollatz {

    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(0);
        boolean digitou = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um número inteio e positivo");

        do {
            if (digitou) {
                System.out.println("eu disse um número INTEIRO E POSITIVO seu imundo");
            }
            String input = sc.nextLine();

            a = new BigInteger(input);
            digitou = true;
        } while (a.equals(0));

        int passos = 1;

        do {
            if (a.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                a = a.divide(BigInteger.valueOf(2));
            } else {
                a = a.multiply(BigInteger.valueOf(3));
                a = a.add(BigInteger.valueOf(1));
            }
            passos++;
            System.out.println(a);
        } while (a.compareTo(BigInteger.ONE) > 0);
        System.out.println("foi necessário " + passos + " passos");
    }

}
