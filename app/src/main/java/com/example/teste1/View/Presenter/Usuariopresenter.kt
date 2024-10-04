package com.example.teste1.View.Presenter

import com.example.teste1.View.Model.Usuariomodel
import com.example.teste1.View.Presenter.Banco.ConfiguracaoBanco

class Usuariopresenter {
    var bd= ConfiguracaoBanco.getconexaousuario()


    fun CadastrarUsuario(user: Usuariomodel){

        bd.createUserWithEmailAndPassword(user.login.toString(),user.senha.toString())

    }//fim classe

    fun RedefinirSenha(email:String){
        bd.sendPasswordResetEmail(email)
    }


}