main {
    int i;
    do {
        write "hello" + (++i);
    } while (i <= 5);
    do {
        --i;
        write "visit" + i;
        if (i % 2) continue;
        write "hello" + i;
    } while (i >= 0);
}