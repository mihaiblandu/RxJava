package javabrains.io.java_rx;

import io.reactivex.Observable;

public class ObservableDemo {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(emitter -> {
            emitter.onNext("Alfa");
            emitter.onNext("Beta");
            emitter.onNext("Gama");
            emitter.onNext("Delta");
            emitter.onNext("Epsilon");

        });

        source.subscribe(s -> {
            System.out.println(s);
        });
    }
}
