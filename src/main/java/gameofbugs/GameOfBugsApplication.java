package gameofbugs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GameOfBugsApplication extends Application {

    private static HBox root = new HBox();
    private static Driver driver;


    public static void main(String[] args) {
        System.out.println("Main");
        driver = new Driver(root);
        driver.launchMenu();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Start");
        primaryStage.setTitle("Game of Bugs");
        Scene scene = new Scene(root, 1400, 900);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
