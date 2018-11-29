int fib[50];

function fib(n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    if (fib[n]) return fib[n];
    return fib[n] = fib(n - 1) + fib(n - 2);
}

main {
    int i;
    for (i = 30; i >= 0; --i)
        write i + " " + fib(i);
}