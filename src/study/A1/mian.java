package study.A2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Application的三种启动方式，和生命周期。
 * @author 12613
 */ //application
public class mian extends Application {
    public static void main(String[] args) {
        System.out.println("main");
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello Fx");

        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}

