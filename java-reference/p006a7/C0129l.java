package p006a7;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import androidx.lifecycle.AbstractC0206p0;
import androidx.lifecycle.InterfaceC0210r0;
import p016b7.AbstractC0315b;
import p024c6.AbstractC0434a;
import p060h5.AbstractC1804l;
import p065i2.AbstractC2064e;
import p077k.AbstractC2210p0;
import p077k.C2194h0;
import p077k.C2213r;
import p080k2.C2300k;
import p080k2.C2302m;
import p080k2.InterfaceC2304o;
import p100n.C2680s;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.l */
/* loaded from: classes.dex */
public class C0129l implements InterfaceC0210r0, InterfaceC2304o {

    /* renamed from: b */
    public static C0129l f525b;

    /* renamed from: c */
    public static C0129l f526c;

    /* renamed from: a */
    public final /* synthetic */ int f527a;

    public /* synthetic */ C0129l(int i7) {
        this.f527a = i7;
    }

    /* renamed from: b */
    public static final float[] m274b() {
        float[] fArr = C2680s.f14396s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[91];
        C2680s.f14396s = fArr2;
        return fArr2;
    }

    /* renamed from: c */
    public static Typeface m275c(String str, C2300k c2300k, int i7) {
        Typeface create;
        Typeface create2;
        if (i7 == 0 && AbstractC3367j.m5096a(c2300k, C2300k.f13233h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        boolean z7 = false;
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        int i8 = c2300k.f13237e;
        if (i7 == 1) {
            z7 = true;
        }
        create2 = Typeface.create(create, i8, z7);
        return create2;
    }

    /* renamed from: d */
    public static Typeface m276d(String str, C2300k c2300k, int i7) {
        if (i7 == 0 && AbstractC3367j.m5096a(c2300k, C2300k.f13233h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int m3249w = AbstractC2064e.m3249w(c2300k, i7);
        if (str != null && str.length() != 0) {
            return Typeface.create(str, m3249w);
        }
        return Typeface.defaultFromStyle(m3249w);
    }

    /* renamed from: f */
    public static C0130m m277f(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = i7 * 2;
                bArr[i7] = (byte) (AbstractC0315b.m671a(str.charAt(i8 + 1)) + (AbstractC0315b.m671a(str.charAt(i8)) << 4));
            }
            return new C0130m(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    /* renamed from: g */
    public static C0130m m278g(String str) {
        AbstractC3367j.m5100e(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC0434a.f1477a);
        AbstractC3367j.m5099d(bytes, "this as java.lang.String).getBytes(charset)");
        C0130m c0130m = new C0130m(bytes);
        c0130m.f531g = str;
        return c0130m;
    }

    /* renamed from: j */
    public static C0130m m279j(byte[] bArr) {
        C0130m c0130m = C0130m.f528h;
        int length = bArr.length;
        AbstractC0117b.m219d(bArr.length, 0, length);
        return new C0130m(AbstractC1804l.m3021N(bArr, 0, length));
    }

    @Override // androidx.lifecycle.InterfaceC0210r0
    /* renamed from: a */
    public AbstractC0206p0 mo280a(Class cls) {
        return AbstractC2064e.m3243q(cls);
    }

    /* renamed from: e */
    public Typeface m281e(C2302m c2302m, C2300k c2300k, int i7) {
        switch (this.f527a) {
            case 18:
                return m275c(c2302m.f13239d, c2300k, i7);
            default:
                String str = c2302m.f13239d;
                int i8 = c2300k.f13237e / 100;
                if (i8 >= 0 && i8 < 2) {
                    str = str.concat("-thin");
                } else if (2 <= i8 && i8 < 4) {
                    str = str.concat("-light");
                } else if (i8 != 4) {
                    if (i8 == 5) {
                        str = str.concat("-medium");
                    } else if ((6 > i8 || i8 >= 8) && 8 <= i8 && i8 < 11) {
                        str = str.concat("-black");
                    }
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface m276d = m276d(str, c2300k, i7);
                    if (!AbstractC3367j.m5096a(m276d, Typeface.create(Typeface.DEFAULT, AbstractC2064e.m3249w(c2300k, i7))) && !AbstractC3367j.m5096a(m276d, m276d(null, c2300k, i7))) {
                        typeface = m276d;
                    }
                }
                if (typeface == null) {
                    return m276d(c2302m.f13239d, c2300k, i7);
                }
                return typeface;
        }
    }

    /* renamed from: h */
    public Signature[] mo282h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* renamed from: i */
    public boolean mo283i(CharSequence charSequence) {
        return false;
    }

    public C0129l() {
        this.f527a = 16;
        new C2213r(16);
        long[] jArr = AbstractC2210p0.f12722a;
        new C2194h0();
    }
}
