package com.example.client.controller

import com.example.client.dto.OrderResponse
import com.example.client.external.MemberClient
import java.time.LocalDateTime
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController(
    private val memberClient: MemberClient,
) {

    @GetMapping("/orders/{orderId}")
    fun find(
        @PathVariable orderId: String,
    ): OrderResponse {
        println("start: ${LocalDateTime.now()}")

        val member = memberClient.find(1L)

        println("end: ${LocalDateTime.now()}")

        return OrderResponse(
            orderId = orderId,
            member = OrderResponse.MemberDto(
                id = member.id,
                name = member.name,
            )
        )
    }
}