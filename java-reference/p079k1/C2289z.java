package p079k1;

import android.graphics.Bitmap;
import p027d1.C0467e;
import p035e1.AbstractC0659i0;
import p035e1.C0644b;
import p035e1.C0654g;
import p035e1.C0666m;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p049g1.C1567a;
import p049g1.C1568b;
import p049g1.InterfaceC1570d;
import p067i4.AbstractC2072e;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p139s1.AbstractC3088a;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.z */
/* loaded from: classes.dex */
public final class C2289z extends AbstractC2287x {

    /* renamed from: b */
    public final C2260b f13209b;

    /* renamed from: c */
    public String f13210c;

    /* renamed from: d */
    public boolean f13211d;

    /* renamed from: e */
    public final C2258a f13212e;

    /* renamed from: f */
    public AbstractC3368k f13213f;

    /* renamed from: g */
    public final C2361g1 f13214g;

    /* renamed from: h */
    public C0666m f13215h;

    /* renamed from: i */
    public final C2361g1 f13216i;

    /* renamed from: j */
    public long f13217j;

    /* renamed from: k */
    public float f13218k;

    /* renamed from: l */
    public float f13219l;

    /* renamed from: m */
    public final C2288y f13220m;

    public C2289z(C2260b c2260b) {
        this.f13209b = c2260b;
        c2260b.f13107i = new C2288y(this, 0);
        this.f13210c = "";
        this.f13211d = true;
        this.f13212e = new C2258a();
        this.f13213f = C2268f.f13149h;
        this.f13214g = AbstractC2418w.m3980x(null);
        this.f13216i = AbstractC2418w.m3980x(new C0467e(0L));
        this.f13217j = 9205357640488583168L;
        this.f13218k = 1.0f;
        this.f13219l = 1.0f;
        this.f13220m = new C2288y(this, 1);
    }

