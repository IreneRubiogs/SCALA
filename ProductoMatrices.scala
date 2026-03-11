object ProductoMatrices {
    def main(args: Array[String]): Unit = {


 val matriz1: Array[Array[Int]] = Array(Array( 1,2,3), Array(3,2,5), Array (2,5,6))
 

 val matriz2: Array[Array[Int]] = Array(Array( 3,4), Array(5,6), Array (3,2))

 val C=  multiplicaMatrices(matriz1,matriz2)
 C.foreach{fila=> println(fila.mkString("[" , " ,", "]"))}


//if (matriz1.exists(fila => fila.exists(_ == 0))) {
//  println("Hay elementos 0")
//} else {
//  println("Todos los elementos tienen valor")

    }

 def multiplicaMatrices(A: Array[Array[Int]], B: Array[Array[Int]]): Array[Array[Int]]= {

   // require(A.length(0)==B.length , "las matrices no multiplicables")
    
    val filas = A.length
    val columnas = B(0).length
    val filasl = B.length

    val  matrizProducto =  Array.ofDim[Int](filas, columnas) 
    
        for (i <- 0 until filas) {          // filas
      for (j <- 0 until columnas) {     // columnas
            for (k <- 0 until filasl) {

                matrizProducto (i)(j) += A(i)(k)*B(k)(j)
            }
          }
        }
    matrizProducto
  }
}
