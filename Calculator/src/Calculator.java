import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.lang.*;

public class Calculator {
    private static final int WINDOW_WIDTH = 410;
    private static final int WINDOW_HEIGHT = 600;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 70;
    private static final int MARGIN_X = 20;
    private static final int MARGIN_Y = 60;

    private JFrame window; // Main Window
    private JComboBox<String> comboCalcType, comboTheme;
    private JTextField inText; // input
    private JButton buttonC, buttonBack, buttonMod, buttonDiv, buttonMul, buttonSub, buttonAdd, button0,
            button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPoint, buttonEqual,
            buttonRoot, buttonPower, buttonLog;

    private char operator = ' '; // Save the operator
    private boolean go = true; // For calculate with Opt != (=)
    private boolean addWrite = true; // Connect numbers in display
    private double value = 0; // Save the value typed for calulation
}
