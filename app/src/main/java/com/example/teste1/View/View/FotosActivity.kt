package com.example.teste1.View.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste1.databinding.ActivityFotosBinding


class FotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bin = ActivityFotosBinding.inflate(layoutInflater)
        setContentView(bin.root)
        bin.btvoltar2.setOnClickListener {
            var voltar = Intent(this, Tela_principalActivity::class.java)
            startActivity(voltar)
        }
        bin.btimgeucarestia.setOnClickListener {
            var foto = Intent(this, FotoeucaristiaActivity::class.java)
            startActivity(foto)
        }
        bin.btimgescola.setOnClickListener {
            var foto = Intent(this, FotoescolaActivity::class.java)
            startActivity(foto)
        }
        bin.btimgjimm.setOnClickListener {
            var foto = Intent(this, FotojimmActivity::class.java)
            startActivity(foto)
        }
        bin.btimgcabo.setOnClickListener {
            var foto = Intent(this, FotocaboActivity::class.java)
            startActivity(foto)
        }
        bin.btimgvacina.setOnClickListener {
            var foto = Intent(this, FotovacinaActivity::class.java)
            startActivity(foto)
        }
    }
}