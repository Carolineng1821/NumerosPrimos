import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita un número límite");
        int n = sc.nextInt();
        List<Integer> resultado = numerosPrimos.generarPrimos(n);
        if (resultado.isEmpty()) {
            System.out.println("Invalido");
        } else {
            System.out.println("Los números primos son: " + resultado);
        }

    }
}