package p164v3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p147t2.C3250c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v3.e */
/* loaded from: classes.dex */
public abstract class AbstractC3581e {

    /* renamed from: a */
    public static final C3250c f17203a = new C3250c(3);

    /* renamed from: b */
    public static final byte[] f17204b = {112, 114, 111, 0};

    /* renamed from: c */
    public static final byte[] f17205c = {112, 114, 109, 0};

    /* renamed from: d */
    public static final byte[] f17206d = {48, 49, 53, 0};

    /* renamed from: e */
    public static final byte[] f17207e = {48, 49, 48, 0};

    /* renamed from: f */
    public static final byte[] f17208f = {48, 48, 57, 0};

    /* renamed from: g */
    public static final byte[] f17209g = {48, 48, 53, 0};

    /* renamed from: h */
    public static final byte[] f17210h = {48, 48, 49, 0};

    /* renamed from: i */
    public static final byte[] f17211i = {48, 48, 49, 0};

    /* renamed from: j */
    public static final byte[] f17212j = {48, 48, 50, 0};

    /* renamed from: a */
    public static byte[] m5549a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m5550b(C3578b[] c3578bArr, byte[] bArr) {
        int i7 = 0;
        int i8 = 0;
        for (C3578b c3578b : c3578bArr) {
            i8 += ((((c3578b.f17200g * 2) + 7) & (-8)) / 8) + (c3578b.f17198e * 2) + m5552d(c3578b.f17194a, c3578b.f17195b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c3578b.f17199f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i8);
        if (Arrays.equals(bArr, f17208f)) {
            int length = c3578bArr.length;
            while (i7 < length) {
                C3578b c3578b2 = c3578bArr[i7];
                m5565q(byteArrayOutputStream, c3578b2, m5552d(c3578b2.f17194a, c3578b2.f17195b, bArr));
                m5564p(byteArrayOutputStream, c3578b2);
                i7++;
            }
        } else {
            for (C3578b c3578b3 : c3578bArr) {
                m5565q(byteArrayOutputStream, c3578b3, m5552d(c3578b3.f17194a, c3578b3.f17195b, bArr));
            }
            int length2 = c3578bArr.length;
            while (i7 < length2) {
                m5564p(byteArrayOutputStream, c3578bArr[i7]);
                i7++;
            }
        }
        if (byteArrayOutputStream.size() == i8) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i8);
    }

