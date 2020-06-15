package com.ero.mysmartband

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profil.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        toolbarProfile.run {
            title = resources.getString(R.string.profile)
            setNavigationIcon(R.drawable.ic_back)
            setNavigationOnClickListener { finish() }
        }

        Glide.with(this)
            .load(ContextCompat.getDrawable(this, R.drawable.ic_profil))
            .circleCrop()
            .into(circleImageViewProfile)

        textNameProfile.text = resources.getString(R.string.nama_profile)
        textViewEmailAbout.text = resources.getString(R.string.email_profile)

    }
}