import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Window extends JFrame {
    public Window() {
        setBounds(100, 100, 800, 600);
        setTitle("Времяубивалка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DrawSpace drawSpace = new DrawSpace();


        Button buttonRed = new Button();
        buttonRed.setBackground(Color.RED);
        buttonRed.setBounds(0, 0, 50, 30);

        Button buttonBlue = new Button();
        buttonBlue.setBackground(Color.BLUE);
        buttonBlue.setBounds(50, 0, 50, 30);

        Button buttonGreen = new Button();
        buttonGreen.setBackground(Color.GREEN);
        buttonGreen.setBounds(100, 0, 50, 30);

        Button buttonYellow = new Button();
        buttonYellow.setBackground(Color.YELLOW);
        buttonYellow.setBounds(150, 0, 50, 30);

        Button buttonOrange = new Button();
        buttonOrange.setBackground(Color.ORANGE);
        buttonOrange.setBounds(200, 0, 50, 30);

        Button buttonDrawRec = new Button("Прямоугольник");
        buttonDrawRec.setBounds(250, 0, 100, 30);

        Button buttonDrawTri = new Button("Треугольник");
        buttonDrawTri.setBounds(350, 0, 100, 30);

        add(buttonRed);
        add(buttonBlue);
        add(buttonGreen);
        add(buttonYellow);
        add(buttonOrange);
        add(buttonDrawRec);
        add(buttonDrawTri);

        add(drawSpace);

        final Color[] lineColor = {Color.BLACK};

        buttonRed.addActionListener(e -> lineColor[0] = Color.RED);

        buttonBlue.addActionListener(e -> lineColor[0] = Color.BLUE);

        buttonGreen.addActionListener(e -> lineColor[0] = Color.GREEN);

        buttonYellow.addActionListener(e -> lineColor[0] = Color.YELLOW);

        buttonOrange.addActionListener(e -> lineColor[0] = Color.ORANGE);


        final String[] figure = {"Треугольник"};

        buttonDrawRec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                figure[0] = "Прямоугольник";
            }
        });

        buttonDrawTri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                figure[0] = "Треугольник";
            }
        });

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                drawSpace.drawFigure(drawSpace.getGraphics(), e.getPoint(), figure[0], lineColor[0]);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        setVisible(true);
    }


}
