package lanterntian.github.io.example.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import lanterntian.github.io.example.shared.getWorld

@Composable
fun HomeScreenRoot(modifier: Modifier = Modifier) {
    Scaffold {
        Column(modifier = Modifier.padding(it)) {
            Text(getWorld())
        }
    }
}