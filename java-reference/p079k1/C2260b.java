package p079k1;

import java.util.ArrayList;
import java.util.List;
import p001a0.C0005b;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p035e1.AbstractC0664l;
import p035e1.C0647c0;
import p035e1.C0660j;
import p035e1.C0671o0;
import p035e1.C0677s;
import p049g1.InterfaceC1570d;
import p060h5.C1813u;
import p068i5.AbstractC2080d;
import p092m.AbstractC2487d;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.b */
/* loaded from: classes.dex */
public final class C2260b extends AbstractC2287x {

    /* renamed from: b */
    public float[] f13100b;

    /* renamed from: c */
    public final ArrayList f13101c = new ArrayList();

    /* renamed from: d */
    public boolean f13102d = true;

    /* renamed from: e */
    public long f13103e = C0677s.f2209g;

    /* renamed from: f */
    public List f13104f;

    /* renamed from: g */
    public boolean f13105g;

    /* renamed from: h */
    public C0660j f13106h;

    /* renamed from: i */
    public InterfaceC3279c f13107i;

    /* renamed from: j */
    public final C0005b f13108j;

    /* renamed from: k */
    public String f13109k;

    /* renamed from: l */
    public float f13110l;

    /* renamed from: m */
    public float f13111m;

    /* renamed from: n */
    public boolean f13112n;

    public C2260b() {
        int i7 = AbstractC2263c0.f13117a;
        this.f13104f = C1813u.f10860e;
        this.f13105g = true;
        this.f13108j = new C0005b(15, this);
        this.f13109k = "";
        this.f13110l = 1.0f;
        this.f13111m = 1.0f;
        this.f13112n = true;
    }

    @Override // p079k1.AbstractC2287x
    /* renamed from: a */
    public final void mo3666a(InterfaceC1570d interfaceC1570d) {
        if (this.f13112n) {
            float[] fArr = this.f13100b;
            if (fArr == null) {
                fArr = C0647c0.m1350a();
                this.f13100b = fArr;
            } else {
                C0647c0.m1353d(fArr);
            }
            C0647c0.m1355f(fArr, 0.0f, 0.0f);
            if (fArr.length >= 16) {
                double d7 = 0.0f * 0.017453292519943295d;
                float sin = (float) Math.sin(d7);
                float cos = (float) Math.cos(d7);
                float f7 = fArr[0];
                float f8 = fArr[4];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = -sin;
                float f11 = (f8 * cos) + (f7 * f10);
                float f12 = fArr[1];
                float f13 = fArr[5];
                float f14 = (sin * f13) + (cos * f12);
                float f15 = (f13 * cos) + (f12 * f10);
                float f16 = fArr[2];
                float f17 = fArr[6];
                float f18 = (sin * f17) + (cos * f16);
                float f19 = (f17 * cos) + (f16 * f10);
                float f20 = fArr[3];
                float f21 = fArr[7];
                fArr[0] = f9;
                fArr[1] = f14;
                fArr[2] = f18;
                fArr[3] = (sin * f21) + (cos * f20);
                fArr[4] = f11;
                fArr[5] = f15;
                fArr[6] = f19;
                fArr[7] = (cos * f21) + (f10 * f20);
            }
            float f22 = this.f13110l;
            float f23 = this.f13111m;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f22;
                fArr[1] = fArr[1] * f22;
                fArr[2] = fArr[2] * f22;
                fArr[3] = fArr[3] * f22;
                fArr[4] = fArr[4] * f23;
                fArr[5] = fArr[5] * f23;
                fArr[6] = fArr[6] * f23;
                fArr[7] = fArr[7] * f23;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            C0647c0.m1355f(fArr, -0.0f, -0.0f);
            this.f13112n = false;
        }
        if (this.f13105g) {
            if (!this.f13104f.isEmpty()) {
                C0660j c0660j = this.f13106h;
                if (c0660j == null) {
                    c0660j = AbstractC0664l.m1445a();
                    this.f13106h = c0660j;
                }
                AbstractC2080d.m3386N(this.f13104f, c0660j);
            }
            this.f13105g = false;
        }
        C0031h1 mo2524E = interfaceC1570d.mo2524E();
        long m109x = mo2524E.m109x();
        mo2524E.m106u().mo1341m();
        try {
            C0031h1 c0031h1 = (C0031h1) ((C0019e1) mo2524E.f152f).f109e;
            float[] fArr2 = this.f13100b;
            if (fArr2 != null) {
                c0031h1.m106u().mo1345r(fArr2);
            }
            C0660j c0660j2 = this.f13106h;
            if (!this.f13104f.isEmpty() && c0660j2 != null) {
                c0031h1.m106u().mo1344q(c0660j2);
            }
            ArrayList arrayList = this.f13101c;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC2287x) arrayList.get(i7)).mo3666a(interfaceC1570d);
            }
        } finally {
            AbstractC2487d.m4052p(mo2524E, m109x);
        }
    }

    @Override // p079k1.AbstractC2287x
    /* renamed from: b */
    public final InterfaceC3279c mo3667b() {
        return this.f13107i;
    }

    @Override // p079k1.AbstractC2287x
    /* renamed from: d */
    public final void mo3668d(C0005b c0005b) {
        this.f13107i = c0005b;
    }

    /* renamed from: e */
    public final void m3669e(int i7, AbstractC2287x abstractC2287x) {
        ArrayList arrayList = this.f13101c;
        if (i7 < arrayList.size()) {
            arrayList.set(i7, abstractC2287x);
        } else {
            arrayList.add(abstractC2287x);
        }
        m3671g(abstractC2287x);
        abstractC2287x.mo3668d(this.f13108j);
        m3675c();
    }

    /* renamed from: f */
    public final void m3670f(long j6) {
        if (this.f13102d && j6 != 16) {
            long j7 = this.f13103e;
            if (j7 == 16) {
                this.f13103e = j6;
                return;
            }
            int i7 = AbstractC2263c0.f13117a;
            if (C0677s.m1459h(j7) != C0677s.m1459h(j6) || C0677s.m1458g(j7) != C0677s.m1458g(j6) || C0677s.m1456e(j7) != C0677s.m1456e(j6)) {
                this.f13102d = false;
                this.f13103e = C0677s.f2209g;
            }
        }
    }

    /* renamed from: g */
    public final void m3671g(AbstractC2287x abstractC2287x) {
        if (abstractC2287x instanceof C2270g) {
            C0671o0 c0671o0 = ((C2270g) abstractC2287x).f13153b;
            if (this.f13102d && c0671o0 != null) {
                m3670f(c0671o0.f2197a);
                return;
            }
            return;
        }
        if (abstractC2287x instanceof C2260b) {
            C2260b c2260b = (C2260b) abstractC2287x;
            if (c2260b.f13102d && this.f13102d) {
                m3670f(c2260b.f13103e);
            } else {
                this.f13102d = false;
                this.f13103e = C0677s.f2209g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f13109k);
        ArrayList arrayList = this.f13101c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2287x abstractC2287x = (AbstractC2287x) arrayList.get(i7);
            sb.append("\t");
            sb.append(abstractC2287x.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
