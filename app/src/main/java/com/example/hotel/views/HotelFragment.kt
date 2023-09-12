package com.example.hotel.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.example.hotel.viewModels.HotelViewModel
import com.example.hotel.R

//прокидывать валюту по коду

class HotelFragment : Fragment() {
    private lateinit var chooseBtn: Button

    companion object {
        fun newInstance() = HotelFragment()
    }

    private lateinit var viewModel: HotelViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hotel, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chooseBtn = requireView().findViewById(R.id.chooseBtn)
        val roomFragment = RoomFragment()
       chooseBtn.setOnClickListener{
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment_container, roomFragment)
            transaction?.addToBackStack("roomFragment")
            transaction?.commit()
        }
    }
}