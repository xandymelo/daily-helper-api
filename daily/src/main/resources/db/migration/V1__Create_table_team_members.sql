CREATE TABLE team_members (
    team_id BIGINT NOT NULL,
    member_id BIGINT NOT NULL,

    PRIMARY KEY (team_id, member_id),

    CONSTRAINT fk_team_members_team
        FOREIGN KEY (team_id)
        REFERENCES teams(id)
        ON DELETE CASCADE,
    CONSTRAINT fk_team_members_member
        FOREIGN KEY (member_id)
        REFERENCES members(id)
        ON DELETE CASCADE
);
