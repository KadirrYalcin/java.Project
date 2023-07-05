module com.example.ders14fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;

    opens com.example.ders14fx to javafx.fxml;
    exports com.example.ders14fx;
}