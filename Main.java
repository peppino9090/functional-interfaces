import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        List<? extends Object> objects =  Stream.of("Sydney", "Dhaka", new Date(), "New York", "London", 1, 3, 35D).collect(Collectors.toList());

        printer(() -> "***** SUPPLIER *****");
        printer(objects::size);
        printer(() -> "\n-------------------------\n");

        printer(() -> "***** RUNNABLE *****");
        runnableM(() -> System.out.println("TUTORIAL => " + Thread.currentThread().getId()));
        printer(() -> "\n-------------------------\n");

        printer(() -> "***** CONSUMER *****");
        Consumer<List<?>> consumer = (t) -> {t.forEach(System.out::println);};
        consumerM(consumer, objects);
        printer(() -> "\n-------------------------\n");

        printer(() -> "***** PREDICATE *****");
        Predicate<List<?>> predicate = t -> {return t != null && !t.isEmpty();};
        printer(() -> (predicateM(predicate, objects)));
        printer(() -> "\n-------------------------\n");

        printer(() -> "***** FUNCTION *****");
        Function<List<?>, List<?>> filterList = t -> {return t.stream().filter(f -> f instanceof String).collect(Collectors.toList());};
        printer(() -> (functionM(filterList, objects)));
        printer(() -> "\n-------------------------\n");


        printer(() -> "***** FUNCTION 2 *****");
        List<? extends Object> objects2 =  Stream.of("Milan", "Rome").collect(Collectors.toList());
        FunctionThrowable<List<?>, List<?>, List<?>> filterLists = (t,q) -> {return Stream.concat(t.stream(), q.stream()).collect(Collectors.toList());};
        printer(() -> (functionM(filterLists, objects, objects2)));
    }

    private static void runnableM(Runnable runnable) {
        runnable.run();
    }
    static <T> void printer (Supplier<T> supplier) {
        System.out.println(supplier.get());
    }

    private static <T> void consumerM(Consumer<T> consumer, List<?> objects) {
        consumer.accept((T) objects);
    }

    private static <T> Boolean predicateM(Predicate<List<?>> predicate, List<?> object) {
        return predicate.test(object);
    }

    private static Object callable(Callable<Object> o) throws Exception {
        return o.call();
    }


    private static List<?> functionM (Function<List<?>, List<?>> function, List<?> objects) {
        return function.apply(objects);
    }

    private static List<?> functionM (FunctionThrowable<List<?>, List<?>, List<?>> function, List<?> objects, List<?> objects2) {
        return function.apply(objects, objects2);
    }







}
