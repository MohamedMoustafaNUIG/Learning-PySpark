package BeginnerTut

object Collections {
  object Arrays {
    val myArray: Array[Int] = new Array[Int](4);
    val myArray2: Array[Int] = new Array[Int](5);
    val myArray3: Array[Int] = Array(1, 2, 3, 4);

    myArray(0) = 20;
  }

  object Lists {
    val ages: List[Int] = List(18, 21, 23, 14);
    val names: List[String] = List("Haneen", "Jana", "Mohamed", "Bob");
    val allOnes = List.fill(5)(1);

    def minor(x: Int) = println(if (x > 18) true else false);

    val (even, odd) = List(1,2,3,4,5,6).partition(_ % 2 == 0);
  }

  object Sets {
    /*
    cant have duplicate values
    not ordered; cant index
    */
    val ids: Set[Int] = Set(1, 2, 3, 4, 4, 4); //immutable
    var names = scala.collection.mutable.Set("Bob", "Frank"); //mutable
  }

  object Maps {
    //keys are unique
    val record: Map[Int, String] = Map(10 -> "Mohamed", 11 -> "Haneen");
  }

  object Tuples {
    //max 22 elements
    val myTuple = (1, 2, "Hello", true);
    val myTuple2 = new Tuple3(1, "Hello", true);
  }

  object Options {
    val lst = List(1, 2, 3);
    var res = lst.find(_ > 1);
    var res1 = Maps.record.get(1).getOrElse("Record not found");
  }

  object MapAndFilter {
    val lst = List(1, 2, 3, 4);
    val myMap = Map(1 -> "Tom", 2 -> "Max", 3 -> "Bob");

    def map_to_lower(): Unit ={
      var map1 = Map(1 -> "Tom", 2 -> "Max", 3 -> "Bob");
      var res = map1
        .map{
          case (key, value) => key -> value.toLowerCase
        }
        .foreach(println);
      println(map1);
      println(res);
    }
  }

  object ReduceFoldOrScan {
    val lst = List(1, 2, 3, 4);
    val lst2 = List("A", "B", "C");

    //var res = lst.reduceLeft(_ + _);
    //var res2 = lst2.reduceLeft(_ + _);

    //var res3 = lst.reduceLeft((x,y) => {println(x + " , " + y); x+y});

    var res4 = lst.foldLeft(10)(_ + _);
    var res5 = lst.scanLeft(10)(_ + _);
  }

  object NewCollectionType{
    def apply(ints: Int*): Seq[Int] = ints;
  }

  def main(args: Array[String]): Unit ={
    /*
    println(Arrays.myArray(0));
    for (x<- Arrays.myArray){
      println(x);
    }
    println(Arrays.myArray3.length);
    */

    /*
    println("Jennifer" :: Lists.names);
    println(1 :: 2 :: Nil);
    println(Lists.allOnes);
    Lists.names.foreach(println);
    print(Lists.ages.foreach(Lists.minor));

    println(Lists.even);
    */

    /*
    var element = 3;
    println(Sets.ids(element));
    println(Sets.ids++Sets.names);
    */

    /*
    println(Maps.record.values);
    Maps.record.keys.foreach { k =>
      println("Key: " + k);
      println("Value: " + Maps.record(k))
    }
    */

    /*
    println(Tuples.myTuple._1);
    Tuples.myTuple.productIterator.foreach{
      i => println(i);
    }
    */

    /*
    println(Options.res);
    println(Options.res1);
    */

    /*
    println(MapAndFilter.lst.map(_ * 2));
    println(MapAndFilter.lst.map(x => x * 2));
    println(MapAndFilter.myMap.map(x => "hi " + x._2));
    println("hello".map(_.toUpper));
    println(List(List(1,2,3), List(4,5,6)).flatten);
    println(MapAndFilter.lst.flatMap(x => List(x, x+1)));

    println(MapAndFilter.lst.filter(x => x%2 == 0));

    MapAndFilter.map_to_lower();
    */

    /*
    println(ReduceFoldOrScan.res);
    println(ReduceFoldOrScan.res4);
    println(ReduceFoldOrScan.res5);
    */

    println(NewCollectionType.apply(1,2,3,4,5));
  }
}
