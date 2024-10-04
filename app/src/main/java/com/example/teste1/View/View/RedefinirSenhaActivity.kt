package com.example.teste1.View.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste1.R
import com.example.teste1.View.Presenter.Usuariopresenter
import com.example.teste1.databinding.ActivityRedefinirSenhaBinding

class RedefinirSenhaActivity : AppCompatActivity() {

    var usuariopresenter = Usuariopresenter()
    lateinit var bind : ActivityRedefinirSenhaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityRedefinirSenhaBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.btenviar.setOnClickListener{
            usuariopresenter.RedefinirSenha(bind.btenviar.text.toString())
        }
        bind.btvoltar.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }

    }

}