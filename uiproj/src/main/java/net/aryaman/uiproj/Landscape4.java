package net.aryaman.uiproj;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Landscape4 extends JPanel implements KeyListener, MouseListener {
    private int w, h;
    private Image img, sun, tree, house, ball;
    private boolean showTreeImage, showHouseImage, showSunImage, showBallImage = false;
    private int treePress1, housePress2, sunPress3, ballPress4;
    private int vMove, hMove;
    private int xBallPos;
    private int yBallPos;

    private boolean mouseClickedOnHouse = false;

    public Landscape4() {
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        setBackground(Color.WHITE);
        sun = new ImageIcon("src/main/resources/sun.png").getImage();
        tree = new ImageIcon("src/main/resources/tree.png").getImage();
        house = new ImageIcon("src/main/resources/house.png").getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        w = getWidth();
        h = getHeight();
        xBallPos = w / 3;
        yBallPos = h / 8;

        if (showSunImage) {
            g.drawImage(sun, (78 * w) / 100, (h / 8), (12 * w) / 100, (h / 6), null);
        } else {
            g.setColor(Color.orange);
            g.drawOval((78 * w) / 100, (h / 8), (12 * w) / 100, (h / 6));
        }
        if (showHouseImage) {
            g.drawImage(house, (7 * w) / 10, (h * 2) / 5, w / 5, (7 * h) / 20, null);
        } else {
            int[] xPoints = {(7 * w) / 10, (4 * w) / 5, (9 * w) / 10};
            int[] yPoints = {(h / 2), (h * 2) / 5, (h / 2)};
            g.setColor(Color.BLUE);
            int nPoints = 3;
            g.fillPolygon(xPoints, yPoints, nPoints);
            g.setColor(new Color(125, 0, 125));
            g.fillRect((7 * w) / 10, (h / 2), (w / 5), (h / 4));
        }
        if (showTreeImage) {
            g.drawImage(tree, (3 * w / 32), (h / 3), (w / 4), (5 * h) / 12, null);
        } else {
            g.setColor(Color.BLACK);
            g.fillRect((2 * w) / 10, (h / 2), (w / 20), (h / 4));
            g.setColor(Color.green);
            g.fillOval((w / 8), (h / 3), (w / 5), (h / 6));
        }
        if (showBallImage) {
            g.drawImage(ball, xBallPos + hMove, yBallPos + vMove, null);
            ball = getImage("src/main/resources/ball.png", 10);
        }
        g.setColor(Color.green);
        g.drawLine(0, (3 * h) / 4, w, (3 * h) / 4);
        Font f = new Font(Font.MONOSPACED, Font.ITALIC | Font.BOLD, 30);
        String text = "Sunnyvale, CA: A Scenic Landscape";
        g.setColor(Color.BLACK);
        g.setFont(f);
        Graphics2D g2 = (Graphics2D) g;
        g2.scale(w / 800D, h / 600D);
        g2.drawString(text, 100, 525);
        repaint();
    }
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_1) {
            showTreeImage = true;
            treePress1++;
            if (treePress1 == 2) {
                showTreeImage = false;
                treePress1 = 0;
            }
        } else if (key == KeyEvent.VK_2) {
            showHouseImage = true;
            housePress2++;
            if (housePress2 == 2) {
                showHouseImage = false;
                housePress2 = 0;
            }
        } else if (key == KeyEvent.VK_3) {
            showSunImage = true;
            sunPress3++;
            if (sunPress3 == 2) {
                showSunImage = false;
                sunPress3 = 0;
            }
        } else if (key == KeyEvent.VK_4) {
            showBallImage = true;
            ballPress4++;
            if (ballPress4 == 2) {
                showBallImage = false;
                ballPress4 = 0;
            }
        }
        if (key == KeyEvent.VK_UP) {
            vMove-=10;
        } else if (key == KeyEvent.VK_DOWN) {
            vMove+=10;
        } else if (key == KeyEvent.VK_LEFT) {
            hMove-=10;
        } else if (key == KeyEvent.VK_RIGHT) {
            hMove+=10;
        }
    }
    public Image getImage(String n, int r) {
        try {
            img = ImageIO.read(new File(n));
        } catch (IOException e) {
            System.out.println("There is no image file!");
        }
        if (img != null) {
            img = img.getScaledInstance(w/r,h/r, Image.SCALE_DEFAULT);
        }
        return img;
    }
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }
    public static void main(String[] args) {
        JFrame window = new JFrame("Landscape4");
        Landscape4 canvas = new Landscape4();
        window.add(canvas);
        window.setBounds(100, 100, 300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            if (e.getX() >= (7*w) / 10 && e.getX() <= (9*w)/10
                    && e.getY() >= h / 2 && e.getY() <= (3*h) / 4) {
                hMove = e.getX() - xBallPos - 40;
                vMove = e.getY() - yBallPos - 30;

            }
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
            if (e.getY() >= 0 && e.getY() <= (3*h)/4 &&
                    e.getX() >= 0 && e.getY() <= w) {
                hMove = e.getX() - xBallPos - 40;
                vMove = e.getY() - yBallPos - 30;
            }
        }
    }

    //repaint();

    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}
