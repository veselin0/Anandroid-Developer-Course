package com.example.activitylifecicleplaygroun

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.activitylifecicleplaygroun.databinding.FragmentTestBinding

class TestFragment: Fragment() {

    private lateinit var binding: FragmentTestBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }
//    In most cases there will be no need of using onCreate method in Fragments:
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textViewFragmentText.text = "This is on view created in the Test Fragment!"
    }

//    We rarely will use this method:
//    override fun onDestroyView() {
//        super.onDestroyView()
//    }

    override fun onDetach() {
        super.onDetach()
    }
}

