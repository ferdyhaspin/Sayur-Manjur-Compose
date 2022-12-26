package org.ferdyhaspin.sayur_manjur_compose.ui.screen.home.detail

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Created by ferdyhaspin on 27/12/22.
 */

@Composable
fun DetailScreen(
    vegetableId: Int,
//    viewModel: DetailRewardViewModel = viewModel(
//        factory = ViewModelFactory(
//            Injection.provideRepository()
//        )
//    ),
    navigateBack: () -> Unit,
    navigateToFavourite: () -> Unit
) {
    Text(text = "Detail Screen")
}