object Demo {
  def main(args: Array[String]): Unit ={
    //Conditionals
    /*
    val x  = 20;
    var res = "";

    if (x == 20){
      res = "X is 20";
    }else{
      res = "X is not 20";
    }
    println(res)

    val res2 = if(x==20) "x == 20" else "x != 20";
    println(res2);

    val y = 30;
    if (x == 20 && y == 30){
      println("x == 20 and y == 30");
    }
    */

    //Loops
    /*
    var x = 0;
    while (x<=10){
      println("x="+x);
      x+=1;
    }

    var y = 0;
    do{
      println("y="+y);
      y+=1;
    }while(y<=10);

    for (i <- 1 to 5){
      println("Hello "+i)
    }

    for (i <- 1.to(5)){
      println("Hello "+i)
    }

    for (i <- 1.until(5)){
      println("Hello "+i)
    }

    for (i <- 1 to 5 ; j <- 1 to 5){
      println("i: "+i+" j: "+j)
    }
    */
    val lst = List(1,2,3,4,5,6);

    for (i <- lst; if i%2==0){
      println(i)
    }

    val results = for {i <- lst; if i%2==0} yield {
      i*i;
    }

    println(results)

  }
}