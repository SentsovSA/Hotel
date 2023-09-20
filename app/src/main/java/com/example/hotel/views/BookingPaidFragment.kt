package com.example.hotel.views

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hotel.viewModels.BookingPaidViewModel
import com.example.hotel.R

class BookingPaidFragment : Fragment() {

    companion object {
        fun newInstance() = BookingPaidFragment()
    }

    private lateinit var viewModel: BookingPaidViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_booking_paid, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BookingPaidViewModel::class.java)
        // TODO: Use the ViewModel
    }

}