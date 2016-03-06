package application;

import components.CenterComponent;
import components.TopComponent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import listeners.SceneHeightListener;
import listeners.SceneWidthListener;
import state.ApplicationState;

public class Main extends Application {

    private ApplicationState state;
    private CenterComponent centerComponent;
    private TopComponent topComponent;

    private Stage primaryStage;
    private BorderPane root;
    private Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ES");

        initRootLayout();
    }

    private void initRootLayout() {

        state = new ApplicationState();
        centerComponent = new CenterComponent();
        topComponent = new TopComponent();

        root = new BorderPane();
        root.setCenter(centerComponent.init());
        root.setTop(topComponent.init());

        scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        scene.widthProperty().addListener(new SceneWidthListener(centerComponent, topComponent));
        scene.heightProperty().addListener(new SceneHeightListener(centerComponent));

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
