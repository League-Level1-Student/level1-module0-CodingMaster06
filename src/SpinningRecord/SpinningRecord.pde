PImage pictureOfRecord;     //as member variable
int xPosition;
int yPosition;
import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
int angle = 100;
void setup() {
  size(600,600);     //in setup method  
minim = new Minim(this);  //in the setup method
song = minim.loadFile("hiccupsSong.mp3", 512);//in the setup method
pictureOfRecord= loadImage("reord.jpeg");  
  pictureOfRecord.resize(600, 600);     //in setup method  
}
void draw() {
  angle++;
 if (mousePressed) {
   rotateImage(pictureOfRecord, angle);
  image(pictureOfRecord, xPosition, yPosition);
  song.play();

 } else {
  song.pause(); 
 }
  
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
