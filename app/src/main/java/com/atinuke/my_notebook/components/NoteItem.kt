package com.atinuke.my_notebook.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NoteItem(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ){
            Text(text = "Title Of Note", fontWeight = FontWeight.Black)
            Text(text="Content of the note will be here lorem ipausm jsks")
            Text(
                text="10: 58 am",
                color = Color.Red,
                fontSize = 12.sp,
                modifier = Modifier
                    .align(Alignment.End)
            )
        }
    }
}