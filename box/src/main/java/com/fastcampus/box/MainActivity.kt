package com.fastcampus.box

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fastcampus.box.ui.theme.BoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxTheme {
                BoxEx()
            }
        }
    }
}

@Composable
fun BoxEx() {
//    Box(modifier = Modifier.size(100.dp)) {
//        //Modifier.align을 통해 박스내에서 위치조절이 가능
    //box scope안에서만 사용할수 있음
//        Text(text = "Hello World", modifier = Modifier.align(Alignment.Center))
//    }
    //1.텍스트 두개를 박스안에 넣어보자
//    Box(modifier = Modifier.size(100.dp)) {
//        Text(text = "Hello World", modifier = Modifier.align(Alignment.TopStart))
//        Text(text = "Jetpack", modifier = Modifier.align(Alignment.CenterEnd))
//        Text(text = "Compose", modifier = Modifier.align(Alignment.BottomEnd))
//    }
    //2.2개의 박스를  박스안에 배치하고 사이즈를 70dp, 색상을 각각 다르게 해보자
//    Box(modifier = Modifier.size(100.dp)) {
//        Box(
//            modifier = Modifier
//                .size(70.dp)
//                .background(color = Color.Cyan)
//                .align(Alignment.CenterStart)
//        )
//        Box(
//            modifier = Modifier
//                .size(70.dp)
//                .background(color = Color.Yellow)
//                .align(Alignment.BottomEnd)
//        )
//    }
    //3.부모 box에 modifier 설정을 제거해서 content size만큼 보여주게하자
    //그리고 첫번째 자식 Box의 사이즈를 matchParentSize()로 설정
    //다음에는 fillMaxSize()로 설정
    Box {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Cyan)
                .align(Alignment.CenterStart)
        )
        Box(
            modifier = Modifier
                .size(70.dp)
                .background(color = Color.Yellow)
                .align(Alignment.Center)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    BoxTheme {
        BoxEx()
    }
}