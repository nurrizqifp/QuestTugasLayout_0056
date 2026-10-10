package com.example.profilkartu.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
            Spacer(modifier = Modifier.weight(1f))
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