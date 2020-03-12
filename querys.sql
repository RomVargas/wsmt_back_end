create database management_status_tool;

select * from app_user;

select * from user_authorities;

select * from roles_cat ;

insert into app_user values ();

insert into roles_cat values (1,true,'ROLE_ADMIN');

select * from user_authorities;

insert into app_user (id_user,name,last_name,user_name,email,password, enabled,role_id) values (
   1,
   'Roman',
   'Vargas',
   'rvargas',
   'romvargas81@gmail.com',
   'buceta69',
   true,
   1
);
insert into user_authorities values(1,1);

select appuser0_.id_user as id_user1_1_, appuser0_.email as email2_1_, appuser0_.enabled as enabled3_1_, appuser0_.role_id as role_id4_1_, appuser0_.last_name as last_nam5_1_, appuser0_.name as name6_1_, appuser0_.password as password7_1_, appuser0_.user_name as user_nam8_1_ from app_user appuser0_ where appuser0_.user_name='rvargas'

select role0_.user_id as user_id1_11_0_, role0_.role_id as role_id2_11_0_, role1_.role_id as role_id1_10_1_, role1_.enabled as enabled2_10_1_, role1_.name_role as name_rol3_10_1_ from user_authorities role0_ inner join roles_cat role1_ on role0_.role_id=role1_.role_id where role0_.user_id=1