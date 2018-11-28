main {
    int phi[200]; int prime[200];
    int vis[200];
    int pSize; int d; int i; int j;
    phi[1] = 1;
    for (i = 2; i < 200; ++i) {
        if (not vis[i]) {
            prime[pSize] = i;
            ++pSize;
            phi[i] = i - 1;
        }
        for (j = 0; j < pSize and (d = i * prime[j]) < 200; ++j) {
            vis[d] = 1;
            if (i % prime[j] == 0) {
                phi[d] = phi[i] * prime[j];
                break;
            }
            else phi[d] = phi[i] * (prime[j] - 1);
        }
    }
    for (i = 0; i < pSize; ++i)
        write "Prime " + i + " = " + prime[i];
    for (i = 0; i < 200; ++i)
        write "Phi[" + i + "] = " + phi[i];
}
