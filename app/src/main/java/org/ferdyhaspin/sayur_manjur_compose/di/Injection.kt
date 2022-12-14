package org.ferdyhaspin.sayur_manjur_compose.di

import android.content.Context
import org.ferdyhaspin.sayur_manjur_compose.data.VegetableRepository

/**
 * Created by ferdyhaspin on 14/12/22.
 */

object Injection {

    fun provideRepository(context: Context): VegetableRepository {
        return VegetableRepository.getInstance(context)
    }
}