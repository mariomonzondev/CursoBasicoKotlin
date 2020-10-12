fun main() {

    sentenciasWhen()
}

private fun sentenciasWhen(){

    val country: String? = readLine()

    when(country){
        "España" -> println( "El idiomas es Español" )
        "Mexico" -> println( "El idiomas es Español" )
        "Perú" -> println( "El idiomas es Español" )
        "Colombia" -> println( "El idiomas es Español" )
        "Argentina" -> println( "El idiomas es Español" )
        "EEUU" -> println( "El idiomas es Inglés" )
        "Francia" -> println( "El idiomas es Francés" )
        else -> println( "No conocemos el idioma" )
    }

    when(country){
        "España", "Portugal", "Francia" -> println( "$country esta en Europa" )
        "Mexico", "Perú", "Colombia", "Argentina", "EEUU" -> println( "$country esta en América" )
        "China", "Japón" -> println( "$country esta en Asia" )
        else -> println( "No conocemos el lugar" )

    }
}