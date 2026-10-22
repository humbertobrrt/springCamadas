CREATE TABLE aluno
(
    id     INT          NOT NULL,
    nome   VARCHAR(255) NULL,
    trilha VARCHAR(255) NULL,
    CONSTRAINT pk_aluno PRIMARY KEY (id)
);