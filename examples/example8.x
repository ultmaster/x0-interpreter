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
    write x;
    repeat {
        read t;
        ++x;
        exit;
    } until (t == "");
    write x;
}