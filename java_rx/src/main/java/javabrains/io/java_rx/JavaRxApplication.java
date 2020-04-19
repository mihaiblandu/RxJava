package javabrains.io.java_rx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class JavaRxApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaRxApplication.class, args);
        // With Lambda and Method Reference
        Thread thread = new Thread(JavaRxApplication::runIt);
        thread.run();
    }
    private static void runIt() {
        System.out.println("Hello World");
    }
}
