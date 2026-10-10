package com.example.profilkartu.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout_0056.R
import com.example.questtugaslayout_0056.model.ProfilItem

@Composable
fun ProfilCard(
    item: ProfilItem,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner_radius)),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(item.containerColorRes),
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = dimensionResource(R.dimen.card_elevation),
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = dimensionResource(R.dimen.card_padding_horizontal),
                    vertical = dimensionResource(R.dimen.card_padding_vertical),
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            CardLogo()

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = dimensionResource(R.dimen.card_content_gap)),
                verticalArrangement = Arrangement.spacedBy(
                    dimensionResource(R.dimen.card_text_spacing),
                ),
            ) {
                Text(
                    text = stringResource(item.nameRes),
                    color = colorResource(item.nameColorRes),
                    fontSize = integerResource(item.nameSizeRes).sp,
                    fontWeight = item.nameFontWeight,
                )

                item.phoneRes?.let { phoneRes ->
                    Text(
                        text = stringResource(phoneRes),
                        color = colorResource(item.phoneColorRes),
                        fontSize = integerResource(R.integer.text_size_card_detail).sp,
                    )
                }

                Text(
                    text = stringResource(item.addressRes),
                    color = colorResource(item.addressColorRes),
                    fontSize = integerResource(R.integer.text_size_card_detail).sp,
                )
            }

            CardLogo()
        }
    }
}

@Composable
private fun CardLogo() {
    Image(
        painter = painterResource(R.drawable.logo_umy),
        contentDescription = stringResource(R.string.logo_description),
        modifier = Modifier.size(dimensionResource(R.dimen.card_logo_size)),
    )
}