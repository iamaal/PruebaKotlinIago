package com.example.competicioesportivaappiagomachado.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.competicioesportivaappiagomachado.R


class IniciFragment : Fragment(R.layout.fragment_inici) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view.findViewById<Button>(R.layout.fragment_inici. }) {
            findNavController().navigate(R.id.action_IniciFragment_to_CategoriesFragment)
        }
    }


}

