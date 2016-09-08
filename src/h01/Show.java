package h01;
//Voorbeeld 2.2

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Dennis Koppen", 50, 60 );
    }
}

