package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField age;
    @FXML
    private TextArea result;

    int max=220;
    int max_rate;

    @FXML
    void OnClick(ActionEvent event) {
        int years=Integer.parseInt(age.getText());
        int hrr;
        Double thr_1;
        Double thr_2;
        max_rate=max-years;
        hrr=max_rate-80;
        thr_1=(hrr*0.7)+80;
        thr_2=(hrr*0.85)+80;
        result.setText("Your  maximum heart rate is "+Integer.toString(max_rate)+".\nYour target-heart-rate range is "+thr_1+"\nto "+thr_2);

    }

}
