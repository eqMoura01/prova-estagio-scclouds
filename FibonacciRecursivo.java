public class FibonacciRecursivo {

    public static void main(String[] args) {

        // termo da sequencia
        long n = 12;
        System.out.println("O " + n + "º termo na sequencia de Fibonacci é " + calcularTermoFibonacci(n));

    }

    public static long calcularTermoFibonacci(long n) {

        if (n < 0) {
            throw new IllegalArgumentException("O valor de n deve ser MAIOR ou IGUAL a 0");
        }

        if (n == 0 || n == 1) {
            return n;
        }

        return calcularTermoFibonacci(n - 1) + calcularTermoFibonacci(n - 2);
    }

}
