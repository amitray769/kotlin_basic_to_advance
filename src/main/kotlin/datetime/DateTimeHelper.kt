package datetime

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

object DateTimeHelper {
    const val DATE_FORMAT_DD_MMM_YYYY = "dd MMM yyyy"
    const val TIME_FORMAT_HH_MM_A = "hh:mm a"
    fun formatDateAndTime(
        millis: Long,
        dateFormat: String = DATE_FORMAT_DD_MMM_YYYY,
        timeFormat: String = TIME_FORMAT_HH_MM_A
    ): String {
        return try {
            val date = Date(millis)
            val currentDate = Calendar.getInstance()
            val inputDate = Calendar.getInstance().apply { time = date }

            when {
                isToday(currentDate, inputDate) -> "today ${formatTime(inputDate, timeFormat)}"
                isTomorrow(currentDate, inputDate) -> "tomorrow ${formatTime(inputDate, timeFormat)}"
                else -> formatDate(inputDate, dateFormat) + ", " + formatTime(inputDate, timeFormat)
            }
        } catch (e: ParseException){
            ""
        }
    }

    fun isToday(currentDate: Calendar, inputDate: Calendar): Boolean {
        return currentDate[Calendar.YEAR] == inputDate[Calendar.YEAR] &&
                currentDate[Calendar.DAY_OF_YEAR] == inputDate[Calendar.DAY_OF_YEAR]
    }

    fun isTomorrow(currentDate: Calendar, inputDate: Calendar): Boolean {
        val tomorrow = currentDate.clone() as Calendar
        tomorrow.add(Calendar.DAY_OF_YEAR, 1)
        return tomorrow[Calendar.YEAR] == inputDate[Calendar.YEAR] &&
                tomorrow[Calendar.DAY_OF_YEAR] == inputDate[Calendar.DAY_OF_YEAR]
    }

    fun formatDate(calendar: Calendar, dateFormat: String): String {
        val sdf = SimpleDateFormat(dateFormat, Locale.getDefault())
        return sdf.format(calendar.time)
    }

    fun formatTime(calendar: Calendar, timeFormat: String): String {
        val sdf = SimpleDateFormat(timeFormat, Locale.getDefault())
        return sdf.format(calendar.time)
    }
}



fun main() {
    val millisToday = System.currentTimeMillis()
    val millisTomorrow = System.currentTimeMillis() + (1000 * 60 * 60 * 24)
    val millisFuture = System.currentTimeMillis() + (1000 * 60 * 60 * 24 * 3)

    println(
        DateTimeHelper.formatDateAndTime(
            millisToday,
            DateTimeHelper.DATE_FORMAT_DD_MMM_YYYY,
            DateTimeHelper.TIME_FORMAT_HH_MM_A
        )
    )
    println(DateTimeHelper.formatDateAndTime(millisTomorrow))
    println(DateTimeHelper.formatDateAndTime(millisFuture))
}
