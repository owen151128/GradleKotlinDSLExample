package kr.co.everspin.st

import android.graphics.Typeface
import android.widget.TextView

object StyleDsl {

    fun styleWith(textView: TextView, block: TextView.() -> Unit): TextView {
        block(textView)

        return textView
    }

    inline fun TextView.applyFont(applyStyle: () -> Typeface) {
        typeface = applyStyle()
    }

    inline fun TextView.changeFontSize(fontStyle: () -> Int) {
        val size = fontStyle()
        textSize = size.toFloat()
    }

    inline fun TextView.applyColor(colorLambda: () -> Int) {
        setTextColor(colorLambda())
    }
}