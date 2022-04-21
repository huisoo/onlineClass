package msaStudy.onlineLecture.service;

import java.lang.reflect.Member;
import java.util.Map;

public interface MemberService {
    //회원가입
    public Map<String,String> join(Member member) throws Exception;

    //로그인
    public Map<String,String> Login(Member member) throws Exception;

}
