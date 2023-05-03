package hello.hellospring.controller;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class MemberController {
    private final MemberService memberService;

    /*DI 멤버 의존관계 주입*/

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}