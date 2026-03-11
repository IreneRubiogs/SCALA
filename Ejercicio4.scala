/*Define una case class llamada Persona con los campos:
•	nombre: String
•	edad: Int
•	ciudad: String
Dada una lista de personas:
1.	Filtra solo las personas mayores de 30 años.
2.	Agrúpalas por ciudad.
3.	Para cada ciudad, calcula la edad media.
4.	Imprime el resultado con el formato:
Ciudad: <ciudad>, Edad media: <valor>
*/

case class Persona(nombre: String, edad: Int, ciudad: String)

object Main extends App {

  // Lista de personas
  val personas = List(
    Persona("Ana", 25, "Madrid"),
    Persona("Carlos", 35, "Madrid"),
    Persona("Lucía", 40, "Barcelona"),
    Persona("Pedro", 50, "Madrid"),
    Persona("Sofía", 32, "Barcelona"),
    Persona("Miguel", 28, "Valencia")
  )

  // 1️⃣ Filtrar mayores de 30
  val mayoresDe30 = personas.filter(_.edad > 30)
  println (s"Mayores 30 años $mayoresDe30")
    println("Mayores de 30: ") 
    personas.filter(_.edad > 30).foreach{case Persona(nombre, edad, ciudad) => println(s"$nombre edad $edad")}


  // 2️⃣ Agrupar por ciudad
  val agrupadasPorCiudad = mayoresDe30.groupBy(_.ciudad)

println (s"Agrupadas por ciudad y mayores de 30 años $agrupadasPorCiudad")

  // 3️⃣ Calcular edad media por ciudad
  val edadMediaPorCiudad = agrupadasPorCiudad.map {
    case (ciudad, listaPersonas) =>
      val totalEdades = listaPersonas.map(_.edad).sum
      val media = totalEdades.toDouble / listaPersonas.size
      (ciudad, media)
  }

  // 4️⃣ Imprimir resultado
  edadMediaPorCiudad.foreach {
    case (ciudad, media) =>
      println(f"Ciudad: $ciudad, Edad media: $media%.2f")
  }
}