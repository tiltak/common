package com.evensberget.tiltak.common.domain

import java.util.*

data class Person(
    val id: UUID,
    val fornavn: String,
    val mellomnavn: String,
    val etternavn: String,
    val telefonnummer: String,
)
