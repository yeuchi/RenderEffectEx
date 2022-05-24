package com.ctyeung.rendereffectex

import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView

class UnSharpMaskFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_un_sharp_mask, container, false)
        view.findViewById<CheckBox>(R.id.chk_mask)?.apply {
            isChecked = false

            setOnClickListener {
                val imageView = view.findViewById<ImageView>(R.id.image_view)
                applyBlur(imageView, isChecked)
                /*
                 * normal - blur + normal = unsharpmask
                 */
            }
        }
        return view
    }

    private fun applyBlur(imageView:ImageView, isOn:Boolean) {
        val blurEffect = if(isOn) {
            RenderEffect.createBlurEffect(
                BlurFragment.DEFAULT_BLUR,
                BlurFragment.DEFAULT_BLUR, Shader.TileMode.MIRROR)
        }
        else {
            null
        }
        imageView.setRenderEffect(blurEffect)
    }
}