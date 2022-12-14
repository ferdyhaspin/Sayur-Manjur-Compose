package org.ferdyhaspin.sayur_manjur_compose.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * Created by ferdyhaspin on 14/12/22.
 */

@Parcelize
data class Vegetable(
    @SerializedName("product_id")
    var id: Int,
    @SerializedName("product_english_name")
    var nameEn: String = "",
    @SerializedName("product_indonesia_name")
    var name: String = "",
    @SerializedName("product_photo")
    var photo: String = "",
    @SerializedName("product_description")
    var desc: String = "",
    @SerializedName("product_health_benefit")
    var benefit: String = ""
) : Parcelable