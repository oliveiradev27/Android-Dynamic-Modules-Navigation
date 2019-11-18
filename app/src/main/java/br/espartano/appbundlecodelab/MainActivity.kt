package br.espartano.appbundlecodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.espartano.appbundlecodelab.features.GoHorseFeature
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_go_to_feature_gohorse).setOnClickListener {
            ServiceLoader.load(
                GoHorseFeature::class.java,
                GoHorseFeature::class.java.classLoader)
                .iterator()
                .forEach { it.get(this) }
        }
    }
}
