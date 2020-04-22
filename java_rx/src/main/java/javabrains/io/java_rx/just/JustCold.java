package javabrains.io.java_rx.just;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class JustCold {
    static public void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");
//first observer
        source.subscribe(s -> System.out.println("Observer 1 Received:" + s));
//second observer
                source.subscribe(s -> System.out.println("Observer 2 Received:" +
                        "A" + s));
    }
}