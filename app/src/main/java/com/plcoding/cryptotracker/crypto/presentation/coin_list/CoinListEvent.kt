package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.core.domain.util.NetworkError

sealed class CoinListEvent{
    data class Error(val error : NetworkError): CoinListEvent()
}