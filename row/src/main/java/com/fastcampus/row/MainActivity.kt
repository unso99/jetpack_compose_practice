package com.fastcampus.row

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fastcampus.row.ui.theme.RowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowTheme {
                RowEx()
            }
        }
    }
}

@Composable
fun RowEx() {
//    Row(modifier=Modifier.height(40.dp)) {
//        //가로로 배치
//        Text(text = "첫 번째!")
//        Text(text = "두 번째!")
//        Text(text = "세 번째!")
//    }
    //1. 각 text의 modifier에 align을 설정
    //Alignment.Top, CenterVertically, Bottom을 지정해보자
//    Row(modifier=Modifier.height(40.dp)) {
//        //기본적으로는 align은 vertical
//        Text(text = "첫 번째!",modifier=Modifier.align(Alignment.Top))
//        Text(text = "두 번째!", modifier = Modifier.align(Alignment.CenterVertically))
//        Text(text = "세 번째!",modifier=Modifier.align(Alignment.Bottom))
//    }
    //2. Row에 verticalAlignment를 설정
    //text에 align을 사용할때와 쓰이는 값이 같다
    //모든항목에 똑같은 modifier를 설정할때 굳이 text마다 다 설정해줄 필요 x row에 직접 alignment 설정
//    Row(
//        verticalAlignment = Alignment.Bottom
//        ,modifier=Modifier.height(40.dp)
//    ) {
//        //기본적으로는 align은 vertical
//        Text(text = "첫 번째!",modifier= Modifier.align(Alignment.Top)) //그중 따로 설정 가능
//        Text(text = "두 번째!")
//        Text(text = "세 번째!")
//    }
    //3.row의 width를 200dp 로 설정
    //row에 horizontalArrangement에 Arrangement.Center를 설정
    //Start, End, SpaceAround, SpaceBetween, SpaceEvnely
//    Row(
//        horizontalArrangement= Arrangement.SpaceEvenly
//        ,verticalAlignment = Alignment.Bottom
//        ,modifier=Modifier.height(40.dp).width(200.dp)
//    ) {
//        //기본적으로는 align은 vertical
//        Text(text = "첫 번째!",modifier= Modifier.align(Alignment.Top)) //그중 따로 설정 가능
//        Text(text = "두 번째!")
//        Text(text = "세 번째!")
//    }
    //4.horizontalArrangement를 제거하고
    //각 text에 Modifier.weight를 설정
    //각 항목의 weight 값을 바꾸어 보자
//    Row(
//        verticalAlignment = Alignment.Bottom
//        ,modifier=Modifier.height(40.dp).width(200.dp)
//    ) {
//        //기본적으로는 align은 vertical
//        Text(text = "첫 번째!",
//            modifier= Modifier.align(Alignment.Top).weight(3f)
//        ) //그중 따로 설정 가능
//        Text(text = "두 번째!",
//            modifier=Modifier.weight(1f)
//            )
//        Text(text = "세 번째!",
//            modifier= Modifier.weight(3f)
//            )
//    }
    //5.text 대신 icon을 넣어보자
    Row(
        verticalAlignment = Alignment.Bottom, modifier = Modifier
            .height(40.dp)
            .width(200.dp)
    ) {
        //기본적으로는 align은 vertical
        Text(
            textAlign = TextAlign.Center,
            text = "첫 번째!",
            modifier = Modifier
                .align(Alignment.Top)
                .weight(3f)
                .background(Color.Magenta)
        ) //그중 따로 설정 가능
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "추가",
            modifier = Modifier
                .weight(1f)
                .background(Color.Cyan)
        )
        Text(
            text = "세 번째!",
            modifier = Modifier
                .weight(3f)
                .background(Color.Blue)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    RowTheme {
        RowEx()
    }
}