package com.example.hw_8

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.SystemClock
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {
    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        return view
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (arguments != null) {
            textView = view.findViewById(R.id.textView)
            textView.text = "Name is: ${arguments?.getString("key")} " +
                    "\n Age is: ${arguments?.getString("key2")}"

        }
        //SystemClock.sleep(10000)
        //findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
    }


}