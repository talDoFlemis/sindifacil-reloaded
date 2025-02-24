CREATE TABLE addresses
(
    id           BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    street       VARCHAR(255),
    number       VARCHAR(255),
    zip_code     VARCHAR(255),
    complement   VARCHAR(255),
    neighborhood VARCHAR(255),
    CONSTRAINT pk_addresses PRIMARY KEY (id)
);

CREATE TABLE authorities
(
    id        VARCHAR NOT NULL,
    authority VARCHAR(255),
    CONSTRAINT pk_authorities PRIMARY KEY (id)
);

CREATE TABLE bank_slips
(
    id             BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    code           VARCHAR(255),
    due_date       TIMESTAMP WITHOUT TIME ZONE,
    emission_date  TIMESTAMP WITHOUT TIME ZONE,
    status         SMALLINT,
    joint_owner_id UUID                                    NOT NULL,
    CONSTRAINT pk_bank_slips PRIMARY KEY (id)
);

CREATE TABLE comment_attachments
(
    key        VARCHAR(255)             NOT NULL,
    file_name  VARCHAR(255),
    mime_type  VARCHAR(255),
    byte_size  BIGINT,
    created_at TIMESTAMP with time zone NOT NULL,
    checksum   VARCHAR(255),
    comment_id BIGINT                   NOT NULL,
    CONSTRAINT pk_comment_attachments PRIMARY KEY (key)
);

CREATE TABLE comment_replies
(
    comment_id         BIGINT NOT NULL,
    comment_replied_id BIGINT,
    CONSTRAINT pk_comment_replies PRIMARY KEY (comment_id)
);

CREATE TABLE comments
(
    id          BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    user_cpf    UUID                                    NOT NULL,
    rich_text   VARCHAR(255),
    like_amount BIGINT,
    ticket_id   BIGINT,
    CONSTRAINT pk_comments PRIMARY KEY (id)
);

CREATE TABLE condominiums
(
    id         BIGINT NOT NULL,
    name       VARCHAR(255),
    cpf        UUID,
    address_id BIGINT NOT NULL,
    CONSTRAINT pk_condominiums PRIMARY KEY (id)
);

CREATE TABLE joint_owners
(
    joint_owner_id UUID NOT NULL,
    CONSTRAINT pk_joint_owners PRIMARY KEY (joint_owner_id)
);

CREATE TABLE newsletter_categories
(
    id   BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_newsletter_categories PRIMARY KEY (id)
);

CREATE TABLE newsletters
(
    id             BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    condominium_id BIGINT,
    text           VARCHAR(255),
    category_id    BIGINT,
    CONSTRAINT pk_newsletters PRIMARY KEY (id)
);

CREATE TABLE properties
(
    id                         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    address_id                 BIGINT,
    condominium_id             BIGINT,
    joint_owner_joint_owner_id UUID,
    CONSTRAINT pk_properties PRIMARY KEY (id)
);

CREATE TABLE provider_reviews
(
    id                   BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    provider_provider_id UUID,
    punctuality          FLOAT,
    proficiency          FLOAT,
    cost                 FLOAT,
    review               VARCHAR(255),
    reviewer_id          UUID                                    NOT NULL,
    CONSTRAINT pk_provider_reviews PRIMARY KEY (id)
);

CREATE TABLE providers
(
    provider_id       UUID NOT NULL,
    office_address_id BIGINT,
    CONSTRAINT pk_providers PRIMARY KEY (provider_id)
);

CREATE TABLE service_categories
(
    id   BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_service_categories PRIMARY KEY (id)
);

CREATE TABLE service_providers
(
    billing_rate_per_hour VARCHAR(255),
    description           VARCHAR(255),
    experience_in_months  BIGINT,
    service_id            BIGINT NOT NULL,
    provider_provider_id  UUID   NOT NULL,
    CONSTRAINT pk_service_providers PRIMARY KEY (service_id, provider_provider_id)
);

CREATE TABLE service_request_attachments
(
    key                VARCHAR(255)             NOT NULL,
    file_name          VARCHAR(255),
    mime_type          VARCHAR(255),
    byte_size          BIGINT,
    created_at         TIMESTAMP with time zone NOT NULL,
    checksum           VARCHAR(255),
    service_request_id BIGINT                   NOT NULL,
    CONSTRAINT pk_service_request_attachments PRIMARY KEY (key)
);

CREATE TABLE service_request_reviews
(
    id                 BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    service_request_id BIGINT                                  NOT NULL,
    reviewer_id        UUID                                    NOT NULL,
    rating             BIGINT                                  NOT NULL,
    review             VARCHAR(255)                            NOT NULL,
    CONSTRAINT pk_service_request_reviews PRIMARY KEY (id)
);

CREATE TABLE service_requests
(
    id                  BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    service_provider_id UUID                                    NOT NULL,
    ticket_id           BIGINT                                  NOT NULL,
    hours_worked        BIGINT,
    started_at          TIMESTAMP with time zone                NOT NULL,
    finished_at         TIMESTAMP with time zone                NOT NULL,
    CONSTRAINT pk_service_requests PRIMARY KEY (id)
);

