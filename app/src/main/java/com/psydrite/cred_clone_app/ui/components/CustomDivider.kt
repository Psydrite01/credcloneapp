package com.psydrite.cred_clone_app.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomDivider(){
    Spacer(Modifier.height(8.dp))
    Row (
        modifier = Modifier
            .padding(start = 16.dp)
    ){
        Divider(
            color = MaterialTheme.colorScheme.onBackground.copy(0.1f)
        )
    }
    Spacer(Modifier.height(8.dp))
}