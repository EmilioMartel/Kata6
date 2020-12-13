package kata6;

import kata6.Model.Block;
import kata6.view.BlockDisplay;

import javax.swing.*;
import java.awt.*;

public class BlockPanel extends JPanel implements BlockDisplay {
    private Block block;
    private static final int SIZE  = 100;
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0,0,700,700);

        g.setColor(Color.BLACK);
        int max = 700*SIZE;
        for (int i = 0; i < 700; i+=100){
            int d = i*SIZE;
            g.drawLine(i*SIZE,0,i*SIZE,max);
            g.drawLine(0,i*SIZE,max,i*SIZE);
        }

        if (block == null) return;

        g.setColor(Color.RED);
        g.fillRect(block.x() * 100, (700 - block.y()) * 100,100,100);

    }


    @Override
    public BlockPanel block() {
        BlockPanel panel = new BlockPanel();
        panel.display(block);
        return panel;
    }

    @Override
    public void display(Block block) {
        this.block = block;
        repaint();
    }

    @Override
    public void changed() {
        repaint();
    }
}
