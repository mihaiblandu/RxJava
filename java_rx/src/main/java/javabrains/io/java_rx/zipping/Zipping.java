package javabrains.io.java_rx.zipping;

import io.reactivex.Observable;
import io.reactivex.Observer;

public class Zipping {
    public static void main(String[] args) {
        Observable<String> source1 =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        Observable<Integer> source2 = Observable.range(1,6);
        Observable.zip(source1,source2,(s,i)->{
                return s + " : " + i;
        }).subscribe(System.out::println);
    }
}
