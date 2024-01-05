# Interfacce funzionali

### Introduzione
Un'interfaccia funzionale è definita come un'interfaccia che contiene un solo metodo astratto. Nel main sviluppato, sfruttando le potenzialità delle interfacce funzionali e dei generici, ho presentato una serie di esempi per illustrare il tipico funzionamento. Ho applicato una serie di funzioni elementari alla lista generica "objects" mediante le interfacce funzionali più comuni.

### Supplier
L'interfaccia Supplier non ammette input e, attraverso il metodo get(), restituisce un valore di un tipo definito. Nell'esempio proposto, l'ho utilizzata come segue:

```java
static <T> void printer(Supplier<T> supplier) {
    System.out.println(supplier.get());
}
```

### Runnable
L'interfaccia Runnable non consente né input né output e viene eseguita attraverso il metodo run().

### Consumer
L'interfaccia Consumer prende un valore in input ma non ha alcun tipo di ritorno. Viene eseguita mediante il metodo accept(). L'interfaccia contiene anche un metodo di default andThen, utile per sviluppare una sequenza di consumatori.

### Predicate
L'interfaccia Predicate prende un input e restituisce in output un booleano. Viene eseguita mediante il metodo test().

### Function
L'interfaccia Function prende un input e restituisce un output. Viene eseguita mediante il metodo apply().


### Custom Function Interface
A volte le interfacce funzionali di Java non soddisfano le esigenze di sviluppo, quindi è possibile svilupparne di personalizzate. Le interfacce devono essere annotate con @FunctionalInterface, come nel caso della classe FunctionThrowable. Il metodo apply() di questa classe prende due argomenti, ho customizzato inserendo la dichiarazione di throws RuntimeException.




