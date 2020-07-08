package com.jydev.certaincolortextview

import android.content.Context
import android.os.Build
import android.text.Html
import android.util.AttributeSet

class CertainColorTextView : androidx.appcompat.widget.AppCompatTextView {
    var certainTextColor: String = "#ffffff"
    var certainText: String = ""

    constructor(context: Context) : super(context) {
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        val attrsArray =
            context.theme.obtainStyledAttributes(attrs, R.styleable.CertainColorTextView, 0, 0)
        if (attrsArray.getNonResourceString(R.styleable.CertainColorTextView_certainText) != null)
            certainText =
                attrsArray.getNonResourceString(R.styleable.CertainColorTextView_certainText)
        if (attrsArray.getNonResourceString(R.styleable.CertainColorTextView_certainTextColor) != null)
            certainTextColor =
                attrsArray.getNonResourceString(R.styleable.CertainColorTextView_certainTextColor)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        setView()
    }

    fun setView() {
        val tv = this.text.toString()
            .replace(certainText, "<font color=\"$certainTextColor\">$certainText</font>")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            this.text = Html.fromHtml(tv, Html.FROM_HTML_MODE_LEGACY)
        } else this.text = Html.fromHtml(tv)
    }

    fun setCertainColor(certainColorCode: String) {
        if (certainColorCode[0] == '#') certainTextColor = certainColorCode
        else certainTextColor = "#ffffff"
        setView()
    }

    fun setCertainTv(certainText: String) {
        this.certainText = certainText
        setView()
    }
}