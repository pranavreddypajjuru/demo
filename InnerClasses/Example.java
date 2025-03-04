class Example {
    static {
        System.out.println("Outer class is loaded");
    }

    Example() {
        System.out.println("Outer class constructor");
    }

    static class A {
        static {
            System.out.println("Inner class is loaded");
        }

        A() {
            System.out.println("Inner class constructor");
        }

        static void m1() {
            System.out.println("Inner class SM");
        }

        void m2() {
            System.out.println("Inner class NSM");
        }

        public static void main(String[] args) {
            System.out.println("inner class main");
            //Example.m1();
            Example e = new Example();
            //e.m1();
        }
    }

    static void m3() {
        System.out.println("Outer class SM");
    }

    void m4() {
        System.out.println("Outer class NSM");
    }

    public static void main(String[] args) {
        System.out.println("outer class main");
        //A.m3();
        A a = new A();
       // a.m4();
    }
}
