package kata6.Model;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Block {
    private static int MAX = 7;
    private final Timer timer;
    private int x;
    private int y;
    private List<Observer> observers;


    public Block(){
        this.x = 4;
        this.y = 4;
        this.timer = new Timer();
    }

    public void right(){
        if(this.x == MAX) return;
        this.x++;
    }

    public void left(){
        if(this.x == 1) return;
        this.x--;
    }

    public void up(){
        if(this.y == MAX) return;
        this.y++;
    }

    public void down(){
        if(this.y == 0) return;
        this.y--;
    }

    public int x(){
        return this.x;
    }
    public int y(){
        return this.y;
    }

    private TimerTask task(){
        return new TimerTask() {
            @Override
            public void run() {
                double r = Math.random();
                if(r<0.9)return;
                if(r<0.92)left();
                if(r<0.94)right();
                if(r<0.96)up();
                if(r<0.98)down();

                for(Observer observer: observers) observer.changed();
            }
        };
    }

    public void register(Observer observer){
        observers.add(observer);

    }

    public interface Observer{
        void changed();
    }
}
