package com.example.teste1.View.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste1.databinding.ActivityHobbyBinding

class HobbyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bin = ActivityHobbyBinding.inflate(layoutInflater)
        setContentView(bin.root)
        bin.btvoltar.setOnClickListener {
            var voltar = Intent(this, Tela_principalActivity::class.java)
            startActivity(voltar)
        }
    }
}