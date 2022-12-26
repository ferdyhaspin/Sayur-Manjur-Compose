package org.ferdyhaspin.sayur_manjur_compose.ui.screen.home

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Created by ferdyhaspin on 27/12/22.
 */

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
//    viewModel: HomeViewModel = viewModel(
//        factory = ViewModelFactory(Injection.provideRepository())
//    ),
    navigateToDetail: (Int) -> Unit,
) {
    Text(text = "Home Screen")
}