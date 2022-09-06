package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    // EntityManager
    @PersistenceContext
    private EntityManager em; // 스프링 컨테이너에서 알아서 주입

    public Long save(Member member) {
        // Command와 Query를 분리
        em.persist(member);
        return member.getId();
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }

}
