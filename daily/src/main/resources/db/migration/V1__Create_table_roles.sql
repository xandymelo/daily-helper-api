CREATE TABLE roles (
    id VARCHAR(255) NOT NULL,
    uuid UUID NOT NULL,
    removed_at TIMESTAMP,
    updated_at TIMESTAMP,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id, uuid)
);