package com.example.teste1.View.Presenter.Banco

import com.google.firebase.ktx.Firebase
import com.google.firebase.auth.ktx.auth
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore



class ConfiguracaoBanco{
        companion object Conexao {
            var auth = Firebase.auth
            var banco = FirebaseFirestore.getInstance()

            fun getconexaousuario(): FirebaseAuth {
                if (auth == null) {
                    auth = Firebase.auth
                    return auth
                } else {
                    return auth
                }
            }

            fun getconexaofirestore(): FirebaseFirestore {

                if (banco == null) {
                    banco = FirebaseFirestore.getInstance()
                    return banco
                } else {
                    return banco
                }
            }

        }//fim object

}
