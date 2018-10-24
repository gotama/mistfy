package gautamastudios.com.mistfy.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import gautamastudios.com.mistfy.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.login_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, RegisterFragment.newInstance())
                    .commitNow()
        }

    }

}