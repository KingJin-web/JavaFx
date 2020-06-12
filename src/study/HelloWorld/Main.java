package study.HelloWorld;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root;
        primaryStage.setTitle("Hello World");
        System.out.println("Hello World");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
