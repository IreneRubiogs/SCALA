/*case class Producto(nombre: String, categoria: String, precio: Double, stock: Int)
Con una lista de productos, haz:
1.	filtra productos con stock > 0
2.	agrupa por categoria
3.	para cada categoría:
a.	producto más caro
b.	precio medio
4.	imprime:
 Categoria: X, Top: <producto>, Media: <media>
Extra:
•	imprime además el top 3 global de productos más caros.
*/

object Productos {

    def main(args: Array[String]): Unit= { 
        val productos = List(
  Producto("Laptop", "Tecnología", 1200.0, 5),
  Producto("Mouse", "Tecnología", 25.5, 50),
  Producto("Silla", "Muebles", 150.0, 10),
  Producto("Mesa", "Muebles", 300.0, 3),
  Producto("Teclado", "Tecnología", 45.0, 30),
  Producto("Monitor", "Tecnología", 250.0, 12),
  Producto("Impresora", "Tecnología", 180.0, 7),
  Producto("Sofá", "Muebles", 800.0, 2),
  Producto("Lámpara", "Decoración", 60.0, 15),
  Producto("Alfombra", "Decoración", 120.0, 6),
  Producto("Cuaderno", "Papelería", 3.5, 200),
  Producto("Bolígrafo", "Papelería", 1.2, 500),
  Producto("Tablet", "Tecnología", 400.0, 9),
  Producto("Estantería", "Muebles", 220.0, 0)
)

    val enStock = productos.filter(_.stock > 0)
    println(enStock)

    val gCategoria = productos.groupBy(_.categoria)
    println(gCategoria)
    
    val mCaro= productos.maxBy(_.precio)
    println(mCaro)

//  val productosMasCaros = gCategoria.mapValues(_.map(_.nombre)).mapValues(lista=> lista.sum.toDouble/lista.size)
    val productosMasCaros = productos
       .groupBy(_.categoria)
       .maxBy(_.precio)
       .mapValues(_.map(_.nombre))
       
       
     
       val productosMasCaro2 = gCategoria.map { case (categoria, lista) =>
       categoria -> lista.maxBy(_.precio)}
       

    //println (s"Productos más caros : $productosMasCaros")
    println (s"Productos más caros : $productosMasCaro2")

  //  val catCaro = productos.groupBy(_.categoria).map{case (categoria,lista )=>  val productoMasCaro = lista.maxBy(_.precio)categoria -> productoMasCaro}


    
   // println(s" Precio Máximo por categoria: $catCaro") 

    val valMedio= productos.map(_.precio).sum/productos.map(_.precio).size
    println(s"Precio medio: $valMedio")

}
}

 
case class Producto(nombre: String, categoria: String, precio: Double, stock: Int){

 private val categoriasPermitidas =
    List("Tecnología", "Muebles", "Papelería","Decoración")

  require(
    categoriasPermitidas.contains(categoria),
    s"Categoría no válida: $categoria"
  )

}