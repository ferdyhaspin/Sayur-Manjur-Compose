package org.ferdyhaspin.sayur_manjur_compose.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Created by ferdyhaspin on 14/12/22.
 */

@Composable
fun SayurManjurApp(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier
    ) { innerPadding ->
        Box(modifier = modifier.padding(innerPadding)) {
            Text(text = "Sayur Manjur App")
        }
    }
}