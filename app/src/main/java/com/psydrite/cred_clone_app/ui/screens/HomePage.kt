package com.psydrite.cred_clone_app.ui.screens

import androidx.compose.foundation.Image
import com.psydrite.cred_clone_app.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.psydrite.cred_clone_app.ui.components.CustomDivider
import com.psydrite.cred_clone_app.ui.components.GarageCard
import com.psydrite.cred_clone_app.ui.components.ProfileCardItem
import com.psydrite.cred_clone_app.ui.components.RewardCardItem

@Composable
fun HomePage(){
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ){
        Column (
            modifier = Modifier.fillMaxSize()
                .padding(top = 50.dp)
                .verticalScroll(rememberScrollState())
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surface)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    //top row
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(
                                modifier = Modifier,
                                onClick = {
                                    //back button logic
                                }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.ArrowBack,
                                    contentDescription = "back"
                                )
                            }
                            Text(
                                "Profile",
                                style = MaterialTheme.typography.titleLarge
                            )
                        }
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Button(
                                onClick = {
                                    //logic
                                },
                                modifier = Modifier
                                    .border(
                                        1.dp,
                                        MaterialTheme.colorScheme.onBackground.copy(0.2f),
                                        RoundedCornerShape(70)
                                    ),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = MaterialTheme.colorScheme.onBackground.copy(0.4f)
                                )
                            ) {
                                Text(
                                    "Support",
                                    style = MaterialTheme.typography.titleSmall
                                )
                            }
                            Spacer(Modifier.width(16.dp))
                        }
                    }

                    Spacer(Modifier.height(12.dp))
                    //profile details
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AsyncImage(
                                model = "",
                                contentDescription = "Profile image",
                                contentScale = ContentScale.FillBounds,
                                placeholder = painterResource(id = R.drawable.default_user),
                                error = painterResource(id = R.drawable.default_user),
                                modifier = Modifier
                                    .size(80.dp)
                                    .clip(CircleShape)
                            )
                            Column(
                                modifier = Modifier
                                    .padding(start = 16.dp),
                                verticalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                Text(
                                    "Username",
                                    style = MaterialTheme.typography.titleLarge)
                                Text(
                                    "member since Dec, 2020",
                                    style = MaterialTheme.typography.titleMedium,
                                    color = MaterialTheme.colorScheme.onBackground.copy(0.5f)
                                )
                            }
                        }
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            IconButton(
                                onClick = {
                                    //logic
                                },
                                modifier = Modifier
                                    .border(
                                        1.dp,
                                        MaterialTheme.colorScheme.onBackground.copy(0.2f),
                                        CircleShape
                                    ).size(48.dp)
                                ,
                                colors = IconButtonDefaults.iconButtonColors(
                                    containerColor = Color.Transparent
                                )
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.outline_mode_edit_24),
                                    contentDescription = "edit",
                                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onBackground.copy(0.4f)),
                                    modifier = Modifier.size(34.dp),
                                    contentScale = ContentScale.FillBounds
                                )
                            }
                            Spacer(Modifier.width(16.dp))
                        }
                    }

                    Spacer(Modifier.height(30.dp))

                    //garage card
                    GarageCard()

                    Spacer(Modifier.height(20.dp))

                    //items
                    ProfileCardItem(R.drawable.default_user, "Credit Score", "REFRESH AVAILABLE", "757")
                    CustomDivider()
                    ProfileCardItem(R.drawable.default_user, "Lifetime Cashback", amount =  "Rs 3")
                    CustomDivider()
                    ProfileCardItem(R.drawable.default_user, "Bank Balance", amount =  "check")

                    Spacer(Modifier.height(32.dp))
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.background)
            ){
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Text(
                        "YOUR REWARDS & BENEFITS",
                        modifier = Modifier
                            .padding(vertical = 24.dp)
                            .padding(start = 16.dp),
                        letterSpacing = 2.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.onBackground.copy(0.3f))

                    RewardCardItem("Cashback Balance", "Rs 0")
                    CustomDivider()
                    RewardCardItem("Coins", "26,46,583")
                    CustomDivider()
                    RewardCardItem("Win upto Rs 1000", "refer and earn")

                    Spacer(Modifier.height(40.dp))

                    Text(
                        "TRANSACTIONS & SUPPORT",
                        modifier = Modifier
                            .padding(vertical = 24.dp)
                            .padding(start = 16.dp),
                        letterSpacing = 2.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.onBackground.copy(0.3f))
                    RewardCardItem("All transactions", "xyz")
                    CustomDivider()
                    RewardCardItem("xyz", "xyz")

                    Spacer(Modifier.height(100.dp))
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun prev(){
    HomePage()
}