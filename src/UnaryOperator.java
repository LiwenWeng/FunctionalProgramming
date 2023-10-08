@FunctionalInterface
interface UnaryOperator<T> {
    T apply(T input);

    default UnaryOperator<T> compose(UnaryOperator<T> before) {
        return (T t) -> apply(before.apply(t));
    }

    default UnaryOperator<T> andThen(UnaryOperator<T> after) {
        return (T t) -> after.apply(apply(t));
    }
}