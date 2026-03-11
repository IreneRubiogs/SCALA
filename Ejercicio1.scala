
import scala.io.StdIn
import scala.util.Try
object Ejercicio1  {


    def main(args: Array[String]): Unit = {

    var nombre = ""

    println ("Introduce un nombre: ")         
    nombre = scala.io.StdIn.readLine()
    
    while (nombre== "")   {
    println ("No has introducido nada, introduce un nombre: ")         
    nombre = scala.io.StdIn.readLine()
    }

   var edadTexto = ""
    var edadValida: Option[Int] = None

    while (edadValida.isEmpty) {
      println("Introduce la edad:")
      edadTexto = StdIn.readLine()
      edadValida = Try(edadTexto.toInt).toOption
      if (edadValida.exists(_ < 0)) {
        println("Edad no válida, debe ser positiva")
        edadValida = None
      }
    }

    val edad = edadValida.get

    println(s"Tu nombre es $nombre" +
      (if (edad >= 18) " y eres mayor de edad." else " y eres menor de edad."))
     } 

  }
