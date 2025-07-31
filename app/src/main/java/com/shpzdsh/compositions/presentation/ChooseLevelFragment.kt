package com.shpzdsh.compositions.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shpzdsh.compositions.R
import com.shpzdsh.compositions.databinding.FragmentChooseLevelBinding


class ChooseLevelFragment: Fragment() {

    private var _binding: FragmentChooseLevelBinding ?= null
    private val binding: FragmentChooseLevelBinding
        get() = _binding ?: throw RuntimeException("FragmentChooseLevelBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLevelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonLevelTest.setOnClickListener {
            // TODO
        }
        binding.buttonLevelEasy.setOnClickListener {
            // TODO
        }
        binding.buttonLevelNormal.setOnClickListener {
            //TODO
        }
        binding.buttonLevelHard.setOnClickListener {
            // TODO
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}