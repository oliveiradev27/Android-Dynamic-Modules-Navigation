package br.espartano.payments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.espartano.navigation.features.GoHorseFeature
import java.util.*

class PaymentsHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payments_home)

        findViewById<Button>(R.id.button_go_to_feature_gohorse).setOnClickListener {
           val iterator = ServiceLoader.load(
                GoHorseFeature::class.java,
                GoHorseFeature::class.java.classLoader)
                .iterator()

            if (iterator.hasNext())
                iterator
                    .next()
                    .get(this)
        }
    }
}
