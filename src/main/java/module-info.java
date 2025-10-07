module com.monkeyoohlala.lookup {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.seleniumhq.selenium.api;
    requires org.seleniumhq.selenium.chrome_driver;


    opens com.monkeyoohlala.lookup to javafx.fxml;
    exports com.monkeyoohlala.lookup;
}