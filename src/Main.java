import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame miVentana = new JFrame("hola Javax");
        JPanel miPanel = new JPanel();
        Label miLabel = new Label("hola mundo");
        JTextField miText = new JTextField();
        Button miBoton = new Button();
        miText.setBackground(Color.YELLOW);
        miText.setPreferredSize(new Dimension(200, 30));
        miText.setForeground(Color.RED);
        miText.setFont(new Font("Arial", Font.BOLD, 14));
        miVentana.add(miLabel);
        miVentana.add(miText);
        miVentana.add(miPanel);
        miPanel.setBackground(Color.MAGENTA);
        miVentana.setSize(600,500);
        miVentana.setVisible(true);
    }
}