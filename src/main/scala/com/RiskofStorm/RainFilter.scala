package com.RiskofStorm


object RainFilter{
  /*
   *  # Type of Sorting:
   *  Default -> Sort by .extention -ex
   *  Sort by name -nm
   *  Sort by date -dt
   *
   *  # Type of Folder:
   *  Default -> local folder
   *  Recursive -r
   *
   *  # Path of files placement:
   *  Default -> new folder named with currently timestamp in local folder
   *  String "path to folder"
   *
   *
   *  # Special feature:
   *  Default -> false
   *  Creates folders of unique sorted files -cf
   *  Examples: (-ex: ".txt"; -nm: "A", "B", "C"; -dt: "mm:dd:yyyy")
   *
   */
  def main(args:Array[String]):Unit ={

    val data = new ProcessData()
//    data.getExtentions(data.getListofFiles(data.getCurrentDir))
    data.getNames(data.getListofFiles(data.getCurrentDir))
    println("Done")

  }

}
