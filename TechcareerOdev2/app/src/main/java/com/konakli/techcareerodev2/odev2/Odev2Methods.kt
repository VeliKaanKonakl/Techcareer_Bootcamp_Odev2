package com.konakli.techcareerodev2.odev2

class Odev2Methods {


    // 1. Soru Derece donusum Fahrenheit.
    fun dereceToFahrenheit(celcius : Double) : Double{
        var sonucFahrenheit : Double = celcius * 1.8 + 32
        return sonucFahrenheit
    }


    // 2. Soru Kenarlari parametre olarak girilen diktortgen cevresi.
    fun dikdortgenCevreHesaplama(kisaKenar : Double, uzunKenar : Double){
        var diktorgenCevre = uzunKenar * 2 + kisaKenar * 2
        println("Girilen Diktortgenin Alani : $diktorgenCevre")
    }


    // 3. Soru Parametre olarak girilen sayinin faktoriyeli
    fun faktoriyelHesaplama(girilenSayi : Int) : Int{

        var faktoriyelSonuc : Int = 1

        for (i in 1..girilenSayi){
            faktoriyelSonuc = faktoriyelSonuc * i
        }
        return faktoriyelSonuc
    }


    // TODO : Kelime icinde harf arama - sonra bak - KASIM HOCAYA SOR
    // 4. Soru Parametre olarak girilen kelime icinde kac adet a harfi oldugunu bulma
    fun icindeKacAHarfiVar(kelime : String){

        // CALISMAYAN CEVAP
        /*
        var sayac = 0
        for (i in 0..kelime.length){
            if (kelime.get(i) == 'a'){
                sayac++
            }
        }
        */

        // println("$kelime kelimesinde $sayac tane 'A' harfi vardir. ")
    }


    // 5. Soru Parametre olarak girilen kenar sayisina gore ic acilari toplamini hesapla

    fun icAcilarToplami(kenarSayisi : Int) : Int{
        var icAcilarToplamiSonuc = (kenarSayisi - 2) * 180
        return icAcilarToplamiSonuc
    }


    // 6. Soru Parametre olarak girilen gun sayisina gore maas hesabi geri dondur
    fun maasHesaplama(gunSayisi : Int) : Int{

        var maas = 0
        var gunlukCalismaSaati = 8
        var gunlukCalismaSaatUcreti = 10
        var ekMesaiSaatUcreti = 20
        var toplamCalismaSaati = gunSayisi * gunlukCalismaSaati
        var normalCalismaSaati = 0
        var ekCalismaSaati = 0

            for (i in 1..toplamCalismaSaati) {
                if (i <= 160){
                    normalCalismaSaati ++
                }
                if (i >= 161){
                    ekCalismaSaati++
                }
            }


        maas = (normalCalismaSaati*gunlukCalismaSaatUcreti) + (ekCalismaSaati*ekMesaiSaatUcreti)
        return maas
    }



    // 7. Soru Parametre olarak girilen kota miktarina gore ucreti hesapla
    fun kotaAsimHesaplama(kullanilanNet : Int) : Int{
        var netFatura = 100
        var kota = 50
        var ekstraUcret = 0
        var kotaAsimi = kullanilanNet - kota

        for (i in 1..kotaAsimi){
            ekstraUcret += 4
        }
        netFatura += ekstraUcret
        return netFatura
    }
}