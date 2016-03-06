package components;


import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;

public class TopComponent {

    private AnchorPane top;
    private Hyperlink lv;
    private Hyperlink ru;
    private Hyperlink en;

    public TopComponent() {
        top = new AnchorPane();
        lv = new Hyperlink("LV");
        ru = new Hyperlink("RU");
        en = new Hyperlink("EN");
    }

    public AnchorPane init() {

        lv.setLayoutX(716);
        lv.setLayoutY(14);
        lv.setMinWidth(10);

        ru.setLayoutX(738);
        ru.setLayoutY(14);
        ru.setMinWidth(10);

        en.setLayoutX(762);
        en.setLayoutY(14);
        en.setMinWidth(10);

        top.getChildren().add(lv);
        top.getChildren().add(ru);
        top.getChildren().add(en);

        return top;
    }

    public AnchorPane getTop() {
        return top;
    }

    public void setTop(AnchorPane top) {
        this.top = top;
    }

    public Hyperlink getLv() {
        return lv;
    }

    public void setLv(Hyperlink lv) {
        this.lv = lv;
    }

    public Hyperlink getRu() {
        return ru;
    }

    public void setRu(Hyperlink ru) {
        this.ru = ru;
    }

    public Hyperlink getEn() {
        return en;
    }

    public void setEn(Hyperlink en) {
        this.en = en;
    }
}
