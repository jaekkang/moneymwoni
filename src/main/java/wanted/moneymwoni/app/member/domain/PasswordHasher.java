package wanted.moneymwoni.app.member.domain;

public interface PasswordHasher {

    String hash(String rawPassword);

    boolean isMatch(String raw, String hashed);
}
