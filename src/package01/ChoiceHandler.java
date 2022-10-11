package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler extends Game implements ActionListener  {
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