package com.prccrud.www.controller;

import com.prccrud.www.domain.entity.Member;
import com.prccrud.www.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/save")
    public Member save(@RequestBody Member member){
        memberService.save(member);
        return member;
    }

    @GetMapping("/read/{idx}")
    public Optional<Member> read(@PathVariable("idx") Long idx){
        Optional<Member> findMember = memberService.read(idx);
        return findMember;
    }

    @DeleteMapping("/delete/{idx}")
    public String delete(@PathVariable("idx") Long idx){
        memberService.delete(idx);
        return idx + "삭제되었습니다";
    }
}
