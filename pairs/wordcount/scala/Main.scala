import org.apache.spark._

object Main {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("test").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val input = sc.textFile("../input")
    val count = input.map(_.toLowerCase).flatMap(line => line.split(" ")).map(word => (word,1)).reduceByKey(_+_)
    count.saveAsTextFile("../output")

  }
}
