/*Dada una lista de frases (simulando líneas de un fichero):
List(
  "spark scala es potente",
  "scala es funcional",
  "spark es distribuido"
)

1.	Divide cada frase en palabras.
2.	Normaliza todas las palabras a minúsculas.
3.	Cuenta cuántas veces aparece cada palabra.
4.	Calcula la media de palabras por frase	
5.	Obtén el top 10 palabras más frecuentes
6.	Cuenta el número de frases que contienen “Scala”
7.	Agrupa las palabras del texto por primera letra
 Prohibido usar bucles (for, while).
*/
object Ejercicio6 {

    def main(args: Array[String]): Unit= { 

var lista = List( 
  "spark scala es potente",
  "scala es funcional",
  "spark es distribuido"
)


val palabras = lista.flatMap(_.split(" ")).map(_.toLowerCase)

val cuantasp = palabras.groupBy(identity).map{case (nombre, num)=> nombre -> num.size}

val cuantasptop = palabras.groupBy(identity).map{case (nombre, num)=> nombre -> num.size}.toSeq.sortBy(-_._2).take(3) 


    val conteoPalabras: Map[String, Int] = 
        res51.flatMap(_.split("\\s+").map(_.toLowerCase)) 
        .groupMapReduce(identity)(_ => 1)(_ + _)
 
  //Cuenta el número de frases que contienen “Scala”
  val pScala = plalabras.groupBy(identity).map{case (nombre, num)=> nombre -> (if (nombre.contains("scala")) "Si" else "No")}
  


}
}