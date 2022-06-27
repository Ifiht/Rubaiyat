package org.evlis.rubaiyat

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.jruby.embed.ScriptingContainer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val add = 5
        //initializes Ruby Environment
        val container = ScriptingContainer()
        //Sets Ruby var 'ans' as java.lang.Integer: add
        container.put("ans", add)
        container.runScriptlet("ans = ans + 1")
        container.get(add, "ans")

        val text = "Ruby_OP $add"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}