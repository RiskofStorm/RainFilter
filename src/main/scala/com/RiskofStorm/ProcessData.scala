package com.RiskofStorm

import java.io.File

class ProcessData {


  def getCurrentDir: String = {
    val locDir: String = new java.io.File(".").getCanonicalFile.toString
    return locDir
  }


  def getListofFiles(path: String): List[String] = {

    var namedFiles = List[String]()
    val dir = new File(path)

    if (dir.isDirectory && dir.exists()) {
      namedFiles = dir.listFiles.filter(_.isFile).toList.map(_.getName)
    } else {
      println("Error: Could not access into folder. \n Solve: Run as administrator")
    }
    return namedFiles
  }


  def getExtentions(files: List[String]): Map[String,String] = {
    var extTemp: Map[String, String] = Map()


    val pattern = "(?:\\.)(\\w+)?".r
    val ext = pattern.findAllIn(files.toString()).matchData.map(_.group(1)).mkString(",").distinct.split(",")

    for (i <- ext) {
      extTemp += (i -> files.filter(_.endsWith(i)).mkString(" "))
    }
    return extTemp
  }


  def getNames(files: List[String]): Unit = {
    val pattern = "\\S+\\.\\w+".r
    val names = pattern.findAllMatchIn(files.toString()).mkString(",")
    println(names.split(",").sortWith(_ > _).mkString(","))

  }

}
