function DateToInt (m, d, y) {
  return
    1461 * (y + 4800 + (m - 14) / 12) / 4 +
    367 * (m - 2 - (m - 14) / 12 * 12) / 12 -
    3 * ((y + 4900 + (m - 14) / 12) / 100) / 4 +
    d - 32075;
}

/* converts integer (Julian day number) to Gregorian date: month/day/year */

function IntToDate (jd, m ref, d ref, y ref){
  int x, n, i, j;

  x = jd + 68569;
  n = 4 * x / 146097;
  x = x - (146097 * n + 3) / 4;
  i = (4000 * (x + 1)) / 1461001;
  x = x - (1461 * i / 4 - 31);
  j = 80 * x / 2447;
  d = x - 2447 * j / 80;
  x = j / 11;
  m = j + 2 - 12 * x;
  y = 100 * (n - 49) + i + x;
}

main {
    int case, T, m, d, y, m1, d1, y1, jd;
    read T;
    for (case = 1; case <= T; ++case) {
        read y; read m; read d;
        jd = DateToInt(m, d, y);
        IntToDate(jd, m1, d1, y1);
        if (m1 == m and d1 == d and y1 == y) {
            write jd;
        } else {
            write "failed";
        }
    }
}
