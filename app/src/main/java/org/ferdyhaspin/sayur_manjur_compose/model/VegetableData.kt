package org.ferdyhaspin.sayur_manjur_compose.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
/**
 * Created by ferdyhaspin on 14/12/22.
 */



@Parcelize
data class VegetableData(
    @SerializedName("vegetables")
    val vegetables: List<Vegetable>
) : Parcelable
