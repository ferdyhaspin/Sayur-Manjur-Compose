package org.ferdyhaspin.sayur_manjur_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import org.ferdyhaspin.sayur_manjur_compose.ui.SayurManjurApp
import org.ferdyhaspin.sayur_manjur_compose.ui.theme.SayurManjurComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SayurManjurComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SayurManjurApp()
                }
            }
        }
    }
}