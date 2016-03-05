package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {

	private Stage primaryStage;
    private BorderPane root;
    private Scene scene;
    
    private AnchorPane center;
    private Label header;

    public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("ES");

		initRootLayout();
		initCenter();
	}

	private void initRootLayout() {

		root = new BorderPane();
	
		scene = new Scene(root, 800, 600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		scene.widthProperty().addListener(new ChangeListener<Number>() {
		    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
		        header.setLayoutX(newSceneWidth.doubleValue() / 2 - 46);
		    }
		});
		
		scene.heightProperty().addListener(new ChangeListener<Number>() {
		    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
 		        if (newSceneHeight.doubleValue() / 2 - 138 - 4 > 0) {
 		        	header.setLayoutY(newSceneHeight.doubleValue() / 2 - 138 - 4);
 		        }
		    }
		});

		primaryStage.setScene(scene);
		primaryStage.show();
    }

	private void initCenter() {

		header = new Label();
		header.setText("Select something");
		header.setLayoutX(354);
		header.setLayoutY(162);
		
		center = new AnchorPane();
		center.getChildren().add(header);
		
		root.setCenter(center);
			
	}


}
