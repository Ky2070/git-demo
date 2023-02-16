package com.mycompany.apptest;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int t = 10;
           if(t >= 10 || t<3)
            App.setRoot("secondary");
           
    }
}
