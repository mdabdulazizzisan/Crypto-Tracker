package com.plcoding.cryptotracker.crypto.presentation.coin_details

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.plcoding.cryptotracker.crypto.presentation.coin_list.CoinListState
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme

@Composable
fun CoinDetailScreen(
    state: CoinListState,
    modifier: Modifier = Modifier
) {
    val contentColor =
        if(isSystemInDarkTheme()) Color.White else Color.Black
    if (state.isLoading){
        Box(
            modifier = modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            CircularProgressIndicator()
        }
    }else if(state.selectedCoin != null){
        val coin = state.selectedCoin

    }
}

@PreviewLightDark
@Composable
private fun CoinDetailScreenPrev() {
    CryptoTrackerTheme {

    }

}