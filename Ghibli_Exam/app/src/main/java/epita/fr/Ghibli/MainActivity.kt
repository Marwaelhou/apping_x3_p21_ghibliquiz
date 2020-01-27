package epita.fr.Ghibli

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import epita.fr.hellofragment.button1
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var haru: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.haru = findViewById(R.id.haru)


        haru!!.setOnClickListener {
            val otherActivity = Intent(applicationContext, button1::class.java)
            startActivity(otherActivity)
            finish()
        }

    }
}



