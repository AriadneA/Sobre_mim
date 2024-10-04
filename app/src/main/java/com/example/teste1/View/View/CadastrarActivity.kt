package com.example.teste1.View.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.teste1.View.Model.Usuariomodel
import com.example.teste1.View.Presenter.Usuariopresenter
import com.example.teste1.databinding.ActivityCadastrarBinding

class CadastrarActivity : AppCompatActivity() {
    lateinit var bind: ActivityCadastrarBinding
    var usermodel = Usuariomodel()
    var userpresenter = Usuariopresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityCadastrarBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btcadastrar.setOnClickListener {
            if (ValidarCampos()) {
                usermodel.login = bind.edtemail.text.toString()
                usermodel.senha = bind.edtsenha.text.toString().toInt()
                userpresenter.CadastrarUsuario(usermodel)
            }else{
                Toast.makeText(this,"Preencha os campos necessarios",Toast.LENGTH_LONG).show()
            }


        }//fim do botao cadastrar
        bind.btvoltar.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

    }//fim metodo oncreate

    //Inicio de desenvolvimento de metodos
    fun ValidarCampos():Boolean {
        if (!bind.edtemail.text.toString().isEmpty() && !bind.edtsenha.text.toString().isEmpty()) {
            return true
        } else{
            return false
        }
    }//fim do validar campos



}