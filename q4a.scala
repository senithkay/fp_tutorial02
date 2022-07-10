import scala.compiletime.ops.float
import java.nio.channels.FileLock
object q4a {

    def normalPayment(normal_hours: Double) : Double = normal_hours*250;

    def otPayment(oT_hours : Double): Double =   oT_hours*85;

    def fullSalary(normal_hours: Double, oT_hours:Double) : Double = 
        otPayment(oT_hours) + normalPayment(normal_hours);

    def tax(full_sal: Double) : Double = full_sal*0.12; 

    def takeHomeSal(normal_hours:Double, oT_hours: Double): Double = 
        fullSalary(normal_hours, oT_hours)-tax(fullSalary(normal_hours, oT_hours));


    def main(Args: Array[String]): Unit = {
        //assumed that a person can work half hours too EX: 40 hours and 30 mins
        var normal_hours: Double = 40; 
        var oT_hours: Double = 30; 
        println(takeHomeSal(normal_hours, oT_hours));
    }
}