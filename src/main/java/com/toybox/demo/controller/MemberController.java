package com.toybox.demo.controller;

import com.toybox.demo.dto.MemberDTO;
import com.toybox.demo.entity.Member;
import com.toybox.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/h2/members")
    public List<Member> getMemberList(){
        return memberService.getMemberList();
    }
    @GetMapping("/h2/member/{id}")
    public Member getMember(@PathVariable Long id) {
        return memberService.findById(id);
    }

//    @PostMapping("/h2/insert")
//    public void addMember(){
//        Member member = Member.builder().name("test").age(22).build();
//        Member newMember = memberService.save(member);
//        System.out.println(newMember);
//    }

    @PostMapping("/h2/insert")
    public void addMember(@RequestBody MemberDTO member){
        memberService.save(Member.builder().dto(member).build());
    }
}