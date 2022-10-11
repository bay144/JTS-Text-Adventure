package package01;
import javax.swing.*;

public class rooms extends Game{
    public static void casinoLobby() {
        position = "casinoLobby";
        image = new ImageIcon(".//Images//testpic.png");
        pictureLabel.setIcon(image);
        mainTextArea.setText("U r in the casino lobby. The story will be in here. \n Guard: u cant be in here either solve a Riddle or leave to move on ");
        choice1.setText("Solve Riddle");
        choice2.setText("Fight Casino Host");
        choice3.setText("Try to sneak in"); //random chance
        choice4.setText("Leave");

    }
    public static void solveRiddle() {
        image = new ImageIcon(".//Images//casinopic.jpeg");
        pictureLabel.setIcon(image);
        position = "solveRiddle";
        mainTextArea.setText("Casino Host: ok this is the Riddle ");
        choice1.setText("Wrong");
        choice2.setText("Wrong");
        choice3.setText("Correct"); //This will be the correct one
        choice4.setText("Wrong");

    }
    public static void attackHost() {
        position = "attackHost";
        mainTextArea.setText("Casino Host: omg u attacked me get ready to fight to death  \n u receive 3 damage "); //battle if u lose u die
        playerHealth = playerHealth - 3;
        healthLabelNumber.setText("" + playerHealth);
        choice1.setText("Attack 1");
        choice2.setText("Attack 2");
        choice3.setText("Attack 3");
        choice4.setText("Attack 4");
    }
    public static void sneakIn() {
        position = "sneakIn";
        mainTextArea.setText("Do u want to sneak in through the bathrooms or through the kitchen?");
        choice1.setText("Bathrooms");
        choice2.setText("Kitchen");
        choice3.setText("Go back");
        choice4.setText("");

    }
    public static void blockedExit() {
        position = "blockedExit";
        mainTextArea.setText(" u cant leave u need a key to exit and the boss has the key. u gotta get it and come back.");
        choice1.setText("Back to main lobby");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public static void bathroomFailed() {
        position = "bathroomFailed";
        mainTextArea.setText("You got caught");
        choice1.setText("Restart Game");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }
    public static void bathroomSuccess() {
        position = "bathroomSuccess";
        mainTextArea.setText("You snuck in!");
        choice1.setText("Go to hallway");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }
    public static void hallway(){
        position = "hallway";
        mainTextArea.setText("You are now in the hallway");
        choice1.setText("Right Door");
        choice2.setText("Left Door");
        choice3.setText("Front Door");
        choice4.setText("");
    }
    public static void queenRoom(){
        position = "queenRoom";
        mainTextArea.setText("You are now in the Queens Area, go to the room with diamond or the one with the heart ?");
        choice1.setText("Diamond");
        choice2.setText("Heart");
        choice3.setText("");
        choice4.setText("");
    }
    public static void kingRoom(){
        position = "kingRoom";
        mainTextArea.setText("THis is the king room, do u want to go to the room with diamond or the one with the heart ?");
        choice1.setText("Diamond");
        choice2.setText("Heart");
        choice3.setText("");
        choice4.setText("");
    }
    public static void jackRoom(){
        position = "jackRoom";
        mainTextArea.setText("This is the jack room, do u want to go to the room with diamond or the one with the heart ?");
        choice1.setText("Diamond");
        choice2.setText("Heart");
        choice3.setText("");
        choice4.setText("");
    }
    public void jackDiamondRoom(){
        position = "jackDiamondRoom";
        mainTextArea.setText("This is jack of diamonds room");

    }
    public void jackHeartRoom(){
        position = "This is the jack of hearts room";
        mainTextArea.setText("This is the jack of hearts room");
    }
    public void queenDiamondRoom(){
        position = "queenDiamondRoom";
        mainTextArea.setText("This is the queen of diamonds room");
    }
    public void queenHeartRoom(){
        position = "queenHeartRoom";
        mainTextArea.setText("This is the queen of hearts room");
    }
    public void kingDiamondRoom(){
        position = "kingDiamondRoom";
        mainTextArea.setText("This is the king of diamonds room");
    }
    public void kingHeartRoom() {
        position = "kingHeartRoom";
        mainTextArea.setText("This is the King of Hearts Room");
    }
    public static void youLost(){
        position = "youLost";
        mainTextArea.setText("U lost");
    }
    public void youWon(){
        position = "youWon";
        mainTextArea.setText("U won");
    }
    public static void story(){
        position = "story";
        image = new ImageIcon(".//Images//casinopixel.png");
        pictureLabel.setIcon(image);
        mainTextArea.setText("story wil go here");
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

}





