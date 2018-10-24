package gautamastudios.com.mistfy.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import gautamastudios.com.mistfy.R

class MainFragment : androidx.fragment.app.Fragment() {

    private var mViewModel: MainViewModel? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java!!)
        // TODO: Use the ViewModel
    }

    companion object {

        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

}
