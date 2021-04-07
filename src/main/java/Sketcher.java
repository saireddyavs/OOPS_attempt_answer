import processing.core.PApplet;

public class Sketcher extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    public static final int DIAMETER = 10;

    ball[] balls = new ball[4];

    Drawing_tools drawing_tools = new Drawing_tools();


    public static void main(String[] args) {
        PApplet.main("Sketcher",args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        ellipse(WIDTH,HEIGHT, DIAMETER,DIAMETER);
        balls[0] = new ball(HEIGHT, 1, DIAMETER, 1, this);
        balls[1] = new ball(HEIGHT, 1, DIAMETER, 2, this);
        balls[2] = new ball(HEIGHT, 1, DIAMETER, 3, this);
        balls[3] = new ball(HEIGHT, 1, DIAMETER, 4, this);

    }

    @Override
    public void draw() {

        for (int i = 0; i < balls.length; ++i) {

            drawing_tools.drawEllipse(balls[i]);
            balls[i].setWidth();

        }
    }


}


class ball {


    private float height, width, diameter;
    private  int speed;
    private  Sketcher pAppletSketcher;

    public ball(float height, float width, float diameter, int speed, Sketcher pAppletSketcher) {
        this.diameter = diameter;
        this.width = width;
        this.height = getHeight(height, speed);
        this.speed = speed;
        this.pAppletSketcher = pAppletSketcher;

    }

    private float getHeight(float height, int speed) {
        return (height * speed) / 5;
    }

    public void setWidth() {
        this.width = width + this.speed;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getDiameter() {
        return diameter;
    }

    public int getSpeed() {
        return speed;
    }

    public Sketcher getpAppletSketcher() {
        return pAppletSketcher;
    }
}


class Drawing_tools {


    public void drawEllipse(ball ball) {
//        System.out.println(ball.height+" "+ball.width+ " "+ball.speed);
        ball.getpAppletSketcher().ellipse(ball.getWidth(), ball.getHeight(), ball.getDiameter(), ball.getDiameter());
    }
}