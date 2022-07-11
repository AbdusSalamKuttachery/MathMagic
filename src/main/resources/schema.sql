CREATE TABLE QUESTION_TEMPLATE (
 question_id BIGINT PRIMARY KEY,
 question_attribute_cnt BIGINT,
 question_structure VARCHAR(2000)
 );
 
 CREATE TABLE QUESTION_TEMPLATE_RULES (
 qrl_id BIGINT AUTO_INCREMENT PRIMARY KEY,
 qrl_parent_id BIGINT,
 qrl_seq_num INTEGER,
 qrl_min_method VARCHAR(50),
 qrl_max_method VARCHAR(50),
 qrl_min_expression VARCHAR(50),
 qrl_max_expression VARCHAR(50), 
 qrl_min_value INTEGER,
 qrl_max_value INTEGER,
 qrl_target_attribute INTEGER
 );
 
 CREATE TABLE SECURITY_ROLE (
 id BIGINT AUTO_INCREMENT PRIMARY KEY,
 description varchar(100) default null,
 role_name varchar(100) default null
 );
 
 
 CREATE TABLE SECURITY_USER (
 id BIGINT AUTO_INCREMENT PRIMARY KEY,
 username varchar(255) default null,
 password varchar(255) default null,
 first_name varchar(255) default null,
 last_name varchar(255) default null
 );
 
 CREATE TABLE USER_ROLE (
 user_id BIGINT NOT NULL,
 role_id BIGINT NOT NULL,
 CONSTRAINT FK_SECURITY_USER_ID FOREIGN KEY (user_id) REFERENCES security_user (id),
 CONSTRAINT FK_SECURITY_ROLE_ID FOREIGN KEY (role_id) REFERENCES security_role (id)
 );
 