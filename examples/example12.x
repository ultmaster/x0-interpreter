function swap(a ref, b ref) {
    const t = a;
    a = b;
    b = t;
}

function partition(a ref, l, r) {
    const pivot = a[r];
    int i, j;
    i = l - 1;
    for (j = l; j < r; ++j)
        if (a[j] <= pivot)
            swap(a[++i], a[j]);
    swap(a[i + 1], a[r]);
    return i + 1;
}

function sort(a ref, l, r) {
    int pi;
    if (l > r) return;
    pi = partition(a, l, r);
    sort(a, l, pi - 1);
    sort(a, pi + 1, r);
}

main {
    str a[100000];
    int n, i;
    read n;
    for (i = 0; i < n; ++i)
        read a[i];
    sort(a, 0, n - 1);
    for (i = 0; i < n; ++i)
        write a[i];
}