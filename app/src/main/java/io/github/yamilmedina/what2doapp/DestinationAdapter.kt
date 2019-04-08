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

    private var countriesFiltered: List<Country> = countries

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                return FilterResults().apply {
                    values = countries.filter { it.capital!!.startsWith(constraint!!, true) }
                }
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                countriesFiltered = results?.values as ArrayList<Country>
                notifyDataSetChanged()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationHolder {
        return DestinationHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.destination_list_item, parent, false
            )
        )
    }

    override fun getItemCount() = countriesFiltered.size

    override fun onBindViewHolder(holder: DestinationHolder, position: Int) {
        holder.bind(countriesFiltered[position])
    }

    class DestinationHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(country: Country) {
            itemView.destinationItem.text = country.capital
            //itemView.setOnClickListener { listener -> listener.oncli}
        }
    }
}
