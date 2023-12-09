package com.example.client.external

import com.example.client.config.DefaultFeignConfig
import com.example.client.external.dto.MemberResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "memberClient",
    url = "\${host.member}",
    configuration = [DefaultFeignConfig::class]
)
interface MemberClient {

    @GetMapping("/members/{memberId}")
    fun find(
        @PathVariable memberId: Long,
    ): MemberResponse
}