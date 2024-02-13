package com.fastcampus.practicecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.fastcampus.practicecard.ui.theme.CardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardTheme {
                CardEx(cardData)
                CardEx(cardData)
            }
        }
    }

    companion object {
        val cardData = CardData(
            imageUrl = "https://picsum.photos/id/237/200/300",
            imageDescription = "강아지 사진",
            name = "unso99",
            description = "unso99의 명함입니다."
        )
    }
}

//@Composable
//fun CardEx(cardData: CardData) {
//    Card(
//        elevation = 8.dp,
//        modifier = Modifier.padding(8.dp)
//    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier.padding(4.dp)
//        ) {
//            //1. AsynceImage, Spacer, Column, Text로 레이아웃 구성
//            AsyncImage(
//                model = cardData.imageUrl, contentDescription = cardData.imageDescription,
//                modifier = Modifier.size(32.dp)
//            )
//            //적당한 공백을 위해 Spacer추가
//            Spacer(modifier = Modifier.size(8.dp))
//            Column {
//                Text(text = cardData.name)
//                Spacer(modifier = Modifier.size(4.dp))
//                Text(text = cardData.description)
//            }
//        }
//    }
//}

@Composable
fun CardEx(cardData: CardData) {
    val placeHolderColor = Color(0x33000000)
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(4.dp)
        ) {
            //2.AsyncImage에는 placeholder를 지정하고
            //contentSclae을 ContentScale.Crop으로 설정
            //clip(CircleShape)로 둥근 외양설정
            AsyncImage(
                model = cardData.imageUrl, contentDescription = cardData.imageDescription,
                contentScale = ContentScale.Crop,
                placeholder = ColorPainter(placeHolderColor),
                modifier = Modifier.size(32.dp)
                    .clip(CircleShape)
            )
            //적당한 공백을 위해 Spacer추가
            Spacer(modifier = Modifier.size(8.dp))
            Column {
                Text(text = cardData.name)
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = cardData.description)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    CardTheme {
        Row {
            CardEx(cardData = MainActivity.cardData)
        }
    }
}

data class CardData(
    val imageUrl: String,
    val imageDescription: String,
    val name: String,
    val description: String
)