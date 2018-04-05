public class ex2 {

        public static void f()
        { g(); h1(); }

        public static void g()
        { h1(); h2(); }

        public static void h1()
        { h2(); }

        public  static void h2()
        { System.out.println("hi"); }

        public static void main(String[] args)
        { f(); }
    }

