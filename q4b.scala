import scala.compiletime.ops.int
object q4b {

    def attendance(ticketPrice: Int) : Int = 120+((15-ticketPrice)/5)*20;

    def cost(ticketPrice: Int) : Int = 500 + attendance(ticketPrice)*3;

    def revenue(ticketPrice: Int) : Int = attendance(ticketPrice)*ticketPrice;

    def profit(ticketPrice: Int) : Int = revenue(ticketPrice) - cost(ticketPrice);


    def main(Args: Array[String]): Unit = {
        print(profit(5), profit(10), profit(15), profit(20), profit(25), profit(30), profit(35))
    }
}