package humazed.github.com.fragmentactivitylambdakotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.container, BlankFragment.newInstance("", { it ->
                    println("it = ${it}")
                }), "tag")
                .commit()
    }
}
