package sample;

/**
 * Sample Skeleton for 'sample.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="textField"
    private TextField textField; // Value injected by FXMLLoader

    @FXML // fx:id="nine"
    private Button nine; // Value injected by FXMLLoader

    @FXML // fx:id="ac"
    private Button ac; // Value injected by FXMLLoader

    @FXML // fx:id="six"
    private Button six; // Value injected by FXMLLoader

    @FXML // fx:id="mul"
    private Button mul; // Value injected by FXMLLoader

    @FXML // fx:id="one"
    private Button one; // Value injected by FXMLLoader

    @FXML // fx:id="dot"
    private Button dot; // Value injected by FXMLLoader

    @FXML // fx:id="seven"
    private Button seven; // Value injected by FXMLLoader

    @FXML // fx:id="eq"
    private Button eq; // Value injected by FXMLLoader

    @FXML // fx:id="percent"
    private Button percent; // Value injected by FXMLLoader

    @FXML // fx:id="two"
    private Button two; // Value injected by FXMLLoader

    @FXML // fx:id="three"
    private Button three; // Value injected by FXMLLoader

    @FXML // fx:id="plus"
    private Button plus; // Value injected by FXMLLoader

    @FXML // fx:id="eight"
    private Button eight; // Value injected by FXMLLoader

    @FXML // fx:id="zero"
    private Button zero; // Value injected by FXMLLoader

    @FXML // fx:id="div"
    private Button div; // Value injected by FXMLLoader

    @FXML // fx:id="min"
    private Button min; // Value injected by FXMLLoader

    @FXML // fx:id="four"
    private Button four; // Value injected by FXMLLoader

    @FXML // fx:id="pm"
    private Button pm; // Value injected by FXMLLoader

    @FXML // fx:id="five"
    private Button five; // Value injected by FXMLLoader

    private boolean decimalClick = false;
    private boolean generalClick = false;
    private double prevValue = 0;
    private String general = "";

    @FXML
    void handlerDigitAction(ActionEvent event) {
        if (textField.getText().equals("0")){
            textField.setText("");
        }

        String digitObject = ((Button)event.getSource()).getText();
        String oldText = textField.getText();
        String newText = oldText+digitObject;
        textField.setText(newText);
    }

    @FXML
    void handlerGeneralAction(ActionEvent event) {
        general = ((Button)event.getSource()).getText();
        prevValue = Double.parseDouble(textField.getText());
        textField.setText("0");
        generalClick = true;
    }

    @FXML
    void handlerDecimalAction(ActionEvent event) {
        if (decimalClick == false) {
            textField.setText(textField.getText()+".");
            decimalClick = true;
        }
    }

    @FXML
    void handlerEqualAction(ActionEvent event) {
        switch (general){
            case "+":
                textField.setText(String.valueOf(prevValue + (Double.parseDouble(textField.getText()))));
                break;
            case "-":
                textField.setText(String.valueOf(prevValue - (Double.parseDouble(textField.getText()))));
                break;
            case "x":
                textField.setText(String.valueOf(prevValue * (Double.parseDouble(textField.getText()))));
                break;
            case "/":
                try{
                    textField.setText(String.valueOf(prevValue / (Double.parseDouble(textField.getText()))));
                }
                catch (ArithmeticException e){
                    textField.setText("ERROR");
                }
                break;
        }

        generalClick = false;
        decimalClick = false;
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'sample.fxml'.";
        assert ac != null : "fx:id=\"ac\" was not injected: check your FXML file 'sample.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'sample.fxml'.";
        assert mul != null : "fx:id=\"mul\" was not injected: check your FXML file 'sample.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'sample.fxml'.";
        assert dot != null : "fx:id=\"dot\" was not injected: check your FXML file 'sample.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'sample.fxml'.";
        assert eq != null : "fx:id=\"eq\" was not injected: check your FXML file 'sample.fxml'.";
        assert percent != null : "fx:id=\"percent\" was not injected: check your FXML file 'sample.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'sample.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'sample.fxml'.";
        assert plus != null : "fx:id=\"plus\" was not injected: check your FXML file 'sample.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'sample.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'sample.fxml'.";
        assert div != null : "fx:id=\"div\" was not injected: check your FXML file 'sample.fxml'.";
        assert min != null : "fx:id=\"min\" was not injected: check your FXML file 'sample.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'sample.fxml'.";
        assert pm != null : "fx:id=\"pm\" was not injected: check your FXML file 'sample.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'sample.fxml'.";

    }
}

