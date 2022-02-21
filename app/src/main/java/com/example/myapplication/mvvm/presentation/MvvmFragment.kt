package com.example.myapplication.mvvm.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe

class MvvmFragment : Fragment() {
    private val viewModel = MvvmViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.usersLiveData.observe(viewLifecycleOwner) { users ->
            // adapter.submitList(users)
        }
    }
}