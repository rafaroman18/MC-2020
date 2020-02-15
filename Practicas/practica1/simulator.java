package practica1;

import javax.swing.*;
import java.awt.*;

public class simulator {

    public static JInternalFrame create(int widthscreen){

        JInternalFrame framesim = new JInternalFrame(("Simuladores"), true, false, true, false);
        framesim.setSize(widthscreen / 4 - 10, (widthscreen / 4) - widthscreen/16 );
        framesim.setLocation(widthscreen/4,widthscreen/16);
        framesim.setVisible(true);

        Canvas canv = new Canvas();
        canv.setBackground(Color.BLACK);
        canv.setFocusable(true);

        framesim.add(canv);

        return framesim;
    }

}