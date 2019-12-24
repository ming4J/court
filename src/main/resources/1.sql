create user court identified by court;
grant connect, resource,dba to court;


create table c_users (
       serialkey number not null primary key,
       username varchar2(50),
       password varchar2(50),
       email varchar2(100)
);
/
create sequence seq_c_users
minvalue 1
maxvalue 99999999999999
start with 1
increment by 1
cache 20;
/

create or replace trigger tri_c_users before insert on c_users for each row 
declare 
 begin 
   if:NEW.serialkey is null then
    select seq_c_users.nextval
    into :NEW.serialkey
    from dual; 
    end if;
    end;
    
    
/

create table c_law (
       serialkey number not null primary key,
       lawtit varchar2(100),
       lawdate Date,
       lawlink varchar2(100)
);
/
create sequence seq_c_law
minvalue 1
maxvalue 99999999999999
start with 1
increment by 1
cache 20;
/

create or replace trigger tri_c_law before insert on c_law for each row 
declare 
 begin 
   if:NEW.serialkey is null then
    select seq_c_law.nextval
    into :NEW.serialkey
    from dual; 
    end if;
    end;
/

create table c_sus (
       serialkey number not null primary key,
       sutit varchar2(100),
       sufile varchar2(4000)
);
/
create sequence seq_c_sus
minvalue 1
maxvalue 99999999999999
start with 1
increment by 1
cache 20;
/
create or replace trigger tri_c_sus before insert on c_sus for each row 
declare 
 begin 
   if:NEW.serialkey is null then
    select seq_c_sus.nextval
    into :NEW.serialkey
    from dual; 
    end if;
    end;
/
create table c_cp (
       serialkey number not null primary key,
       cptit varchar2(100),
       cpah varchar2(50),
       cpdate Date,
       cpfile varchar2(4000)     
);
/
create sequence seq_c_cp
minvalue 1
maxvalue 99999999999999
start with 1
increment by 1
cache 20;
/
create or replace trigger tri_c_cp before insert on c_cp for each row 
declare 
 begin 
   if:NEW.serialkey is null then
    select seq_c_cp.nextval
    into :NEW.serialkey
    from dual; 
    end if;
    end;
/

create table c_note (
       serialkey number not null primary key,
       note varchar2(500),
       nodate Date
);
/
create sequence seq_c_note
minvalue 1
maxvalue 99999999999999
start with 1
increment by 1
cache 20;
/
create or replace trigger tri_c_note before insert on c_note for each row 
declare 
 begin 
   if:NEW.serialkey is null then
    select seq_c_note.nextval
    into :NEW.serialkey
    from dual; 
    end if;
    end;
