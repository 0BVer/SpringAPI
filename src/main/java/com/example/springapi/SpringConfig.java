package com.example.springapi;

import com.example.springapi.repository.MemberRepository;
import com.example.springapi.repository.MemoryMemberRepository;
import com.example.springapi.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService((MemoryMemberRepository) memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
