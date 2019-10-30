import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;

public class controller {

    @FXML TextField term1;
    @FXML TextField term2;
    @FXML TextField term3;
    @FXML TextArea output;
    @FXML
    public void calculateGrowth(){
        String input1 = term1.getText();
        String input2 = term2.getText();
        String input3 = term3.getText();
        int ter1 = Integer.parseInt(input1), ter2 = Integer.parseInt(input2), ter3=Integer.parseInt(input3);
        int difference = (ter1-ter2)*-1;
        output.setText("The difference is: " + difference + "\n" + "The next numbers in the sequence are: " + (ter2+difference)+", "+(ter2+difference*2)+", "+(ter2+difference*3) + "\n"+"The 0 term is:" +(ter1-difference)+"\nTerm Calculated: "+ (ter1-difference)+(ter3*difference));





    }

}
