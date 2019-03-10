int y = 0;

 int randomNumber1 = (int) random(width); 

 int score = 0;
void setup(){
  size(500, 500);
 
}
void draw(){
 
  background(0, 156, 250);

fill(167, 180, 188);
 rect(mouseX, 480, 100, 100);
 


 
  fill(0, 0, 255);
stroke(0, 9, 4);
ellipse(randomNumber1,y  , 30, 70);
   y += 5;
if (y >= 500) {
  randomNumber1 = (int) random(width);
  y= 0;
}
if (y == 480)
{
  checkCatch(randomNumber1);
    
} 
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); 
   
   }