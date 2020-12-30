package kr.co.everspin.st

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.everspin.st.StyleDsl.applyColor
import kr.co.everspin.st.StyleDsl.applyFont
import kr.co.everspin.st.StyleDsl.changeFontSize
import kr.co.everspin.st.StyleDsl.styleWith
import kr.co.everspin.st.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        styleWith(binding.mainText) {
            applyFont { Typeface.MONOSPACE }
            changeFontSize { 20 }
            applyColor { Color.WHITE }
        }

        // normal
//        binding.mainText.typeface = Typeface.MONOSPACE
//        binding.mainText.textSize = 20.0f
//        binding.mainText.setTextColor(Color.WHITE)
    }
}