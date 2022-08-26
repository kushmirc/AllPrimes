package AllPrimes;
import java.util.ArrayList;

public class AllPrimes {
    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }   else if (number < 2) {
            return false;
        }
    for (int i = 2; i < number; i++) {

        if (number % i == 0) {
            return false;
        }
    }
      return true;
}
    public static void main(String[] args) {
        AllPrimes pr = new AllPrimes();

        System.out.println(pr.isPrime(14));
    }
}
