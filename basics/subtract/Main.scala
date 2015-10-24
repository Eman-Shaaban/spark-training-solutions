import org.apache.spark._

object Main {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("test").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val nums1 = sc.parallelize(List(1,2,3,4))
    val nums2 = sc.parallelize(List(2,4,6,8))
    val res  = nums1.subtract(nums2).collect
    println(res.mkString(","))
  }
}
