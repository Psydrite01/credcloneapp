package com.psydrite.cred_clone_app.ui.components

import android.graphics.Color
import com.psydrite.cred_clone_app.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun GarageCard(){
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background
        ),
        shape = RectangleShape
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, MaterialTheme.colorScheme.onBackground.copy(0.2f), RectangleShape)
                .padding(horizontal = 24.dp)
                .padding(top = 24.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.Start
        ){
            //cred icon
            Image(
                painter = painterResource(R.drawable.default_user),
                contentDescription = "cred icon",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.FillBounds,
                alpha = 0.4f
            )
            Spacer(Modifier.width(16.dp))
            Column (
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    "get to know your vehicles, inside out",
                    color = MaterialTheme.colorScheme.onBackground.copy(0.6f))
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text("CRED garage")
                    IconButton(
                        modifier = Modifier,
                        onClick = {
                            //button logic
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "CRED garage"
                        )
                    }
                }
            }
        }
    }
}