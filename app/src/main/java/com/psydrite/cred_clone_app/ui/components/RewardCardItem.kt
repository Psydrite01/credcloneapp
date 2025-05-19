package com.psydrite.cred_clone_app.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RewardCardItem(text: String, amount: String){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .clickable(
                onClick = {
                    //logic here
                }
            )
            .padding(start = 16.dp)
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column (){
            Text(
                text,
                )
            Text(
                amount,
                color = MaterialTheme.colorScheme.onBackground.copy(0.6f))
        }
        Icon(
            modifier = Modifier
                .padding(end = 16.dp),
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = "go to",
            tint = MaterialTheme.colorScheme.onBackground.copy(0.6f)
        )
    }
}