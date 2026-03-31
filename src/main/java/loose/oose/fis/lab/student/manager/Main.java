package loose.oose.fis.lab.student.manager;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@Override
public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
    primaryStage.setTitle("FIS - Student Manager");
    primaryStage.setScene(new Scene(root, 600, 400));
    primaryStage.show();
}

