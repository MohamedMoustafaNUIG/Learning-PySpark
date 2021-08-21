package BeginnerTut

object OOP {
  class User(private val name: String, age: Int) {
    def this() {
      this("John Doe", 33);
    }

    def this(name: String) {
      this(name, 33);
    }

    def getName(): String = {
      return name;
    }

    def getAge(): Int = {
      return age;
    }
  };

  object Classes {
    var user = new User("Mohamed", 22);
    var user1 = new User();
    var user2 = new User("Mohamed");

  }
  def main(args: Array[String]): Unit ={
    println(Classes.user.getName);
  }
}
