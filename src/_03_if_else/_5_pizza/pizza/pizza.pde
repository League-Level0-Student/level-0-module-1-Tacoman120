PImage pepperoni;
void setup() {
    size(500,500);
    fill(239,204,162);
    ellipse(250,250,420,420);
    fill(255,99,71);
    ellipse(250,250,370,370);
    fill(255, 234, 0);
    ellipse(250,250,340,340);
    pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(50,50);
}
void draw() {
  if (mousePressed) {
    image(pepperoni,100,200);
    image(pepperoni,190,280);
    image(pepperoni,290,300);
    image(pepperoni,250,130);
    image(pepperoni,140,140);
    image(pepperoni,250,350);
    image(pepperoni,350,200);
    image(pepperoni,200,200);
    image(pepperoni,270,220);
    image(pepperoni,120,300);
  }
}
