package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller
{
    private int counter;
    @FXML
    private Label display;

    public void add()
    {
        counter++;
        display.setText(String.valueOf(counter));
    }
}
