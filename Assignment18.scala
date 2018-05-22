import breeze.macros.expand.args

object Assignment18 {
  def main (args: Array[String])
  {
    def numList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var sum: Int = 0
    var total: Int = numList.length
    println(s"Total number of elements in the list is $total")
    var Avg: Int = 0
    var N: Int = 0
    var evensum: Int = 0
    var divisiblcount: Int = 0
    for (N <- numList) {
      if(N % 2 == 0 ){
        evensum += N
      }
      if(N % 3 == 0 && N % 5 == 0 ){
        divisiblcount += 1
      }
      sum += N
    }
    println(s"The sum of all numbers is $sum ")
    println(s"The sum of all even numbers is $evensum ")
    println(s"The number of elements that are divisible by 3 and 5 are $divisiblcount ")
    Avg = sum / total
    println(s"The average of all the numbers in the list $Avg ")
  }
}