package roboarm;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Visual extends JFrame {
    public Visual(){
        setTitle("to mój tytuł");
        setLayout(new BorderLayout());
        Graph graph = new Graph();
        graph.setPreferredSize(new Dimension(800, 600));
        add(graph, BorderLayout.CENTER);

    }

    public static void main(String[] args) throws Exception {

        SwingUtilities.invokeAndWait(new Runnable() {
            public void run() {
                JFrame frame = new Visual();
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
    public static class Graph extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
g2d.setTransform(new AffineTransform(){

});
            int w = getWidth();
            int h = getHeight();
            g.drawLine(0,0,w/2,h/2);
        }

    }

}
