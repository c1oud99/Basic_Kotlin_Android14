package eu.tutorials.mywishlistapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(viewModel: WishViewModel = viewModel(), navController: NavController = rememberNavController())