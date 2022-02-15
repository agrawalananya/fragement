package com.example.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class FragmentFirst : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_fragment,container,false)
    }



        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            Log.d("FirstFragmentTag","this is onCreate function")
        }



        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            Log.d("FirstFragmentTag","this is onViewCreated function")

        }

        override fun onViewStateRestored(savedInstanceState: Bundle?) {
            super.onViewStateRestored(savedInstanceState)
            Log.d("FirstFragmentTag","this is onViewStateRestored function")
        }

        override fun onStart() {
            super.onStart()
            Log.d("FirstFragmentTag","this is onStart function")
        }

        override fun onResume() {
            super.onResume()
            Log.d("FirstFragmentTag","this is onResume function")
        }

        override fun onPause() {
            super.onPause()
            Log.d("FirstFragmentTag","this is onPause function")
        }

        override fun onStop() {
            super.onStop()
            Log.d("FirstFragmentTag","this is onStop function")
        }

        override fun onSaveInstanceState(outState: Bundle) {
            super.onSaveInstanceState(outState)
            Log.d("FirstFragmentTag","this is onSaveInstanceState function")
        }

        override fun onDestroyView() {
            super.onDestroyView()
            Log.d("FirstFragmentTag","this is onDestroyView function")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d("FirstFragmentTag","this is onDestroy function")
        }

        override fun onAttach(context: Context) {
            super.onAttach(context)
            Log.d("FirstFragmentTag","this is onAttach function")

        }

        override fun onDetach() {
            super.onDetach()
            Log.d("FirstFragmentTag","this is onDeattach function")
        }
}




