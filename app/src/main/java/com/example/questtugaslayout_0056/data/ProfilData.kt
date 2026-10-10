package com.example.questtugaslayout_0056.data

import androidx.compose.ui.text.font.FontWeight
import com.example.questtugaslayout_0056.R
import com.example.questtugaslayout_0056.model.ProfilItem

val daftarProfil = listOf(
    ProfilItem(
        nameRes = R.string.name_bambang,
        addressRes = R.string.address_bambang,
        containerColorRes = R.color.card_gray,
        addressColorRes = R.color.text_yellow,
        nameFontRes = R.font.dancing_script,
        nameSizeRes = R.integer.text_size_card_name_script,
        nameFontWeight = FontWeight.Normal,
    ),
    ProfilItem(
        nameRes = R.string.name_gibran,
        phoneRes = R.string.phone_gibran,
        addressRes = R.string.address_gibran,
        containerColorRes = R.color.card_purple,
        addressColorRes = R.color.text_yellow,
    ),
    ProfilItem(
        nameRes = R.string.name_zhilal,
        phoneRes = R.string.phone_zhilal,
        addressRes = R.string.address_zhilal,
        containerColorRes = R.color.card_blue,
        addressColorRes = R.color.text_white,
    ),
    ProfilItem(
        nameRes = R.string.name_ahmad,
        phoneRes = R.string.phone_ahmad,
        addressRes = R.string.address_ahmad,
        containerColorRes = R.color.card_green,
        addressColorRes = R.color.text_white,
    ),
)