package com.main.modul6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.*;

import java.util.Arrays;

public class HelloApplication extends Application {
    @Override
    public <String> void start() {
        start(null);
    }

    @Override
    public <String> void start(Stage primaryStage) {
        String user = (String) "user";
        String Pass = (String) "user";

        primaryStage.setTitle("Form Login");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setScene(scene);

        Label msgLabel = new Label();
        Text scenetitle = new Text("Halaman Login");
        scenetitle.setFont(Font.font("Poppins", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0,0, 2, 1 );
        Label userName = new Label("User Name: ");
        grid.add(userName, 0,1);
        TextField textName = new TextField();
        grid.add(textName, 1,1);
        Label pass = new Label("Password: ");
        grid.add(pass, 0,2);
        TextField textPass = new TextField();
        grid.add(textPass, 1,2);
        HBox hbox = new HBox(10);
        Button btn = new Button("Sign in");
        btn.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(btn);
        Text actionTarget = new Text();
        grid.add(actionTarget, 1, 5);
        grid.add(btn, 1,4);

        VBox welcomePage = new VBox(10);
        Label labelWelcome = new Label("Halo " + user);
        Button btnLogOut = new Button("Keluar");
        welcomePage.getChildren().addAll(labelWelcome, btnLogOut);
        Scene homeScene = new Scene(welcomePage, 200, 200);


        btn.setOnAction(actionEvent -> {
            String username = (String) textName.getText();
            String password = (String) textPass.getText();

            if (user.equals(username) && Pass.equals(password)){
                msgLabel.setText("Login Success");
                grid.add(msgLabel, 1,5);
                primaryStage.setScene(homeScene);
            } else {
                msgLabel.setText("username atau password salah");
                grid.add(msgLabel, 1,5);
            }
        });

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(Arrays.toString(args));
    }

    @java.lang.Override
    public void start(Stage stage) {

    }
}