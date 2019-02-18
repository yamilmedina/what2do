package io.github.yamilmedina.what2doapp.domain

import java.io.Serializable
import java.util.HashMap

class Currency : Serializable {

    var code: String? = null
    var name: String? = null
    var symbol: String? = null
    private val additionalProperties = HashMap<String, Any>()

    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    fun setAdditionalProperty(name: String, value: Any) {
        this.additionalProperties[name] = value
    }

    companion object {
        private const val serialVersionUID = -8585866566345385712L
    }

}
