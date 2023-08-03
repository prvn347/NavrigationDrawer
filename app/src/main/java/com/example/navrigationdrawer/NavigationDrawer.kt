package com.example.navrigationdrawer

import android.content.ClipData.Item
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DrawerHeader() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Green)
        .padding(14.dp), contentAlignment = Alignment.Center){
        Text(text = "Hello", fontSize = 60.sp)

    }
    
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun DrawerBody(
    items:List<MenuItems>,
    modifier: Modifier = Modifier,
    textitemStyle: androidx.compose.ui.text.TextStyle = androidx.compose.ui.text.TextStyle(fontSize = 3.sp),
    onItemClicked:(MenuItems)-> Unit
) {
LazyColumn(modifier){
    items(items){item->
        Row(modifier = modifier
            .padding(16.dp)
            .clickable { onItemClicked(item) }
            .fillMaxWidth()) {
            Icon(imageVector = item.icon, contentDescription = item.contentDescription )
            Spacer(modifier = modifier.width(15.dp))
            Text(text = item.title, style = textitemStyle, modifier = modifier.weight(1f) )
            
        }



    }
}
}