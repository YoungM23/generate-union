package com.reco.generate.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constant {

    private static String ip;

    private static Integer port;

    private static String username;

    private static String password;

    private static String remoteJspPath;

    private static String remoteActImgPath;

    private static String remoteActIconPath;

    private static String remoteActFiconPath;

    private static String tempPath;

    @Value("${spring.ssh.ipAddress}")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Value("${spring.ssh.port}")
    public void setPort(int port) {
        this.port = port;
    }

    @Value("${spring.ssh.username}")
    public void setUsername(String username) {
        this.username = username;
    }

    @Value("${spring.ssh.password}")
    public void setPassword(String password) {
        this.password = password;
    }

    @Value("${spring.file.remoteJspPath}")
    public void setRemotePath(String remoteJspPath) {
        this.remoteJspPath = remoteJspPath;
    }

    @Value("${spring.file.remoteJspPath}")
    public void setRemoteJspPath(String remoteJspPath) {
        this.remoteJspPath = remoteJspPath;
    }

    @Value("${spring.file.remoteActImgPath}")
    public void setRemoteActImgPath(String remoteActImgPath) {
        this.remoteActImgPath = remoteActImgPath;
    }

    @Value("${spring.file.remoteActIconPath}")
    public void setRemoteActIconPath(String remoteActIconPath) {
        this.remoteActIconPath = remoteActIconPath;
    }

    @Value("${spring.file.remoteActFiconPath}")
    public void setRemoteActFiconPath(String remoteActFiconPath) {
        this.remoteActFiconPath = remoteActFiconPath;
    }

    @Value("${spring.file.tempPath}")
    public void setTempPath(String tempPath) {
        this.tempPath = tempPath;
    }

    public static String getIp() {
        return ip;
    }

    public static Integer getPort() {
        return port;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static String getRemoteJspPath() {
        return remoteJspPath;
    }

    public static String getRemoteActImgPath() {
        return remoteActImgPath;
    }

    public static String getRemoteActIconPath() {
        return remoteActIconPath;
    }

    public static String getRemoteActFiconPath() {
        return remoteActFiconPath;
    }

    public static String getTempPath() {
        return tempPath;
    }
}