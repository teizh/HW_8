package com.example.hw_8

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {
    private lateinit var editTextName: EditText
    private lateinit var editTextAge: EditText
    private lateinit var button: Button
    lateinit var name: String
    lateinit var age: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_first, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button = view.findViewById(R.id.button)
        editTextName = view.findViewById(R.id.editName)
        editTextAge = view.findViewById(R.id.editAge)
        button.setOnClickListener {
            val bundle = Bundle()
            name = editTextName.text.toString()
            age = editTextAge.text.toString()
            bundle.putString("key", name.toString())
            bundle.putString("key2", age)
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
        }
    }
}