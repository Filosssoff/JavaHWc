import javax.swing.*;
import java.awt.*;


public class DrawSpace extends JPanel {
    private static final int RAND_MULTIPLIER = 100;

    public DrawSpace() {
        setBackground(Color.WHITE);
        setOpaque(true);
    }


    public void drawTriangle(Graphics g, Point point, Color color) {
        int coordXAdditionX2 = (int) (Math.random() * RAND_MULTIPLIER);
        int coordYAdditionY2 = (int) (Math.random() * RAND_MULTIPLIER);
        int coordXAdditionX3 = (int) (Math.random() * RAND_MULTIPLIER);
        int coordYAdditionY3 = (int) (Math.random() * RAND_MULTIPLIER);
        g.setColor(color);
        g.drawLine(point.x, point.y, (point.x + coordXAdditionX2), (point.y + coordYAdditionY2));
        g.drawLine(point.x, point.y, (point.x + coordXAdditionX3), (point.y + coordYAdditionY3));
        g.drawLine((point.x + coordXAdditionX2), (point.y + coordYAdditionY2), (point.x + coordXAdditionX3), (point.y + coordYAdditionY3));
    }

    public void drawRectangle(Graphics g, Point point, Color color) {
        int width = (int) (Math.random() * RAND_MULTIPLIER);
        int height = (int) (Math.random() * RAND_MULTIPLIER);
        g.setColor(color);
        g.drawRect(point.x, point.y, width, height);
    }

    public void drawFigure(Graphics g, Point point, String figure, Color color) {
        if (figure.equals("Треугольник")) {
            drawTriangle(g, point, color);
        } else if (figure.equals("Прямоугольник")) {
            drawRectangle(g, point, color);
        }
    }

}

