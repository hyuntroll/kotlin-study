package extend

enum class CardType(val protocolId: Int) {
    VISA(12314) {
        override fun pay() {
            println("visa로 결제합니다!!")
        }
    },
    MASTERCARD(232342) {
        override fun pay() {
            println("mastercard로 결제합니다1!")
        }
    },
    DISCOVER(23734) {
        override fun pay() {
            println("discover로 결제합니다@@!")
        }
    };

    fun example() {
        println("${this.protocolId} + 1")
    }

    abstract fun pay(): Unit
}

open class Card(val name: String, val type: CardType) {

    fun connect() {
        print(name)
        print(type.protocolId)
        println()
    }
}

interface SerialNumber {
    fun getNumber(): Int
}

// interface 구현 가능!
enum class NFCCard(val num: Int): SerialNumber {
    APPLE_CARD(244),
    SAMSUNG_CARD(356);

    override fun getNumber(): Int {
        return num + 5
    }
}

fun main() {
    println(CardType.VISA.name)
    println(CardType.MASTERCARD.protocolId)
    CardType.DISCOVER.example()

    val card = Card("토스",  CardType.DISCOVER)
    card.connect()
    card.type.pay()

    val nfcCard = NFCCard.APPLE_CARD
    println(nfcCard)
}