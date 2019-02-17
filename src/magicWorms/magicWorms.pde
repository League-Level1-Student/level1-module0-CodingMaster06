int maxValue = 1080;
int maxValue1 = 255;
float color1 = random(maxValue1);
float color2 = random(maxValue1);
float color3 = random(maxValue1);
float x = 0;
float y = 0;
void setup() {
size(1080, 1080);
background(255, 0, 0);


}
void draw(){
  makeMagical();
  for (int i = 0; i < 300; i = i+1) {
     x= getWormX(i);
 y= getWormY(i);
    stroke(color2, color3, color1);
    fill(color1, color2, color3);
 ellipse(x, y, 55, 55);
color1 = random(maxValue1);
color2 = random(maxValue1);
color3 = random(maxValue1);
}
 
  
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
