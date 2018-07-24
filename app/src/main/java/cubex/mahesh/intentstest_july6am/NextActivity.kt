package cubex.mahesh.intentstest_july6am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        var s = intent.getStringExtra("person_name")
        //tv1.setText("Welcome 2 NareshIT : $s")
        tv1.text = "Welcome 2 NareshIT : $s"
    }
}
