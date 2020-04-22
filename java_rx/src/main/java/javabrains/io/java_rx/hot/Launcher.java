package javabrains.io.java_rx.hot;

import io.reactivex.Observable;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
public class Launcher {
    public static void main(String[] args) {
        Observable<String> source1 = Observable.interval(1, TimeUnit.SECONDS)
                        .take(2)
                        .map(l -> l + 1)
                        .map(l -> "Source1: " + l + " seconds");
        Observable<String> source2 =
                Observable.interval(300, TimeUnit.MILLISECONDS)
                        .map(l -> (l + 1) * 300)
                .map(l -> "Source2: " + l + "milliseconds");
                        Observable.amb(Arrays.asList(source1, source2))
                                .subscribe(i -> System.out.println("RECEIVED: " + i));
        sleep(5000);
    }
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}