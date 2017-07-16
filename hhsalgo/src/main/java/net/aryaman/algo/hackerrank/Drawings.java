package net.aryaman.algo.hackerrank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawings extends JPanel implements MouseListener {
    private int x, y;
    private int textXPos, textYPos;
    private int hMove, vMove;

    public Drawings() {
        addMouseListener(this);
        setFocusable(true);
        setBackground(Color.WHITE);

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        x = getWidth();
        y = getHeight();
        textXPos = 0;
        textYPos = 30;

        // Draw Circle
        g.setColor(Color.BLACK);
        g.drawOval((25*x)/64, (y/8), (5 * x)/20, (y/6));

        // Draw Filled Rectangle
        g.setColor(Color.BLUE);
        g.fillRect((117*x)/256, (75*y/256), (x/8), (y/16));

        // Shaded Polygon
        int[] xPoints = {(133*x)/256, (117*x)/256, (149*x)/256};
        int[] yPoints = {(91*y)/256, (120*y)/256,(120*y)/256};

        int[] x1Points = {(117*x)/256, (149*x)/256, (133*x)/256};
        int[] y1Points = {(120*y)/256, (120*y)/256, (135*y)/256};
        g.setColor(Color.BLUE);
        g.fillPolygon(xPoints, yPoints, 3);
        g.fillPolygon(x1Points, y1Points, 3);

        // Line
        g.setColor(Color.BLACK);
        g.drawLine((133*x)/256, (135*y)/256, (133*x)/256, (21*y)/32);

        // Legs
        g.setColor(Color.BLACK);
        g.drawLine((133*x)/256, (21*y)/32, (9*x/24), y);
        g.drawLine((133*x)/256, (21*y)/32, (31*x/48), y);

        // Arms
        g.setColor(Color.BLACK);
        g.drawLine((140*x)/256, (104*y)/256, (3*x)/4, (75*y)/256);
        g.drawLine((126*x)/256, (104*y)/256, x/4, (75*y)/256);

        // Text
        Font f = new Font(Font.MONOSPACED, Font.ITALIC |Font.PLAIN, 30);
        String text = "Mr. Wilson: A Portrait";
        g.setColor(Color.RED);
        g.setFont(f);
        g.drawString(text, 0 + hMove, 30 + vMove);
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(x / 800D, y / 600D);
        repaint();

    }
    public static void main(String[] args) {
        JFrame window = new JFrame("Drawings");
        window.setBounds(100, 100, 300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel canvas = new Drawings();
        canvas.setBackground(Color.WHITE);
        window.getContentPane().add(canvas);
        window.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            if (e.getX() >= 0 / 10 && e.getX() <= x
                    && e.getY() >= 0 && e.getY() <= y) {
                hMove = e.getX() - textXPos - 200;
                vMove = e.getY() - textYPos;

            }
        }

    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}