package com.fastcampus.networkimage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.fastcampus.networkimage.ui.theme.NetworkImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NetworkImageTheme {
                CoilEx()
            }
        }
    }
}

@Composable
fun CoilEx() {
    //3. rememberImagePainter를 이용해 Image의 painter를 설정
    //data에 있는 내용을 저장했다가 다시 composable이 재호출될때 기억했다가 알려준다
//    val painter = rememberImagePainter(data = "https://picsum.photos/200/300")
//    Image(painter = painter, contentDescription = "랜덤한 사진")
    //구글문서에는 코일과 glide를 추천 코일같은경우 AsyncImage를 활용
    Column{
        AsyncImage(model = "https://picsum.photos/200/300", contentDescription = "랜덤한 사진")
        AsyncImage(model = "https://picsum.photos/200/300", contentDescription = "랜덤한 사진")
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NetworkImageTheme {
        CoilEx()
    }
}