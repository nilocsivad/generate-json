
drop table if exists tbl_company;

drop table if exists tbl_multipart_user;

drop table if exists tbl_reg_user_info;

drop table if exists tbl_token;

drop table if exists tbl_user_had_table;

/*==============================================================*/
/* Table: tbl_company                                           */
/*==============================================================*/
create table tbl_company
(
   companyID            int not null auto_increment comment 'Reference Company',
   name                 varchar(64) not null comment 'Company Name',
   address              varchar(64) comment 'Company Address',
   phone                varchar(16) not null comment 'Phone',
   primary key (companyID)
);

alter table tbl_company comment 'Reference Company';

/*==============================================================*/
/* Table: tbl_multipart_user                                    */
/*==============================================================*/
create table tbl_multipart_user
(
   uuid                 char(36) not null comment 'UUID',
   account              varchar(64) not null comment 'do login account',
   pwd                  varchar(32) not null comment 'password',
   status               int(4) not null default 100 comment 'status 100:Normal
            ',
   createDT             char(19) comment 'Create Date Time',
   type                 varchar(12) default 'Email' comment 'Type e.g.  QQ WeChat Phone Email'
);

alter table tbl_multipart_user comment 'multipart user / login table';

/*==============================================================*/
/* Table: tbl_reg_user_info                                     */
/*==============================================================*/
create table tbl_reg_user_info
(
   uuid                 char(36) not null comment 'UUID',
   companyID            int comment 'Reference Company',
   realname             varchar(32) comment 'Real Name',
   gender               char(2) comment 'Gender',
   primary key (uuid)
);

alter table tbl_reg_user_info comment 'user info';

/*==============================================================*/
/* Table: tbl_token                                             */
/*==============================================================*/
create table tbl_token
(
   uuid                 char(36) not null comment 'UUID',
   token                char(56) not null comment 'Token',
   startDT              char(19) not null comment 'Start Use Date Time',
   stopDT               char(19) not null comment 'Stop Use Date Time'
);

alter table tbl_token comment 'Onlien Vlidate Token';

/*==============================================================*/
/* Table: tbl_user_had_table                                    */
/*==============================================================*/
create table tbl_user_had_table
(
   uuid                 char(36) not null comment 'UUID',
   tblName              varchar(32) not null comment 'Table Name',
   href                 varchar(128) not null comment 'Link Url'
);
