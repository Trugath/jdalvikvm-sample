package com.github.trugath.jdvmsample;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * Created by Elliot on 14/05/2014.
 */
public class Util {
    static byte[] slurpBytesFromResource(final String filename) throws IOException {
        byte[] bytes = { 0 };
        DataInputStream in = null;
        try {
            in = new DataInputStream(new BufferedInputStream(Util.class.getResourceAsStream(filename)));
            bytes = new byte[in.available()];
            in.readFully(bytes);
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return bytes;
    }
}
