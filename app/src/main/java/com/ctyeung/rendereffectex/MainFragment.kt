package com.ctyeung.rendereffectex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            findViewById<Button>(R.id.btn_blur)?.apply {
                setOnClickListener {
                    findNavController().navigate(R.id.action_mainFragment_to_blurFragment)
                }
            }

            findViewById<Button>(R.id.btn_mask)?.apply {
                setOnClickListener {
                    findNavController().navigate(R.id.action_mainFragment_to_unsharpMaskFragment)
                }
            }
        }
    }
}