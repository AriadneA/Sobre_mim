package com.example.teste1.View.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste1.databinding.ActivityFotoescolaBinding

class FotoescolaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bin = ActivityFotoescolaBinding.inflate(layoutInflater)
        setContentView(bin.root)
        bin.btvoltar2.setOnClickListener {
            var voltar = Intent(this, FotosActivity::class.java)
            startActivity(voltar)
            finish()
        }
    }
}