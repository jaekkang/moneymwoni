package wanted.moneymwoni.app.member.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(
    name = "member",
    indexes = {
        @Index(
            name = "idx__member__name",
            columnList = "name",
            unique = true
        )
    }
)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @Column(name = "member_id")
    private Long id;

    @Column(name = "memeber_name")
    private String name;

    @Builder
    public Member(String name) {
        this.name = name;
    }
}
