package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Can only extend 1 class but u can implement multiple interfaces.
public class titleScreenHandler extends CreateGameScreen implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        createGameScreen();
    }
}
