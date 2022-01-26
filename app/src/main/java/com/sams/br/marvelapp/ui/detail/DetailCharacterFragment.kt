package com.sams.br.marvelapp.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.sams.br.marvelapp.databinding.FragmentDetailsCharacterBinding
import com.sams.br.marvelapp.ui.base.BaseFragment

class DetailCharacterFragment : BaseFragment<FragmentDetailsCharacterBinding, DetailCharacterViewModel>(){
    override val viewModel: DetailCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailsCharacterBinding =
        FragmentDetailsCharacterBinding.inflate(inflater, container, false)
}