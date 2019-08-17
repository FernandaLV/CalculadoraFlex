package br.com.fernandavedovello.calculadouraflex.extensions

fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)