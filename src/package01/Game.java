package package01;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Game {
    JFrame window;
    static Container container;
    static JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerStatsPanel, picturePanel ;
    JLabel titleNameLabel;
    static JLabel healthLabel, healthLabelNumber, attackLabel, attackLabelNumber, defenseLabel, defenseLabelNumber, speedLabel, speedLabelNumber, luckLabel, luckLabelNumber, pictureLabel ;
    Font titleFont = new Font("Papyrus", Font.PLAIN, 60);
    static Font normalFont = new Font("Papyrus", Font.PLAIN, 20), statsFont = new Font("Papyrus", Font.PLAIN, 16);
    static JButton startButton, choice1, choice2, choice3, choice4 ;
    static JTextArea mainTextArea ;
    static int playerHealth, playerAttack, playerDefense, playerSpeed, playerLuck;
    static String position;
    static titleScreenHandler tsHandler = new titleScreenHandler();
    static ChoiceHandler choiceHandler = new ChoiceHandler();
    static ImageIcon image;

    public static void main(String[] args) {

        new Game();
    }
    public Game() {
        //initialized JFrame
        window = new JFrame();
        window.setSize(1000, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        container = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150); //makes space for text (x-axis, y-axis, width, height)
        titleNamePanel.setBackground(Color.black);

        titleNameLabel = new JLabel("Stuck in Casino Game");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);


        picturePanel = new JPanel();
        picturePanel.setBounds(50, 100, 900, 400);
        picturePanel.setBackground(Color.blue);

        pictureLabel = new JLabel();

        image = new ImageIcon("");
        pictureLabel.setIcon(image);
        picturePanel.add(pictureLabel);

        //makes the panel for button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        //this makes the button, adds details
        startButton = new JButton("Start");
        startButton.setBackground(Color.CYAN);
        startButton.setForeground(Color.BLACK);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler); //when u click start button, it recognizes the click and call the tsHandler
        startButton.setFocusPainted(false); //in case there is a line around text, use this for each button

        //adds titleNamePanel to the Container IF U DONT HAVE THIS, WHAT U DID ABOVE WILL NOT SHOW UP
        container.add(titleNamePanel);
        container.add(startButtonPanel);
        container.add(picturePanel);
        startButtonPanel.add(startButton);
        //adds titleNameLabel to the titleNamePanel
        titleNamePanel.add(titleNameLabel);

        //makes window visible THIS HAS TO BE AT THE BOTTOM OF THE METHOD
        window.setVisible(true);

        //when u click start button, it recognizes the click and call the tsHandler
        startButton.addActionListener(tsHandler);
    }





    public Random random = new Random();

    public boolean randomChance() {
        return random.nextBoolean();
    }
}
