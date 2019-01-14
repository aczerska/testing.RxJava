import io.reactivex.Flowable;

import java.util.concurrent.TimeUnit;


public class Main {

    public static boolean isEven(long n) {
        System.out.println("called for" + n);
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Flowable.interval(1, 1, TimeUnit.SECONDS)
                .filter(Main::isEven)
                .map(e -> e * 2);
        //.subscribe(System.out::println);
        sleep(10000);

    }

    private static boolean sleep(int ms) {
        try {
            Thread.sleep(ms);
            return true;
        } catch (InterruptedException e) {
            return false;
        }
    }
}
