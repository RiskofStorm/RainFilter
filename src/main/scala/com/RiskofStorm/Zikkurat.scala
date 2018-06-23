#!/bin/sh
exec scala "$0" "$@"
!#

// List comprehention
var x = List()
for(i <- 1 to 10) yield i
println(x.mkString(","))