package lat.pam.navpinterest.ui.person

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PersonViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Person Fragment"
    }
    val text: LiveData<String> = _text
}