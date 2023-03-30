module com.example.lab4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.lab4 to javafx.fxml;
    exports com.example.lab4;
}