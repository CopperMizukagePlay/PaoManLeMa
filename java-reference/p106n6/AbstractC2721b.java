package p106n6;

import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p006a7.AbstractC0117b;
import p006a7.C0129l;
import p006a7.C0130m;
import p006a7.C0136s;
import p006a7.InterfaceC0116a0;
import p006a7.InterfaceC0128k;
import p015b6.C0296c;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p024c6.C0442i;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p099m6.AbstractC2595c;
import p099m6.C2598d0;
import p099m6.C2600e0;
import p099m6.C2617r;
import p099m6.C2619t;
import p099m6.C2623x;
import p151t6.C3287b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n6.b */
/* loaded from: classes.dex */
public abstract class AbstractC2721b {

    /* renamed from: a */
    public static final byte[] f14569a;

    /* renamed from: b */
    public static final C2617r f14570b = AbstractC2595c.m4137k(new String[0]);

    /* renamed from: c */
    public static final C2600e0 f14571c;

    /* renamed from: d */
    public static final C0136s f14572d;

    /* renamed from: e */
    public static final TimeZone f14573e;

    /* renamed from: f */
    public static final C0442i f14574f;

    /* renamed from: g */
    public static final String f14575g;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x010e, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, a7.i] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, a7.i] */
    static {
        int i7 = 0;
        byte[] bArr = new byte[0];
        f14569a = bArr;
        ?? obj = new Object();
        obj.m5912write(bArr);
        long j6 = 0;
        f14571c = new C2600e0(j6, obj);
        m4357c(j6, j6, j6);
        C0130m c0130m = C0130m.f528h;
        C0130m[] c0130mArr = {C0129l.m277f("efbbbf"), C0129l.m277f("feff"), C0129l.m277f("fffe"), C0129l.m277f("0000ffff"), C0129l.m277f("ffff0000")};
        ArrayList m3032Y = AbstractC1804l.m3032Y(c0130mArr);
        if (m3032Y.size() > 1) {
            Collections.sort(m3032Y);
        }
        ArrayList arrayList = new ArrayList(5);
        for (int i8 = 0; i8 < 5; i8++) {
            C0130m c0130m2 = c0130mArr[i8];
            arrayList.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        ArrayList m3069Q = AbstractC1806n.m3069Q(Arrays.copyOf(numArr, numArr.length));
        int i9 = 0;
        int i10 = 0;
        while (i9 < 5) {
            m3069Q.set(AbstractC1806n.m3064L(m3032Y, c0130mArr[i9]), Integer.valueOf(i10));
            i9++;
            i10++;
        }
        if (((C0130m) m3032Y.get(0)).mo286c() > 0) {
            int i11 = 0;
            while (i11 < m3032Y.size()) {
                C0130m c0130m3 = (C0130m) m3032Y.get(i11);
                int i12 = i11 + 1;
                int i13 = i12;
                while (i13 < m3032Y.size()) {
                    C0130m c0130m4 = (C0130m) m3032Y.get(i13);
                    c0130m4.getClass();
                    AbstractC3367j.m5100e(c0130m3, "prefix");
                    if (c0130m4.mo290g(c0130m3.mo286c(), c0130m3)) {
                        if (c0130m4.mo286c() != c0130m3.mo286c()) {
                            if (((Number) m3069Q.get(i13)).intValue() > ((Number) m3069Q.get(i11)).intValue()) {
                                m3032Y.remove(i13);
                                m3069Q.remove(i13);
                            } else {
                                i13++;
                            }
                        } else {
                            throw new IllegalArgumentException(("duplicate option: " + c0130m4).toString());
                        }
                    }
                }
                i11 = i12;
            }
            ?? obj2 = new Object();
            AbstractC0117b.m218c(0L, obj2, 0, m3032Y, 0, m3032Y.size(), m3069Q);
            int[] iArr = new int[(int) (obj2.f524f / 4)];
            while (!obj2.m251c()) {
                iArr[i7] = obj2.readInt();
                i7++;
            }
            Object[] copyOf = Arrays.copyOf(c0130mArr, 5);
            AbstractC3367j.m5099d(copyOf, "copyOf(this, size)");
            f14572d = new C0136s((C0130m[]) copyOf, iArr);
            TimeZone timeZone = TimeZone.getTimeZone("GMT");
            AbstractC3367j.m5097b(timeZone);
            f14573e = timeZone;
            f14574f = new C0442i("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
            f14575g = AbstractC0444k.m944h0(AbstractC0444k.m943g0(C2623x.class.getName(), "okhttp3."), "Client");
            return;
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    /* renamed from: a */
    public static final boolean m4355a(C2619t c2619t, C2619t c2619t2) {
        AbstractC3367j.m5100e(c2619t, "<this>");
        AbstractC3367j.m5100e(c2619t2, "other");
        if (AbstractC3367j.m5096a(c2619t.f14154d, c2619t2.f14154d) && c2619t.f14155e == c2619t2.f14155e && AbstractC3367j.m5096a(c2619t.f14151a, c2619t2.f14151a)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final int m4356b(String str, long j6, TimeUnit timeUnit) {
        if (j6 >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j6);
                if (millis <= 2147483647L) {
                    if (millis == 0 && j6 > 0) {
                        throw new IllegalArgumentException(str.concat(" too small.").toString());
                    }
                    return (int) millis;
                }
                throw new IllegalArgumentException(str.concat(" too large.").toString());
            }
            throw new IllegalStateException("unit == null");
        }
        throw new IllegalStateException(str.concat(" < 0").toString());
    }

    /* renamed from: c */
    public static final void m4357c(long j6, long j7, long j8) {
        if ((j7 | j8) >= 0 && j7 <= j6 && j6 - j7 >= j8) {
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: d */
    public static final void m4358d(Closeable closeable) {
        AbstractC3367j.m5100e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final void m4359e(Socket socket) {
        AbstractC3367j.m5100e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e7) {
            throw e7;
        } catch (RuntimeException e8) {
            if (AbstractC3367j.m5096a(e8.getMessage(), "bio == null")) {
            } else {
                throw e8;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public static final int m4360f(int i7, int i8, String str, String str2) {
        while (i7 < i8) {
            if (AbstractC0444k.m929S(str2, str.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    /* renamed from: g */
    public static final int m4361g(String str, char c7, int i7, int i8) {
        while (i7 < i8) {
            if (str.charAt(i7) == c7) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    /* renamed from: h */
    public static /* synthetic */ int m4362h(String str, char c7, int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = str.length();
        }
        return m4361g(str, c7, i7, i8);
    }

    /* renamed from: i */
    public static final String m4363i(String str, Object... objArr) {
        AbstractC3367j.m5100e(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* renamed from: j */
    public static final boolean m4364j(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC3367j.m5100e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C0296c m5103h = AbstractC3367j.m5103h(strArr2);
                while (m5103h.hasNext()) {
                    if (comparator.compare(str, (String) m5103h.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public static final long m4365k(C2598d0 c2598d0) {
        String m4164a = c2598d0.f14061j.m4164a("Content-Length");
        if (m4164a == null) {
            return -1L;
        }
        try {
            return Long.parseLong(m4164a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: l */
    public static final List m4366l(Object... objArr) {
        AbstractC3367j.m5100e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(AbstractC1806n.m3067O(Arrays.copyOf(objArr2, objArr2.length)));
        AbstractC3367j.m5099d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: m */
    public static final int m4367m(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (AbstractC3367j.m5101f(charAt, 31) <= 0 || AbstractC3367j.m5101f(charAt, 127) >= 0) {
                return i7;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public static final int m4368n(int i7, int i8, String str) {
        while (i7 < i8) {
            char charAt = str.charAt(i7);
            if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                i7++;
            } else {
                return i7;
            }
        }
        return i8;
    }

    /* renamed from: o */
    public static final int m4369o(int i7, int i8, String str) {
        int i9 = i8 - 1;
        if (i7 <= i9) {
            while (true) {
                char charAt = str.charAt(i9);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i9 == i7) {
                        break;
                    }
                    i9--;
                } else {
                    return i9 + 1;
                }
            }
        }
        return i7;
    }

    /* renamed from: p */
    public static final String[] m4370p(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC3367j.m5100e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i7]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i7++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: q */
    public static final boolean m4371q(String str) {
        AbstractC3367j.m5100e(str, "name");
        if (!str.equalsIgnoreCase("Authorization") && !str.equalsIgnoreCase("Cookie") && !str.equalsIgnoreCase("Proxy-Authorization") && !str.equalsIgnoreCase("Set-Cookie")) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static final int m4372r(char c7) {
        if ('0' <= c7 && c7 < ':') {
            return c7 - '0';
        }
        if ('a' <= c7 && c7 < 'g') {
            return c7 - 'W';
        }
        if ('A' <= c7 && c7 < 'G') {
            return c7 - '7';
        }
        return -1;
    }

    /* renamed from: s */
    public static final Charset m4373s(InterfaceC0128k interfaceC0128k, Charset charset) {
        AbstractC3367j.m5100e(interfaceC0128k, "<this>");
        AbstractC3367j.m5100e(charset, "default");
        int mo269v = interfaceC0128k.mo269v(f14572d);
        if (mo269v != -1) {
            if (mo269v != 0) {
                if (mo269v != 1) {
                    if (mo269v != 2) {
                        if (mo269v != 3) {
                            if (mo269v == 4) {
                                Charset charset2 = AbstractC0434a.f1477a;
                                Charset charset3 = AbstractC0434a.f1479c;
                                if (charset3 == null) {
                                    Charset forName = Charset.forName("UTF-32LE");
                                    AbstractC3367j.m5099d(forName, "forName(...)");
                                    AbstractC0434a.f1479c = forName;
                                    return forName;
                                }
                                return charset3;
                            }
                            throw new AssertionError();
                        }
                        Charset charset4 = AbstractC0434a.f1477a;
                        Charset charset5 = AbstractC0434a.f1480d;
                        if (charset5 == null) {
                            Charset forName2 = Charset.forName("UTF-32BE");
                            AbstractC3367j.m5099d(forName2, "forName(...)");
                            AbstractC0434a.f1480d = forName2;
                            return forName2;
                        }
                        return charset5;
                    }
                    Charset charset6 = StandardCharsets.UTF_16LE;
                    AbstractC3367j.m5099d(charset6, "UTF_16LE");
                    return charset6;
                }
                Charset charset7 = StandardCharsets.UTF_16BE;
                AbstractC3367j.m5099d(charset7, "UTF_16BE");
                return charset7;
            }
            Charset charset8 = StandardCharsets.UTF_8;
            AbstractC3367j.m5099d(charset8, "UTF_8");
            return charset8;
        }
        return charset;
    }

    /* renamed from: t */
    public static final int m4374t(InterfaceC0128k interfaceC0128k) {
        AbstractC3367j.m5100e(interfaceC0128k, "<this>");
        return (interfaceC0128k.readByte() & 255) | ((interfaceC0128k.readByte() & 255) << 16) | ((interfaceC0128k.readByte() & 255) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, a7.i] */
    /* renamed from: u */
    public static final boolean m4375u(InterfaceC0116a0 interfaceC0116a0, int i7) {
        long j6;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC3367j.m5100e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (interfaceC0116a0.mo215a().mo229e()) {
            j6 = interfaceC0116a0.mo215a().mo228c() - nanoTime;
        } else {
            j6 = Long.MAX_VALUE;
        }
        interfaceC0116a0.mo215a().mo223d(Math.min(j6, timeUnit.toNanos(i7)) + nanoTime);
        try {
            ?? obj = new Object();
            while (interfaceC0116a0.mo214C(8192L, obj) != -1) {
                obj.skip(obj.f524f);
            }
            if (j6 == Long.MAX_VALUE) {
                interfaceC0116a0.mo215a().mo226a();
                return true;
            }
            interfaceC0116a0.mo215a().mo223d(nanoTime + j6);
            return true;
        } catch (InterruptedIOException unused) {
            if (j6 == Long.MAX_VALUE) {
                interfaceC0116a0.mo215a().mo226a();
                return false;
            }
            interfaceC0116a0.mo215a().mo223d(nanoTime + j6);
            return false;
        } catch (Throwable th) {
            if (j6 == Long.MAX_VALUE) {
                interfaceC0116a0.mo215a().mo226a();
            } else {
                interfaceC0116a0.mo215a().mo223d(nanoTime + j6);
            }
            throw th;
        }
    }

    /* renamed from: v */
    public static final C2617r m4376v(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3287b c3287b = (C3287b) it.next();
            C0130m c0130m = c3287b.f16138a;
            C0130m c0130m2 = c3287b.f16139b;
            String m293j = c0130m.m293j();
            String m293j2 = c0130m2.m293j();
            arrayList.add(m293j);
            arrayList.add(AbstractC0444k.m956t0(m293j2).toString());
        }
        return new C2617r((String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: w */
    public static final String m4377w(C2619t c2619t, boolean z7) {
        int i7;
        AbstractC3367j.m5100e(c2619t, "<this>");
        int i8 = c2619t.f14155e;
        String str = c2619t.f14154d;
        if (AbstractC0444k.m928R(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z7) {
            String str2 = c2619t.f14151a;
            AbstractC3367j.m5100e(str2, "scheme");
            if (str2.equals("http")) {
                i7 = 80;
            } else if (str2.equals("https")) {
                i7 = 443;
            } else {
                i7 = -1;
            }
            if (i8 == i7) {
                return str;
            }
        }
        return str + ':' + i8;
    }

    /* renamed from: x */
    public static final List m4378x(List list) {
        AbstractC3367j.m5100e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(AbstractC1805m.m3036D0(list));
        AbstractC3367j.m5099d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: y */
    public static final int m4379y(String str, int i7) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i7;
    }

    /* renamed from: z */
    public static final String m4380z(int i7, int i8, String str) {
        int m4368n = m4368n(i7, i8, str);
        String substring = str.substring(m4368n, m4369o(m4368n, i8, str));
        AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
