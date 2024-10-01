import javax.swing.*;
import java.awt.*;

public class MorseTreeGUI extends JPanel {

    private MorseTree tree;

    public MorseTreeGUI(MorseTree tree) {
        this.tree = tree;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTree(g, tree.getRoot(), getWidth() / 2, 50, getWidth() / 4, 50);
    }

    private void drawTree(Graphics g, Node node, int x, int y, int horizontalSpacing, int verticalSpacing) {
        if (node == null) return;

        g.setColor(Color.BLACK);
        g.fillOval(x - 15, y - 15, 30, 30);
        g.setColor(Color.WHITE);
        g.drawString(node.getValue() != null ? node.getValue() : "", x - 5, y + 5);

        if (node.getLeft() != null) {
            g.setColor(Color.BLACK);
            g.drawLine(x, y, x - horizontalSpacing, y + verticalSpacing);
            drawTree(g, node.getLeft(), x - horizontalSpacing, y + verticalSpacing, horizontalSpacing / 2, verticalSpacing);
        }

        if (node.getRight() != null) {
            g.setColor(Color.BLACK);
            g.drawLine(x, y, x + horizontalSpacing, y + verticalSpacing);
            drawTree(g, node.getRight(), x + horizontalSpacing, y + verticalSpacing, horizontalSpacing / 2, verticalSpacing);
        }
    }
}