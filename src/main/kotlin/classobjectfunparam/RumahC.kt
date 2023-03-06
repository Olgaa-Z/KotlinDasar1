package classobjectfunparam

class RumahC {

    var luasTanah : Int = 7
    var pemilikRumah : String = "Danu"
    var panjangRumah : Int = 100

//    secondary constructor 1
    constructor(_luastanah : Int, _panjangRumah :Int){
        this.luasTanah = _luastanah
        this.panjangRumah = _panjangRumah
    }

//    secondary constructor 2
    constructor(_pemilik : String){
        this.pemilikRumah = _pemilik
    }

//
}