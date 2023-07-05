module com.example.jafafx1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires com.jfoenix;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.jafafx1 to javafx.fxml;
    exports com.example.jafafx1;
}