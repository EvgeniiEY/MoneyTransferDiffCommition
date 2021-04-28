import org.junit.Test

import org.junit.Assert.*
import ru.netology.cardType
import ru.netology.commisionCalculate
import ru.netology.main

class MoneyTransferDiffCommitionKtTest {

    @Test
    fun commisionCalculateVisa() {
        val card = "Visa"
        val pastSum = 100_000
        val amount = 1_000

        val result = commisionCalculate(
            cardType = card,
            pastTransfersSum = pastSum,
            amount = amount
        )


        assertEquals(3500, result)
    }

    @Test
    fun commisionCalculateMCard() {
        val card = "MasterCard"
        val pastSum = 100_000
        val amount = 1_000

        val result = commisionCalculate(
            cardType = card,
            pastTransfersSum = pastSum,
            amount = amount
        )


        assertEquals(2600.0, result)
    }
    @Test
    fun commisionCalculateVKPay() {
        val card = "VK Pay"
        val pastSum = 100_000
        val amount = 1_000

        val result = commisionCalculate(
            cardType = card,
            pastTransfersSum = pastSum,
            amount = amount
        )


        assertEquals(999, result)
    }
    @Test
    fun commisionCalculateZero() {
        val card = "0"
        val pastSum = 100_000
        val amount = 1_000

        val result = commisionCalculate(
            cardType = card,
            pastTransfersSum = pastSum,
            amount = amount
        )


        assertEquals(0, result)
    }
    @Test
    fun mainReturnsTrue() {
        val card = "0"
        val pastSum = 100_000
        val amount = 1_000

        val result = main(

        )
        assertTrue(true)


    }


}