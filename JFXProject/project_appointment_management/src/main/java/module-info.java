module jfx_maven_project {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens jfx_maven_project to javafx.fxml;
    exports jfx_maven_project;
}
