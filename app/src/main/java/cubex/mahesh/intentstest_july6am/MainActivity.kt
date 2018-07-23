package cubex.mahesh.intentstest_july6am

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dial.setOnClickListener({
            var i = Intent( )
                           // code to open dial screen
        /*    i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:"+et1.text.toString()) */
                        // code to open browser
        /*    i.action = Intent.ACTION_VIEW
            i.data = Uri.parse(et1.text.toString()) */
            i.action = Intent.ACTION_GET_CONTENT
            i.type = "image/*"
            startActivity(i)

        })  // Dial

        whatsapp.setOnClickListener({

          var i =  packageManager.getLaunchIntentForPackage("in.redbus.android")
          if(i!=null) {
              startActivity(i)
          }else{
              var i1 = Intent( )
              i1.action = Intent.ACTION_VIEW
              i1.data = Uri.parse("https://play.google.com/store/apps/details?id=in.redbus.android")
              startActivity(i1)
          }

        })



    } // onCreate
}  // MainActivity
