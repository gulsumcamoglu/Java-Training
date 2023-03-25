package MethodsHomeworks;

public class FibonacciSequence {
    public static void main(String[] args) {
        // 1 1 2 3 5

        System.out.println(fibonacci(5));
        // f(n) = f(n-1) + f(n-2)
    }
    public static int fibonacci(int n){
        if (n==1 || n==0){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
