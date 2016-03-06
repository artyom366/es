package listeners;


import components.CenterComponent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class SceneHeightListener implements ChangeListener<Number> {

    private CenterComponent centerComponent;

    public SceneHeightListener(CenterComponent centerComponent) {
        this.centerComponent = centerComponent;
    }

    @Override
    public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
        if (newSceneHeight.doubleValue() / 2 - 138 - 4 > 0) {
            centerComponent.getSubTitle().setLayoutY(newSceneHeight.doubleValue() / 2 - 138 - 4);
        }
    }
}
