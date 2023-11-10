package hello.servlet.domain.member;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach(){
        memberRepository.clearStore();
    }
    @Test
    void getInstance() {
    }

    @Test
    void save() {
        //given
        Member member = new Member("hello", 20);

        //when
        Member savedMember = memberRepository.save(member);
        //then
        Member findMember = memberRepository.findbyId(savedMember.getId());
        org.assertj.core.api.Assertions.assertThat(findMember).isEqualTo(savedMember);
    }

    @Test
    void findbyId() {
        //given


        //when

        //then
    }

    @Test
    void findAll() {
        //given


        //when

        //then
    }

    @Test
    void clearStore() {
        //given


        //when

        //then
    }
    //given


    //when

    //then
}