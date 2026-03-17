//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjiramramji

package rust.interop.bridge

class NativeInterop {

    external fun fetchInteroperability(url: String, paramsJson: String): String

    companion object {
        init {
            System.loadLibrary("interoperability_ffi_robusta")
        }
    }
}

fun main(args: Array<String>) {
    val bridge = NativeInterop()
    
    val url = "https://interoperability.onrender.com/filter"
    val params = """{"page": "1"}"""
    
    println("Interoperability FFI (Kotlin CLI)")
    
    val response = bridge.fetchInteroperability(url, params)
    
    println(response)
}

//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjiramramji