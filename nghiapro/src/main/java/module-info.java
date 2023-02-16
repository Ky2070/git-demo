module com.mycompany.nghiapro {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.nghiapro to javafx.fxml;
    exports com.mycompany.nghiapro;
}
