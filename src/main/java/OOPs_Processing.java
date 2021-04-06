import processing.core.PApplet;

import java.io.DataInput;
import java.util.Date;

public class OOPs_Processing extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    public static final int Diameter = 10;

    float X_positions[] = new float[4];


    public static void main(String[] args) {
        PApplet.main("OOPs_Processing", args);
    }

    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

        ellipse(WIDTH, HEIGHT, Diameter, Diameter);

        for (int i = 0; i < 4; ++i) X_positions[i] = 0;

    }

    @Override
    public void draw() {

        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();

    }

    private void drawCircle4() {
        drawEllipse(4);
    }


    private void drawCircle3() {
        drawEllipse(3);


    }

    private void drawCircle2() {
        drawEllipse(2);


    }

    private void drawCircle1() {
        drawEllipse(1);


    }

    private void drawEllipse(int ellipse_number) {

        ellipse(X_positions[ellipse_number-1], getEllipse_Y_position(ellipse_number), Diameter, Diameter);

        update_X_postions(ellipse_number);


    }

    private int getEllipse_Y_position(int ellipse_number) {
        return (HEIGHT * ellipse_number) / 5;
    }

    private void update_X_postions(int ellipse_number){
        X_positions[ellipse_number-1]+=ellipse_number;

    }


}
