package com.example.teste1.View.Presenter;

import android.content.Context
import android.view.View
import com.example.teste1.View.Model.Pessoamodel
import com.example.teste1.View.Presenter.Banco.ConfiguracaoBanco
import com.example.teste1.View.Utilidade.Util

class Pessoapresenter(context: Context) {

    var cont = context
    var banco = ConfiguracaoBanco.getconexaofirestore()
    fun CadastrarPessoa(v: View, pessoamodel: Pessoamodel){
        banco.collection("Pessoa").document().set(pessoamodel)
        Util.ExibirMensagemSnackbar(v,"Dados Cadastrados...")
    }
}