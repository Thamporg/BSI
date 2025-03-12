DROP SCHEMA IF EXISTS quiz;  
CREATE DATABASE IF NOT EXISTS quiz;  

USE quiz;  

CREATE TABLE questoes (  
    id INT AUTO_INCREMENT PRIMARY KEY,  
    pergunta VARCHAR(255),  
    op_a VARCHAR(255),  
    op_b VARCHAR(255),  
    op_c VARCHAR(255),  
    op_d VARCHAR(255),  
    resposta CHAR(1),  
    dificuldade VARCHAR(20)  
);  

CREATE TABLE placar (  
    id INT AUTO_INCREMENT PRIMARY KEY,  
    nome VARCHAR(50),  
    pontuacao INT  
);  

INSERT INTO questoes (pergunta, op_a, op_b, op_c, op_d, resposta, dificuldade) VALUES  
('Qual das seguintes linguagens é uma linguagem de programação orientada a objetos?', 'Python', 'HTML', 'CSS', 'SQL', 'a', 'fácil'),  
('O que significa a sigla "HTML"?', 'Hyper Text Markup Language', 'High Text Markup Language', 'Hyper Text Markup Language', 'Hyper Transfer Markup Language', 'a', 'fácil'),  
('Qual é a extensão de arquivos para scripts Python?', '.py', '.java', '.php', '.html', 'a', 'fácil'),  
('Qual comando é usado para imprimir no console em Python?', 'output()', 'echo()', 'print()', 'log()', 'c', 'fácil'),  

('O que é um loop "for" em programação?', 'Um tipo de variável', 'Uma estrutura de repetição', 'Uma função', 'Um erro', 'b', 'médio'),  
('Qual dos seguintes tipos de dados é imutável em Python?', 'List', 'Dictionary', 'Tuple', 'Set', 'c', 'médio'),  
('Qual é o operador para exponenciação em Python?', 'exp', '^', '^', '**', 'd', 'médio'),  
('Qual palavra-chave é usada para criar uma classe em Java?', 'define', 'class', 'new', 'object', 'b', 'médio'),  

('Em SQL, qual comando é usado para atualizar dados em uma tabela?', 'UPDATE', 'ALTER', 'MODIFY', 'CHANGE', 'a', 'difícil'),  
('O que significa IDE no contexto de programação?', 'Integrated Development Environment', 'Internal Data Execution', 'Interactive Data Editor', 'Integrated Debugging Environment', 'a', 'difícil'),  
('Qual dos seguintes é um framework para desenvolvimento web?', 'Django', 'SQL', 'HTML', 'Python', 'a', 'difícil'),  
('Qual dos seguintes é um banco de dados relacional?', 'MongoDB', 'MySQL', 'Redis', 'Elasticsearch', 'b', 'difícil');