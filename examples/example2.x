main {
    int a;
    int b;
    int c;
    read a;
    read b;
    while (b != 0) {
        c = a % b;
        a = b;
        b = c;
    }
    write a;
}
