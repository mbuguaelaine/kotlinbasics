fun main(args: Array<String>) {

    val majina= arrayOf("Erick", "Joan", 78.56, 87, 'g', true)

    val myarr= arrayOf<Int>(4, 10, 78, 56 ,98)

    myarr[1]=5

    println("My name is ${majina[0]}")
    println(myarr)
    val myarr2=myarr.sorted()
    println(myarr2)
    println("My name is ${myarr.size}")
}