int x, y;

function gcd(a, b, c ref) {
    if (b == 0) return c = a;
    return gcd(b, a % b, c);
}

main {
    int z;
    x = 84; y = 63;
    write x + " " + y;
    write gcd(x, y, z);
    write "LCM = " + x / z * y;
}
