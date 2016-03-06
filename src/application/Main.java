package application;

import java.util.HashMap;

import components.CenterComponent;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import listeners.SceneWidthListener;
import state.ApplicationState;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private ApplicationState state;
	private CenterComponent centerComponent;
	
	private Stage primaryStage;
    private BorderPane root;
    private Scene scene;
    
    private AnchorPane center;
    private Label subTitle;
    private RadioButton option1;
    private RadioButton option2;
    private RadioButton option3;
    private Button prev;
    private Button next;
    private ProgressBar progressBar;
    private Button reset;

    private AnchorPane top;
    private Hyperlink lv;
    private Hyperlink ru;
    private Hyperlink en;
    

    public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("ES");

		initRootLayout();
		
		initTop();
		//initCenter();
	}

	private void initRootLayout() {
		
//		subTitle = new Label();
		
		state = new ApplicationState();
		centerComponent = new CenterComponent();

		root = new BorderPane();
		root.setCenter(centerComponent.init());
	
		scene = new Scene(root, 800, 600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		scene.widthProperty().addListener(new SceneWidthListener(centerComponent));
		
//		scene.widthProperty().addListener(new ChangeListener<Number>() {
//		    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
//		    	subTitle.setLayoutX(newSceneWidth.doubleValue() / 2 - 46);
//		    }
//		});
		
//		scene.heightProperty().addListener(new ChangeListener<Number>() {
//		    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
// 		        if (newSceneHeight.doubleValue() / 2 - 138 - 4 > 0) {
// 		        	subTitle.setLayoutY(newSceneHeight.doubleValue() / 2 - 138 - 4);
// 		        }
//		    }
//		});

		primaryStage.setScene(scene);
		primaryStage.show();
    }
	
	private void initTop() {
		
		lv = new Hyperlink("LV");
		lv.setLayoutX(716);
		lv.setLayoutY(14);
		
		ru = new Hyperlink("RU");
		ru.setLayoutX(738);
		ru.setLayoutY(14);
		
		en = new Hyperlink("EN");
		en.setLayoutX(762);
		en.setLayoutY(14);
		
		top = new AnchorPane();
		top.getChildren().add(lv);
		top.getChildren().add(ru);
		top.getChildren().add(en);
		
		root.setTop(top);
	}

	private void initCenter() {

		
		subTitle.setText("Select something");
		subTitle.setLayoutX(354);
		subTitle.setLayoutY(162);
		
		option1 = new RadioButton("Option 1");
		option1.setLayoutX(366);
		option1.setLayoutY(240);
		
		option2 = new RadioButton("Option 2");
		option2.setLayoutX(366);
		option2.setLayoutY(292);
		
		option3 = new RadioButton("Option 3");
		option3.setLayoutX(366);
		option3.setLayoutY(344);
		
		prev = new Button("Prev");
		prev.setMinWidth(50);
		prev.setLayoutX(340);
		prev.setLayoutY(475);
		
		next = new Button("Next");
		next.setMinWidth(50);
		next.setLayoutX(410);
		next.setLayoutY(475);
		
		progressBar = new ProgressBar();
		progressBar.setMinWidth(200);
		progressBar.setProgress(0);
		progressBar.setLayoutX(300);
		progressBar.setLayoutY(517);
		
		reset = new Button("Reset");
		reset.setMinWidth(50);
		reset.setLayoutX(736);
		reset.setLayoutY(530);
		
		center = new AnchorPane();
		center.getChildren().add(subTitle);
		center.getChildren().add(option1);
		center.getChildren().add(option2);
		center.getChildren().add(option3);
		center.getChildren().add(prev);
		center.getChildren().add(next);
		center.getChildren().add(progressBar);
		center.getChildren().add(reset);
		
		root.setCenter(center);	
	}

}
