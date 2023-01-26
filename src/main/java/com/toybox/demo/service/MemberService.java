package com.toybox.demo.service;

import com.toybox.demo.entity.Member;
import com.toybox.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public Member findById(Long id){
        return memberRepository.findById(id).get();
    }

    public Member save(Member member){
        return memberRepository.save(member);
    }

    public List<Member> getMemberList() {
        return memberRepository.findAll();
    }
}
