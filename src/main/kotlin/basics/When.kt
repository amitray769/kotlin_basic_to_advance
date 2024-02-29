package basics


fun main() {
    val data = BillDetailsViewData("123", "sfsd","55")
  val test =  if (listOf(data.itemTotal, data.discounts, data.deliveryFee, data.orderAmount).all { it != null }) {
        // If all fields are not null, then show OrderBillDetailsCard
      true
    } else false

    println(test)

}
data class BillDetailsViewData(
    val itemTotal: String? = null,
    val discounts: String? = null,
    val deliveryFee: String? = null,
    val orderAmount: String? = null
)