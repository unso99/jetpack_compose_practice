package com.fastcampus.checkbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fastcampus.checkbox.ui.theme.CheckBoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CheckBoxTheme {
                CheckBoxEx()
            }
        }
    }
}

@Composable
fun CheckBoxEx() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        //1. checkBox를 만들어보자 checked 속성은 false
        //onCheckedChange는 비워두자
        //CheckBox를 앞에 넣어주자
//        Checkbox(checked = false, onCheckedChange = {})
        //일반적인 안드로이드의 레거시 뷰하고는 좀 다른점이 있다 레거시뷰는 어떤 코드를 넣지않아도
        //동작을 하지만 jetpackcompose는 그렇게 되어있지 않고 체크박스에 false가 되어있기에 무조건 체크가 안되어 있는것
        //2. onCheckedChange에서 boolean 값 변수를 바꾸고
        //checked에서 그 값을 반영해보자 (잘 안됨)
//        var checked = false // 그 이유는 상태가 아니기때문에
//        Checkbox(checked = checked, onCheckedChange = {
//            checked = !checked
//        })
        //3. boolean 대신 remember {mutableStateOf(false)를
        //사용하여 상태를 도입하자 (value property를 이용)
//        var checked = remember {
//            mutableStateOf(false)
//        }
//        //composable은 언제든지 다시 그려질수있고 중단 될수도 있고 사라질수있다고 생각을 해야한다
//        //그래서 state가 날아갈수있다고 가정을 해야한다. 그래서 remember를 붙여줘야한다
//        //remember는 이상태를 기억했다가 나중에 쓰게 해달라는 거라 생각하면 된다
//        Checkbox(checked = checked.value, onCheckedChange = {
//            checked.value = !checked.value
//        })
        //근데 .value하는게 불편할수도있따
        //위임된 속성
        //4. delegated properties로 변경해보자
        //checked가 프로퍼티인것처럼
//        var checked by remember {
//            mutableStateOf(false)
//        }
//        Checkbox(checked = checked, onCheckedChange = {
//            checked = !checked
//        })

        //5. destuction으로 상태를 받아서 사용
        //비구조화
        val (checked, setChecked) =  remember {
            mutableStateOf(false)
        }
        Checkbox(checked = checked, onCheckedChange = setChecked)
        Text(text = "프로그래머입니까?",modifier = Modifier.clickable {
            setChecked(!checked)
        })
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CheckBoxTheme {
        CheckBoxEx()
    }
}