import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun InfoCard(
    title: String,
    formattedText: String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    formattedTextStyle: TextStyle = LocalTextStyle.current.copy(
        textAlign = TextAlign.Center,
        fontSize = 18.sp,
    )
) {
    Card(
        modifier = modifier
            .padding(8.dp)
            .shadow(
                elevation = 15.dp,
                shape = RectangleShape,
                spotColor = MaterialTheme.colorScheme.primary
            )
    ) {

    }
}
