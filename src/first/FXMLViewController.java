
package first;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Walter
 */
public class FXMLViewController implements Initializable {
    @FXML
    private Label Hello;
    @FXML
    private void deleted(ActionEvent e){
        Hello.setVisible(false);
    }
    @FXML
    private void write(ActionEvent e){
       Hello.setVisible(true);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // 
    }    
    
}
