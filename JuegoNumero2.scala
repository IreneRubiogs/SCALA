import scala.util.Random
import scala.io.StdIn.readInt

object JuegoNumero {

  def main(args: Array[String]): Unit = {

    val numeroSecreto = Random.between(0, 101)
    val n = 1

    // Llamada inicial a la función recursiva
    compruebaNumero(numeroSecreto, n)
  }

  def compruebaNumero(numeroSecreto: Int, n: Int): Unit = {
    println("Introduce un número: ")
    val intento = readInt()
    
    if (intento == numeroSecreto)
      println(s"¡Has acertado! El número era $intento tras $n intentos" )
    else {
      if (intento < numeroSecreto)
        println("El número es mayor, prueba de nuevo")
      else
        println("El número es menor, prueba de nuevo")

      // Recursión hasta acertar
      
      compruebaNumero(numeroSecreto, n+1)
    }
  }
}
