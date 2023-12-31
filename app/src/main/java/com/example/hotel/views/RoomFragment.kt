package com.example.hotel.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.example.hotel.R
import com.example.hotel.viewModels.RoomViewModel

class RoomFragment : Fragment() {
    private lateinit var backBtn: ImageButton
    private lateinit var bookBtn: Button

    companion object {
        fun newInstance() = RoomFragment()
    }

    private lateinit var viewModel: RoomViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_room, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backBtn = requireView().findViewById(R.id.backBtn)
        bookBtn = requireView().findViewById(R.id.tab1Button)

        val bookingFragment = BookingFragment()
        backBtn.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack()
        }
        bookBtn.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment_container, bookingFragment)
            transaction?.addToBackStack("bookingFragment")
            transaction?.commit()
        }
    }

}