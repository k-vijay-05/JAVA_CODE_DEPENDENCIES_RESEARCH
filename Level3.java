package tracer;

public class Level3 {
    public void execute() {
        Level4 level4 = new Level4();
        level4.run();
        
        // Call additional functions for demonstration
        useLevel21();
        useLevel22();
        useLevel23();

        // Call new logic functions
        int product = multiply(3, 4);
        System.out.println("Product of 3 and 4: " + product);
        boolean palindrome = isPalindrome("level");
        System.out.println("Is 'level' a palindrome? " + palindrome);
        int max = maxOfThree(10, 25, 17);
        System.out.println("Max of 10, 25, 17: " + max);
    }

    public void useLevel21() {
        Level21 level21 = new Level21();
        level21.finish();
    }

    public void useLevel22() {
        Level22 level22 = new Level22();
        level22.complete();
    }

    public void useLevel23() {
        Level23 level23 = new Level23();
        level23.terminate();
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
} 