package io.github.yamilmedina.what2doapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.SearchView
import io.github.yamilmedina.what2doapp.domain.Country
import io.github.yamilmedina.what2doapp.utils.FileReaderWrapper

class HomeActivity : AppCompatActivity(), SearchView.OnQueryTextListener {

    private lateinit var fileReader: FileReaderWrapper
    private lateinit var countries: List<Country>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        fileReader = FileReaderWrapper(this.applicationContext)
        countries = fileReader.readResponseFromAsset("countries.json")
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
