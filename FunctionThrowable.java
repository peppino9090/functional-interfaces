
@FunctionalInterface
public interface FunctionThrowable <T, R, Q> {
    R apply(T t, Q q) throws RuntimeException;
}
