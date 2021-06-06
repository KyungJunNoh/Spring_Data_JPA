package com.prccrud.www.service.Impl;

import com.prccrud.www.domain.entity.Member;
import com.prccrud.www.repository.MemberRepository;
import com.prccrud.www.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    public void save(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Optional<Member> read(Long idx) {
        return memberRepository.findById(idx);
    }

    @Override
    public void delete(Long idx) {
        memberRepository.deleteById(idx);
    }


}
