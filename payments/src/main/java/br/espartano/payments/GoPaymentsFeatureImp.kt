package br.espartano.payments

import android.content.Context
import android.content.Intent
import br.espartano.appbundlecodelab.features.GoPaymentsFeature

class GoPaymentsFeatureImp: GoPaymentsFeature {

    override fun go(context: Context) {
        context.startActivity(Intent(context, PaymentsHomeActivity::class.java))
    }
}