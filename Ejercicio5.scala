/*Dada esta lista:
 List(" Scala ", "spark", "", " FUNCIONAL ", "scala", "Spark")
Haz lo siguiente e imprime cada paso:
1.	trim a cada string
2.	elimina los vacíos
3.	normaliza a minúsculas
4.	elimina duplicados
5.	ordena alfabéticamente
6.	calcula un mapa con el recuento de letras total por palabra (ej: "scala" -> 5)
7.	calcula la suma total de letras de todas las palabras
*/

object Ejercicio5 {

    def main(args: Array[String]): Unit= { 

    var lista = List(" Scala ", "spark", "", " FUNCIONAL ", "scala", "Spark")
    
    var list1 = lista.filter(_.nonEmpty)
    var list2 = list1.map(_.trim)
    var list3 = list2.map {s=>s.head.toUpper + s.tail.toLowerCase}
    var list4 = list3.distinct.sorted
    var list5 = list4.map(p => p -> p.length).toMap
    var list6 = list4.map(_.length).sum
    
    println(s"$list1")
    println(s"$list2")
    println(s"$list3")
    println(s"$list4")
    println(s"$list5")
    println(s"$list6")

    
}

}