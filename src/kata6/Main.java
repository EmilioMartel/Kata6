package kata6;

import kata6.view.BlockDisplay;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private BlockDisplay blockDisplay;
    public static void main(String[] args) {
        new Main().execute();
    }

    public Main(){
        this.setTitle("Block shifter");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700,722);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().add(blockPanel());
    }

    private void execute(){
        this.setVisible(true);
    }

    private JPanel blockPanel() {
        BlockPanel panel = new BlockPanel();
        this.blockDisplay = panel;
        panel.block();
        return panel;
    }
}
