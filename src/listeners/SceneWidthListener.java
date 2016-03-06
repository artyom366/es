package listeners;


import components.CenterComponent;
import components.TopComponent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;

public class SceneWidthListener implements ChangeListener<Number> {

	private CenterComponent centerComponent;
	private TopComponent topComponent;

	public SceneWidthListener(CenterComponent centerComponent, TopComponent topComponent) {
		this.centerComponent = centerComponent;
		this.topComponent = topComponent;
	}

	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
		centerComponent.getSubTitle().setLayoutX(newSceneWidth.doubleValue() / 2 - 46);
		centerComponent.getOption1().setLayoutX(newSceneWidth.doubleValue() / 2 - 34);
		centerComponent.getOption2().setLayoutX(newSceneWidth.doubleValue() / 2 - 34);
		centerComponent.getOption3().setLayoutX(newSceneWidth.doubleValue() / 2 - 34);
		centerComponent.getPrev().setLayoutX(newSceneWidth.doubleValue() / 2 - 50 - (newSceneWidth.doubleValue() / 80));
		centerComponent.getNext().setLayoutX(newSceneWidth.doubleValue() / 2 + (newSceneWidth.doubleValue() / 80));
		centerComponent.getProgressBar().setLayoutX(newSceneWidth.doubleValue() / 2 - 100);
		centerComponent.getReset().setLayoutX(newSceneWidth.doubleValue() - 50 - (newSceneWidth.doubleValue() / 100 * 2));
		topComponent.getLv().setLayoutX(newSceneWidth.doubleValue() - 10 - (newSceneWidth.doubleValue() / 10.81));
		topComponent.getRu().setLayoutX(newSceneWidth.doubleValue() - 10 - (newSceneWidth.doubleValue() / 15.38));
		topComponent.getEn().setLayoutX(newSceneWidth.doubleValue() - 10 - (newSceneWidth.doubleValue() / 28.57));
	}


}
