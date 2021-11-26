package com.example.dogglers.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dogs(
@StringRes
    val nameResourse : Int ,
@StringRes
    val ageResourse : Int ,
@StringRes
    val  hobbyResourse : Int ,
@DrawableRes
    val imageResourse : Int

)
