package br.com.fernandavedovello.calculadouraflex.ui.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fernandavedovello.calculadouraflex.R
import br.com.fernandavedovello.calculadouraflex.ui.result.ResultActivity
import br.com.fernandavedovello.calculadouraflex.watchers.DecimalTextWatcher
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        etGasPrice.addTextChangedListener(DecimalTextWatcher(etGasPrice))
        etEthanolPrice.addTextChangedListener(DecimalTextWatcher(etEthanolPrice))
        etGasAverage.addTextChangedListener(DecimalTextWatcher(etGasAverage))
        etEthanolAverage.addTextChangedListener(DecimalTextWatcher(etEthanolAverage))

        btCalculate.setOnClickListener {
            val nextScreen = Intent(this@FormActivity, ResultActivity::class.java)

            nextScreen.putExtra("GAS_PRICE", etGasPrice.text.toString().toDouble())
            nextScreen.putExtra("ETHANOL_PRICE", etEthanolPrice.text.toString().toDouble())
            nextScreen.putExtra("GAS_AVERAGE", etGasAverage.text.toString().toDouble())
            nextScreen.putExtra("ETHANOL_AVERAGE", etEthanolAverage.text.toString().toDouble())

            startActivity(nextScreen)
        }
    }
}
