CREATE TABLE members (
    id BIGSERIAL PRIMARY KEY,
    uuid UUID UNIQUE NOT NULL,
    removed_at TIMESTAMP NULL,
    updated_at TIMESTAMP NOT NULL DEFAULT NOW(),
    created_at TIMESTAMP NOT NULL DEFAULT NOW(),
    name VARCHAR(255) NOT NULL,
    ip VARCHAR(45), -- comporta IPv4 e IPv6
    role_id INT,
    CONSTRAINT fk_members_role
        FOREIGN KEY (role_id) REFERENCES public.roles(id)
);
