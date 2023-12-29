package org.jetbrains.kotlinx.spark.api

import scala.collection.JavaConverters

fun <T> Iterable<T>.asScala() =
    JavaConverters.asScala(this)

fun <T> Iterable<T>.toSeq() =
    asScala().toSeq()
