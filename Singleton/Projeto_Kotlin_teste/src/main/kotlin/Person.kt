class Person (val nome: String) {

    val likedPeople = mutableListOf<Person>()

    infix fun likes (other: Person){
        likedPeople.add(other)
    }





}