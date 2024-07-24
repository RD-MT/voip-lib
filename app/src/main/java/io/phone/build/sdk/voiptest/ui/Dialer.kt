package io.phone.build.sdk.voiptest.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.TableLayout
import io.phone.build.sdk.voiptest.R
import kotlin.properties.Delegates

class Dialer @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : TableLayout(context, attrs) {

    var onCallListener: OnCallListener? = null

    var digits: String by Delegates.observable("") {
            _, _, new ->
        /*digitEntryWindow.text = new
        backspace.visibility = if (new.isNotBlank()) View.VISIBLE else View.GONE*/
    }
    private set

            init {
                TableLayout.inflate(getContext(), R.layout.dialer, this)
            }

    override fun onFinishInflate() {
        super.onFinishInflate()

        /*keypad.children.forEach {
            (it as ViewGroup).forEach {
                if (it is Button) {
                    it.setOnClickListener {
                        val button = it as Button
                        digits = "${digits}${button.text}"
                    }
                }
            }
        }

        backspace.setOnClickListener {
            if (digits.isNotBlank()) {
                digits = digits.substring(0, digits.length - 1)
            }
        }

        backspace.setOnLongClickListener {
            digits = ""
            true
        }

        callButton.setOnClickListener {
            if (digits.isNotBlank()) {
                onCallListener?.onCall(digits)
            }
        }*/
    }

    fun interface OnCallListener {
        fun onCall(number: String)
    }
}