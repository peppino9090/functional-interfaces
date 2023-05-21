# Interfacce funzionali

### Intro
Si definisce interfaccia funzionale, un interfaccia che contiene un solo metodo astratto.
Nel main realizzato, sfruttando la potenzialiatà delle interfacce funzionali e dei generici, ho riportato una serie di esempi mostrando un tipico funzionamento
di callback.
Ho applicato alla lista generica `objects` una serie di funzioni elementari sviluppate mediante le interfacce funzionali più comuni.

### Supplier
L'interfaccia Supplier non consente input, mediante il metodo get() ritorna un valore di un tipo definito.
Nell'esempio proposto l'ho utilizzata come printer
`static <T> void printer (Supplier<T> supplier) {
    System.out.println(supplier.get());
 }`
`

### Runnable
L'interfaccia Runnable non consente ne input ne output. Viene eseguita mediate il metodo run().

### Consumer
L'interfaccia Consumer prende un valore in input ma non ha alcun tipo di ritorno. Viene eseguita mediante il metodo accept(). 
L'interfaccia contient anche un default metodo `andThen` utile per una sviluppare una sequenza di consumatori.

### Predicate
L'interfaccia Predicate prende un input e restitusice in output un booleano. Viene eseguita mediante il metodo test().

### Function
L'interfaccia Function prende un input e restituisce un output. Viene eseguita mediante il metodo apply();

Quelle elencate sono le interfacce funzionali che giornalmente utilizzo. A queste se ne aggiungono altre come ad esempio BiPredicate, Callable ecc...


### Custom Function Interface
Capita che le interfacce funzionali di Java non soddisfino le esigeneze di sviluppo, cosi è possibile svilupparne di custom.
Le interfacce vanno annotate con `@FunctionalInterface` come fatto per la classe `FunctionThrowable`, 
 al metodo apply() vengono passati due argomenti, inoltre ho aggiunto `throws RuntimeException`.





