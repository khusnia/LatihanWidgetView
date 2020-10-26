package com.khusnia.latihanwidgetview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Toast
import com.khusnia.latihanwidgetview.R.id.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPesan.setOnClickListener {
            val checkedVarianRadioButtonId = rgVarian.checkedRadioButtonId
            val varian = findViewById<RadioButton>(checkedVarianRadioButtonId)
            val cash = cbCash.isChecked
            val mBanking = mBanking.isChecked
            val eWallet = eWallet.isChecked
            val orderString = "Anda memesan Kopi:\n" +
                            "${varian.text}" +
                            (if(cash) "\nCash" else "") +
                            (if(mBanking) "\nmBanking" else "") +
                            (if(eWallet) "\neWallet" else "")
            tvPesan.text = orderString
        }
    }
}