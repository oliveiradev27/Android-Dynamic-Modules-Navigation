package br.espartano.appbundlecodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.espartano.navigation.features.GoHorseFeature
import br.espartano.navigation.features.GoPaymentsFeature
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        findViewById<Button>(R.id.button_go_to_feature_pizzas).setOnClickListener {
           val iterator = ServiceLoader.load(
                GoPaymentsFeature::class.java,
                GoPaymentsFeature::class.java.classLoader)
               .iterator()

            if (iterator.hasNext())
                iterator
                    .next()
                    .go(this)
        }
    }
}