CREATE TABLE services
(
    id          BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name        VARCHAR(255),
    category_id BIGINT,
    CONSTRAINT pk_services PRIMARY KEY (id)
);

CREATE TABLE sindifacil_managers
(
    user_id UUID NOT NULL,
    CONSTRAINT pk_sindifacil_managers PRIMARY KEY (user_id)
);

CREATE TABLE syndics
(
    syndic_id      UUID NOT NULL,
    condominium_id BIGINT,
    CONSTRAINT pk_syndics PRIMARY KEY (syndic_id)
);

CREATE TABLE ticket
(
    id          BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    creator_id  UUID,
    title       VARCHAR(255),
    description VARCHAR(255),
    status      VARCHAR(255),
    CONSTRAINT pk_ticket PRIMARY KEY (id)
);

CREATE TABLE ticket_attachments
(
    key        VARCHAR(255)             NOT NULL,
    file_name  VARCHAR(255),
    mime_type  VARCHAR(255),
    byte_size  BIGINT,
    created_at TIMESTAMP with time zone NOT NULL,
    checksum   VARCHAR(255),
    ticket_id  BIGINT                   NOT NULL,
    CONSTRAINT pk_ticket_attachments PRIMARY KEY (key)
);

CREATE TABLE users
(
    id                      UUID   NOT NULL,
    password                VARCHAR(255),
    cpf                     VARCHAR(255),
    email                   VARCHAR(255),
    address_id              BIGINT NOT NULL,
    cellphone               VARCHAR(255),
    name                    VARCHAR(255),
    picture                 VARCHAR(255),
    username                VARCHAR(255),
    account_non_expired     BOOLEAN,
    account_non_locked      BOOLEAN,
    credentials_non_expired BOOLEAN,
    provider                VARCHAR(255),
    provider_id             VARCHAR(255),
    enabled                 BOOLEAN,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

CREATE TABLE users_authorities
(
    authorities_id VARCHAR NOT NULL,
    users_id       UUID    NOT NULL,
    CONSTRAINT pk_users_authorities PRIMARY KEY (authorities_id, users_id)
);

ALTER TABLE bank_slips
    ADD CONSTRAINT uc_bank_slips_joint_owner UNIQUE (joint_owner_id);

ALTER TABLE comments
    ADD CONSTRAINT uc_comments_user_cpf UNIQUE (user_cpf);

ALTER TABLE condominiums
    ADD CONSTRAINT uc_condominiums_address UNIQUE (address_id);

ALTER TABLE condominiums
    ADD CONSTRAINT uc_condominiums_cpf UNIQUE (cpf);

ALTER TABLE properties
    ADD CONSTRAINT uc_properties_address UNIQUE (address_id);

ALTER TABLE provider_reviews
    ADD CONSTRAINT uc_provider_reviews_reviewer UNIQUE (reviewer_id);

ALTER TABLE service_request_reviews
    ADD CONSTRAINT uc_service_request_reviews_reviewer UNIQUE (reviewer_id);

ALTER TABLE service_requests
    ADD CONSTRAINT uc_service_requests_service_provider UNIQUE (service_provider_id);

ALTER TABLE syndics
    ADD CONSTRAINT uc_syndics_condominium UNIQUE (condominium_id);

ALTER TABLE users
    ADD CONSTRAINT uc_users_address UNIQUE (address_id);

ALTER TABLE users_authorities
    ADD CONSTRAINT uc_users_authorities_authorities UNIQUE (authorities_id);

ALTER TABLE users
    ADD CONSTRAINT uc_users_username UNIQUE (username);

ALTER TABLE bank_slips
    ADD CONSTRAINT FK_BANK_SLIPS_ON_JOINT_OWNER FOREIGN KEY (joint_owner_id) REFERENCES joint_owners (joint_owner_id);

ALTER TABLE comments
    ADD CONSTRAINT FK_COMMENTS_ON_TICKET FOREIGN KEY (ticket_id) REFERENCES ticket (id);

ALTER TABLE comments
    ADD CONSTRAINT FK_COMMENTS_ON_USER_CPF FOREIGN KEY (user_cpf) REFERENCES users (id);

ALTER TABLE comment_attachments
    ADD CONSTRAINT FK_COMMENT_ATTACHMENTS_ON_COMMENT FOREIGN KEY (comment_id) REFERENCES comments (id);

ALTER TABLE comment_replies
    ADD CONSTRAINT FK_COMMENT_REPLIES_ON_COMMENT FOREIGN KEY (comment_id) REFERENCES comments (id);

ALTER TABLE comment_replies
    ADD CONSTRAINT FK_COMMENT_REPLIES_ON_COMMENTREPLIED FOREIGN KEY (comment_replied_id) REFERENCES comments (id);

ALTER TABLE condominiums
    ADD CONSTRAINT FK_CONDOMINIUMS_ON_ADDRESS FOREIGN KEY (address_id) REFERENCES addresses (id);

ALTER TABLE condominiums
    ADD CONSTRAINT FK_CONDOMINIUMS_ON_CPF FOREIGN KEY (cpf) REFERENCES syndics (syndic_id);

ALTER TABLE joint_owners
    ADD CONSTRAINT FK_JOINT_OWNERS_ON_JOINT_OWNER FOREIGN KEY (joint_owner_id) REFERENCES users (id);

ALTER TABLE newsletters
    ADD CONSTRAINT FK_NEWSLETTERS_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES newsletter_categories (id);

ALTER TABLE newsletters
    ADD CONSTRAINT FK_NEWSLETTERS_ON_CONDOMINIUM FOREIGN KEY (condominium_id) REFERENCES condominiums (id);

ALTER TABLE properties
    ADD CONSTRAINT FK_PROPERTIES_ON_ADDRESS FOREIGN KEY (address_id) REFERENCES addresses (id);

ALTER TABLE properties
    ADD CONSTRAINT FK_PROPERTIES_ON_CONDOMINIUM FOREIGN KEY (condominium_id) REFERENCES condominiums (id);

ALTER TABLE properties
    ADD CONSTRAINT FK_PROPERTIES_ON_JOINTOWNER_JOINT_OWNER FOREIGN KEY (joint_owner_joint_owner_id) REFERENCES joint_owners (joint_owner_id);

ALTER TABLE providers
    ADD CONSTRAINT FK_PROVIDERS_ON_OFFICEADDRESS FOREIGN KEY (office_address_id) REFERENCES addresses (id);

ALTER TABLE providers
    ADD CONSTRAINT FK_PROVIDERS_ON_PROVIDER FOREIGN KEY (provider_id) REFERENCES users (id);

ALTER TABLE provider_reviews
    ADD CONSTRAINT FK_PROVIDER_REVIEWS_ON_PROVIDER_PROVIDER FOREIGN KEY (provider_provider_id) REFERENCES providers (provider_id);

ALTER TABLE provider_reviews
    ADD CONSTRAINT FK_PROVIDER_REVIEWS_ON_REVIEWER FOREIGN KEY (reviewer_id) REFERENCES users (id);

ALTER TABLE services
    ADD CONSTRAINT FK_SERVICES_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES service_categories (id);

ALTER TABLE service_providers
    ADD CONSTRAINT FK_SERVICE_PROVIDERS_ON_PROVIDER_PROVIDER FOREIGN KEY (provider_provider_id) REFERENCES providers (provider_id);

ALTER TABLE service_providers
    ADD CONSTRAINT FK_SERVICE_PROVIDERS_ON_SERVICE FOREIGN KEY (service_id) REFERENCES services (id);

ALTER TABLE service_requests
    ADD CONSTRAINT FK_SERVICE_REQUESTS_ON_SERVICE_PROVIDER FOREIGN KEY (service_provider_id) REFERENCES providers (provider_id);

ALTER TABLE service_requests
    ADD CONSTRAINT FK_SERVICE_REQUESTS_ON_TICKET FOREIGN KEY (ticket_id) REFERENCES ticket (id);

ALTER TABLE service_request_attachments
    ADD CONSTRAINT FK_SERVICE_REQUEST_ATTACHMENTS_ON_SERVICE_REQUEST FOREIGN KEY (service_request_id) REFERENCES service_requests (id);

ALTER TABLE service_request_reviews
    ADD CONSTRAINT FK_SERVICE_REQUEST_REVIEWS_ON_REVIEWER FOREIGN KEY (reviewer_id) REFERENCES joint_owners (joint_owner_id);

ALTER TABLE service_request_reviews
    ADD CONSTRAINT FK_SERVICE_REQUEST_REVIEWS_ON_SERVICEREQUEST FOREIGN KEY (service_request_id) REFERENCES service_requests (id);

ALTER TABLE sindifacil_managers
    ADD CONSTRAINT FK_SINDIFACIL_MANAGERS_ON_USER FOREIGN KEY (user_id) REFERENCES users (id);

ALTER TABLE syndics
    ADD CONSTRAINT FK_SYNDICS_ON_CONDOMINIUM FOREIGN KEY (condominium_id) REFERENCES condominiums (id);

ALTER TABLE syndics
    ADD CONSTRAINT FK_SYNDICS_ON_SYNDIC FOREIGN KEY (syndic_id) REFERENCES users (id);

ALTER TABLE ticket_attachments
    ADD CONSTRAINT FK_TICKET_ATTACHMENTS_ON_TICKET FOREIGN KEY (ticket_id) REFERENCES ticket (id);

ALTER TABLE ticket
    ADD CONSTRAINT FK_TICKET_ON_CREATOR FOREIGN KEY (creator_id) REFERENCES users (id);

ALTER TABLE users
    ADD CONSTRAINT FK_USERS_ON_ADDRESS FOREIGN KEY (address_id) REFERENCES addresses (id);

ALTER TABLE users_authorities
    ADD CONSTRAINT fk_useaut_on_authority_entity FOREIGN KEY (authorities_id) REFERENCES authorities (id);

ALTER TABLE users_authorities
    ADD CONSTRAINT fk_useaut_on_user_entity FOREIGN KEY (users_id) REFERENCES users (id);