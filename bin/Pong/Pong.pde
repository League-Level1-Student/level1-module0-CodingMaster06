PImage backgroundImage;
 import ddf.minim.*;  
Minim minim;
AudioSample sound;
 int xPos = (int) random(500);
 int yPos = (int) random(500);
 float speedx = 5;
 float speedy = 5;
 
 
void setup() {
  size(500, 500);
minim = new Minim (this);
sound = minim.loadSample("Pong.wav", 128);

backgroundImage = loadImage("volleyBallNet.jpg");
backgroundImage.resize( 500, 500);

}
void draw() {
  image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
  fill(30,30,30);
  rect(mouseX, 480, 70, 70);
xPos+= speedx;
yPos+= speedy;
  fill(255, 0, 0);
stroke(36, 0, 0);
ellipse(xPos, yPos, 100, 100);
  if (xPos >= width) {
    speedx = -5;
  }
  if (xPos <= 0) {
   speedx = 5; 
  }
   if (yPos >= height) {
    speedy = -5;
  }
  if (yPos <= 0) {
   speedy = 5; 
  }
  if (intersects (xPos, yPos, mouseX, 480, 70)) {
    sound.trigger();
  }
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}
