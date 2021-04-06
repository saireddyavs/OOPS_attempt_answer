import processing.core.PApplet;

class Sketcher extends PApplet {

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


    public float height, width, diameter;
    int speed;
    Sketcher pAppletSketcher;

    public ball(float height, float width, float diameter, int speed, Sketcher pAppletSketcher) {
        this.diameter = diameter;
        this.width = width;
        this.height = (height*speed)/5;
        this.speed = speed;
        this.pAppletSketcher = pAppletSketcher;

    }

    public void setWidth() {
        this.width = width + this.speed;
    }
}


class Drawing_tools {


    public void drawEllipse(ball ball) {
//        System.out.println(ball.height+" "+ball.width+ " "+ball.speed);
        ball.pAppletSketcher.ellipse(ball.width, ball.height, ball.diameter, ball.diameter);
    }
}