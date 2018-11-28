main {
    float a[2][2]; float b[2][2];
    float c[2][2];
    int i; int j; int k;
    a[0][0] = 1.0;
    a[1][1] = -0.4;
    b[0][0] = b[0][1] = b[1][0] = 1.8;
    for (i = 0; i < 2; ++i)
        for (j = 0; j < 2; ++j)
            for (k = 0; k < 2; ++k)
                c[i][j] = c[i][j] + a[i][k] * b[k][j];
    write c[0][0] + " " + c[0][1];
    write c[1][0] + " " + c[1][1];
}