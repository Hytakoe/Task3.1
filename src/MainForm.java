import javax.swing.*;

public class MainForm extends JFrame {
    private JPanel panel1;
    private JComboBox comboBox1;
    String[] TrafficLightsTypes = {
            "Пешеходный",
            "Автомобильный",
            "Автомобильный с левой секцией",
            "Автомобильный с правой секцией",
            "Автомобильный с обеими секциями",
    };
    JComboBox TrafficLights = new JComboBox(TrafficLightsTypes);
}
