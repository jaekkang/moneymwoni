package wanted.moneymwoni.app.member.domain;

public interface PasswordValidator {

    void validate(Member member, String rawPassword, PasswordHasher passwordHasher);
}
