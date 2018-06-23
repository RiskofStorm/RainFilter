package com.RiskofStorm

class ArgParse {


  def getArgs(args:Array[String]):Map[String,Boolean]={

    val funcToUse = Map[String,Boolean]("-ex" -> true, "-nm" -> false, "-dt" -> false, "-cf" -> false)
    var path = Option[String]
    for(arg <- args){
      if (arg.contains(List("/", "\\"))){
//        path = arg
      }
      funcToUse.updated(arg, true)

    }
    return funcToUse
  }
}
