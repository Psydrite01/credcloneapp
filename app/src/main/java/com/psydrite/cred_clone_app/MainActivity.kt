package com.psydrite.cred_clone_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.psydrite.cred_clone_app.ui.screens.HomePage
import com.psydrite.cred_clone_app.ui.theme.CredcloneappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CredcloneappTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //not using nav graph because only one page to show
                    HomePage()
                }
            }
        }
    }
}