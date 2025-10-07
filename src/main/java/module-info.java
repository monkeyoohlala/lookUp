module com.monkeyoohlala.lookup {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.monkeyoohlala.lookup to javafx.fxml;
    exports com.monkeyoohlala.lookup;
}