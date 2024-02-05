package com.fastcampus.column

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fastcampus.column.ui.theme.ColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnTheme {
                ColumnEx()
            }
        }
    }
}

@Composable
fun ColumnEx() {
//    Column(//세로로 배치시키는 레이아웃
//        modifier = Modifier.size(100.dp)
//    ) {
//        Text(text = "첫 번째")
//        Text(text = "두 번째")
//        Text(text = "세 번째")
//    }
    //1. horizontalAlignment를 Column에 적용
//    Column(//세로로 배치시키는 레이아웃
//        horizontalAlignment = Alignment.End,
//        modifier = Modifier.size(100.dp)
//    ) {
//        Text(text = "첫 번째")
//        Text(text = "두 번째")
//        Text(text = "세 번째")
//    }
    //2.Column에 verticalArrangement를 지정
    //SpaceAround, SpaceEvenly, SpaceBetween
//    Column(//세로로 배치시키는 레이아웃
//        verticalArrangement= Arrangement.Center,
//        horizontalAlignment = Alignment.End,
//        modifier = Modifier.size(100.dp)
//    ) {
//        Text(text = "첫 번째")
//        Text(text = "두 번째")
//        Text(text = "세 번째")
//    }
    //3. text에 Modifier.align을 사용
    Column(//세로로 배치시키는 레이아웃
        verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.End,
        modifier = Modifier.size(100.dp)
    ) {
        Text(
            text = "첫 번째",
            modifier = Modifier.align(Alignment.Start)
        )
        Text(
            text = "두 번째",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = "세 번째"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    ColumnTheme {
        ColumnEx()
    }
}