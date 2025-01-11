package eu.tutorials.mywishlistapp

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun AddEditDetailView(
    id: Long,
    viewModel: WishViewModel,
    navController: NavController
){
  Scaffold(
      topBar = { AppBarView(title =
      if(id != 0L) "Update Wish" else "Add Wish"
      )}
  ){

  }
}