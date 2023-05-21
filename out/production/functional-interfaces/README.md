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







