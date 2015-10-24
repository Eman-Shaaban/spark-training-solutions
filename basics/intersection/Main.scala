import org.apache.spark._

object Main {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("test").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val nums1 = sc.parallelize(1 to 10)
    val nums2 = sc.parallelize(1 to 5)
    val res  = nums1.intersection(nums2).collect
    println(res.mkString(","))
  }
}
