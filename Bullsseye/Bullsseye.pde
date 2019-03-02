int Y=50;
 int X=60;
void setup() {
size(500, 500);
}
void draw() {

 for (int i=8;0<i;i--) {
  fill(0, 0, 0); 
  if  (i%2==0) {
  fill (255, 0, 0);
  }
    ellipse(200, 200, i*25,i*25 );
 }
}