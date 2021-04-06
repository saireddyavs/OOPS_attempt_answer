import processing.core.PApplet;

class PAppletSketcher extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    public static final int DIAMETER = 10;
    ball[] balls = new ball[4];

    Drawing_tools drawing_tools = new Drawing_tools();


    public static void main(String[] args) {
        PApplet.main("OOPS_way", args);
    }

    @Override
    public void setup() {
        super.setup();
        ellipse(WIDTH, HEIGHT, DIAMETER, DIAMETER);

        balls[0] = new ball(HEIGHT, WIDTH, DIAMETER, 1, this);
        balls[1] = new ball(HEIGHT, WIDTH, DIAMETER, 2, this);
        balls[2] = new ball(HEIGHT, WIDTH, DIAMETER, 3, this);
        balls[3] = new ball(HEIGHT, WIDTH, DIAMETER, 4, this);

    }

    @Override
    public void draw() {
        for (int i = 0; i < balls.length; ++i) {

            drawing_tools.drawEllipse(balls[0]);
            balls[0].setWidth();

        }
    }
}

class ball {


    public float height, width, diameter;
    int speed;
    PAppletSketcher pAppletSketcher;

    public ball(float height, float width, float diameter, int speed, PAppletSketcher pAppletSketcher) {
        this.diameter = diameter;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.pAppletSketcher = pAppletSketcher;

    }

    public void setWidth() {
        this.width = width * this.speed;
    }
}


class Drawing_tools {


    public void drawEllipse(ball ball) {
        ball.pAppletSketcher.ellipse(ball.height, ball.width, ball.diameter, ball.diameter);
    }
}


