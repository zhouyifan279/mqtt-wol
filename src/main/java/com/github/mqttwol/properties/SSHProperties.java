package com.github.mqttwol.properties;

/**
 * SSHProperties
 *
 * @author zhouyifan279
 * @since 2025/7/14
 */
public final class SSHProperties {

    public final static String HOST;
    public final static Integer PORT;
    public final static String USERNAME;
    public final static String PASSWORD;

    static {
        String address = System.getenv("SSH_HOST");
        if (address == null || address.isBlank()) {
            address = "127.0.0.1";
        }
        HOST = address;

        String port = System.getenv("SSH_PORT");
        if (port == null || port.isBlank()) {
            port = "22";
        }
        PORT = Integer.parseInt(port);

        String username = System.getenv("SSH_USERNAME");
        if (username == null || username.isBlank()) {
            username = "root";
        }
        USERNAME = username;

        String password = System.getenv("SSH_PASSWORD");
        if (password == null || password.isBlank()) {
            password = "pa55w0rd!";
        }
        PASSWORD = password;
    }

    public static String print() {
        return "SSH配置：{" +
                "host='" + HOST + '\'' +
                ", port=" + PORT +
                ", username='" + USERNAME + '\'' +
                ", password='" + PASSWORD + '\'' +
                '}';
    }

}
