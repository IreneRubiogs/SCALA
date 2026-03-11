import scala.collection.immutable.List

/*Dada una lista de números enteros:
List(3, 7, 2, 10, 4, 7, 10)

1.	Elimina los números duplicados.
2.	Quédate solo con los números mayores que 5.
3.	Eleva cada número al cuadrado.
4.	Devuelve la suma total del resultado.
El programa debe imprimir el valor final y cada lista intermedia resultante.
*/  

object Ejercicio2 {

    def main ( args: Array[String]): Unit = {

       var lista =  List(3, 7, 2, 10, 4, 7, 10)

       var lista1 = lista.distinct

       println (lista1)
       
       var lista2 = lista.filter(_ > 5)
        println (lista2)

        var lista3 = lista.map( n=> n*n)
        println (lista3)
        var lista4 = lista.sum
        println (lista4)

    }


}
