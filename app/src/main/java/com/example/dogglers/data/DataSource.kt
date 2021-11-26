package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dogs

class DataSource {
    fun dogglers() : List<Dogs>{
        val list = listOf<Dogs>(
        Dogs(R.string.name1 ,R.string.age1 ,R.string.hobby1 , R.drawable.tzeitel ),
        Dogs(R.string.name2 ,R.string.age2 ,R.string.hobby2 , R.drawable.leroy ),
        Dogs(R.string.name3 ,R.string.age3 ,R.string.hobby3 , R.drawable.frankie ),
        Dogs(R.string.name4 ,R.string.age4 ,R.string.hobby4 , R.drawable.nox ),
        Dogs(R.string.name5 ,R.string.age5 ,R.string.hobby5 , R.drawable.faye ),
        Dogs(R.string.name6 ,R.string.age6 ,R.string.hobby6 , R.drawable.bella )
        )
        return  list

    }
}