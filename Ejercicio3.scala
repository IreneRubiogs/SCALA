object Ejercicio3 {

    def main(args: Array[String]): Unit= {
        
        
        
/*Ejercicio 3 — Recursión (sin bucles) + funciones puras
Objetivo: pensar funcional.
Enunciado:
 Implementa (sin bucles):
1.	factorial(n: Int): BigInt
2.	fibonacci(n: Int): BigInt (con recursión + acumuladores para evitar explosión)
3.	sumaLista(xs: List[Int]): Int usando recursión
*/
var lista =  List(20 ,5 ,3, 7, 2, 10, 4, 7, 10)

val suma = sumaLista(lista)
val numero = factorial(8)
val nfibonacci : Int = 4

val nfb = fibonacci (nfibonacci)

println (numero)
println (suma)
println (nfb)
    }


def factorial(n: Int): Int = {
  require(n >= 0, "n debe ser >= 0")
  if (n == 0) 1
  else n * factorial(n - 1)
    }

def fibonacci( n: Int): BigInt = {

  
    if (n== 0 || n ==1) n
      else { 
        fibonacci(n-1) + fibonacci (n-2)
          }
       
}

def sumaLista(xs: List[Int]): Int = {
    var xx: List[xs]
 xs match {
  case Nil => throw new NoSuchElementException("Lista vacía")
  case head :: Nil => head
  //case head :: tail => math.max(head, sumaLista(tail))
   case head :: tail => head + sumaLista(tail) 
     }

    if (xx.length==0)0
    else xx(0) + sumaLista(xx.drop(1))
 println(xx)
}
   
}
