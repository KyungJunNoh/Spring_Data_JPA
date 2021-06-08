package com.prccrud.www.service.Impl;

import com.prccrud.www.domain.dto.MemberRequestDto;
import com.prccrud.www.domain.entity.Member;
import com.prccrud.www.exception.UserNotFoundException;
import com.prccrud.www.repository.MemberRepository;
import com.prccrud.www.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void save(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member read(Long idx) {
        return memberRepository.findById(idx).orElseThrow(UserNotFoundException::new);
    }

    @Override
    public void delete(Long idx) {
        memberRepository.deleteById(idx);
    }

    @Transactional
    @Override
    public String update(Long id, MemberRequestDto requestDto) {
        Member member = memberRepository.findById(id).orElseThrow(UserNotFoundException::new);
        member.update(requestDto.getId(), requestDto.getName());
        return member + "update 성공";
    }



}
