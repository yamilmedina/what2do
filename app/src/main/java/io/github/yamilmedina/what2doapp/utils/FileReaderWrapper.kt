package io.github.yamilmedina.what2doapp.utils

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import io.github.yamilmedina.what2doapp.domain.Country
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader


class FileReaderWrapper(private val context: Context) {

    // TODO(generify)
    @Throws(IOException::class)
    fun readResponseFromAsset(filename: String): List<Country> {
        val inputStream = context.assets.open(filename)
        val gson = Gson()
        val reader = BufferedReader(InputStreamReader(inputStream))

        val listType = object : TypeToken<List<Country>>() {}.type
        return gson.fromJson(reader, listType)
    }
}
