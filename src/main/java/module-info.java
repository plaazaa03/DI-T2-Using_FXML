module com.example.using_fxml_to_create_user_interface {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.using_fxml_to_create_user_interface to javafx.fxml;
    exports com.example.using_fxml_to_create_user_interface;
}