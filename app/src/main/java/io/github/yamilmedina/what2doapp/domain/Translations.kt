package io.github.yamilmedina.what2doapp.domain

import java.io.Serializable
import java.util.HashMap

class Translations : Serializable {

    var de: String? = null
    var es: String? = null
    var fr: String? = null
    var ja: String? = null
    var it: String? = null
    var br: String? = null
    var pt: String? = null
    var nl: String? = null
    var hr: String? = null
    var fa: String? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties[name] = value
    }

    companion object {
        private const val serialVersionUID = -4005806234095429583L
    }

}
