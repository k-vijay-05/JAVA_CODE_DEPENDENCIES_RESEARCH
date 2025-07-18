package tracer;

public class Level8 {
    public void act() {
        Level9 level9 = new Level9();
        level9.respond();
        
        // Demonstrate calling Level7's logic functions
        Level7 level7 = new Level7();
        int sum = level7.calculateSum(5, 7);
        System.out.println("Sum of 5 and 7: " + sum);
        boolean even = level7.isEven(10);
        System.out.println("Is 10 even? " + even);
        int fact = level7.factorial(5);
        System.out.println("Factorial of 5: " + fact);
        String reversed = level7.reverseString("hello");
        System.out.println("Reversed 'hello': " + reversed);
        int fib = level7.fibonacci(6);
        System.out.println("Fibonacci of 6: " + fib);
        boolean prime = level7.isPrime(13);
        System.out.println("Is 13 prime? " + prime);
    }
} 