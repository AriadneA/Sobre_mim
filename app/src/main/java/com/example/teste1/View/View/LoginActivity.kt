 package com.example.teste1.View.View

 import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
 import android.widget.Toast
 import com.example.teste1.View.Presenter.Banco.ConfiguracaoBanco
 import com.example.teste1.databinding.ActivityLoginBinding

 class LoginActivity : AppCompatActivity() {
     lateinit var bind:ActivityLoginBinding
     var bd = ConfiguracaoBanco.getconexaousuario()
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         bind = ActivityLoginBinding.inflate(layoutInflater)
         setContentView(bind.root)

         bind.btcriarconta?.setOnClickListener {
             startActivity(Intent(this, CadastrarActivity::class.java))
             finish()
         }//fim do botao criar conta

         bind.btlogar.setOnClickListener{
             bd.signInWithEmailAndPassword(bind.edtlogin.text.toString(),bind.edtsenha.text.toString())

                 .addOnSuccessListener {  sucesso ->
                     startActivity(Intent(this,Tela_principalActivity::class.java))
                 }.addOnFailureListener { error ->
                     Toast.makeText(this,"Email/Senha não cadastrado",Toast.LENGTH_LONG).show()
                     bind.edtlogin.text?.clear()
                     bind.edtsenha.text?.clear()
                     bind.edtlogin.requestFocus()
                 }

         }//fim do botao logar

         bind.btredefinirsenha?.setOnClickListener{
             startActivity(Intent(this,RedefinirSenhaActivity::class.java))
             finish()

         }//fim botao redefinir senha

     }//fim metodo oncreate

 }