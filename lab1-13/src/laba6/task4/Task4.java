package laba6.task4;

public class Task4 {
    public static void main(String[] args) {
        int fact= DoubleFactorial.factorial(7);
        System.out.println(fact);
        int fact1 = DoubleFactorial.factorialRecursive(7);
        System.out.println(fact1);
        int fact3= DoubleFactorial.factorial(8);
        System.out.println(fact3);
        int fact4 = DoubleFactorial.factorialRecursive(8);
        System.out.println(fact4);
    }
}
