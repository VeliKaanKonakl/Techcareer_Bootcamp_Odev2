package com.konakli.techcareerodev2.odev2

fun main() {

    val m = Odev2Methods() // m adinda bir nesne turetiyoruz.

    // 1. Soru Derece donusum Fahrenheit.
    println("-----------SORU-1-----------")

    var celcius : Double = 33.5 // Celcius biciminde olan degerimizi cikti ekraninda gormek icin degiskende tutuyoruz.

    val donusumSonuc = m.dereceToFahrenheit(celcius) // m nesnesinden methoda ulasiyoruz ve islem sonucunu degiskende tutuyoruz.
    println("$celcius Derece : $donusumSonuc Fahrenheit") // islem sonucunu yazdiriyoruz.



    // 2. Soru Kenarlari parametre olarak girilen diktortgen cevresi.
    println("-----------SORU-2-----------")
    m.dikdortgenCevreHesaplama(10.2,20.7)



    // 3. Soru Parametre olarak girilen sayinin faktoriyeli
    println("-----------SORU-3-----------")
    var faktoriyeliAlinacakSayi = 8
    val faktoriyelSonuc = m.faktoriyelHesaplama(faktoriyeliAlinacakSayi)
    println("$faktoriyeliAlinacakSayi Sayisinin Faktoriyeli : $faktoriyelSonuc")


    // TODO : Kelime icinde harf arama - sonra bak - KASIM HOCAYA SOR
    // 4. Soru Parametre olarak girilen kelime icinde kac adet a harfi oldugunu bulma

    println("-----------SORU-4-----------")
    /*
    m.icindeKacAHarfiVar("Ankara")
    */


    // 5. Soru Parametre olarak girilen kenar sayisina gore ic acilari toplamini hesapla
    println("-----------SORU-5-----------")
    var kenarSayisi = 5
    val icAcilarToplamiSonuc = m.icAcilarToplami(kenarSayisi)
    println("Kenar sayisi $kenarSayisi olan bir cokgenin ic acilar toplami : $icAcilarToplamiSonuc")


    // 6. Soru Parametre olarak girilen gun sayisina gore maas hesabi geri dondur
    println("-----------SORU-6-----------")
    var gunSayisi = 25
    val maasSonuc = m.maasHesaplama(gunSayisi)
    println("Ek Ucretler Dahil Maas : $maasSonuc tl")




    // 7. Soru Parametre olarak girilen kota miktarina gore ucreti hesapla
    println("-----------SORU-7-----------")
    var kullanilanNet = 52
    val netFaturaUcreti = m.kotaAsimHesaplama(kullanilanNet)
    println("Net Fatura Ucreti : $netFaturaUcreti tl , Asim Miktari ${kullanilanNet-50} GB , Asim Ucreti ${netFaturaUcreti-100} tl")
}