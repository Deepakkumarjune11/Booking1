package com.example.booking.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity(tableName = "reservations")
data class Reservation(
    val userId: Int = 0,
    val hotelId: Int = 0,
//    val name: String?,
    @PrimaryKey
    val reservationId: Int = 0,
    val nightsCount: Int = 0,
//    val pricePerNight: Int?,
    val dateTimestamp: String = "",
    val name: String = "",
    val url: String = "",
    val roomsLeft: Int = 0,
    val pricePerNight: Int = 0,
    val reservedByPeople: Int = 0
)

