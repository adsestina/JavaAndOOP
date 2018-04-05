public class WhatIsInside {
    public static void main(String[] args) {
        int total = 0;
        for (int i=1; i<=10; i++) {
            System.out.println(i);
            total += i;

            System.out.println(total);
        }
        String st1 = "hi";
        String st2 = "there";
        System.out.println(st1.compareTo(st2));
    }
}
