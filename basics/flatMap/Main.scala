import org.apache.spark._

object Main {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("test").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val fruits = sc.parallelize(Seq("apple", "banana", "orange"))
    val res  = fruits.flatMap(_.toUpperCase)
    println(res.collect().mkString("-"))
  }
}
