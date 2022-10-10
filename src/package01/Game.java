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
    //creates window
    JFrame window;
    static Container container;
    //creates title panel
    static JPanel titleNamePanel;
    static JPanel startButtonPanel;
    static JPanel mainTextPanel;
    static JPanel choiceButtonPanel;
    static JPanel playerStatsPanel;
    JPanel inventoryButtonPanel;
    JPanel picturePanel;
    JLabel titleNameLabel;
    static JLabel healthLabel;
    static JLabel healthLabelNumber;
    static JLabel attackLabel;
    static JLabel attackLabelNumber;
    static JLabel defenseLabel;
    static JLabel defenseLabelNumber;
    static JLabel speedLabel;
    static JLabel speedLabelNumber;
    static JLabel luckLabel;
    static JLabel luckLabelNumber;
    static JLabel pictureLabel;
    Font titleFont = new Font("Papyrus", Font.PLAIN, 60);
    static Font normalFont = new Font("Papyrus", Font.PLAIN, 20);
    static Font statsFont = new Font("Papyrus", Font.PLAIN, 16);
    static JButton startButton;
    static JButton choice1;
    static JButton choice2;
    static JButton choice3;
    static JButton choice4;
    static JTextArea mainTextArea ;
    static int playerHealth;
    static int playerAttack;
    static int playerDefense;
    static int playerSpeed;
    static int playerLuck;
    static String position;
    titleScreenHandler tsHandler = new titleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();
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
    public class titleScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            createGameScreen();
        }
    }
    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand(); //adds action command to whatever button is clicked. If u click c1 its will add that to the your choice string

            //add results to buttons
            switch(position){
                case "kingRoom":
                    switch(yourChoice){
                        case "c1": break;
                        case "c2": break;
                        case "c3": break;
                        case "c4": break;
                    }
                    break;
                case "queenRoom":
                    switch(yourChoice){
                        case "c1": break;
                        case "c2": break;
                        case "c3": break;
                        case "c4": break;
                    }
                    break;
                case "casinoLobby": //recognizes position
                    switch(yourChoice){
                        case "c1": rooms.solveRiddle(); break;
                        case "c2": rooms.attackHost(); break;
                        case "c3": rooms.sneakIn(); break;
                        case "c4": rooms.blockedExit(); break;
                    }
                    break;
                case "story":
                    switch (yourChoice){
                        case "c1": rooms.casinoLobby(); break;
                        case "c2": rooms.casinoLobby(); break;
                        case "c3": rooms.casinoLobby(); break;
                        case "c4": rooms.casinoLobby(); break;
                    }
                    break;
                case "solveRiddle":
                    switch(yourChoice) {
                        case "c1": rooms.youLost(); break;
                        case "c2": rooms.youLost(); break;
                        case "c3": rooms.hallway(); break;
                        case "c4": rooms.youLost(); break;
                    }
                    break;
                case "attackHost": // if hp less hank 0 lose. When in fight the 4 choices will be different attacks and have dif damage values.
                    switch (yourChoice){
                        case "c1": rooms.casinoLobby(); break; // maybe if statement for each attack? but would have  to make room for each damage?
                        case "c2": break;
                        case "c3": break;
                        case "c4": break;
                    }
                    break;
                case "sneakIn":
                    switch (yourChoice){
                        case "c1":
                            if (randomChance())
                            { rooms.bathroomFailed();}
                            else{
                                rooms.bathroomSuccess();}
                        case "c2":
                        case "c4":
                        case "c3": break;
                    }
                    break;
                case "hallway":
                    switch(yourChoice){
                        case "c1": rooms.queenRoom();break;
                        case "c2": rooms.kingRoom(); break;
                        case "c3": rooms.jackRoom(); break;
                        case "c4": break;
                    }
                    break;
                case "bathroomSuccess":
                    switch(yourChoice) {
                        case "c1": rooms.hallway(); break;
                        case "c2": break;
                        case "c4": break;
                        case "c3": break;
                    }
                    break;
                case "bathroomFail":
                    switch(yourChoice) {
                        case"c1": rooms.casinoLobby(); break;
                        case "c2":
                        case "c4":
                        case "c3":
                            break;
                    }
                    break;

            }
        }
    }
}
