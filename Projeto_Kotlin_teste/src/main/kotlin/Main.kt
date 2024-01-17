 fun main(args: Array<String>) {


val person1 = Person("Jota")
    val person2 = Person("lais")
    val person3 = Person("Ghost")
    val person4 = Person("Mãe")




    person1.likes(Person("Lais"))
    person1.likes(Person("Ghost"))




println("${person1.nome} gosta das seguintes pessoas: ${person1.likedPeople}")



}

