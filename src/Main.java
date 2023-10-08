public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> increment = x -> x + 1;
        UnaryOperator<Integer> decrement = x -> x - 1;
        UnaryOperator<Integer> square = x -> x * x;

        UnaryOperator<Integer> incrementThenSquare = increment.andThen(square);
        UnaryOperator<Integer> squareThenDecrement = square.andThen(decrement);

        System.out.println(incrementThenSquare.apply(10));
        System.out.println(squareThenDecrement.apply(4));
    }
}
