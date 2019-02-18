package io.github.yamilmedina.what2doapp.domain

import java.io.Serializable
import java.util.HashMap

class RegionalBloc : Serializable {

    var acronym: String? = null
    var name: String? = null
    var otherAcronyms: List<Any>? = null
    var otherNames: List<Any>? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties[name] = value
    }

    companion object {
        private const val serialVersionUID = -5275930242106997695L
    }

}
