package io.coolshit.encrosync.utils;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import io.coolshit.encrosync.core.Peer;

public class SftpClient {
    private ChannelSftp client;

    SftpClient(Peer peer) throws JSchException {
        //TODO: CHANGE TO KEYS AND CONFIGURE MY SERVICE ACCOUNT ALONGSIDE CLOUD-INIT
        JSch jsch = new JSch();
        Session jschSession = jsch.getSession("ando-test", "");
        jschSession.connect();
        jschSession.connect();
        jschSession.openChannel("sftp");
    }
}