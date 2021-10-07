package com.example.dictionaryappdemo.fragments

import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dictionaryappdemo.R
import com.example.dictionaryappdemo.adapter.LetterAdapter
import com.example.dictionaryappdemo.databinding.FragmentLetterListBinding


class LetterListFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentLetterListBinding? = null
    private val binding: FragmentLetterListBinding get() = _binding!!
    companion object{
        var isLinearLayoutManager = true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLetterListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = binding.recyclerView
        chooseLayout()
        recyclerView.adapter = LetterAdapter()
    }

    private fun chooseLayout() {
        if(isLinearLayoutManager){
            recyclerView.layoutManager = LinearLayoutManager(this.requireContext())
        }
        else{
            recyclerView.layoutManager = GridLayoutManager(this.requireContext(), 2)
        }
    }
    private fun setIcon(menuButton: MenuItem?){
        if(menuButton == null){
            return
        }
        menuButton.icon =
            if (isLinearLayoutManager) {
                ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_list_view)
            }
            else {
                ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_grid_view)
            }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.icon_menu, menu)
        val menuButton = menu.findItem(R.id.menu_item)
        setIcon(menuButton)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if(item.itemId == R.id.menu_item){
            isLinearLayoutManager = !isLinearLayoutManager
            chooseLayout()
            setIcon(item)
            true
        }
        else super.onOptionsItemSelected(item)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}