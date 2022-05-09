-- 用户表
CREATE TABLE `user` (
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
    `account` VARCHAR(64) NOT NULL COMMENT '登录名',
    `password` VARCHAR(64) NOT NULL COMMENT '密码',
    `name` varchar(64) NOT NULL COMMENT '昵称',
    `creator_id` BIGINT(20) NOT NULL COMMENT '创建人id',
    `creator_name` VARCHAR(64) NOT NULL COMMENT '创建人名称',
    `create_time` DATETIME(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
    `update_user_id` BIGINT(20) NOT NULL COMMENT '更新人id',
    `update_user_name` VARCHAR(64) NOT NULL COMMENT '更新人名称',
    `update_time` DATETIME(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
    PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户表';