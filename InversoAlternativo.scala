
import scala.collection.mutable.ArrayBuffer
object InversoAlternativo{
    def main(args: Array[String]): Unit ={

         val edades = Map("Ana"-> 25, "Jose" -> 30, "Julio"-> 25) 

         println("Introduce la edad que quieres consultar: ")

         var edadBuscada = scala.io.StdIn.readInt()

         var personas= ArrayBuffer[String]()

         for ((persona, edad)<-edades){
            if (edad == edadBuscada) personas.addOne(persona)

         }
         if (personas.length==0) println ("No hay nadie con el criterio de búsqueda")
         else {
            println (s"las personas con $edadBuscada años son ")

            personas.foreach(persona=> print(s", $persona"))
            }

        }

    }


