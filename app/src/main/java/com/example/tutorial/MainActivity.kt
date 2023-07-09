package com.example.tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorial.ui.theme.TutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticle(title = stringResource(R.string.title_name), shortDescription = stringResource(R.string.short_para
                    ), longDescription = stringResource(R.string.long_para)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeArticle(title: String, shortDescription: String, longDescription: String) {
    Column {
        val image = painterResource(id = R.drawable.articleimage)
        Image(painter = image, contentDescription= null)
        Text(
            text = title, fontSize = 24.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )
        Text(
            text = shortDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = longDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TutorialTheme {
        ComposeArticle(title = stringResource(R.string.title_name), shortDescription = stringResource(R.string.short_para
        ), longDescription = stringResource(R.string.long_para)
        )
    }
}