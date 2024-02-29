package basics

fun main() {
   // val add = BuyerFulfillmentData("Nearby office", "Bangalore", "Central Mall", "G -14").getDisplayAddress()
    val add = BuyerFulfillmentData().getDisplayAddress()
println(add)
}

data class BuyerFulfillmentData(
    //val phoneNumber: String? = null,
    val address: String? = null,
    val city: String? = null,
    //val name: String? = null,
    val locality: String? = null,
    val houseNo: String? = null,
    //val location: LocationData? = null
) {
    fun getDisplayAddress(): String {
        val addressComponents = listOfNotNull(houseNo, address, locality, city)
        return addressComponents.joinToString(separator = ", ")
    }
}