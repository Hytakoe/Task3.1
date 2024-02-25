import utils.*;

import java.util.Locale;
import java.io.PrintStream;
import java.util.ArrayList;
import java.awt.Window;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        SwingUtils.setDefaultFont("Microsoft Sans Serif", 18);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
}