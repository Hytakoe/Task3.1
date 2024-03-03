import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;

public class MainForm extends JFrame {
    private JPanel panel1;
    private JComboBox comboBox1;
    private JRadioButton RedLight;
    private JRadioButton YellowLight;
    private JRadioButton GreenLight;
    private JRadioButton RightSection;
    private JRadioButton LeftSection;
    private JTextField YellowToGreen;
    private JTextField RedToYellow;
    private JTextField RedTime;
    private JTextField GreenTime;
    private JTextField RedToGreen;
    private JButton Start;
    private JButton StartLeft;
    private JButton StartRight;

    public MainForm() {
        this.setTitle("FrameMain");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        String[] TrafficLightsTypes = {
                "Пешеходный",
                "Автомобильный",
                "Автомобильный с левой секцией",
                "Автомобильный с правой секцией",
                "Автомобильный с обеими секциями",
        };
        for (int i = 0; i < TrafficLightsTypes.length; i++) {
            comboBox1.addItem(TrafficLightsTypes[i]);
        }
        TrafficLight currentTL = new TrafficLight();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = comboBox1.getSelectedIndex();
                switch (index) {
                    case 0:
                        YellowLight.setVisible(false);
                        RightSection.setVisible(false);
                        LeftSection.setVisible(false);
                        RedToGreen.setVisible(true);
                        RedToYellow.setVisible(false);
                        YellowToGreen.setVisible(false);
                        StartLeft.setVisible(false);
                        StartRight.setVisible(false);
                        break;
                    case 1:
                        YellowLight.setVisible(true);
                        RightSection.setVisible(false);
                        LeftSection.setVisible(false);
                        RedToGreen.setVisible(false);
                        RedToYellow.setVisible(true);
                        YellowToGreen.setVisible(true);
                        StartLeft.setVisible(false);
                        StartRight.setVisible(false);
                        break;
                    case 2:
                        YellowLight.setVisible(true);
                        RightSection.setVisible(false);
                        LeftSection.setVisible(true);
                        RedToGreen.setVisible(false);
                        RedToYellow.setVisible(true);
                        YellowToGreen.setVisible(true);
                        StartLeft.setVisible(true);
                        StartRight.setVisible(false);
                        break;
                    case 3:
                        YellowLight.setVisible(true);
                        RightSection.setVisible(true);
                        LeftSection.setVisible(false);
                        RedToGreen.setVisible(false);
                        RedToYellow.setVisible(true);
                        YellowToGreen.setVisible(true);
                        StartLeft.setVisible(false);
                        StartRight.setVisible(true);
                        break;
                    case 4:
                        YellowLight.setVisible(true);
                        RightSection.setVisible(true);
                        LeftSection.setVisible(true);
                        RedToGreen.setVisible(false);
                        RedToYellow.setVisible(true);
                        YellowToGreen.setVisible(true);
                        StartLeft.setVisible(true);
                        StartRight.setVisible(true);
                        break;
                }
            }
        });
        Start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int type = comboBox1.getSelectedIndex();
                switch (type) {
                    case 0:
                        currentTL.setType(TrafficLightTypes.PEDESTRIAN);
                        currentTL.setGreenTime(Integer.parseInt(GreenTime.getText()));
                        currentTL.setRedTime(Integer.parseInt(RedTime.getText()));
                }
            }
        });
        currentTL.
    }
}
