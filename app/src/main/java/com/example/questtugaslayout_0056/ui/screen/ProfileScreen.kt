package com.example.profilkartu.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout_0056.R

@Composable
fun ProfilScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_background))
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ProfilHeader()
    }
}

@Composable
private fun ProfilHeader() {
    Text(
        text = stringResource(R.string.header_title),
        color = colorResource(R.color.text_primary),
        fontSize = integerResource(R.integer.text_size_title).sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(top = dimensionResource(R.dimen.header_padding_top)),
    )
    Text(
        text = stringResource(R.string.header_subtitle),
        color = colorResource(R.color.text_primary),
        fontSize = integerResource(R.integer.text_size_subtitle).sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(
            top = dimensionResource(R.dimen.header_subtitle_spacing),
            bottom = dimensionResource(R.dimen.header_padding_bottom),
        ),
    )
}