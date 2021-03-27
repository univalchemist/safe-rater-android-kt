package com.example.saferater.views.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.andrefrsousa.superbottomsheet.SuperBottomSheetFragment
import com.example.saferater.R
import kotlinx.android.synthetic.main.rating_feedback_bottom_sheet.*


/**
 * A simple [Fragment] subclass.
 *
 */
class RatingFeedbackFragment : SuperBottomSheetFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.rating_feedback_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners()
        setupUI()
    }

    override fun getStatusBarColor() = Color.TRANSPARENT
    override fun animateStatusBar() = true
    override fun getExpandedHeight() = -2
    override fun isSheetAlwaysExpanded() = true

    private fun setupUI() {
    }
    private fun setListeners() {
        btn_dismiss.setOnClickListener {
            this.dismiss()
        }
    }
}
