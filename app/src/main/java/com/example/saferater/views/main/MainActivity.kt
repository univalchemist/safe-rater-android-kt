package com.example.saferater.views.main
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.saferater.R
import com.example.saferater.utils.ext.makeStatusBarTransparent
import com.example.saferater.views.fragments.RatingFeedbackFragment
import com.example.saferater.views.fragments.RatingInfoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var ratingInfoSheet : RatingInfoFragment? = null
    private var ratingFeedbackSheet : RatingFeedbackFragment? = null

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_main)

        makeStatusBarTransparent()
        setupUI()
        setListeners()

    }

    private fun setupUI() {
    }

    private fun setListeners() {
        rating_bar.setOnRatingChangeListener { _, rating ->
            if (rating > 0) {
                btn_submit.isEnabled = true
                btn_submit.setBackgroundResource(R.drawable.btn_round_shape_active)
                tv_submit_title.setTextColor(ResourcesCompat.getColor(resources,
                    R.color.primary, null))
            } else {
                btn_submit.isEnabled = false
                btn_submit.setBackgroundResource(R.drawable.btn_round_shape_inactive)
                tv_submit_title.setTextColor(ResourcesCompat.getColor(resources,
                    R.color.green_light, null))
            }
        }
        iv_info.setOnClickListener {
            openRatingInfo()
        }
        btn_submit.setOnClickListener {
            openRatingFeedback()
        }
    }

    private fun openRatingInfo() {
        if(ratingInfoSheet == null){
            ratingInfoSheet = RatingInfoFragment()
        }
        ratingInfoSheet?.show(supportFragmentManager, "dialog")

    }

    private fun openRatingFeedback() {
        if(ratingFeedbackSheet == null){
            ratingFeedbackSheet = RatingFeedbackFragment()
        }
        ratingFeedbackSheet?.show(supportFragmentManager, "dialog")

    }

}