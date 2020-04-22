package javabrains.io.java_rx.simple;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class ObservableWithoutLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Observable<Integer> source = Observable.fromIterable(list);
        source.subscribe(emiter->{
            System.out.println(emiter);
        });
    }
}
