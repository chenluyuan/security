-- user
CREATE TABLE users (
  id BIGINT(20) UNSIGNED PRIMARY KEY NOT NULL COMMENT '自增主键' AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL COMMENT '用户名',
  password VARCHAR(500) NOT NULL COMMENT '密码',
  enabled TINYINT(4) DEFAULT '1' NOT NULL COMMENT '状态',
  salt VARCHAR(64) NOT NULL COMMENT '密码加盐',
  gmt_create DATETIME NOT NULL COMMENT '创建时间',
  gmt_modified DATETIME NOT NULL COMMENT '更新时间'
)ENGINE = innodb DEFAULT CHARACTER SET = utf8;
CREATE UNIQUE INDEX idx_username ON users (username);

CREATE TABLE authorities (
  id BIGINT(20) UNSIGNED PRIMARY KEY NOT NULL COMMENT '自增主键' AUTO_INCREMENT,
  authority VARCHAR(64) NOT NULL COMMENT '角色',
  description VARCHAR(255) NULL COMMENT '描述',
  gmt_create DATETIME NOT NULL COMMENT '创建时间',
  gmt_modified DATETIME NOT NULL COMMENT '更新时间'
)ENGINE = innodb DEFAULT CHARACTER SET = utf8;

CREATE TABLE groups (
  id BIGINT(20) UNSIGNED PRIMARY KEY NOT NULL COMMENT '自增主键' AUTO_INCREMENT,
  group_name VARCHAR(64) NOT NULL COMMENT '组名',
  description VARCHAR(255) NULL COMMENT '描述',
  gmt_create DATETIME NOT NULL COMMENT '创建时间',
  gmt_modified DATETIME NOT NULL COMMENT '更新时间'
)ENGINE = innodb DEFAULT CHARACTER SET = utf8;

CREATE TABLE user_authorities (
  id BIGINT(20) UNSIGNED PRIMARY KEY NOT NULL COMMENT '自增主键' AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL COMMENT '用户名',
  authority_id BIGINT(20) UNSIGNED NOT NULL COMMENT '角色ID',
  gmt_create DATETIME NOT NULL COMMENT '创建时间',
  gmt_modified DATETIME NOT NULL COMMENT '更新时间'
)ENGINE = innodb DEFAULT CHARACTER SET = utf8;
CREATE INDEX idx_authority_id ON user_authorities (authority_id);

CREATE TABLE group_authorities (
  id BIGINT(20) UNSIGNED PRIMARY KEY NOT NULL COMMENT '自增主键' AUTO_INCREMENT,
  group_id BIGINT(20) UNSIGNED NOT NULL COMMENT '组ID',
  authority VARCHAR(64) NOT NULL COMMENT '组角色',
  description VARCHAR(255) NULL COMMENT '描述',
  gmt_create DATETIME NOT NULL COMMENT '创建时间',
  gmt_modified DATETIME NOT NULL COMMENT '更新时间'
)ENGINE = innodb DEFAULT CHARACTER SET = utf8;
CREATE INDEX idx_group_a_id ON group_authorities (group_id);

CREATE TABLE group_members (
  id BIGINT(20) UNSIGNED PRIMARY KEY NOT NULL COMMENT '自增主键' AUTO_INCREMENT,
  group_id BIGINT(20) UNSIGNED NOT NULL COMMENT '组ID',
  username VARCHAR(50) NOT NULL COMMENT '用户名',
  gmt_create DATETIME NOT NULL COMMENT '创建时间',
  gmt_modified DATETIME NOT NULL COMMENT '更新时间'
)ENGINE = innodb DEFAULT CHARACTER SET = utf8;
CREATE INDEX idx_group_m_id ON group_members (group_id);

CREATE TABLE permissions (
  id BIGINT(20) UNSIGNED PRIMARY KEY NOT NULL COMMENT '自增主键' AUTO_INCREMENT,
  code VARCHAR(32) NOT NULL COMMENT '权限码',
  description VARCHAR(255) NULL COMMENT '描述',
  gmt_create DATETIME NOT NULL COMMENT '创建时间',
  gmt_modified DATETIME NOT NULL COMMENT '更新时间'
)ENGINE = innodb DEFAULT CHARACTER SET = utf8;

CREATE TABLE authority_permissions (
  id BIGINT(20) UNSIGNED PRIMARY KEY NOT NULL COMMENT '自增主键' AUTO_INCREMENT,
  authority_id BIGINT(20) UNSIGNED NOT NULL COMMENT '角色ID',
  permission_id BIGINT(20) UNSIGNED NOT NULL COMMENT '权限ID',
  gmt_create DATETIME NOT NULL COMMENT '创建时间',
  gmt_modified DATETIME NOT NULL COMMENT '更新时间'
)ENGINE = innodb DEFAULT CHARACTER SET = utf8;
CREATE INDEX idx_authority_p_id ON authority_permissions (authority_id);
CREATE INDEX idx_permission_id ON authority_permissions (permission_id);