package com.arkivanov.mvikotlin.timetravel.proto.internal.io

internal actual fun DataReader.readFloat(): Float = readDouble().toFloat()
