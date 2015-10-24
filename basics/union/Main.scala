import org.apache.spark._

object Main {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("test").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val even = sc.parallelize(List(2,4,6,8,10))
    val odd = sc.parallelize(List(1,3,5,7,9))
    val res  = odd.union(even).collect
    println(res.mkString(","))
  }
}
