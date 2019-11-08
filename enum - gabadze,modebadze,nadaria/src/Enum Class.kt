fun main() {
    val season = Seasons.GAZAFXULI.AMINDI
    val tansacmeli = Seasons.SHEMODGOMA.Tansacmeli
    println("ამ სეზონზე ${season} და უნდა ჩავიცვათ ${tansacmeli}")
}
enum class Seasons(val AMINDI: String,val Tansacmeli:String) { // პირველადი კონსტრუქტორი
    // ეს არის enum კლასი, სადაც enum-ებს გადაეცემა პარამეტრი AMINDI და Tansacmeli

    ZAMTARI("ცივა","კურტკა"),
    ZAFXULI("ცხელა","მაისური"),
    SHEMODGOMA("ქარია","ჰუდი"),
    GAZAFXULI("წვიმს","საწვიმარი")
}