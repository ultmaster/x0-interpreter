int M, r[100], m[100], n;

function exGcd(a, b, x ref, y ref) {
    int ret;
    if (b == 0) { x = 1; y = 0; return a; }
    ret = exGcd(b, a % b, y, x);
    y = y - a / b * x;
    return ret;
}

function CRT(m ref, r ref, n) {
    int R, x, y, d, i;
    if (not n) return 0;
    M = m[0]; R = r[0];
    for (i = 1; i < n; ++i) {
        d = exGcd(M, m[i], x, y);
        if ((r[i] - R) % d) return -1;
        x = (r[i] - R) / d * x % (m[i] / d);
        R = R + x * M;
        M = M / d * m[i];
        R = R % M;
    }
    if (R >= 0) return R;
    return R + M;
}

main {
    int case, T, i, a;
    read T;
    for (case = 1; case <= T; ++case) {
        read n;
        for (i = 0; i < n; ++i) {
            read r[i]; read m[i];
        }
        a = CRT(m, r, n);
        write "Case #" + case + ": " + a + " " + M;
    }
}
