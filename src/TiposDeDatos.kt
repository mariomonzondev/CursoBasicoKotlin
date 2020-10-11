fun main() {

    tipoDeDatosTexto()
    tipoDeDatosEnteros()
    tipoDeDatoBooleano()
}

private fun tipoDeDatosTexto(){

    //String
    val myFirstString: String = "Hi Hackermen"
    val mySecondString: String = """
        Bienvenido
        al curso básico de 
        Kotlin
    """.trimIndent()

    println( "$myFirstString $mySecondString" )

}

private fun tipoDeDatosEnteros(){

    //Enteros ( Byte, Short, Int, Long )
    val myFirstInt: Int = 3
    val mySecondInt: Int = 45
    val otherInt: Int = myFirstInt.plus(mySecondInt)
    println( otherInt )

    //Decimales ( Float, Double )
    val myFirstFloat: Float = 1.5f
    val myFirstDouble: Double = 2.3
    val mySecondDouble: Double = 7.4
    val myThirdDouble: Double = myFirstDouble.plus(mySecondDouble)
    println( myThirdDouble )
}

private fun tipoDeDatoBooleano(){

    val myFirstBool: Boolean = true
    val mySecondBool: Boolean = false

    println(myFirstBool == mySecondBool)
    println( myFirstBool.and(mySecondBool) )
}