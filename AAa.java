class B {
    int a;
    int b;
    int c;
    int z;

    public B() {
        this(0, 0, 0);
    }

    public B(int a) {
        this(a, 0, 0);
    }

    public B(int a, int b) {
        this(a, b, 0);
    }

    public B(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }
}