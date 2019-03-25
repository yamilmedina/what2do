package io.github.yamilmedina.what2doapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import io.github.yamilmedina.what2doapp.domain.Country
import kotlinx.android.synthetic.main.destination_list_item.view.*


class DestinationAdapter(private val countries: List<Country>) :
    RecyclerView.Adapter<DestinationAdapter.DestinationHolder>(), Filterable {

    override fun getFilter(): Filter {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationHolder {
        return DestinationHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.destination_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = countries.size

    override fun onBindViewHolder(holder: DestinationHolder, position: Int) {
        holder.bind(countries[position])
    }

    class DestinationHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(country: Country) {
            itemView.destinationItem.text = country.capital
            //itemView.setOnClickListener { listener -> listener.oncli}
        }
    }
}
