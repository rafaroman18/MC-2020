package practica1;

import javax.swing.*;
import java.awt.*;

public class simulator {

    public static JInternalFrame create(int widthscreen){

        JInternalFrame framegraph = new JInternalFrame(("Simuladores"), true, false, true, true);
        framegraph.setSize(widthscreen / 4 - 10, (widthscreen / 4) - widthscreen/16 );
        framegraph.setLocation(widthscreen/4,widthscreen/16);
        framegraph.setVisible(true);

        Canvas canv = new Canvas();
        canv.setBackground(Color.BLACK);
        canv.setFocusable(true);

        framegraph.add(canv);

        return framegraph;
    }


}