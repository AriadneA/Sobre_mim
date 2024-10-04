package com.example.teste1.View.View

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste1.databinding.ActivityMusicasBinding

class MusicasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bind = ActivityMusicasBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btlittlemix.setOnClickListener {
            var mix = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=LGPm0EUO_xw"))
            startActivity(mix)
        }
        bind.btjustin.setOnClickListener {
            var justin = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=tQ0yjYUFKAE"))
            startActivity(justin)
        }
        bind.btdualipa.setOnClickListener {
            var dualipa = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oygrmJFKYZY"))
            startActivity(dualipa)
        }
        bind.bted.setOnClickListener {
            var ed = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Il0S8BoucSA"))
            startActivity(ed)
        }
        bind.btfivesos.setOnClickListener {
            var fivesos = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JWeJHN5P-E8"))
            startActivity(fivesos)
        }
        bind.btharry.setOnClickListener {
            var harry = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=P3cffdsEXXw"))
            startActivity(harry)
        }
        bind.btlaroi.setOnClickListener {
            var laroi = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=SJOKlqJho8U"))
            startActivity(laroi)
        }
        bind.btolivia.setOnClickListener {
            var olivia = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gNi_6U5Pm_o"))
            startActivity(olivia)
        }
        bind.btshawn.setOnClickListener {
            var shawn = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fHeQemJJQII"))
            startActivity(shawn)
        }
        bind.bttaylor.setOnClickListener {
            var taylor = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=e-ORhEE9VVg"))
            startActivity(taylor)
        }
        bind.btvoltar2.setOnClickListener {
            var voltar = Intent(this, Tela_principalActivity::class.java)
            startActivity(voltar)
        }
    }
}