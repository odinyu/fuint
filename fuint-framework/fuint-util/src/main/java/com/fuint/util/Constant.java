package com.fuint.util;

/**
 * 系统常量定义接口
 *
 * @author Harrison Han
 * @version $Id: Constant.java, v 0.1 2019年11月12日 下午1:13:42 Harrison Han Exp $
 */
public interface Constant {
    /**
     * 密码加密过程系统常量
     *
     * @author Harrison Han
     * @version $Id: Constant.java, v 0.1 2019年11月12日 下午1:18:13 Harrison Han Exp $
     */
    public interface SaltConstant {
        /**
         * sha1算法常量
         */
        public static final String HASH_ALGORITHM = "SHA-1";
        /**
         * sha次数
         */
        public static final int HASH_INTERATIONS = 1024;
        /**
         * 生成salt中随机的Byte[]的长度
         */
        public static final int SALT_SIZE = 8;

    }

    public interface sessionConstant {
        /**
         * 强制退出会话标识
         */
        public static final String SESSION_FORCE_LOGOUT_KEY = "session.force.logout";
    }

}
