package com.toybox.demo;

import com.toybox.demo.dto.UserDTO;
import com.toybox.demo.entity.User;
import com.toybox.demo.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private UserService userService;
	@BeforeEach
	void init(){

	}
	@Test
	void getMember(){

	}

	@Test
	void getMembers(){

	}

}
