object SumaMatrices {
    def main(args: Array[String]): Unit = {


 val matriz1: Array[Array[Int]] = Array(Array( 1,2,3), Array(-1,2,5))

 val matriz2: Array[Array[Int]] = Array(Array( 10,10,10), Array(-20,20,20))

 val C= sumarMatrices(matriz1,matriz2)
 C.foreach{fila=> println(fila.mkString("[" , " ,", "]"))}

 val filasEnParejas = matriz1.zip(matriz2)
 
 //filasEnParejas.foreach{fila=> println(fila.mkString("[" , " ,", "]"))}

 val parejasDentroDeLaFila = filasEnParejas.map { case (fa, fb) => fa.zip(fb)}
 //val PF= parejasDentroDeLaFila
 parejasDentroDeLaFila.foreach{fila=> println(fila.mkString("[" , " ,", "]"))}

//if (matriz1.exists(fila => fila.exists(_ == 0))) {
//  println("Hay elementos 0")
//} else {
//  println("Todos los elementos tienen valor")



    }

 def sumarMatrices(A: Array[Array[Int]], B: Array[Array[Int]]): Array[Array[Int]]= {

    require(A.length==B.length && A(0).length == B(0).length, "las matrices deben tener las mismas dimensiones")
    require(B.forall(fila => fila.forall(_ != 0)), "Elementos no 0")
    require(A.forall(fila => fila.forall(_ != 0)), "Elementos no 0")

    val filas = A.length
    val columnas = A(0).length
    val matrizSuma = Array.ofDim[Int](filas, columnas) 
    
        for (i <- 0 until A.length) {          // filas
      for (j <- 0 until A(i).length) {     // columnas

      matrizSuma(i)(j)= A(i)(j)+B(i)(j)
      print(matrizSuma(i)(j) + " ")  
      
      }
      println()
    }
    matrizSuma
  }
}







