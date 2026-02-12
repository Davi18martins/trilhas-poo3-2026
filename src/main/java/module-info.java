module br.edu.tds.projetofxpoo {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.tds.projetofxpoo to javafx.fxml;
    exports br.edu.tds.projetofxpoo;
}
