module nm.ldl.deskledlight {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens nm.ldl.deskledlight to javafx.fxml;
    exports nm.ldl.deskledlight;
}