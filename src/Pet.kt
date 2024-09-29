class Pet(val name: String, val weight: Int, private val type: Type) {
    fun getType() = this.type.type
    enum class Type (val type: String) {
        Cow ("Корова"),
        Goose ("Гусь"),
        Dog ("Собака"),
        Cat ("Кошка");
    }
}