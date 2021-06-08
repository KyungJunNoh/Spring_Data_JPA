package com.prccrud.www.controller;

import com.prccrud.www.domain.dto.MemberRequestDto;
import com.prccrud.www.domain.entity.Member;
import com.prccrud.www.exception.UserNotFoundException;
import com.prccrud.www.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public Member read(@PathVariable("idx") Long idx){
        Member findMember = memberService.read(idx);
        return findMember;
    }

    @PutMapping("/delete/{idx}")
    public String delete(@PathVariable("idx") Long idx){
        memberService.delete(idx);
        return idx + "삭제되었습니다";
    }

    @PutMapping("/update/{idx}")
    public String update(@PathVariable("idx") Long idx, @RequestBody MemberRequestDto memberRequestDto){
        return memberService.update(idx,memberRequestDto);
    }
}
