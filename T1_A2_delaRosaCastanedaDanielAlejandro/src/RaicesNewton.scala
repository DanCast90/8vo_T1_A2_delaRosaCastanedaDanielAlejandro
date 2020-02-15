import scala.math._
import scala.io.StdIn._
object RaicesNewton {
  def main(args: Array[String]): Unit={
    
    print("Ingresa un numero: ")
    var num=readInt()
    var estimacion=num/2+0.0
    var i=1;
    var x=0.0;
    
    while(abs(num-pow(x,2))>0.0001){
      x=num/estimacion
      estimacion=(x+estimacion)/2
      printf("iteracion # %d x %f \n",i,x)
      i=i+1
    }

  }
}