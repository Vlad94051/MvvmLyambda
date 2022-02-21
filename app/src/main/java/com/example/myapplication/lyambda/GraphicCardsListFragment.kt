package com.example.myapplication.lyambda

import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class GraphicCardsListFragment(val send: (card: Any) -> Unit) : BottomSheetDialogFragment() {

    companion object {
        fun newInstance(send: (card: Any) -> Unit) =
            GraphicCardsListFragment(send)
    }

    override fun onStart() {
        super.onStart()
        send(Any())
    }
}

interface TransferData {
    fun send(obj: Any)
}