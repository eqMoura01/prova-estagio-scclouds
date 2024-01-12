import java.util.ArrayList;
import java.util.List;

public class PrimosLinear {
    public static void main(String[] args) {

        // Aqui tu bota até qual numero queres.
        int n = 10;
        List<Integer> numerosPrimos = obterNumerosPrimos(n);

        System.out.println(numerosPrimos);
    }

    public static List<Integer> obterNumerosPrimos(int n) {

        List<Integer> primos = new ArrayList<>();

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (isPrimo(i)) {
                    primos.add(i);
                }
            }
        } else {
            throw new IllegalArgumentException("O valor de N deve ser MAIOR que 1");
        }

        return primos;
    }

    // verifica se eh primo
    private static boolean isPrimo(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
