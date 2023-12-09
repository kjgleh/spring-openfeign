package com.example.member

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController {

    @GetMapping("/members/{memberId}")
    fun find(
        @PathVariable memberId: Long,
    ): MemberResponse {
        return MemberResponse(id = 1, name = "홍길동")
    }
}