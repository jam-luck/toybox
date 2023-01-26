package com.toybox.demo;

import com.toybox.demo.entity.Member;
import com.toybox.demo.service.MemberService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private MemberService memberService;
	@BeforeEach
	void init(){
		memberService.save(Member.builder().name("테스터1").age(22).build());
		memberService.save(Member.builder().name("테스터2").age(42).build());
		memberService.save(Member.builder().name("테스터3").age(17).build());
		memberService.save(Member.builder().name("테스터4").age(59).build());
		memberService.save(Member.builder().name("테스터5").age(74).build());
	}
	@Test
	void getMember(){
		Member member = memberService.findById(1L);
		System.out.println(member);
		assertThat(member).isNotNull();
	}

	@Test
	void getMembers(){
		List<Member> members = memberService.getMemberList();
		members.stream().forEach(e -> System.out.println(e));

		assertThat(members.get(0).getName()).isEqualTo("테스터1");
		assertThat(members.get(1).getName()).isEqualTo("테스터2");
		assertThat(members.get(2).getName()).isEqualTo("테스터3");
		assertThat(members.get(3).getName()).isEqualTo("테스터4");
		assertThat(members.get(4).getName()).isEqualTo("테스터5");

	}

}
