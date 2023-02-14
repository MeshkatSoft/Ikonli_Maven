module com.example.ikonli_maven {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.bootstrapicons;
    requires org.kordamp.ikonli.bpmn;
    requires org.kordamp.ikonli.codicons;

    opens com.example.ikonli_maven to javafx.fxml;
    exports com.example.ikonli_maven;
}