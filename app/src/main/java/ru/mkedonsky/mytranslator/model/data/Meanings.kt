import com.google.gson.annotations.SerializedName
import ru.mkedonsky.mytranslator.model.data.Translation

class Meanings(
    @field:SerializedName("translation") val translation: Translation?,
    @field:SerializedName("imageUrl") val imageUrl: String?
)

