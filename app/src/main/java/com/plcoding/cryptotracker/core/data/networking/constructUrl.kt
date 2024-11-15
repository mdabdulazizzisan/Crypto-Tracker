package com.plcoding.cryptotracker.core.data.networking

import com.plcoding.cryptotracker.BuildConfig

fun constructUrl(url: String): String{
    val baseUrl = BuildConfig.BASE_URL
    return when{
        url.contains(baseUrl) -> url
        url.startsWith("/") -> baseUrl + url.drop(0)
        else -> baseUrl + url
    }
}