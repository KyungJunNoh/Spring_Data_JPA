package com.prccrud.www.service;

import com.prccrud.www.domain.dto.MemberRequestDto;
import com.prccrud.www.domain.entity.Member;

public interface MemberService {
    Member save(Member member);
    Member read(Long idx);
    void delete(Long idx);
    String update(Long idx, MemberRequestDto memberRequestDto);

}
