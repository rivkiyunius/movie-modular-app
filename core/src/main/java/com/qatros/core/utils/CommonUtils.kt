package com.qatros.core.utils

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.qatros.core.BuildConfig

/**
 * @author rivki
 * Created 11/03/22 at 12.27
 */

fun ImageView.showImages(url: String){
    Glide.with(this).load(BuildConfig.BASE_URL_IMAGE + url).into(this)
}

fun ImageView.showImages(id: Int){
    Glide.with(this).load(id).into(this)
}

fun String.showToast(context: Context, lengthToast: Int = Toast.LENGTH_SHORT){
    Toast.makeText(context, this, lengthToast).show()
}