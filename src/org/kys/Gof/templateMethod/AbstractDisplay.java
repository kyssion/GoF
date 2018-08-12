package org.kys.Gof.templateMethod;

/**
 * 模板
 */
public abstract class AbstractDisplay {
    private int speed=5;
    public abstract void start();
    public abstract void stop();
    public abstract void print();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void display(){
        start();
        for(int a=0;a<this.speed;a++){
            this.print();
        }
        this.stop();
    }
}
