main {
    int x;
    str t;
    x = 0;
    repeat {
        read t;
        ++x;
    } until (t == "OK");
    write odd x;
    write not odd x;
    repeat {
        read t;
        exit;
    } until (t == "");
}