public class FibonacciLinear {

    public static void main(String[] args) {

        // termo da sequencia
        long n = 100;
        System.out.println("O " + n + "º termo na sequencia de Fibonacci é " + calcularTermoFibonacci(n));

    }

    public static long calcularTermoFibonacci(long n) {

        if (n < 0) {

            throw new IllegalArgumentException("O valor de n deve ser MAIOR ou IGUAL a 0");
        }

        long a = 0;
        long b = 1;
        for (long i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}