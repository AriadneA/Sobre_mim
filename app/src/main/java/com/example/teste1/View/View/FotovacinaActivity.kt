package com.example.teste1.View.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste1.databinding.ActivityFotovacinaBinding

class FotovacinaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bind = ActivityFotovacinaBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.btvoltar2.setOnClickListener {
            var voltar = Intent(this, FotosActivity::class.java)
            startActivity(voltar)
            finish()
        }
    }
}