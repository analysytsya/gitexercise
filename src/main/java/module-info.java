module eus.es.gitexercise {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens eus.es.gitexercise to javafx.fxml;
    exports eus.es.gitexercise;
}