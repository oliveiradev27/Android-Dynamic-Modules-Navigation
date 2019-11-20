package br.espartano.gohorse.navigation

import android.content.Context
import android.content.Intent
import br.espartano.navigation.features.GoHorseFeature
import br.espartano.gohorse.GoHorseActivity
import com.google.auto.service.AutoService

@AutoService(GoHorseFeature::class)
class GoHorseFeatureImp : GoHorseFeature {
    override fun get(context: Context) {
        context.startActivity(Intent(context, GoHorseActivity::class.java))
    }
}