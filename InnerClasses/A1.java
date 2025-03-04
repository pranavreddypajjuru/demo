class A1 {
    int x = 20;

    class B1 {
        int x = 50;

        void m1() {
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(A1.this.x);
        }

        void m2() {
            int x = 60;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(A1.this.x);
        }
    }

    void m3() {
        System.out.println(x);

        B1 b = new B1();
        System.out.println(b.x);
    }

    public static void main(String[] args) {
        A1 a = new A1();
        a.m3();

        A1.B1 b = new A1().new B1();
        b.m1();
        b.m2();
    }
}
