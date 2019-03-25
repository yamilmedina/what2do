package io.github.yamilmedina.what2doapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.SearchView
import io.github.yamilmedina.what2doapp.domain.Country
import io.github.yamilmedina.what2doapp.utils.FileReaderWrapper


class HomeActivity : AppCompatActivity(), SearchView.OnQueryTextListener {

    private lateinit var fileReader: FileReaderWrapper
    private lateinit var countries: List<Country>
    private lateinit var recyclerView: RecyclerView
    private lateinit var destinationAdapter: DestinationAdapter

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
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        false
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        false
    }
}
