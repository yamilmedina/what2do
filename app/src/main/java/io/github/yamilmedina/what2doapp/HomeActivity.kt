package io.github.yamilmedina.what2doapp

import android.app.SearchManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SearchView
import io.github.yamilmedina.what2doapp.domain.Country
import io.github.yamilmedina.what2doapp.utils.FileReaderWrapper


class HomeActivity : AppCompatActivity() {

    private lateinit var fileReader: FileReaderWrapper
    private lateinit var countries: List<Country>
    private lateinit var recyclerView: RecyclerView
    private lateinit var destinationAdapter: DestinationAdapter
    private lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        fileReader = FileReaderWrapper(this.applicationContext)
        countries = fileReader.readResponseFromAsset("countries.json")

        destinationAdapter = DestinationAdapter(countries)

        recyclerView = findViewById(R.id.searchResultsList)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = destinationAdapter

        setupSearchView()
    }

    private fun setupSearchView() {
        val searchManager = getSystemService(SEARCH_SERVICE) as SearchManager
        searchView = findViewById(R.id.destinationSearch)
        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                destinationAdapter.filter.filter(query)
                return false
            }

            override fun onQueryTextChange(query: String): Boolean {
                destinationAdapter.filter.filter(query)
                return false
            }
        })
    }
}