    /* renamed from: c */
    public static boolean m5551c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z7 = true;
            for (File file2 : listFiles) {
                if (m5551c(file2) && z7) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            return z7;
        }
        file.delete();
        return true;
    }

    /* renamed from: d */
    public static String m5552d(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = f17210h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f17209g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                        str3 = ":";
                    }
                    return AbstractC2487d.m4046j(sb, str3, str2);
                }
            } else {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    /* renamed from: e */
    public static void m5553e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: f */
    public static byte[] m5554f(InputStream inputStream, int i7) {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int read = inputStream.read(bArr, i8, i7 - i8);
            if (read >= 0) {
                i8 += read;
            } else {
                throw new IllegalStateException(AbstractC2647h.m4256b("Not enough bytes to read: ", i7));
            }
        }
        return bArr;
    }

    /* renamed from: g */
    public static int[] m5555g(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += (int) m5561m(byteArrayInputStream, 2);
            iArr[i9] = i8;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m5556h(FileInputStream fileInputStream, int i7, int i8) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i8];
            byte[] bArr2 = new byte[2048];
            int i9 = 0;
            int i10 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i9 < i7) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    try {
                        i10 += inflater.inflate(bArr, i10, i8 - i10);
                        i9 += read;
                    } catch (DataFormatException e7) {
                        throw new IllegalStateException(e7.getMessage());
                    }
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i9);
        } finally {
            inflater.end();
        }
    }

    /* renamed from: i */
    public static C3578b[] m5557i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C3578b[] c3578bArr) {
        byte[] bArr3 = f17211i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f17206d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m5561m = (int) m5561m(fileInputStream, 1);
                    byte[] m5556h = m5556h(fileInputStream, (int) m5561m(fileInputStream, 4), (int) m5561m(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m5556h);
                        try {
                            C3578b[] m5558j = m5558j(byteArrayInputStream, m5561m, c3578bArr);
                            byteArrayInputStream.close();
                            return m5558j;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, f17212j)) {
            int m5561m2 = (int) m5561m(fileInputStream, 2);
            byte[] m5556h2 = m5556h(fileInputStream, (int) m5561m(fileInputStream, 4), (int) m5561m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(m5556h2);
                try {
                    C3578b[] m5559k = m5559k(byteArrayInputStream2, bArr2, m5561m2, c3578bArr);
                    byteArrayInputStream2.close();
                    return m5559k;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    /* renamed from: j */
    public static C3578b[] m5558j(ByteArrayInputStream byteArrayInputStream, int i7, C3578b[] c3578bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C3578b[0];
        }
        if (i7 == c3578bArr.length) {
            String[] strArr = new String[i7];
            int[] iArr = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                int m5561m = (int) m5561m(byteArrayInputStream, 2);
                iArr[i8] = (int) m5561m(byteArrayInputStream, 2);
                strArr[i8] = new String(m5554f(byteArrayInputStream, m5561m), StandardCharsets.UTF_8);
            }
            for (int i9 = 0; i9 < i7; i9++) {
                C3578b c3578b = c3578bArr[i9];
                if (c3578b.f17195b.equals(strArr[i9])) {
                    int i10 = iArr[i9];
                    c3578b.f17198e = i10;
                    c3578b.f17201h = m5555g(byteArrayInputStream, i10);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c3578bArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* renamed from: k */
    public static C3578b[] m5559k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, C3578b[] c3578bArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new C3578b[0];
        }
        if (i7 == c3578bArr.length) {
            for (int i8 = 0; i8 < i7; i8++) {
                m5561m(byteArrayInputStream, 2);
                String str2 = new String(m5554f(byteArrayInputStream, (int) m5561m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m5561m = m5561m(byteArrayInputStream, 4);
                int m5561m2 = (int) m5561m(byteArrayInputStream, 2);
                C3578b c3578b = null;
                if (c3578bArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i9 = 0;
                    while (true) {
                        if (i9 >= c3578bArr.length) {
                            break;
                        }
                        if (c3578bArr[i9].f17195b.equals(str)) {
                            c3578b = c3578bArr[i9];
                            break;
                        }
                        i9++;
                    }
                }
                if (c3578b != null) {
                    c3578b.f17197d = m5561m;
                    int[] m5555g = m5555g(byteArrayInputStream, m5561m2);
                    if (Arrays.equals(bArr, f17210h)) {
                        c3578b.f17198e = m5561m2;
                        c3578b.f17201h = m5555g;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return c3578bArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* renamed from: l */
    public static C3578b[] m5560l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f17207e)) {
            int m5561m = (int) m5561m(fileInputStream, 1);
            byte[] m5556h = m5556h(fileInputStream, (int) m5561m(fileInputStream, 4), (int) m5561m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m5556h);
                try {
                    C3578b[] m5562n = m5562n(byteArrayInputStream, str, m5561m);
                    byteArrayInputStream.close();
                    return m5562n;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    /* renamed from: m */
    public static long m5561m(InputStream inputStream, int i7) {
        byte[] m5554f = m5554f(inputStream, i7);
        long j6 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j6 += (m5554f[i8] & 255) << (i8 * 8);
        }
        return j6;
    }

    /* renamed from: n */
    public static C3578b[] m5562n(ByteArrayInputStream byteArrayInputStream, String str, int i7) {
        int i8;
        int i9 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C3578b[0];
        }
        C3578b[] c3578bArr = new C3578b[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            int m5561m = (int) m5561m(byteArrayInputStream, 2);
            int m5561m2 = (int) m5561m(byteArrayInputStream, 2);
            c3578bArr[i10] = new C3578b(str, new String(m5554f(byteArrayInputStream, m5561m), StandardCharsets.UTF_8), m5561m(byteArrayInputStream, 4), m5561m2, (int) m5561m(byteArrayInputStream, 4), (int) m5561m(byteArrayInputStream, 4), new int[m5561m2], new TreeMap());
        }
        int i11 = 0;
        while (i11 < i7) {
            C3578b c3578b = c3578bArr[i11];
            int available = byteArrayInputStream.available();
            int i12 = c3578b.f17199f;
            int i13 = c3578b.f17200g;
            TreeMap treeMap = c3578b.f17202i;
            int i14 = available - i12;
            int i15 = i9;
            while (byteArrayInputStream.available() > i14) {
                i15 += (int) m5561m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i15), 1);
                int m5561m3 = (int) m5561m(byteArrayInputStream, 2);
                while (m5561m3 > 0) {
                    m5561m(byteArrayInputStream, 2);
                    int m5561m4 = (int) m5561m(byteArrayInputStream, 1);
                    if (m5561m4 != 6 && m5561m4 != 7) {
                        while (m5561m4 > 0) {
                            m5561m(byteArrayInputStream, 1);
                            int i16 = i9;
                            int i17 = i11;
                            for (int m5561m5 = (int) m5561m(byteArrayInputStream, 1); m5561m5 > 0; m5561m5--) {
                                m5561m(byteArrayInputStream, 2);
                            }
                            m5561m4--;
                            i9 = i16;
                            i11 = i17;
                        }
                    }
                    m5561m3--;
                    i9 = i9;
                    i11 = i11;
                }
            }
            int i18 = i9;
            int i19 = i11;
            if (byteArrayInputStream.available() == i14) {
                c3578b.f17201h = m5555g(byteArrayInputStream, c3578b.f17198e);
                BitSet valueOf = BitSet.valueOf(m5554f(byteArrayInputStream, (((i13 * 2) + 7) & (-8)) / 8));
                for (int i20 = i18; i20 < i13; i20++) {
                    if (valueOf.get(i20)) {
                        i8 = 2;
                    } else {
                        i8 = i18;
                    }
                    if (valueOf.get(i20 + i13)) {
                        i8 |= 4;
                    }
                    if (i8 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i20));
                        if (num == null) {
                            num = Integer.valueOf(i18);
                        }
                        treeMap.put(Integer.valueOf(i20), Integer.valueOf(i8 | num.intValue()));
                    }
                }
                i11 = i19 + 1;
                i9 = i18;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return c3578bArr;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: o */
    public static boolean m5563o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C3578b[] c3578bArr) {
        long j6;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f17206d;
        int i7 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                m5570v(byteArrayOutputStream2, c3578bArr.length);
                int i8 = 2;
                int i9 = 2;
                for (C3578b c3578b : c3578bArr) {
                    m5569u(byteArrayOutputStream2, c3578b.f17196c, 4);
                    m5569u(byteArrayOutputStream2, c3578b.f17197d, 4);
                    m5569u(byteArrayOutputStream2, c3578b.f17200g, 4);
                    String m5552d = m5552d(c3578b.f17194a, c3578b.f17195b, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = m5552d.getBytes(charset).length;
                    m5570v(byteArrayOutputStream2, length2);
                    i9 = i9 + 14 + length2;
                    byteArrayOutputStream2.write(m5552d.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i9 == byteArray.length) {
                    C3586j c3586j = new C3586j(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(c3586j);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < c3578bArr.length) {
                        try {
                            C3578b c3578b2 = c3578bArr[i10];
                            m5570v(byteArrayOutputStream3, i10);
                            m5570v(byteArrayOutputStream3, c3578b2.f17198e);
                            i11 = i11 + 4 + (c3578b2.f17198e * i8);
                            int[] iArr = c3578b2.f17201h;
                            int length3 = iArr.length;
                            int i12 = i7;
                            int i13 = i8;
                            int i14 = i12;
                            while (i14 < length3) {
                                int i15 = iArr[i14];
                                m5570v(byteArrayOutputStream3, i15 - i12);
                                i14++;
                                i12 = i15;
                            }
                            i10++;
                            i8 = i13;
                            i7 = 0;
                        } catch (Throwable th) {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i11 == byteArray2.length) {
                        C3586j c3586j2 = new C3586j(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(c3586j2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < c3578bArr.length) {
                            try {
                                C3578b c3578b3 = c3578bArr[i16];
                                Iterator it = c3578b3.f17202i.entrySet().iterator();
                                int i18 = 0;
                                while (it.hasNext()) {
                                    i18 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    m5566r(byteArrayOutputStream4, i18, c3578b3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        m5567s(byteArrayOutputStream4, c3578b3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        m5570v(byteArrayOutputStream3, i16);
                                        int length4 = byteArray3.length + 2 + byteArray4.length;
                                        int i19 = i17 + 6;
                                        ArrayList arrayList4 = arrayList3;
                                        m5569u(byteArrayOutputStream3, length4, 4);
                                        m5570v(byteArrayOutputStream3, i18);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i17 = i19 + length4;
                                        i16++;
                                        arrayList3 = arrayList4;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i17 == byteArray5.length) {
                            C3586j c3586j3 = new C3586j(4, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(c3586j3);
                            long j7 = 4;
                            long size = j7 + j7 + 4 + (arrayList2.size() * 16);
                            m5569u(byteArrayOutputStream, arrayList2.size(), 4);
                            int i20 = 0;
                            while (i20 < arrayList2.size()) {
                                C3586j c3586j4 = (C3586j) arrayList2.get(i20);
                                int i21 = c3586j4.f17222a;
                                byte[] bArr3 = c3586j4.f17223b;
                                if (i21 != 1) {
                                    if (i21 != 2) {
                                        if (i21 != 3) {
                                            if (i21 != 4) {
                                                if (i21 == 5) {
                                                    j6 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j6 = 3;
                                            }
                                        } else {
                                            j6 = 2;
                                        }
                                    } else {
                                        j6 = 1;
                                    }
                                } else {
                                    j6 = 0;
                                }
                                m5569u(byteArrayOutputStream, j6, 4);
                                m5569u(byteArrayOutputStream, size, 4);
                                if (c3586j4.f17224c) {
                                    long length5 = bArr3.length;
                                    byte[] m5549a = m5549a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(m5549a);
                                    m5569u(byteArrayOutputStream, m5549a.length, 4);
                                    m5569u(byteArrayOutputStream, length5, 4);
                                    length = m5549a.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    m5569u(byteArrayOutputStream, bArr3.length, 4);
                                    m5569u(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i20++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr4 = f17207e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] m5550b = m5550b(c3578bArr, bArr4);
            m5569u(byteArrayOutputStream, c3578bArr.length, 1);
            m5569u(byteArrayOutputStream, m5550b.length, 4);
            byte[] m5549a2 = m5549a(m5550b);
            m5569u(byteArrayOutputStream, m5549a2.length, 4);
            byteArrayOutputStream.write(m5549a2);
            return true;
        }
        byte[] bArr5 = f17209g;
        if (Arrays.equals(bArr, bArr5)) {
            m5569u(byteArrayOutputStream, c3578bArr.length, 1);
            for (C3578b c3578b4 : c3578bArr) {
                int size2 = c3578b4.f17202i.size() * 4;
                String m5552d2 = m5552d(c3578b4.f17194a, c3578b4.f17195b, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                m5570v(byteArrayOutputStream, m5552d2.getBytes(charset2).length);
                m5570v(byteArrayOutputStream, c3578b4.f17201h.length);
                m5569u(byteArrayOutputStream, size2, 4);
                m5569u(byteArrayOutputStream, c3578b4.f17196c, 4);
                byteArrayOutputStream.write(m5552d2.getBytes(charset2));
                Iterator it2 = c3578b4.f17202i.keySet().iterator();
                while (it2.hasNext()) {
                    m5570v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    m5570v(byteArrayOutputStream, 0);
                }
                for (int i23 : c3578b4.f17201h) {
                    m5570v(byteArrayOutputStream, i23);
                }
            }
            return true;
        }
        byte[] bArr6 = f17208f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] m5550b2 = m5550b(c3578bArr, bArr6);
            m5569u(byteArrayOutputStream, c3578bArr.length, 1);
            m5569u(byteArrayOutputStream, m5550b2.length, 4);
            byte[] m5549a3 = m5549a(m5550b2);
            m5569u(byteArrayOutputStream, m5549a3.length, 4);
            byteArrayOutputStream.write(m5549a3);
            return true;
        }
        byte[] bArr7 = f17210h;
        if (Arrays.equals(bArr, bArr7)) {
            m5570v(byteArrayOutputStream, c3578bArr.length);
            for (C3578b c3578b5 : c3578bArr) {
                String str = c3578b5.f17194a;
                TreeMap treeMap = c3578b5.f17202i;
                String m5552d3 = m5552d(str, c3578b5.f17195b, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                m5570v(byteArrayOutputStream, m5552d3.getBytes(charset3).length);
                m5570v(byteArrayOutputStream, treeMap.size());
                m5570v(byteArrayOutputStream, c3578b5.f17201h.length);
                m5569u(byteArrayOutputStream, c3578b5.f17196c, 4);
                byteArrayOutputStream.write(m5552d3.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    m5570v(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i24 : c3578b5.f17201h) {
                    m5570v(byteArrayOutputStream, i24);
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static void m5564p(ByteArrayOutputStream byteArrayOutputStream, C3578b c3578b) {
        m5567s(byteArrayOutputStream, c3578b);
        int i7 = c3578b.f17200g;
        int[] iArr = c3578b.f17201h;
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            m5570v(byteArrayOutputStream, i10 - i9);
            i8++;
            i9 = i10;
        }
        byte[] bArr = new byte[(((i7 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c3578b.f17202i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i11 = intValue / 8;
                bArr[i11] = (byte) (bArr[i11] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i12 = intValue + i7;
                int i13 = i12 / 8;
                bArr[i13] = (byte) ((1 << (i12 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: q */
    public static void m5565q(ByteArrayOutputStream byteArrayOutputStream, C3578b c3578b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        m5570v(byteArrayOutputStream, str.getBytes(charset).length);
        m5570v(byteArrayOutputStream, c3578b.f17198e);
        m5569u(byteArrayOutputStream, c3578b.f17199f, 4);
        m5569u(byteArrayOutputStream, c3578b.f17196c, 4);
        m5569u(byteArrayOutputStream, c3578b.f17200g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: r */
    public static void m5566r(ByteArrayOutputStream byteArrayOutputStream, int i7, C3578b c3578b) {
        int i8 = c3578b.f17200g;
        byte[] bArr = new byte[(((Integer.bitCount(i7 & (-2)) * i8) + 7) & (-8)) / 8];
        for (Map.Entry entry : c3578b.f17202i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i9 = 0;
            for (int i10 = 1; i10 <= 4; i10 <<= 1) {
                if (i10 != 1 && (i10 & i7) != 0) {
                    if ((i10 & intValue2) == i10) {
                        int i11 = (i9 * i8) + intValue;
                        int i12 = i11 / 8;
                        bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
                    }
                    i9++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: s */
    public static void m5567s(ByteArrayOutputStream byteArrayOutputStream, C3578b c3578b) {
        int i7 = 0;
        for (Map.Entry entry : c3578b.f17202i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m5570v(byteArrayOutputStream, intValue - i7);
                m5570v(byteArrayOutputStream, 0);
                i7 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5568t(Context context, Executor executor, InterfaceC3580d interfaceC3580d, boolean z7) {
        boolean z8;
        ?? r7;
        byte[] bArr;
        C3578b[] c3578bArr;
        C3578b[] c3578bArr2;
        C3578b[] c3578bArr3;
        byte[] bArr2;
        boolean z9;
        boolean z10;
        Throwable th;
        Throwable th2;
        boolean z11;
        boolean z12;
        ?? r72;
        boolean z13;
        C3577a c3577a;
        boolean z14;
        FileInputStream m5547a;
        boolean z15;
        boolean z16;
        boolean z17;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z7) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            if (readLong == packageInfo.lastUpdateTime) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                interfaceC3580d.mo4281h(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z17) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        AbstractC3585i.m5576c(context, false);
                        return;
                    }
                }
                z17 = false;
                if (z17) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C3577a c3577a2 = new C3577a(assets, executor, interfaceC3580d, name, file2);
            byte[] bArr3 = c3577a2.f17188c;
            if (bArr3 == null) {
                c3577a2.m5548b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c3577a2.m5548b(4, null);
                    }
                    c3577a2.f17191f = true;
                    try {
                        try {
                            r7 = c3577a2.m5547a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e7) {
                            interfaceC3580d.mo4281h(6, e7);
                            r7 = 0;
                            bArr = f17204b;
                            if (r7 != 0) {
                            }
                            c3578bArr2 = c3577a2.f17192g;
                            if (c3578bArr2 != null) {
                            }
                            InterfaceC3580d interfaceC3580d2 = c3577a2.f17187b;
                            c3578bArr3 = c3577a2.f17192g;
                            byte[] bArr4 = c3577a2.f17188c;
                            boolean z18 = r7;
                            z18 = r7;
                            if (c3578bArr3 != null) {
                            }
                            bArr2 = c3577a2.f17193h;
                            if (bArr2 != null) {
                            }
                            if (z10) {
                            }
                            z12 = z10;
                            z15 = z11;
                            if (!z12) {
                            }
                            z16 = false;
                            AbstractC3585i.m5576c(context, z16);
                        } catch (IOException e8) {
                            interfaceC3580d.mo4281h(7, e8);
                            r7 = 0;
                            bArr = f17204b;
                            if (r7 != 0) {
                            }
                            c3578bArr2 = c3577a2.f17192g;
                            if (c3578bArr2 != null) {
                            }
                            InterfaceC3580d interfaceC3580d22 = c3577a2.f17187b;
                            c3578bArr3 = c3577a2.f17192g;
                            byte[] bArr42 = c3577a2.f17188c;
                            boolean z182 = r7;
                            z182 = r7;
                            if (c3578bArr3 != null) {
                            }
                            bArr2 = c3577a2.f17193h;
                            if (bArr2 != null) {
                            }
                            if (z10) {
                            }
                            z12 = z10;
                            z15 = z11;
                            if (!z12) {
                            }
                            z16 = false;
                            AbstractC3585i.m5576c(context, z16);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e9) {
                                    interfaceC3580d.mo4281h(8, e9);
                                    try {
                                        r7.close();
                                    } catch (IOException e10) {
                                        interfaceC3580d.mo4281h(7, e10);
                                    }
                                    c3578bArr = null;
                                    c3577a2.f17192g = c3578bArr;
                                    c3578bArr2 = c3577a2.f17192g;
                                    if (c3578bArr2 != null) {
                                    }
                                    InterfaceC3580d interfaceC3580d222 = c3577a2.f17187b;
                                    c3578bArr3 = c3577a2.f17192g;
                                    byte[] bArr422 = c3577a2.f17188c;
                                    boolean z1822 = r7;
                                    z1822 = r7;
                                    if (c3578bArr3 != null) {
                                    }
                                    bArr2 = c3577a2.f17193h;
                                    if (bArr2 != null) {
                                    }
                                    if (z10) {
                                    }
                                    z12 = z10;
                                    z15 = z11;
                                    if (!z12) {
                                    }
                                    z16 = false;
                                    AbstractC3585i.m5576c(context, z16);
                                }
                            } catch (IOException e11) {
                                interfaceC3580d.mo4281h(7, e11);
                                r7.close();
                                c3578bArr = null;
                                c3577a2.f17192g = c3578bArr;
                                c3578bArr2 = c3577a2.f17192g;
                                if (c3578bArr2 != null) {
                                }
                                InterfaceC3580d interfaceC3580d2222 = c3577a2.f17187b;
                                c3578bArr3 = c3577a2.f17192g;
                                byte[] bArr4222 = c3577a2.f17188c;
                                boolean z18222 = r7;
                                z18222 = r7;
                                if (c3578bArr3 != null) {
                                }
                                bArr2 = c3577a2.f17193h;
                                if (bArr2 != null) {
                                }
                                if (z10) {
                                }
                                z12 = z10;
                                z15 = z11;
                                if (!z12) {
                                }
                                z16 = false;
                                AbstractC3585i.m5576c(context, z16);
                            }
                            if (Arrays.equals(bArr, m5554f(r7, 4))) {
                                c3578bArr = m5560l(r7, m5554f(r7, 4), c3577a2.f17190e);
                                try {
                                    r7.close();
                                } catch (IOException e12) {
                                    interfaceC3580d.mo4281h(7, e12);
                                }
                                c3577a2.f17192g = c3578bArr;
                            } else {
                                throw new IllegalStateException("Invalid magic");
                            }
                        }
                        c3578bArr2 = c3577a2.f17192g;
                        if (c3578bArr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                r7 = "dexopt/baseline.profm";
                                m5547a = c3577a2.m5547a(assets, "dexopt/baseline.profm");
                                z14 = r7;
                            } catch (FileNotFoundException e13) {
                                interfaceC3580d.mo4281h(9, e13);
                                z14 = r7;
                            } catch (IOException e14) {
                                interfaceC3580d.mo4281h(7, e14);
                                z14 = r7;
                            } catch (IllegalStateException e15) {
                                c3577a2.f17192g = null;
                                interfaceC3580d.mo4281h(8, e15);
                                z14 = r7;
                            }
                            if (m5547a == null) {
                                try {
                                    if (Arrays.equals(f17205c, m5554f(m5547a, 4))) {
                                        byte[] m5554f = m5554f(m5547a, 4);
                                        c3577a2.f17192g = m5557i(m5547a, m5554f, bArr3, c3578bArr2);
                                        m5547a.close();
                                        c3577a = c3577a2;
                                        r7 = m5554f;
                                        if (c3577a != null) {
                                            c3577a2 = c3577a;
                                        }
                                    } else {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                } finally {
                                }
                            } else {
                                if (m5547a != null) {
                                    m5547a.close();
                                    z14 = r7;
                                }
                                c3577a = null;
                                r7 = z14;
                                if (c3577a != null) {
                                }
                            }
                        }
                        InterfaceC3580d interfaceC3580d22222 = c3577a2.f17187b;
                        c3578bArr3 = c3577a2.f17192g;
                        byte[] bArr42222 = c3577a2.f17188c;
                        boolean z182222 = r7;
                        z182222 = r7;
                        if (c3578bArr3 != null && bArr42222 != null) {
                            r72 = c3577a2.f17191f;
                            if (r72 == 0) {
                                try {
                                    r72 = new ByteArrayOutputStream();
                                    try {
                                        r72.write(bArr);
                                        r72.write(bArr42222);
                                    } finally {
                                    }
                                } catch (IOException e16) {
                                    interfaceC3580d22222.mo4281h(7, e16);
                                    z13 = r72;
                                } catch (IllegalStateException e17) {
                                    interfaceC3580d22222.mo4281h(8, e17);
                                    z13 = r72;
                                }
                                if (!m5563o(r72, bArr42222, c3578bArr3)) {
                                    interfaceC3580d22222.mo4281h(5, null);
                                    c3577a2.f17192g = null;
                                    r72.close();
                                    z182222 = r72;
                                } else {
                                    c3577a2.f17193h = r72.toByteArray();
                                    r72.close();
                                    z13 = r72;
                                    c3577a2.f17192g = null;
                                    z182222 = z13;
                                }
                            } else {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                        }
                        bArr2 = c3577a2.f17193h;
                        if (bArr2 != null) {
                            z10 = false;
                            z11 = true;
                        } else {
                            try {
                                if (c3577a2.f17191f) {
                                    try {
                                        try {
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                            try {
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(c3577a2.f17189d);
                                                    try {
                                                        try {
                                                            FileChannel channel = fileOutputStream.getChannel();
                                                            try {
                                                                FileLock tryLock = channel.tryLock();
                                                                try {
                                                                    try {
                                                                        if (tryLock != null) {
                                                                            try {
                                                                                if (tryLock.isValid()) {
                                                                                    byte[] bArr5 = new byte[512];
                                                                                    while (true) {
                                                                                        int read = byteArrayInputStream.read(bArr5);
                                                                                        if (read <= 0) {
                                                                                            break;
                                                                                        } else {
                                                                                            fileOutputStream.write(bArr5, 0, read);
                                                                                        }
                                                                                    }
                                                                                    z11 = true;
                                                                                    c3577a2.m5548b(1, null);
                                                                                    tryLock.close();
                                                                                    channel.close();
                                                                                    fileOutputStream.close();
                                                                                    byteArrayInputStream.close();
                                                                                    c3577a2.f17193h = null;
                                                                                    c3577a2.f17192g = null;
                                                                                    z10 = true;
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                                Throwable th4 = th;
                                                                                if (tryLock != null) {
                                                                                    try {
                                                                                        tryLock.close();
                                                                                        throw th4;
                                                                                    } catch (Throwable th5) {
                                                                                        th4.addSuppressed(th5);
                                                                                        throw th4;
                                                                                    }
                                                                                }
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                        throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        Throwable th7 = th;
                                                                        if (channel != null) {
                                                                            try {
                                                                                channel.close();
                                                                                throw th7;
                                                                            } catch (Throwable th8) {
                                                                                th7.addSuppressed(th8);
                                                                                throw th7;
                                                                            }
                                                                        }
                                                                        throw th7;
                                                                    }
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            th2 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th2;
                                                            } catch (Throwable th12) {
                                                                th2.addSuppressed(th12);
                                                                throw th2;
                                                            }
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        th2 = th;
                                                        fileOutputStream.close();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    th = th;
                                                    try {
                                                        byteArrayInputStream.close();
                                                        throw th;
                                                    } catch (Throwable th15) {
                                                        th.addSuppressed(th15);
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                th = th;
                                                byteArrayInputStream.close();
                                                throw th;
                                            }
                                        } catch (FileNotFoundException e18) {
                                            e = e18;
                                            c3577a2.m5548b(6, e);
                                            z9 = z182222;
                                            z10 = false;
                                            z11 = z9;
                                            if (z10) {
                                            }
                                            z12 = z10;
                                            z15 = z11;
                                            if (!z12) {
                                            }
                                            z16 = false;
                                            AbstractC3585i.m5576c(context, z16);
                                        } catch (IOException e19) {
                                            e = e19;
                                            c3577a2.m5548b(7, e);
                                            z9 = z182222;
                                            z10 = false;
                                            z11 = z9;
                                            if (z10) {
                                            }
                                            z12 = z10;
                                            z15 = z11;
                                            if (!z12) {
                                            }
                                            z16 = false;
                                            AbstractC3585i.m5576c(context, z16);
                                        }
                                    } catch (FileNotFoundException e20) {
                                        e = e20;
                                        z182222 = true;
                                        c3577a2.m5548b(6, e);
                                        z9 = z182222;
                                        z10 = false;
                                        z11 = z9;
                                        if (z10) {
                                        }
                                        z12 = z10;
                                        z15 = z11;
                                        if (!z12) {
                                        }
                                        z16 = false;
                                        AbstractC3585i.m5576c(context, z16);
                                    } catch (IOException e21) {
                                        e = e21;
                                        z182222 = true;
                                        c3577a2.m5548b(7, e);
                                        z9 = z182222;
                                        z10 = false;
                                        z11 = z9;
                                        if (z10) {
                                        }
                                        z12 = z10;
                                        z15 = z11;
                                        if (!z12) {
                                        }
                                        z16 = false;
                                        AbstractC3585i.m5576c(context, z16);
                                    }
                                } else {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                            } finally {
                                c3577a2.f17193h = null;
                                c3577a2.f17192g = null;
                            }
                        }
                        if (z10) {
                            m5553e(packageInfo, filesDir);
                        }
                        z12 = z10;
                        z15 = z11;
                    } finally {
                    }
                    bArr = f17204b;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            c3577a2.m5548b(4, null);
                        }
                        c3577a2.f17191f = true;
                        r7 = c3577a2.m5547a(assets, "dexopt/baseline.prof");
                        bArr = f17204b;
                        if (r7 != 0) {
                        }
                        c3578bArr2 = c3577a2.f17192g;
                        if (c3578bArr2 != null) {
                            r7 = "dexopt/baseline.profm";
                            m5547a = c3577a2.m5547a(assets, "dexopt/baseline.profm");
                            z14 = r7;
                            if (m5547a == null) {
                            }
                        }
                        InterfaceC3580d interfaceC3580d222222 = c3577a2.f17187b;
                        c3578bArr3 = c3577a2.f17192g;
                        byte[] bArr422222 = c3577a2.f17188c;
                        boolean z1822222 = r7;
                        z1822222 = r7;
                        if (c3578bArr3 != null) {
                            r72 = c3577a2.f17191f;
                            if (r72 == 0) {
                            }
                        }
                        bArr2 = c3577a2.f17193h;
                        if (bArr2 != null) {
                        }
                        if (z10) {
                        }
                        z12 = z10;
                        z15 = z11;
                    } catch (IOException unused2) {
                        z8 = true;
                        c3577a2.m5548b(4, null);
                    }
                }
                if (!z12 && z7) {
                    z16 = z15;
                } else {
                    z16 = false;
                }
                AbstractC3585i.m5576c(context, z16);
            }
            z8 = true;
            z12 = false;
            z15 = z8;
            if (!z12) {
            }
            z16 = false;
            AbstractC3585i.m5576c(context, z16);
        } catch (PackageManager.NameNotFoundException e22) {
            interfaceC3580d.mo4281h(7, e22);
            AbstractC3585i.m5576c(context, false);
        }
    }

    /* renamed from: u */
    public static void m5569u(ByteArrayOutputStream byteArrayOutputStream, long j6, int i7) {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j6 >> (i8 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: v */
    public static void m5570v(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        m5569u(byteArrayOutputStream, i7, 2);
    }
}
