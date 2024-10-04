package com.example.teste1.View.Utilidade

import android.content.Context
import android.widget.Toast
import android.view.View
import com.google.android.material.snackbar.Snackbar

class Util {
    companion object{

        fun ExibirMensagemToast(context:Context,mensagem:String){
            Toast.makeText(context,mensagem,Toast.LENGTH_LONG).show()
        }//fim exibir
        fun ExibirMensagemSnackbar(v: View, mensagem:String){
            Snackbar.make(v,mensagem,Snackbar.LENGTH_LONG).show()
        }

    }//fim object




}