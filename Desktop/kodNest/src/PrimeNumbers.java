public class PrimeNumbers {
    public static void main(String[] args) {
        int n=7;
        int num =2;
        System.out.println("prime numbers " + n);
        int count=0;
        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
