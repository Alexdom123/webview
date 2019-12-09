package moreno.alex.webview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wv.settings.javaScriptEnabled
        wv.loadUrl("https://psicologiaymente.com/psicologia/ejercicios-para-desarrollar-inteligencia-emocional")
        wv.setWebViewClient(WebViewClient())
    }
}
