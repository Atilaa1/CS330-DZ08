package rs.ac.metropolitan.cs330_dz08

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import rs.ac.metropolitan.cs330_dz08.ui.theme.CS330DZ08Theme


class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CS330DZ08Theme {
                // A surface container using the 'background' color from the theme
                navController = rememberNavController()

                Scaffold(topBar = {
                    TopAppBar(title = { Text(text = "Food") })
                }) { innerPadding ->
                    NavSettup(navController)
                }
            }
        }
    }
}