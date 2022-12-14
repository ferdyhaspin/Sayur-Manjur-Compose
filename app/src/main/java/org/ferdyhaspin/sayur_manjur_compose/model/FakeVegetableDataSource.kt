package org.ferdyhaspin.sayur_manjur_compose.model

import android.content.Context
import com.google.gson.Gson
import org.ferdyhaspin.sayur_manjur_compose.R

/**
 * Created by ferdyhaspin on 14/12/22.
 */

fun Context.dummyVegetable(): VegetableData {
    val data = resources
        .openRawResource(R.raw.data)
        .bufferedReader()
        .use {
            it.readText()
        }

    return Gson().fromJson(data, VegetableData::class.java)
}