    @Override // p079k1.AbstractC2287x
    /* renamed from: a */
    public final void mo3666a(InterfaceC1570d interfaceC1570d) {
        m3676e(interfaceC1570d, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r3 != r8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
    
        if (r9.f13093a == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0077  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3676e(InterfaceC1570d interfaceC1570d, float f7, C0666m c0666m) {
        int i7;
        boolean z7;
        C2258a c2258a;
        C0666m c0666m2;
        C0654g c0654g;
        long j6;
        C0654g c0654g2;
        C0654g c0654g3;
        int i8;
        int i9;
        int i10;
        C0666m c0666m3 = c0666m;
        C2260b c2260b = this.f13209b;
        boolean z8 = c2260b.f13102d;
        C2361g1 c2361g1 = this.f13214g;
        if (z8 && c2260b.f13103e != 16) {
            C0666m c0666m4 = (C0666m) c2361g1.getValue();
            int i11 = AbstractC2263c0.f13117a;
            if (c0666m4 == null ? c0666m4 == null : !((i10 = c0666m4.f2182c) != 5 && i10 != 3)) {
                if (c0666m3 == null ? c0666m3 == null : !((i9 = c0666m3.f2182c) != 5 && i9 != 3)) {
                    i7 = 1;
                    z7 = this.f13211d;
                    c2258a = this.f13212e;
                    if (!z7 && C0467e.m1023a(this.f13217j, interfaceC1570d.mo2546c())) {
                        c0654g3 = (C0654g) c2258a.f13095c;
                        if (c0654g3 == null) {
                            i8 = c0654g3.m1362a();
                        } else {
                            i8 = 0;
                        }
                    }
                    if (i7 != 1) {
                        long j7 = c2260b.f13103e;
                        int i12 = AbstractC2263c0.f13117a;
                        if (C0677s.m1455d(j7) != 1.0f) {
                            j7 = C0677s.m1453b(1.0f, j7);
                        }
                        c0666m2 = new C0666m(5, j7);
                    } else {
                        c0666m2 = null;
                    }
                    this.f13215h = c0666m2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC1570d.mo2546c() >> 32));
                    C2361g1 c2361g12 = this.f13216i;
                    this.f13218k = intBitsToFloat / Float.intBitsToFloat((int) (((C0467e) c2361g12.getValue()).f1637a >> 32));
                    this.f13219l = Float.intBitsToFloat((int) (interfaceC1570d.mo2546c() & 4294967295L)) / Float.intBitsToFloat((int) (((C0467e) c2361g12.getValue()).f1637a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC1570d.mo2546c() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC1570d.mo2546c() & 4294967295L)))) & 4294967295L);
                    EnumC3103m layoutDirection = interfaceC1570d.getLayoutDirection();
                    c0654g = (C0654g) c2258a.f13095c;
                    C0644b c0644b = (C0644b) c2258a.f13096d;
                    if (c0654g != null) {
                        Bitmap bitmap = c0654g.f2144a;
                        if (c0644b != null) {
                            j6 = 4294967295L;
                            if (((int) (ceil >> 32)) <= bitmap.getWidth()) {
                                if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                                }
                            }
                            c0654g = AbstractC0659i0.m1406f((int) (ceil >> 32), (int) (ceil & j6), i7);
                            c0644b = AbstractC0659i0.m1401a(c0654g);
                            c2258a.f13095c = c0654g;
                            c2258a.f13096d = c0644b;
                            c2258a.f13093a = i7;
                            c2258a.f13094b = ceil;
                            C1568b c1568b = (C1568b) c2258a.f13097e;
                            long m3347y = AbstractC2072e.m3347y(ceil);
                            C1567a c1567a = c1568b.f10181e;
                            InterfaceC3093c interfaceC3093c = c1567a.f10177a;
                            EnumC3103m enumC3103m = c1567a.f10178b;
                            InterfaceC0674q interfaceC0674q = c1567a.f10179c;
                            C0644b c0644b2 = c0644b;
                            long j8 = c1567a.f10180d;
                            c1567a.f10177a = interfaceC1570d;
                            c1567a.f10178b = layoutDirection;
                            c1567a.f10179c = c0644b2;
                            c1567a.f10180d = m3347y;
                            c0644b2.mo1341m();
                            InterfaceC1570d.m2535D(c1568b, C0677s.f2204b, 0L, 0L, 0.0f, 62);
                            this.f13220m.mo23f(c1568b);
                            c0644b2.mo1338j();
                            C1567a c1567a2 = c1568b.f10181e;
                            c1567a2.f10177a = interfaceC3093c;
                            c1567a2.f10178b = enumC3103m;
                            c1567a2.f10179c = interfaceC0674q;
                            c1567a2.f10180d = j8;
                            c0654g.f2144a.prepareToDraw();
                            this.f13211d = false;
                            this.f13217j = interfaceC1570d.mo2546c();
                            if (c0666m3 == null) {
                                if (((C0666m) c2361g1.getValue()) != null) {
                                    c0666m3 = (C0666m) c2361g1.getValue();
                                } else {
                                    c0666m3 = this.f13215h;
                                }
                            }
                            C0666m c0666m5 = c0666m3;
                            c0654g2 = (C0654g) c2258a.f13095c;
                            if (c0654g2 == null) {
                                AbstractC3088a.m4750b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                            }
                            InterfaceC1570d.m2542d0(interfaceC1570d, c0654g2, c2258a.f13094b, 0L, f7, c0666m5, 0, 858);
                        }
                    }
                    j6 = 4294967295L;
                    c0654g = AbstractC0659i0.m1406f((int) (ceil >> 32), (int) (ceil & j6), i7);
                    c0644b = AbstractC0659i0.m1401a(c0654g);
                    c2258a.f13095c = c0654g;
                    c2258a.f13096d = c0644b;
                    c2258a.f13093a = i7;
                    c2258a.f13094b = ceil;
                    C1568b c1568b2 = (C1568b) c2258a.f13097e;
                    long m3347y2 = AbstractC2072e.m3347y(ceil);
                    C1567a c1567a3 = c1568b2.f10181e;
                    InterfaceC3093c interfaceC3093c2 = c1567a3.f10177a;
                    EnumC3103m enumC3103m2 = c1567a3.f10178b;
                    InterfaceC0674q interfaceC0674q2 = c1567a3.f10179c;
                    C0644b c0644b22 = c0644b;
                    long j82 = c1567a3.f10180d;
                    c1567a3.f10177a = interfaceC1570d;
                    c1567a3.f10178b = layoutDirection;
                    c1567a3.f10179c = c0644b22;
                    c1567a3.f10180d = m3347y2;
                    c0644b22.mo1341m();
                    InterfaceC1570d.m2535D(c1568b2, C0677s.f2204b, 0L, 0L, 0.0f, 62);
                    this.f13220m.mo23f(c1568b2);
                    c0644b22.mo1338j();
                    C1567a c1567a22 = c1568b2.f10181e;
                    c1567a22.f10177a = interfaceC3093c2;
                    c1567a22.f10178b = enumC3103m2;
                    c1567a22.f10179c = interfaceC0674q2;
                    c1567a22.f10180d = j82;
                    c0654g.f2144a.prepareToDraw();
                    this.f13211d = false;
                    this.f13217j = interfaceC1570d.mo2546c();
                    if (c0666m3 == null) {
                    }
                    C0666m c0666m52 = c0666m3;
                    c0654g2 = (C0654g) c2258a.f13095c;
                    if (c0654g2 == null) {
                    }
                    InterfaceC1570d.m2542d0(interfaceC1570d, c0654g2, c2258a.f13094b, 0L, f7, c0666m52, 0, 858);
                }
            }
        }
        i7 = 0;
        z7 = this.f13211d;
        c2258a = this.f13212e;
        if (!z7) {
            c0654g3 = (C0654g) c2258a.f13095c;
            if (c0654g3 == null) {
            }
        }
        if (i7 != 1) {
        }
        this.f13215h = c0666m2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1570d.mo2546c() >> 32));
        C2361g1 c2361g122 = this.f13216i;
        this.f13218k = intBitsToFloat2 / Float.intBitsToFloat((int) (((C0467e) c2361g122.getValue()).f1637a >> 32));
        this.f13219l = Float.intBitsToFloat((int) (interfaceC1570d.mo2546c() & 4294967295L)) / Float.intBitsToFloat((int) (((C0467e) c2361g122.getValue()).f1637a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC1570d.mo2546c() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC1570d.mo2546c() & 4294967295L)))) & 4294967295L);
        EnumC3103m layoutDirection2 = interfaceC1570d.getLayoutDirection();
        c0654g = (C0654g) c2258a.f13095c;
        C0644b c0644b3 = (C0644b) c2258a.f13096d;
        if (c0654g != null) {
        }
        j6 = 4294967295L;
        c0654g = AbstractC0659i0.m1406f((int) (ceil2 >> 32), (int) (ceil2 & j6), i7);
        c0644b3 = AbstractC0659i0.m1401a(c0654g);
        c2258a.f13095c = c0654g;
        c2258a.f13096d = c0644b3;
        c2258a.f13093a = i7;
        c2258a.f13094b = ceil2;
        C1568b c1568b22 = (C1568b) c2258a.f13097e;
        long m3347y22 = AbstractC2072e.m3347y(ceil2);
        C1567a c1567a32 = c1568b22.f10181e;
        InterfaceC3093c interfaceC3093c22 = c1567a32.f10177a;
        EnumC3103m enumC3103m22 = c1567a32.f10178b;
        InterfaceC0674q interfaceC0674q22 = c1567a32.f10179c;
        C0644b c0644b222 = c0644b3;
        long j822 = c1567a32.f10180d;
        c1567a32.f10177a = interfaceC1570d;
        c1567a32.f10178b = layoutDirection2;
        c1567a32.f10179c = c0644b222;
        c1567a32.f10180d = m3347y22;
        c0644b222.mo1341m();
        InterfaceC1570d.m2535D(c1568b22, C0677s.f2204b, 0L, 0L, 0.0f, 62);
        this.f13220m.mo23f(c1568b22);
        c0644b222.mo1338j();
        C1567a c1567a222 = c1568b22.f10181e;
        c1567a222.f10177a = interfaceC3093c22;
        c1567a222.f10178b = enumC3103m22;
        c1567a222.f10179c = interfaceC0674q22;
        c1567a222.f10180d = j822;
        c0654g.f2144a.prepareToDraw();
        this.f13211d = false;
        this.f13217j = interfaceC1570d.mo2546c();
        if (c0666m3 == null) {
        }
        C0666m c0666m522 = c0666m3;
        c0654g2 = (C0654g) c2258a.f13095c;
        if (c0654g2 == null) {
        }
        InterfaceC1570d.m2542d0(interfaceC1570d, c0654g2, c2258a.f13094b, 0L, f7, c0666m522, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f13210c);
        sb.append("\n\tviewportWidth: ");
        C2361g1 c2361g1 = this.f13216i;
        sb.append(Float.intBitsToFloat((int) (((C0467e) c2361g1.getValue()).f1637a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C0467e) c2361g1.getValue()).f1637a & 4294967295L)));
        sb.append("\n");
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }
}
