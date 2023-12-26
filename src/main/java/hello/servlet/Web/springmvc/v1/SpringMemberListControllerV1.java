package hello.servlet.Web.springmvc.v1;

import hello.servlet.Web.frontcontroller.ModelView;
import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class SpringMemberListControllerV1 {
    private MemberRepository memberRepository = MemberRepository.getInstance() ;

    @RequestMapping("/springmvc/v1/members")
    public ModelAndView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();
        ModelAndView modelView = new ModelAndView("members");
        modelView.addObject("member", members);

        return modelView;
    }
}
