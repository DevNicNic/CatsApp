package com.nicnicdev.catsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.nicnicdev.catsapp.ui.CatCard
import com.nicnicdev.catsapp.ui.home.HomeViewModel
import com.nicnicdev.catsapp.ui.theme.CatsAppTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = koinViewModel<HomeViewModel>()
            val state = viewModel.homeState.collectAsState()

            LaunchedEffect(key1 = Unit) {
                viewModel.getCatImage()
            }

            CatsAppTheme {
                HomeContent(
                    imageUrl = state.value.catImageUrl
                )
            }
        }
    }
}


@Composable
private fun HomeContent(
    imageUrl: String,
) {
    Column {
        CatCard(url = imageUrl)
    }
}