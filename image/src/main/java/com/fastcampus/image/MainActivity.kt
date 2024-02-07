package com.fastcampus.image

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.fastcampus.image.ui.theme.ImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        //1. Image를 만들자
        //Image는 painter, imageVector, bitmap 3가지가 있는데 painter를 사용해보자
        Image(
            painter = painterResource(id = R.drawable.sample),
            contentDescription = "모래 위 핸드폰"
        )

        //2.imageVector를 사용해보자
        Image(
            imageVector = Icons.Filled.Settings,
            contentDescription = "세팅"
        )

        //bitmap은 context가 있는 activity 등에서 가지고 온다음에 bitmap을 주입시켜야하기에 우선 스킵 이런타입도 있다는 것을 보여주면됨
        
    }

    //이미지를 제대로 쓰기 위해서는 이렇게 정적인 이미지를 쓰는게 아니라 네트워크를 통해서 이미지를 가져와야한다
    //다음 시간에 공부해보자
}

@Preview(showBackground = true)
@Composable
fun ImagePreview() {
    ImageTheme {
        Greeting()
    }
}