
import com.google.gson.annotations.SerializedName

data class NextMatch(
    @SerializedName("events")
    val events: List<Event>
)