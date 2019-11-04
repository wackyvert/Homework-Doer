import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;

import static java.lang.String.valueOf;

public class controller {
    double difference;
    double ter3;
    double ter2;
    double ter1;
    @FXML TextField term1;
    @FXML TextField term2;
    @FXML TextField term3;
    @FXML TextField a1;
    @FXML TextField d1;
    @FXML TextField n1;
    @FXML TextArea output;
    @FXML TextArea output2;
    @FXML CheckBox ari;
    @FXML CheckBox geo;

    @FXML
    public void help(){
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://github.com/wackyvert/homework-doer.git");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void buttonCheck(){
        if (ari.isSelected())
        {
            try{
                calculateArith();
            }
            catch (NumberFormatException e)
            {
                output.setText("You need to enter a value!");
            }
        }
        else if (geo.isSelected())
        {
            try
            {
                calculateGeo();
            }
            catch (NumberFormatException e)
            {
                output.setText("You need to enter a value!");
            }
        }
        else
        {
            output.setText("You need to check a sequence type!");
        }
    }
    @FXML
    public void calculateArith(){
        String input1 = term1.getText();
        String input2 = term2.getText();
        String input3 = term3.getText();
        ter1 = Integer.parseInt(input1);
        ter2 = Integer.parseInt(input2);
        difference = (ter1-ter2)*-1;
        output.setText("The difference is: " + difference + "\n" + "The next numbers in the sequence are: " + (ter2+difference)+", "+(ter2+difference*2)+", "+(ter2+difference*3) + "\n"+"The 0 term is:" +(ter1-difference)+"\nThe explicit equation for this function is: a-sub-n="+difference+"n+"+(ter1-difference));

    }
    public void calculateGeo(){
        String input1 = term1.getText();
        String input2 = term2.getText();
        ter1 = Double.parseDouble(input1);
        ter2 = Integer.parseInt(input2);
        output.setText(valueOf((ter2/ter1)));
    }
    @FXML public void calculateXTerm(){
        String input1 = term1.getText();
        String input2 = term2.getText();
        String input3 = term3.getText();
        ter3 = Integer.parseInt(input3);
        difference = (ter1-ter2)*-1;
        output.setText("Term Calculated: "+ (ter1-difference)+(ter3*difference));
    }
    @FXML public void arithmeticCheck(){
        if (geo.isSelected()){
            geo.setSelected(false);
        }
    }
    @FXML public void geometricCheck(){
        if (ari.isSelected()){
            ari.setSelected(false);
        }
    }
    @FXML public void arithSeries(){
        float a = Float.parseFloat(a1.getText()), d=Float.parseFloat(d1.getText()), n = Float.parseFloat(n1.getText());
        float sum = 0;
        for (int i=0;i<n;i++)
        {
            sum = sum + a;
            a = a + d;
        }
        output2.setText(valueOf(sum));
    }

}
