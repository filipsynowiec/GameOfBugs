package gameofbugs.view;

import gameofbugs.controller.SceneController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class MenuView {
    private HBox root;
    private SceneController sceneController;

    public MenuView(HBox root, SceneController sceneController) {
        this.root = root;
        this.sceneController = sceneController;
    }

    public void displayGameStart() {
        Button startGameButton = new Button("Start Game");
        startGameButton.setOnMouseClicked(event -> sceneController.triggerGameStart());

        Button launchInstructionButton = new Button("Instruction");
        launchInstructionButton.setOnMouseClicked(event -> sceneController.triggerInstruction());

        Button exitGameButton = new Button("Exit");
        exitGameButton.setOnMouseClicked(event -> System.exit(0));

        root.getChildren().clear();
        root.getChildren().addAll(startGameButton, launchInstructionButton, exitGameButton);
        root.setAlignment(Pos.CENTER);
    }
}