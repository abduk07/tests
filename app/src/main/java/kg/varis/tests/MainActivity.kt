package kg.varis.tests

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kg.varis.tests.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnResult.setOnClickListener {
            divide()
        }
    }

    private fun divide() = with(binding) {
        result.text = Divide().divide(count.text.toString(), secondCount.text.toString())
    }
}