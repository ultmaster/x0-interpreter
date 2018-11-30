function f(x) {
    return 1 / (1 + x * x);
}

main {
    int i, n;
    float x0, xn, h, so, se, ans;
    read x0; read xn; read h;
    n = (xn - x0) / h;
    if (n % 2) ++n;
    h = (xn - x0) / n; so = 0; se = 0;
    for (i = 1; i < n; ++i) {
        if (odd i) { so = so + f(x0 + i * h); continue; }
        se = se + f(x0 + i * h);
    }
    ans = h / 3 * (f(x0) + f(xn) + 4 * so + 2 * se);
    write ans;
}
