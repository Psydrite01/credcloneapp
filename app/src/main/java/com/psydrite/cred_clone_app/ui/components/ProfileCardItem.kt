package com.psydrite.cred_clone_app.ui.components

import com.psydrite.cred_clone_app.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ProfileCardItem(icon: Int, text1: String, additionalText: String? = null, amount: String){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Row (
            modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(icon),
                contentDescription = "cred icon",
                modifier = Modifier
                    .size(20.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.FillBounds,
                alpha = 0.4f
            )
            Text(
                text1,
                color = MaterialTheme.colorScheme.onBackground.copy(0.8f))
            if (!additionalText.isNullOrBlank()){
                Image(
                    painter = painterResource(R.drawable.baseline_circle_24),
                    contentDescription = null,
                    modifier = Modifier.size(7.dp),
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
                )
                Text(
                    additionalText,
                    color = MaterialTheme.colorScheme.primary)
            }
        }
        Row (
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(amount)
            IconButton(
                modifier = Modifier,
                onClick = {
                    //button logic
                }
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Go to"
                )
            }
        }
    }
}