clear()
drawStage(ColorMaker.black)

class BouncingRect(x: Int, y: Int) {
val pic = Picture.rectangle(90, 90)
pic.setFillColor(purple)
pic.setPosition(x, y)
var vel = Vector2D(2, 10)
val gravity = Vector2D(0, -0.2)

def draw() {
pic.draw()
}

def step() {
vel = vel + gravity
pic.translate(vel)
if (pic.collidesWith(stageBorder)) {
vel = bouncePicVectorOffStage(pic, vel)
}
}
}
val br = new BouncingRect(100, 100)
br.draw()

animate {
br.step()
}