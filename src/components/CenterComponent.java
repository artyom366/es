package components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;

public class CenterComponent {
	
    private AnchorPane center;
    private Label subTitle;
    private RadioButton option1;
    private RadioButton option2;
    private RadioButton option3;
    private Button prev;
    private Button next;
    private ProgressBar progressBar;
    private Button reset;
    
    public CenterComponent() {
    	subTitle = new Label();
    	option1 = new RadioButton("Option 1");
    	option2 = new RadioButton("Option 2");
    	option3 = new RadioButton("Option 3");
    	prev = new Button("Prev");
    	next = new Button("Next");
    	progressBar = new ProgressBar();
    	reset = new Button("Reset");
    	center = new AnchorPane();
    }
    
    public AnchorPane init() {
    
    	subTitle.setText("Select something");
		subTitle.setLayoutX(354);
		subTitle.setLayoutY(162);
		
		option1.setLayoutX(366);
		option1.setLayoutY(240);
		
		option2.setLayoutX(366);
		option2.setLayoutY(292);
		
		option3.setLayoutX(366);
		option3.setLayoutY(344);
		
		prev.setMinWidth(50);
		prev.setLayoutX(340);
		prev.setLayoutY(475);
		
		next.setMinWidth(50);
		next.setLayoutX(410);
		next.setLayoutY(475);
		
		progressBar.setMinWidth(200);
		progressBar.setProgress(0);
		progressBar.setLayoutX(300);
		progressBar.setLayoutY(517);
		
		reset.setMinWidth(50);
		reset.setLayoutX(736);
		reset.setLayoutY(530);
		
		center.getChildren().add(subTitle);
		center.getChildren().add(option1);
		center.getChildren().add(option2);
		center.getChildren().add(option3);
		center.getChildren().add(prev);
		center.getChildren().add(next);
		center.getChildren().add(progressBar);
		center.getChildren().add(reset);
		
		return center;	
    }

	public AnchorPane getCenter() {
		return center;
	}

	public void setCenter(AnchorPane center) {
		this.center = center;
	}

	public Label getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(Label subTitle) {
		this.subTitle = subTitle;
	}

	public RadioButton getOption1() {
		return option1;
	}

	public void setOption1(RadioButton option1) {
		this.option1 = option1;
	}

	public RadioButton getOption2() {
		return option2;
	}

	public void setOption2(RadioButton option2) {
		this.option2 = option2;
	}

	public RadioButton getOption3() {
		return option3;
	}

	public void setOption3(RadioButton option3) {
		this.option3 = option3;
	}

	public Button getPrev() {
		return prev;
	}

	public void setPrev(Button prev) {
		this.prev = prev;
	}

	public Button getNext() {
		return next;
	}

	public void setNext(Button next) {
		this.next = next;
	}

	public ProgressBar getProgressBar() {
		return progressBar;
	}

	public void setProgressBar(ProgressBar progressBar) {
		this.progressBar = progressBar;
	}

	public Button getReset() {
		return reset;
	}

	public void setReset(Button reset) {
		this.reset = reset;
	}
    
    

}
