package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoin(): Result<List<Coin>, NetworkError>
    

}