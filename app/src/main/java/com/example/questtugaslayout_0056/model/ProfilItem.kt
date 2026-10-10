package com.example.questtugaslayout_0056.model

import androidx.annotation.ColorRes
import androidx.annotation.FontRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes
import androidx.compose.ui.text.font.FontWeight
import com.example.questtugaslayout_0056.R

data class ProfilItem(
    @StringRes val nameRes: Int,
    @StringRes val addressRes: Int,
    @ColorRes val containerColorRes: Int,
    @ColorRes val addressColorRes: Int,
    @StringRes val phoneRes: Int? = null,
    @ColorRes val nameColorRes: Int = R.color.text_white,
    @ColorRes val phoneColorRes: Int = R.color.text_cyan,
    @FontRes val nameFontRes: Int? = null,
    @IntegerRes val nameSizeRes: Int = R.integer.text_size_card_name,
    val nameFontWeight: FontWeight = FontWeight.Bold,
)