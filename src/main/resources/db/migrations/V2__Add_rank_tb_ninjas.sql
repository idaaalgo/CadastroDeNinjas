-- V2: Migration pra adicionar a coluna de Rank na tabela tb_ninjas

ALTER TABLE TB_NINJAS
ADD COLUMN rank VARCHAR(255);