import org.apache.spark._

object Main {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("test").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val name = sc.parallelize(Seq("Eman","Shaaban"))
    val res  = name.map(_.toLowerCase)
    println(res.collect().mkString(" "))
  }
}
