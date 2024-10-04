package com.example.teste1.View.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.teste1.R
import com.example.teste1.View.Utilidade.Util
import com.example.teste1.databinding.ActivityTelaPrincipalBinding

class Tela_principalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bindi = ActivityTelaPrincipalBinding.inflate(layoutInflater)
        setContentView(bindi.root)
        bindi.btfotos.setOnClickListener {
            var tela = Intent(this, FotosActivity:: class.java)
            startActivity(tela)
            finish()
        }
        bindi.btmusicas.setOnClickListener {
            var tela = Intent(this, MusicasActivity:: class.java)
            startActivity(tela)
            finish()
        }
        bindi.bthobby.setOnClickListener {
            var tela = Intent(this, HobbyActivity:: class.java)
            startActivity(tela)
            finish()
        }
        bindi.btvoltar.setOnClickListener {
            var volta = Intent(this, LoginActivity::class.java)
            startActivity(volta)
            finish()
        }
    }
}