package rs.ac.metropolitan.cs330_dz08.screens

import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import rs.ac.metropolitan.cs330_dz08.Food


@Composable
fun FoodDetailScreen(vm: FoodViewModel, foodId: Long) {
    FoodDetailScreenContent(vm.getFood(foodId)) {
        vm.goBack()
    }
}

@Composable
fun FoodDetailScreenContent(food: Food?, goBack: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        LazyColumn(horizontalAlignment = CenterHorizontally) {
            item {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
                    IconButton(
                        modifier = Modifier.background(Color.Transparent), onClick = goBack
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(36.dp)
                        )
                    }
                }
            }
            item {
                AsyncImage(
                    model = food?.image, contentDescription = null, modifier = Modifier.size(240.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Column {
                    Text(
                        text = "${food?.title}",
                        style = MaterialTheme.typography.titleLarge,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier
                            .padding(8.dp)
                            .align(alignment = CenterHorizontally)
                    )
                    Text(
                        text = "Difficulty: ",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.align(alignment = CenterHorizontally)
                    )
                    Text(
                        text = "${food?.difficulty}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.secondary,
                        modifier = Modifier
                            .padding(8.dp)
                            .align(alignment = CenterHorizontally)
                    )
                    Text(
                        text = "Portion: ",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.align(alignment = CenterHorizontally)
                    )
                    Text(
                        text = "${food?.portion}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.secondary,
                        modifier = Modifier
                            .padding(8.dp)
                            .align(alignment = CenterHorizontally)
                    )
                    Text(
                        text = "Time: ",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.align(alignment = CenterHorizontally)
                    )
                    Text(
                        text = "${food?.time}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.secondary,
                        modifier = Modifier
                            .padding(8.dp)
                            .align(alignment = CenterHorizontally)
                    )
                    Text(
                        text = "Description: ",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.align(alignment = CenterHorizontally)
                    )
                    Text(
                        text = "${food?.description}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.secondary,
                        modifier = Modifier
                            .padding(8.dp)
                            .align(alignment = CenterHorizontally)
                    )
                    Text(
                        text = "Ingredients: ",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.align(alignment = CenterHorizontally)
                    )
                    Text(
                        text = "${food?.ingredients}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.secondary,
                        modifier = Modifier
                            .padding(8.dp)
                            .align(alignment = CenterHorizontally)
                    )

                }
            }
        }
    }
}

