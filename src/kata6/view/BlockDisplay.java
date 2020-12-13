package kata6.view;

import kata6.BlockPanel;
import kata6.Model.Block;

public interface BlockDisplay extends Block.Observer {
    BlockPanel block();
    void display(Block block);

}
