package com.example.hotel.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.example.hotel.R
import com.example.hotel.viewModels.BookingViewModel

class BookingFragment : Fragment() {
    private lateinit var backBtn: ImageButton
    private lateinit var payButton: Button

    companion object {
        fun newInstance() = BookingFragment()
    }

    private lateinit var viewModel: BookingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_booking, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backBtn = requireView().findViewById(R.id.backBtn)
        payButton = requireView().findViewById(R.id.payButton)
        val bookingPaidFragment = BookingPaidFragment()
        backBtn.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack()
        }
        payButton.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment_container, bookingPaidFragment)
            transaction?.addToBackStack("bookingPaidFragment")
            transaction?.commit()
        }
    }

}