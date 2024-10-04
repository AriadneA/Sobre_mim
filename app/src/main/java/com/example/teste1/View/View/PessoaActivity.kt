package com.example.teste1.View.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.teste1.View.Model.Pessoamodel
import com.example.teste1.View.Presenter.Pessoapresenter
import com.example.teste1.R
import com.example.teste1.databinding.ActivityPessoaBinding

class PessoaActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var bind:ActivityPessoaBinding
    var pessoamodel = Pessoamodel()
    var pessoapresenter = Pessoapresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityPessoaBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.btsalvar.setOnClickListener(this)
    }
    override fun onClick(v: View?){
        when(v?.id){
            bind.btsalvar.id ->{
                pessoamodel.nome = bind.edtnome.text.toString()
                pessoamodel.cpf = bind.edtcpf.text.toString()
                pessoamodel.ano = bind.edtano.text.toString().toInt()
                pessoapresenter.CadastrarPessoa(findViewById(R.id.layoutpessoa),pessoamodel)
            }//fim salvar
        }//fim
    }
}