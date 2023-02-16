module com.mycompany.apptest {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.apptest to javafx.fxml;
    exports com.mycompany.apptest;
}
