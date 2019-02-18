package io.github.yamilmedina.what2doapp.domain

import java.io.Serializable
import java.util.HashMap

class Country : Serializable {

    var name: String? = null
    var topLevelDomain: List<String>? = null
    var alpha2Code: String? = null
    var alpha3Code: String? = null
    var callingCodes: List<String>? = null
    var capital: String? = null
    var altSpellings: List<String>? = null
    var region: String? = null
    var subregion: String? = null
    var population: Int? = null
    var latlng: List<Double>? = null
    var demonym: String? = null
    var area: Double? = null
    var gini: Double? = null
    var timezones: List<String>? = null
    var borders: List<String>? = null
    var nativeName: String? = null
    var numericCode: String? = null
    var currencies: List<Currency>? = null
    var languages: List<Language>? = null
    var translations: Translations? = null
    var flag: String? = null
    var regionalBlocs: List<RegionalBloc>? = null
    var cioc: String? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties[name] = value
    }

    companion object {
        private const val serialVersionUID = -7692791051161269838L
    }

}
