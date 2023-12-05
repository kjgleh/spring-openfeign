package com.example.client.dto

data class OrderResponse(
    val orderId: String,
    val member: MemberDto,
) {

    data class MemberDto(
        val id: Long,
        val name: String,
    )
}
