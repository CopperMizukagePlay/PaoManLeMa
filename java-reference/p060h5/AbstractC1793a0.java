package p060h5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import p000a.AbstractC0000a;
import p001a0.AbstractC0094y0;
import p001a0.C0043k1;
import p001a0.C0062p0;
import p001a0.InterfaceC0071r1;
import p024c6.C0439f;
import p027d1.C0464b;
import p027d1.C0465c;
import p029d3.AbstractC0495b;
import p034e0.C0605g;
import p034e0.C0614k0;
import p034e0.C0619n;
import p034e0.C0620n0;
import p034e0.C0621o;
import p034e0.C0622o0;
import p034e0.C0623p;
import p034e0.C0624p0;
import p034e0.C0629s;
import p034e0.C0631t;
import p034e0.InterfaceC0613k;
import p034e0.InterfaceC0617m;
import p035e1.C0671o0;
import p035e1.C0677s;
import p039e5.C0811dk;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p053g5.C1689h;
import p053g5.C1695n;
import p053g5.InterfaceC1685d;
import p068i5.C2087k;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p079k1.C2272i;
import p079k1.C2274k;
import p079k1.C2275l;
import p079k1.C2276m;
import p079k1.C2281r;
import p079k1.C2284u;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p102n1.AbstractC2710c;
import p117p1.AbstractC2847c0;
import p132r2.EnumC3036j;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p177x0.C3807o;

