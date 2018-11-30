main {
    const pMax = 200, primeStr = "prime";
    int phi[pMax], prime[pMax];
    bool vis[pMax];
    int pSize, d, i, j;
    phi[1] = 1;
    for (i = 2; i < pMax; ++i) {
        if (not vis[i]) {
            prime[pSize] = i;
            ++pSize;
            phi[i] = i - 1;
        }
        for (j = 0; j < pSize and (d = i * prime[j]) < pMax; ++j) {
            vis[d] = true;
            if (i % prime[j] == 0) {
                phi[d] = phi[i] * prime[j];
                break;
            }
            else phi[d] = phi[i] * (prime[j] - 1);
        }
    }
    for (i = 0; i < pSize; ++i)
        write primeStr + "[" + i + "] = " + prime[i];
    for (i = 0; i < pMax; ++i)
        write "Phi[" + i + "] = " + phi[i];
}
