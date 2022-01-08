
void setup() {
    size(500,500);
    fill(239,204,162);
    ellipse(250,250,420,420);
    fill(255,99,71);
    ellipse(250,250,370,370);
    fill(255, 234, 0);
    ellipse(250,250,340,340);
    PImage pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(30,30);
}
void draw() {
    image(pepperoni ,100,200);
}
