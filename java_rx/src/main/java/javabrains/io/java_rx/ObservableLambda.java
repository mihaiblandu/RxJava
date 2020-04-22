package javabrains.io.java_rx;

import io.reactivex.Observable;

public class ObservableLambda {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(emitter -> {
            try {
                emitter.onNext("Alpha");
                emitter.onNext("Beta");
                emitter.onNext("Gamma");
                emitter.onNext("Delta");
                emitter.onNext("Epsilon");
                emitter.onComplete();
            } catch (Throwable e) {
                emitter.onError(e);
            }
        });

        source.map(String::length).filter(i -> i >= 5).subscribe(s -> System.out.println("RECEIVED : " + s));

    }
}
