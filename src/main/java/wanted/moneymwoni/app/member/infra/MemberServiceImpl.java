package wanted.moneymwoni.app.member.infra;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wanted.moneymwoni.app.member.domain.Member;
import wanted.moneymwoni.app.member.domain.MemberRepository;
import wanted.moneymwoni.app.member.service.MemberService;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Long join(Member member) {
        return null;
    }
}
