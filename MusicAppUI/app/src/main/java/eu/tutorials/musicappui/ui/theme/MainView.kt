package eu.tutorials.musicappui.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView(){

    val scaffoldState: ScaffoldState = rememberBottomSheetScaffoldState()

    Scaffold(
        topBar ={
            TopAppBar(title = { Text("Home") },
                navigationIcon = { IconButton(onClick = {
                    // Open the drawer

                }) {
                    Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Menu")
                }}
            )
        }

    ) {
        Text("Text", modifier = Modifier.padding(it))
    }
}