main {
    bool pr[200]; int i; int j;
    for (i = 2; i < 200; ++i)
        pr[i] = 1;
    for (i = 2; i < 200; ++i) {
        if (pr[i]) {
            for (j = i + i; j < 200; j = j + i) {
                pr[j] = 0;
            }
        }
    }
    for (i = 2; i < 200; ++i)
        if (pr[i]) write i;
}