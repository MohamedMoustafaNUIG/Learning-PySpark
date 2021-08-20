object HelloWorld {
  def main(args: Array[String]): Unit ={
    //string interpolation
    val name = "Mohamed";
    val age = 22;
    println(name + " is " + age + " years old");
    println(s"$name is $age years old");
    println(f"$name%s is $age%d years old");
    println(s"Hello\nWorld");
    println(raw"Hello\n World");
  }
}