package study.HelloWorld;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("start()" + Thread.currentThread().getName());
        primaryStage.setTitle("Hello World");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        System.out.println("init()"+ Thread.currentThread().getName());
        super.init();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop()" + Thread.currentThread().getName());
        super.stop();
    }

    public static void main(String[] args) {
        System.out.println("main()" + Thread.currentThread().getName());
        launch(args);
    }
    /**
     * main()main
     * init()JavaFX-Launcher
     * start()JavaFX Application Thread
     * stop()JavaFX Application Thread
     */
}
