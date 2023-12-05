package com.example.client.server

import com.example.client.server.dto.MemberResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "serverClient", url = "\${host.server}")
interface ServerClient {

    @GetMapping("/members/{memberId}")
    fun find(
        @PathVariable memberId: Long,
    ): MemberResponse
}