fun main() {

    variablesConstantes()
}

private fun variablesConstantes(){

    var myFirstVariable: String = "Hi Hackerman!"
    println( myFirstVariable )

    myFirstVariable = "Welcome Hackerman"
    println( myFirstVariable )

    var myFirstNumber: Int = 2020
    println( "Estamos en el año $myFirstNumber" )

    val mySecondVariable: String = """
        Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam 
        nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat 
        volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation 
        ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. 
        Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse 
        molestie consequat, vel illum dolore eu feugiat nulla facilisis at 
        vero eros et accumsan et iusto odio dignissim qui blandit praesent 
        luptatum zzril delenit augue duis dolore te feugait nulla facilisi.
    """.trimIndent()

    println( mySecondVariable )
}