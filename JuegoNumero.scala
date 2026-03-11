import scala.util.Random

object JuegoNumero  {

    def main(args: Array[String]): Unit = {

    val numeroSecreto = Random.between (0,101)

    var intento = -1
    
    
    while (intento != numeroSecreto)   {
    println ("Introduce un número: ")         
    intento = scala.io.StdIn.readInt()
   if (intento < numeroSecreto) println ("El número es mayor, prueba de nuevo ")
        else println ("El número es menor, prueba de nuevo ")
    
   
    //else println ("Fallo, era: " + numeroSecreto)
     } 
   println ("Has acertado!!" + intento)
 
  }
}