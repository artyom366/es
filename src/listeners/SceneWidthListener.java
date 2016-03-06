package listeners;


import components.CenterComponent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;

public class SceneWidthListener implements ChangeListener<Number> {

	private Label subTitle;
	private CenterComponent centerComponent;

	public SceneWidthListener(CenterComponent centerComponent) {
		this.subTitle = subTitle;
		this.centerComponent = centerComponent;
	}

	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
		centerComponent.getSubTitle().setLayoutX(newSceneWidth.doubleValue() / 2 - 46);
	}


}
