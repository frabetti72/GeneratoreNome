package com.example.generatorenome.model

import com.example.generatorenome.view.Mese
import com.example.generatorenome.view.Sesso
import java.time.LocalDate

object NameEngine : IEngine {
    override fun calcola(input: String): String {
        return input;
    }
    fun calcolaCodice(name:String, surname:String, dataNascita: LocalDate,siglaComune:String,sesso:Sesso): String{
        var result:String=""
        val anno: Int = dataNascita.year
        val mese: Mese =Mese.valueOf(dataNascita.month.name.uppercase())//vedere se funziona
        val giorno: Int= dataNascita.dayOfMonth

        return result
    }
    fun calcolaCodiceNome(name:String): String{
        var result:String="";
        var nome:String=name.replace(" ","")//rimossi gli spazi

        var consonanti=0;
        for(c:Char in nome){
            //if(isConsonante(c))consonanti++
            if(c.isConsonante()) consonanti++
        }
        if(consonanti>3){

        }
        if(consonanti==2 && nome.length>2){

        }
        if(consonanti==1 && nome.length>2){

        }
        if(consonanti==0 && nome.length>2){

        }
        if(nome.length<3){

        }
        return result
    }
    /*
    fun isConsonante(c:Char): Boolean{
        if( c.equals('b')||
            c.equals('c')||
            c.equals('d')||
            c.equals('f')||
            c.equals('g')||
            c.equals('h')||
            c.equals('l')||
            c.equals('m')||
            c.equals('n')||
            c.equals('p')||
            c.equals('q')||
            c.equals('r')||
            c.equals('s')||
            c.equals('t')||
            c.equals('v')||
            c.equals('w')||
            c.equals('z')||
            c.equals('j')||
            c.equals('k') ) return true
        return false
    }
    */
}

fun Char.isConsonante():Boolean{//estensione della classe Char
    val c= this
    if( c.equals('b')||
        c.equals('c')||
        c.equals('d')||
        c.equals('f')||
        c.equals('g')||
        c.equals('h')||
        c.equals('l')||
        c.equals('m')||
        c.equals('n')||
        c.equals('p')||
        c.equals('q')||
        c.equals('r')||
        c.equals('s')||
        c.equals('t')||
        c.equals('v')||
        c.equals('w')||
        c.equals('z')||
        c.equals('j')||
        c.equals('k') ) return true
    return false
}