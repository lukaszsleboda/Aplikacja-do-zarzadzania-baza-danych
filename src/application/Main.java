package application;



import application.Alerts.DecisionAlert;
import application.sceneControler.SceneControler;

import application.tools.date.DateTool;
import application.user.User;
import javafx.application.Application;

import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import oracle.sql.DATE;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.initStyle(StageStyle.UTILITY);
        SceneControler.getInstance().createWindow(primaryStage,"login");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
