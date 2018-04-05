public class PrimeNumbers {

    public static boolean isPrime(int number) {

        //loop from 2 to the square root of the number - if one number divides equally
        //then not prime.
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            //if divides equally then is not prime
            if (number % divisor == 0) {
                return false;
            }
        }
        // if at end of loop it is prime
        return true;
    }


    public static void printPrimes(int endPoint) {
        for (int number = 1; number <= endPoint; number++) {

            if (number %100 == 0) {
                System.out.println();
            }

            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static void main(String[] args) {
        printPrimes(1000);
    }

}
    