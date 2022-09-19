package Demo8

object Q1 {

  case class Point(var a:Int,var b:Int) // initialize case class

  // (a)
  def add(p1:Point, p2:Point):Unit = { // define add function which takes two points as parameters
    val x = p1.a + p2.a
    val y = p1.b + p2.b
    println("(a) Adding two points: "+"(" + x + "," + y +")")
  }

  // (b)
  def distance(p1:Point):Unit = {
    println("Input a distance dx and dy: ")
    print("dx: ")
    val dx = scala.io.StdIn.readInt()

    print("dy: ")
    val dy = scala.io.StdIn.readInt()

    val x = p1.a + dx
    val y = p1.b + dy
    println("(b) Moving a point: "+ "(" + x + "," + y +")")
  }

  // (c)
  def distance_between_two_points(p1:Point, p2:Point): Unit ={
    val x_distance = p1.a - p2.a
    val y_distance = p1.b - p2.b
    val distance = x_distance*x_distance + y_distance*y_distance
    println("(c) Distance between two given points: " + scala.math.sqrt(distance))
  }

  // (d)
  def invert(p1:Point): Unit = {
    val tmp = p1.a
    p1.a = p1.b
    p1.b = tmp
    println("(d) Switching x and y coordinates: ")
    println("x: " + p1.a)
    println("y: " + p1.b)
  }

  def main(args:Array[String]): Unit ={

    add(Point(1,2), Point(4,5)) // call function add on a point at (1,2) and (4,5)

    distance(Point(5,8)) // call function distance on a point at (5,8)

    distance_between_two_points(Point(4,5), Point(8,6)) // call function distance_between_two_points on a point at (4,5) and (8,6)

    invert(Point(8,7)) // call function invert on a point at (8, 45)

  }
}