/* renamed from: h5.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC1793a0 {

    /* renamed from: a */
    public static C2266e f10830a;

    /* renamed from: b */
    public static C2266e f10831b;

    /* renamed from: c */
    public static C2266e f10832c;

    /* renamed from: d */
    public static C2266e f10833d;

    /* renamed from: e */
    public static C2266e f10834e;

    /* renamed from: f */
    public static C2266e f10835f;

    /* renamed from: g */
    public static C2266e f10836g;

    /* renamed from: h */
    public static C2266e f10837h;

    /* renamed from: i */
    public static C2266e f10838i;

    /* renamed from: j */
    public static C2266e f10839j;

    /* renamed from: k */
    public static C2266e f10840k;

    /* renamed from: l */
    public static C2266e f10841l;

    /* renamed from: m */
    public static C2266e f10842m;

    /* renamed from: n */
    public static C2266e f10843n;

    /* renamed from: o */
    public static C2266e f10844o;

    /* renamed from: p */
    public static C2266e f10845p;

    /* renamed from: q */
    public static C2266e f10846q;

    /* renamed from: A */
    public static File m2961A(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: B */
    public static final C2266e m2962B() {
        C2266e c2266e = f10846q;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Tune", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(3.0f, 17.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(6.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1510k(3.0f, 17.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(3.0f, 5.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(10.0f);
        c0811dk.m1510k(13.0f, 5.0f);
        c0811dk.m1510k(3.0f, 5.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(13.0f, 21.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(8.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(-8.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1517r(6.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(7.0f, 9.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1510k(3.0f, 11.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(4.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1510k(9.0f, 9.0f);
        c0811dk.m1510k(7.0f, 9.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(21.0f, 13.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1510k(11.0f, 11.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(10.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(15.0f, 9.0f);
        c0811dk.m1509j(2.0f);
        c0811dk.m1510k(17.0f, 7.0f);
        c0811dk.m1509j(4.0f);
        c0811dk.m1510k(21.0f, 5.0f);
        c0811dk.m1509j(-4.0f);
        c0811dk.m1510k(17.0f, 3.0f);
        c0811dk.m1509j(-2.0f);
        c0811dk.m1517r(6.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f10846q = m3673b;
        return m3673b;
    }

    /* renamed from: C */
    public static final boolean m2963C(C0622o0 c0622o0, boolean z7) {
        InterfaceC3238v m119c;
        C0043k1 c0043k1 = c0622o0.f2047d;
        if (c0043k1 != null && (m119c = c0043k1.m119c()) != null) {
            C0465c m21v = AbstractC0000a.m21v(m119c);
            long m1286i = c0622o0.m1286i(z7);
            float f7 = m21v.f1625a;
            float f8 = m21v.f1627c;
            float m1008d = C0464b.m1008d(m1286i);
            if (f7 <= m1008d && m1008d <= f8) {
                float f9 = m21v.f1626b;
                float f10 = m21v.f1628d;
                float m1009e = C0464b.m1009e(m1286i);
                if (f9 <= m1009e && m1009e <= f10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: D */
    public static LinkedHashSet m2964D(Set set, Object obj) {
        AbstractC3367j.m5100e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1817y.m3082N(set.size()));
        boolean z7 = false;
        for (Object obj2 : set) {
            boolean z8 = true;
            if (!z7 && AbstractC3367j.m5096a(obj2, obj)) {
                z7 = true;
                z8 = false;
            }
            if (z8) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: E */
    public static MappedByteBuffer m2965E(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: F */
    public static LinkedHashSet m2966F(Set set, Object obj) {
        AbstractC3367j.m5100e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1817y.m3082N(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* renamed from: G */
    public static LinkedHashSet m2967G(Set set, ArrayList arrayList) {
        AbstractC3367j.m5100e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1817y.m3082N(set.size() + Integer.valueOf(arrayList.size()).intValue()));
        linkedHashSet.addAll(set);
        AbstractC1811s.m3076X(arrayList, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: H */
    public static List m2968H(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i7);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: I */
    public static void m2969I(Window window, boolean z7) {
        int i7;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 35) {
            AbstractC0495b.m1075e(window, z7);
            return;
        }
        if (i8 >= 30) {
            AbstractC0495b.m1074d(window, z7);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z7) {
            i7 = systemUiVisibility & (-1793);
        } else {
            i7 = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i7);
    }

    /* renamed from: J */
    public static Set m2970J(Object obj) {
        Set singleton = Collections.singleton(obj);
        AbstractC3367j.m5099d(singleton, "singleton(...)");
        return singleton;
    }

    /* renamed from: K */
    public static Set m2971K(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1817y.m3082N(objArr.length));
                for (Object obj : objArr) {
                    linkedHashSet.add(obj);
                }
                return linkedHashSet;
            }
            return m2970J(objArr[0]);
        }
        return C1815w.f10862e;
    }

    /* renamed from: L */
    public static final void m2972L(Object obj) {
        if (!(obj instanceof C1689h)) {
        } else {
            throw ((C1689h) obj).f10473e;
        }
    }

    /* renamed from: a */
    public static final long m2973a(float f7, float f8) {
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    /* renamed from: b */
    public static long m2974b(float f7) {
        return (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
    }

    /* renamed from: c */
    public static final long m2975c(float f7, float f8) {
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    /* renamed from: d */
    public static final void m2976d(boolean z7, EnumC3036j enumC3036j, C0622o0 c0622o0, C2395p c2395p, int i7) {
        int i8;
        boolean z8;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(-1344558920);
        if ((i7 & 6) == 0) {
            if (c2395p.m3872h(z7)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(enumC3036j)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i8 |= i10;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3874i(c0622o0)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i8 |= i9;
        }
        if ((i8 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            int i12 = i8 & 14;
            boolean z9 = false;
            if (i12 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean m3870g = z8 | c2395p.m3870g(c0622o0);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3870g || m3847O == c2413u0) {
                m3847O = new C0620n0(c0622o0, z7);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC0071r1 interfaceC0071r1 = (InterfaceC0071r1) m3847O;
            boolean m3874i = c2395p.m3874i(c0622o0);
            if (i12 == 4) {
                z9 = true;
            }
            boolean z10 = m3874i | z9;
            Object m3847O2 = c2395p.m3847O();
            if (z10 || m3847O2 == c2413u0) {
                m3847O2 = new C0624p0(c0622o0, z7);
                c2395p.m3877j0(m3847O2);
            }
            InterfaceC0617m interfaceC0617m = (InterfaceC0617m) m3847O2;
            boolean m2590f = C1602n0.m2590f(c0622o0.m1287j().f13724b);
            boolean m3874i2 = c2395p.m3874i(interfaceC0071r1);
            Object m3847O3 = c2395p.m3847O();
            if (m3874i2 || m3847O3 == c2413u0) {
                m3847O3 = new C0062p0(interfaceC0071r1, null, 7);
                c2395p.m3877j0(m3847O3);
            }
            AbstractC0000a.m4e(interfaceC0617m, z7, enumC3036j, m2590f, 0L, AbstractC2847c0.m4505a(C3807o.f17991a, interfaceC0071r1, (InterfaceC3281e) m3847O3), c2395p, (i8 << 3) & 1008);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0605g(z7, enumC3036j, c0622o0, i7);
        }
    }

    /* renamed from: e */
    public static final C0623p m2977e(C0614k0 c0614k0, InterfaceC0613k interfaceC0613k) {
        boolean z7;
        int m1251b = c0614k0.m1251b();
        C0619n c0619n = (C0619n) c0614k0.f2019d;
        if (m1251b == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new C0623p(m2980h(c0619n, z7, true, interfaceC0613k), m2980h(c0619n, z7, false, interfaceC0613k), z7);
    }

    /* renamed from: f */
    public static final C0439f m2978f(Matcher matcher, int i7, CharSequence charSequence) {
        if (!matcher.find(i7)) {
            return null;
        }
        return new C0439f(matcher, charSequence);
    }

    /* renamed from: g */
    public static final C0621o m2979g(C0614k0 c0614k0, C0619n c0619n, C0621o c0621o) {
        int i7;
        int i8;
        boolean z7;
        int i9 = c0619n.f2036c;
        int i10 = c0619n.f2035b;
        boolean z8 = c0614k0.f2017b;
        if (z8) {
            i7 = i10;
        } else {
            i7 = i9;
        }
        C1598l0 c1598l0 = (C1598l0) c0619n.f2038e;
        int i11 = c0619n.f2037d;
        InterfaceC1685d m4326I = AbstractC2710c.m4326I(new C0631t(c0619n, i7));
        if (z8) {
            i8 = i9;
        } else {
            i8 = i10;
        }
        InterfaceC1685d m4326I2 = AbstractC2710c.m4326I(new C0629s(c0619n, i7, i8, c0614k0, m4326I));
        if (1 != c0621o.f2043c) {
            return (C0621o) ((C1695n) m4326I2).getValue();
        }
        if (i7 == i11) {
            return c0621o;
        }
        if (((Number) ((C1695n) m4326I).getValue()).intValue() != c1598l0.m2578e(i11)) {
            return (C0621o) ((C1695n) m4326I2).getValue();
        }
        int i12 = c0621o.f2042b;
        long m2584k = c1598l0.m2584k(i12);
        if (i11 != -1) {
            if (i7 != i11) {
                if (i10 >= i9 && i10 > i9) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!(z7 ^ z8)) {
                }
            }
            return c0619n.m1274a(i7);
        }
        int i13 = C1602n0.f10303c;
        if (i12 != ((int) (m2584k >> 32)) && i12 != ((int) (4294967295L & m2584k))) {
            return c0619n.m1274a(i7);
        }
        return (C0621o) ((C1695n) m4326I2).getValue();
    }

    /* renamed from: h */
    public static final C0621o m2980h(C0619n c0619n, boolean z7, boolean z8, InterfaceC0613k interfaceC0613k) {
        int i7;
        long j6;
        if (z8) {
            i7 = c0619n.f2035b;
        } else {
            i7 = c0619n.f2036c;
        }
        long mo1249a = interfaceC0613k.mo1249a(c0619n, i7);
        if (z7 ^ z8) {
            int i8 = C1602n0.f10303c;
            j6 = mo1249a >> 32;
        } else {
            int i9 = C1602n0.f10303c;
            j6 = 4294967295L & mo1249a;
        }
        return c0619n.m1274a((int) j6);
    }

    /* renamed from: i */
    public static final C0621o m2981i(C0621o c0621o, C0619n c0619n, int i7) {
        return new C0621o(((C1598l0) c0619n.f2038e).m2574a(i7), i7, c0621o.f2043c);
    }

    /* renamed from: j */
    public static void m2982j(int i7, int i8, int i9) {
        if (i7 >= 0 && i8 <= i9) {
            if (i7 <= i8) {
                return;
            } else {
                throw new IllegalArgumentException(AbstractC0094y0.m182i(i7, i8, "fromIndex: ", " > toIndex: "));
            }
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
    }

    /* renamed from: k */
    public static final boolean m2983k(C0465c c0465c, float f7, float f8) {
        float f9 = c0465c.f1625a;
        if (f7 <= c0465c.f1627c && f9 <= f7) {
            float f10 = c0465c.f1626b;
            if (f8 <= c0465c.f1628d && f10 <= f8) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m2984l(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e8) {
            e = e8;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: m */
    public static final C1689h m2985m(Throwable th) {
        AbstractC3367j.m5100e(th, "exception");
        return new C1689h(th);
    }

    /* renamed from: n */
    public static C2087k m2986n() {
        return new C2087k();
    }

    /* renamed from: o */
    public static final C2266e m2987o() {
        C2266e c2266e = f10832c;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.AccessTime", false);
        int i7 = AbstractC2263c0.f13117a;
        long j6 = C0677s.f2204b;
        C0671o0 c0671o0 = new C0671o0(j6);
        C0811dk m179f = AbstractC0094y0.m179f(11.99f, 2.0f);
        m179f.m1506g(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        m179f.m1514o(4.47f, 10.0f, 9.99f, 10.0f);
        m179f.m1506g(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        m179f.m1513n(17.52f, 2.0f, 11.99f, 2.0f);
        m179f.m1505f();
        m179f.m1512m(12.0f, 20.0f);
        m179f.m1507h(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        m179f.m1514o(3.58f, -8.0f, 8.0f, -8.0f);
        m179f.m1514o(8.0f, 3.58f, 8.0f, 8.0f);
        m179f.m1514o(-3.58f, 8.0f, -8.0f, 8.0f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C0671o0 c0671o02 = new C0671o0(j6);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2276m(12.5f, 7.0f));
        arrayList.add(new C2274k(11.0f));
        arrayList.add(new C2284u(6.0f));
        arrayList.add(new C2281r(5.25f, 3.15f));
        arrayList.add(new C2281r(0.75f, -1.23f));
        arrayList.add(new C2281r(-4.5f, -2.67f));
        arrayList.add(C2272i.f13166b);
        C2264d.m3672a(c2264d, arrayList, c0671o02);
        C2266e m3673b = c2264d.m3673b();
        f10832c = m3673b;
        return m3673b;
    }

    /* renamed from: p */
    public static final C2266e m2988p() {
        C2266e c2266e = f10833d;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.ArrowDropDown", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2276m(7.0f, 10.0f));
        arrayList.add(new C2281r(5.0f, 5.0f));
        arrayList.add(new C2281r(5.0f, -5.0f));
        arrayList.add(C2272i.f13166b);
        C2264d.m3672a(c2264d, arrayList, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f10833d = m3673b;
        return m3673b;
    }

    /* renamed from: q */
    public static final C2266e m2989q() {
        C2266e c2266e = f10834e;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Build", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(22.7f, 19.0f);
        c0811dk.m1511l(-9.1f, -9.1f);
        c0811dk.m1507h(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
        c0811dk.m1507h(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
        c0811dk.m1510k(9.0f, 6.0f);
        c0811dk.m1510k(6.0f, 9.0f);
        c0811dk.m1510k(1.6f, 4.7f);
        c0811dk.m1506g(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
        c0811dk.m1507h(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
        c0811dk.m1511l(9.1f, 9.1f);
        c0811dk.m1507h(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, 0.0f);
        c0811dk.m1511l(2.3f, -2.3f);
        c0811dk.m1507h(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f10834e = m3673b;
        return m3673b;
    }

    /* renamed from: r */
    public static final long m2990r(long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* renamed from: s */
    public static final C2266e m2991s() {
        C2266e c2266e = f10835f;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Cloud", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(19.35f, 10.04f);
        m179f.m1506g(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        m179f.m1506g(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        m179f.m1506g(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        m179f.m1507h(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        m179f.m1509j(13.0f);
        m179f.m1507h(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        m179f.m1507h(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f10835f = m3673b;
        return m3673b;
    }

    /* renamed from: t */
    public static final C2266e m2992t() {
        C2266e c2266e = f10836g;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Delete", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(6.0f, 19.0f);
        m179f.m1507h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        m179f.m1509j(8.0f);
        m179f.m1507h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        m179f.m1516q(7.0f);
        m179f.m1508i(6.0f);
        m179f.m1517r(12.0f);
        m179f.m1505f();
        m179f.m1512m(19.0f, 4.0f);
        m179f.m1509j(-3.5f);
        m179f.m1511l(-1.0f, -1.0f);
        m179f.m1509j(-5.0f);
        m179f.m1511l(-1.0f, 1.0f);
        m179f.m1508i(5.0f);
        m179f.m1517r(2.0f);
        m179f.m1509j(14.0f);
        m179f.m1516q(4.0f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f10836g = m3673b;
        return m3673b;
    }

    /* renamed from: u */
    public static final C2266e m2993u() {
        C2266e c2266e = f10837h;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.ExpandLess", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C2276m(12.0f, 8.0f));
        arrayList.add(new C2281r(-6.0f, 6.0f));
        arrayList.add(new C2281r(1.41f, 1.41f));
        arrayList.add(new C2275l(12.0f, 10.83f));
        arrayList.add(new C2281r(4.59f, 4.58f));
        arrayList.add(new C2275l(18.0f, 14.0f));
        arrayList.add(C2272i.f13166b);
        C2264d.m3672a(c2264d, arrayList, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f10837h = m3673b;
        return m3673b;
    }

    /* renamed from: v */
    public static final C2266e m2994v() {
        C2266e c2266e = f10839j;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Language", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk m179f = AbstractC0094y0.m179f(11.99f, 2.0f);
        m179f.m1506g(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        m179f.m1514o(4.47f, 10.0f, 9.99f, 10.0f);
        m179f.m1506g(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        m179f.m1513n(17.52f, 2.0f, 11.99f, 2.0f);
        m179f.m1505f();
        m179f.m1512m(18.92f, 8.0f);
        m179f.m1509j(-2.95f);
        m179f.m1507h(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
        m179f.m1507h(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
        m179f.m1505f();
        m179f.m1512m(12.0f, 4.04f);
        m179f.m1507h(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
        m179f.m1509j(-3.82f);
        m179f.m1507h(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
        m179f.m1505f();
        m179f.m1512m(4.26f, 14.0f);
        m179f.m1506g(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
        m179f.m1514o(0.1f, -1.36f, 0.26f, -2.0f);
        m179f.m1509j(3.38f);
        m179f.m1507h(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
        m179f.m1507h(0.0f, 0.68f, 0.06f, 1.34f, 0.14f, 2.0f);
        m179f.m1510k(4.26f, 14.0f);
        m179f.m1505f();
        m179f.m1512m(5.08f, 16.0f);
        m179f.m1509j(2.95f);
        m179f.m1507h(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
        m179f.m1507h(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
        m179f.m1505f();
        m179f.m1512m(8.03f, 8.0f);
        m179f.m1510k(5.08f, 8.0f);
        m179f.m1507h(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
        m179f.m1506g(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
        m179f.m1505f();
        m179f.m1512m(12.0f, 19.96f);
        m179f.m1507h(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
        m179f.m1509j(3.82f);
        m179f.m1507h(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
        m179f.m1505f();
        m179f.m1512m(14.34f, 14.0f);
        m179f.m1510k(9.66f, 14.0f);
        m179f.m1507h(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
        m179f.m1507h(0.0f, -0.68f, 0.07f, -1.35f, 0.16f, -2.0f);
        m179f.m1509j(4.68f);
        m179f.m1507h(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
        m179f.m1507h(0.0f, 0.68f, -0.07f, 1.34f, -0.16f, 2.0f);
        m179f.m1505f();
        m179f.m1512m(14.59f, 19.56f);
        m179f.m1507h(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
        m179f.m1509j(2.95f);
        m179f.m1507h(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
        m179f.m1505f();
        m179f.m1512m(16.36f, 14.0f);
        m179f.m1507h(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
        m179f.m1507h(0.0f, -0.68f, -0.06f, -1.34f, -0.14f, -2.0f);
        m179f.m1509j(3.38f);
        m179f.m1507h(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
        m179f.m1514o(-0.1f, 1.36f, -0.26f, 2.0f);
        m179f.m1509j(-3.38f);
        m179f.m1505f();
        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f10839j = m3673b;
        return m3673b;
    }

    /* renamed from: w */
    public static final C2266e m2995w() {
        C2266e c2266e = f10840k;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.Menu", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(3.0f, 18.0f);
        c0811dk.m1509j(18.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1510k(3.0f, 16.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(3.0f, 13.0f);
        c0811dk.m1509j(18.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1510k(3.0f, 11.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1505f();
        c0811dk.m1512m(3.0f, 6.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(18.0f);
        c0811dk.m1510k(21.0f, 6.0f);
        c0811dk.m1510k(3.0f, 6.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f10840k = m3673b;
        return m3673b;
    }

    /* renamed from: x */
    public static final C2266e m2996x() {
        C2266e c2266e = f10841l;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.NetworkPing", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(12.0f, 14.67f);
        c0811dk.m1510k(3.41f, 6.09f);
        c0811dk.m1510k(2.0f, 7.5f);
        c0811dk.m1511l(8.5f, 8.5f);
        c0811dk.m1508i(4.0f);
        c0811dk.m1517r(2.0f);
        c0811dk.m1509j(16.0f);
        c0811dk.m1517r(-2.0f);
        c0811dk.m1509j(-6.5f);
        c0811dk.m1511l(5.15f, -5.15f);
        c0811dk.m1506g(18.91f, 10.95f, 19.2f, 11.0f, 19.5f, 11.0f);
        c0811dk.m1507h(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        c0811dk.m1513n(20.88f, 6.0f, 19.5f, 6.0f);
        c0811dk.m1513n(17.0f, 7.12f, 17.0f, 8.5f);
        c0811dk.m1507h(0.0f, 0.35f, 0.07f, 0.67f, 0.2f, 0.97f);
        c0811dk.m1510k(12.0f, 14.67f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f10841l = m3673b;
        return m3673b;
    }

    /* renamed from: y */
    public static final C2266e m2997y() {
        C2266e c2266e = f10831b;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("AutoMirrored.Filled.ShowChart", true);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(3.5f, 18.49f);
        c0811dk.m1511l(6.0f, -6.01f);
        c0811dk.m1511l(4.0f, 4.0f);
        c0811dk.m1510k(22.0f, 6.92f);
        c0811dk.m1511l(-1.41f, -1.41f);
        c0811dk.m1511l(-7.09f, 7.97f);
        c0811dk.m1511l(-4.0f, -4.0f);
        c0811dk.m1510k(2.0f, 16.99f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f10831b = m3673b;
        return m3673b;
    }

    /* renamed from: z */
    public static final C2266e m2998z() {
        C2266e c2266e = f10845p;
        if (c2266e != null) {
            return c2266e;
        }
        C2264d c2264d = new C2264d("Filled.StayCurrentPortrait", false);
        int i7 = AbstractC2263c0.f13117a;
        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
        C0811dk c0811dk = new C0811dk(2);
        c0811dk.m1512m(17.0f, 1.01f);
        c0811dk.m1510k(7.0f, 1.0f);
        c0811dk.m1507h(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        c0811dk.m1517r(18.0f);
        c0811dk.m1507h(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        c0811dk.m1509j(10.0f);
        c0811dk.m1507h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c0811dk.m1516q(3.0f);
        c0811dk.m1507h(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        c0811dk.m1505f();
        c0811dk.m1512m(17.0f, 19.0f);
        c0811dk.m1508i(7.0f);
        c0811dk.m1516q(5.0f);
        c0811dk.m1509j(10.0f);
        c0811dk.m1517r(14.0f);
        c0811dk.m1505f();
        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
        C2266e m3673b = c2264d.m3673b();
        f10845p = m3673b;
        return m3673b;
    }
}
