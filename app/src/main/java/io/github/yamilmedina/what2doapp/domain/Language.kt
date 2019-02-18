package io.github.yamilmedina.what2doapp.domain

import java.io.Serializable
import java.util.HashMap

class Language : Serializable {

    var iso6391: String? = null
    var iso6392: String? = null
    var name: String? = null
    var nativeName: String? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties[name] = value
    }

    companion object {
        private const val serialVersionUID = -6605027935902329407L
    }

}
