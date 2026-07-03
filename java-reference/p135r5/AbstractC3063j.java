package p135r5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import p015b6.C0304k;
import p065i2.AbstractC2064e;
import p066i3.AbstractC2067b;
import p068i5.AbstractC2080d;
import p073j2.AbstractC2168e;
import p158u5.AbstractC3367j;

/* renamed from: r5.j */
/* loaded from: classes.dex */
public abstract class AbstractC3063j extends AbstractC2064e {
    /* renamed from: L */
    public static void m4735L(File file, File file2) {
        if (file.exists()) {
            if (file2.exists() && !file2.delete()) {
                throw new C3055b(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
            if (file.isDirectory()) {
                if (file2.mkdirs()) {
                    return;
                } else {
                    throw new C3055b(file, file2, "Failed to create target directory.");
                }
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    AbstractC2080d.m3398k(fileInputStream, fileOutputStream);
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2168e.m3526m(fileInputStream, th);
                    throw th2;
                }
            }
        } else {
            throw new C3055b(file, null, "The source file doesn't exist.");
        }
    }

    /* renamed from: M */
    public static void m4736M(File file) {
        AbstractC3367j.m5100e(file, "<this>");
        C3060g c3060g = new C3060g(new C0304k(file));
        while (true) {
            boolean z7 = true;
            while (c3060g.hasNext()) {
                File file2 = (File) c3060g.next();
                if (file2.delete() || !file2.exists()) {
                    if (z7) {
                        break;
                    }
                }
                z7 = false;
            }
            return;
        }
    }

    /* renamed from: N */
    public static String m4737N(File file, Charset charset) {
        AbstractC3367j.m5100e(file, "<this>");
        AbstractC3367j.m5100e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String m3296u = AbstractC2067b.m3296u(inputStreamReader);
            inputStreamReader.close();
            return m3296u;
        } finally {
        }
    }

    /* renamed from: O */
    public static void m4738O(File file, String str, Charset charset) {
        AbstractC3367j.m5100e(str, "text");
        AbstractC3367j.m5100e(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            m4739P(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    /* renamed from: P */
    public static final void m4739P(FileOutputStream fileOutputStream, String str, Charset charset) {
        boolean z7;
        AbstractC3367j.m5100e(str, "text");
        AbstractC3367j.m5100e(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            AbstractC3367j.m5099d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        AbstractC3367j.m5097b(onUnmappableCharacter);
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        AbstractC3367j.m5099d(allocate2, "allocate(...)");
        int i7 = 0;
        int i8 = 0;
        while (i7 < str.length()) {
            int min = Math.min(8192 - i8, str.length() - i7);
            int i9 = i7 + min;
            char[] array = allocate.array();
            AbstractC3367j.m5099d(array, "array(...)");
            str.getChars(i7, i9, array, i8);
            allocate.limit(min + i8);
            i8 = 1;
            if (i9 == str.length()) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (onUnmappableCharacter.encode(allocate, allocate2, z7).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i8 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i7 = i9;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }
}
