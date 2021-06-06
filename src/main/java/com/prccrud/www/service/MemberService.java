package com.prccrud.www.service;

import com.prccrud.www.domain.entity.Member;

import java.util.Optional;

public interface MemberService {
    void save(Member member);
    Optional<Member> read(Long idx);

    void delete(Long idx);
}
