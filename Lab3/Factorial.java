public class Factorial {
    int prod = 1;

    public int fact(int number) {
        for (int i = 1; i <= number; i++) {
            prod = prod * i;
        }
        return prod;
    }

    public int recursionFac(int number) {
        if (number == 1) {
            return 1;
        }
        return number * recursionFac(number - 1);  // Fixed typo here
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.print(fact.fact(5));  // Prints factorial using the iterative method
        System.out.println();
        System.out.print(fact.recursionFac(5));  // Prints factorial using recursion
    }
}
