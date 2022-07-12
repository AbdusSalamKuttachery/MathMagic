insert into QUESTION_TEMPLATE (question_id, question_attribute_cnt, question_structure) values 
(1,4,'Rida had %1 chocolates. She gives %2 to her sister Zara and eats %3 herself. If her Mom gives another %4 chocolates to her then how many chocolates she has now?');

insert into QUESTION_TEMPLATE_RULES ( qrl_parent_id, qrl_seq_num, qrl_min_method, qrl_max_method, qrl_min_expression, qrl_max_expression,  qrl_min_value, qrl_max_value, qrl_target_attribute) values 
(1,1,'Value', 'Value', null, null, 10, 100, 1),
(1,2,'Value', 'Index', null, null, 6, 1, 2),
(1,3,'Value', 'Expression', null, '%1 - %2', 1, 0, 3),
(1,4,'Value', 'Value', null, null, 1, 50, 4);

insert into QUESTION_TEMPLATE (question_id, question_attribute_cnt, question_structure) values 
(2,2,'Zara has %1 rupees If she has to buy a book which is priced %2 rupees then how much more she should borrow from her mother?');

insert into QUESTION_TEMPLATE_RULES ( qrl_parent_id, qrl_seq_num, qrl_min_method, qrl_max_method, qrl_min_expression, qrl_max_expression,  qrl_min_value, qrl_max_value, qrl_target_attribute) values 
(2,1,'Value', 'Value', null, null, 100, 999, 1),
(2,2,'Index', 'Value', null, null, 1, 1500, 2);