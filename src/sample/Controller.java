package sample;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller
{
    private int counter;
    @FXML
    private Label display;
    @FXML
    private Label display1;
    private boolean switchs = true;
    public void add()
    {
        if(switchs)
        {
            counter++;
            display.setText("");//(String.valueOf(counter));
            display1.setText(String.valueOf(counter));
        }
    }
    long karen = System.nanoTime() + 10000000000L;
    @FXML
    public void initialize()
    {
        new AnimationTimer()
        {
            public void handle(long now)
            {
                display.setText("Time :" + now);
                if (now > karen)
                {
                    this.stop();
                    switchs = false;
                    display1.setText("You clicked" + " " + counter + " " + "times!");
                }
            }
        }.start();
    }
}
