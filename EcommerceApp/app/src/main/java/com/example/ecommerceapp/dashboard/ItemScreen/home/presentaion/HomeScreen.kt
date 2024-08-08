package com.example.ecommerceapp.dashboard.ItemScreen.home.presentaion

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.ecommerceapp.R
import com.example.ecommerceapp.app.background
import com.example.ecommerceapp.app.purple
import com.example.ecommerceapp.app.white
import com.example.ecommerceapp.component.CircleAvatarX
import com.example.ecommerceapp.component.XTextMedium
import com.example.ecommerceapp.component.XTextSmall

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = Modifier
            .systemBarsPadding()
            .padding(horizontal = 15.dp),
        topBar = {
            TopBar()
        }
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {
            BuildList()
        }
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CircleAvatarX(
            radius = 50, image = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/1025px-Cat03.jpg")
        XTextSmall(text = "Menu", fontWeight = FontWeight.Bold)
        Icon(
            tint = white,
            modifier = Modifier
                .size(50.dp)
                .background(purple, shape = CircleShape),
            painter = painterResource(
                id = R.drawable.order),
            contentDescription = null,
            )

    }
}

@Composable
private fun BuildList() {
    LazyColumn(
        modifier = Modifier
            .navigationBarsPadding()
            .padding(bottom = 50.dp)
    ){
        item { Searchbar() }
        item { Category() }
        item { TopSelling() }
        item { NewIn() }
        item { TopSelling() }
    }
}

@Composable
private fun Searchbar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 15.dp)
            .height(50.dp)
            .background(background, shape = CircleShape),

    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp)
                .align(Alignment.Center),
            verticalAlignment = Alignment.CenterVertically,
        ){
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
            XTextSmall(text = "Search", modifier = Modifier.padding(start = 15.dp))
        }
    }
}

@Composable
private fun Category() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            XTextMedium(text = "Categories", fontWeight = FontWeight.Bold)
            XTextMedium(text = "See All")
        }
        Row(
            modifier = Modifier.padding(vertical = 10.dp)
        ){
                LazyRow {
                    item {
                        repeat( 10) {
                            Column(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                CircleAvatarX(
                                    hspace = 5.dp,
                                    radius = 80,
                                    image = "https://i.pinimg.com/originals/ab/58/34/ab58349c2becf561a5bae775eb863f51.jpg"
                                )
                                XTextSmall(text = "Hello bro", modifier = Modifier.padding(vertical = 10.dp))
                            }
                            
                        }
                    }
                }
        }
    }
}

@Composable
private fun TopSelling(
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            XTextMedium(text = "Top Selling", fontWeight = FontWeight.Bold)
            XTextMedium(text = "See All")
        }

        Row {
            LazyRow {
                item {
                    repeat(6){
                        Box (
                            modifier = Modifier
                                .padding(horizontal = 5.dp, vertical = 10.dp)
                                .height(300.dp)
                                .width(200.dp)
                                .background(background, shape = RoundedCornerShape(10.dp))
                        ){
                            Column {
                                Box(
                                    modifier = Modifier
                                        .fillMaxHeight(0.8f)
                                        .fillMaxWidth()
                                ){
                                    Image(
                                        painter = rememberImagePainter(data = "https://i.pinimg.com/originals/ab/58/34/ab58349c2becf561a5bae775eb863f51.jpg"),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(
                                                RoundedCornerShape(
                                                    topStart = 10.dp,
                                                    topEnd = 10.dp,
                                                )
                                            ),
                                        contentScale = ContentScale.FillHeight
                                        )
                                }
                               Column(
                                   modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                               ) {
                                   XTextSmall(text = "Men's Harrington Jacket")
                                   Spacer(modifier = Modifier.padding(vertical = 3.dp))
                                   Row (
                                       modifier = Modifier.fillMaxWidth(),
                                       verticalAlignment = Alignment.CenterVertically
                                   ){
                                       XTextSmall(text = "$148.00", fontWeight = FontWeight.Bold)
                                       Spacer(modifier = Modifier.padding(horizontal = 5.dp))
                                       Text(text = "$100.00", textDecoration = TextDecoration.LineThrough)
                                   }
                                  
                               }

                            }
                        }
                    }
                }
            }
        }

    }
}

@Composable
private fun NewIn(
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            XTextMedium(text = "New In", fontWeight = FontWeight.Bold, color = purple)
            XTextMedium(text = "See All")
        }

        Row {
            LazyRow {
                item {
                    repeat(6){
                        Box (
                            modifier = Modifier
                                .padding(horizontal = 5.dp, vertical = 10.dp)
                                .height(300.dp)
                                .width(200.dp)
                                .background(background, shape = RoundedCornerShape(10.dp))
                        ){
                            Column {
                                Box(
                                    modifier = Modifier
                                        .fillMaxHeight(0.8f)
                                        .fillMaxWidth()
                                ){
                                    Image(
                                        painter = rememberImagePainter(data = "https://i.pinimg.com/originals/ab/58/34/ab58349c2becf561a5bae775eb863f51.jpg"),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(
                                                RoundedCornerShape(
                                                    topStart = 10.dp,
                                                    topEnd = 10.dp,
                                                )
                                            ),
                                        contentScale = ContentScale.FillHeight
                                    )
                                }
                                Column(
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                                ) {
                                    XTextSmall(text = "Men's Harrington Jacket")
                                    Spacer(modifier = Modifier.padding(vertical = 3.dp))
                                    XTextSmall(text = "$ 148.00", fontWeight = FontWeight.Bold)
                                }

                            }
                        }
                    }
                }
            }
        }

    }
}