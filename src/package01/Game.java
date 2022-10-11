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
    public void createGameScreen() {

        //disable button panel and title screen panel otherwise if u click button it will stay on the same page
        titleNamePanel.setVisible(false);
        startButton.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(50, 550, 350, 250);
        mainTextPanel.setBackground(Color.black);
        container.add(mainTextPanel);

        mainTextArea = new JTextArea("Main Text Area");
        mainTextArea.setBounds(50, 550, 350, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true); //if the text is too long, it will be wrapped automatically
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(550, 550, 400, 200);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(2, 2)); //sets layout for button (rows, columns)
        container.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.black);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.black);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Choice 3 ");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.black);
        choice3.setFont(normalFont);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Choice 4 ");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.black);
        choice4.setFont(normalFont);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerStatsPanel = new JPanel();
        playerStatsPanel.setBounds(100, 15, 600, 50);
        playerStatsPanel.setBackground(Color.white);
        playerStatsPanel.setLayout(new GridLayout(1, 4));
        container.add(playerStatsPanel);

        healthLabel = new JLabel("Health: ");
        healthLabel.setFont(statsFont);
        healthLabel.setForeground(Color.black);
        playerStatsPanel.add(healthLabel);

        healthLabelNumber = new JLabel();
        healthLabelNumber.setFont(statsFont);
        healthLabelNumber.setForeground(Color.black);
        playerStatsPanel.add(healthLabelNumber);

        attackLabel = new JLabel("Attack: ");
        attackLabel.setFont(statsFont);
        healthLabel.setForeground(Color.BLACK);
        playerStatsPanel.add(attackLabel);

        attackLabelNumber = new JLabel();
        attackLabelNumber.setFont(statsFont);
        attackLabelNumber.setForeground(Color.black);
        playerStatsPanel.add(attackLabelNumber);

        defenseLabel = new JLabel("Defense: ");
        defenseLabel.setFont(statsFont);
        defenseLabel.setForeground(Color.black);
        playerStatsPanel.add(defenseLabel);

        defenseLabelNumber = new JLabel();
        defenseLabelNumber.setFont(statsFont);
        defenseLabelNumber.setForeground(Color.black);
        playerStatsPanel.add(defenseLabelNumber);

        speedLabel = new JLabel("Speed: ");
        speedLabel.setFont(statsFont);
        speedLabel.setForeground(Color.black);
        playerStatsPanel.add(speedLabel);

        speedLabelNumber = new JLabel();
        speedLabelNumber.setFont(statsFont);
        speedLabelNumber.setForeground(Color.black);
        playerStatsPanel.add(speedLabelNumber);

        luckLabel = new JLabel("Luck: ");
        luckLabel.setFont(statsFont);
        luckLabel.setForeground(Color.black);
        playerStatsPanel.add(luckLabel);

        luckLabelNumber = new JLabel();
        luckLabelNumber.setFont(statsFont);
        luckLabelNumber.setForeground(Color.black);
        playerStatsPanel.add(luckLabelNumber);
        playerSetup();
    }
    public void playerSetup() {
        //set parameters
        playerHealth = 7;
        playerAttack = 7;
        playerSpeed = 9;
        playerDefense = 10;
        playerLuck = 8;

        healthLabelNumber.setText("" + playerHealth);
        speedLabelNumber.setText("" + playerSpeed);
        attackLabelNumber.setText("" + playerAttack);
        defenseLabelNumber.setText("" + playerDefense);
        luckLabelNumber.setText("" + playerLuck);
        rooms.story();
    }
    public Random random = new Random();
    public boolean randomChance() {
        return random.nextBoolean();
    }
}
