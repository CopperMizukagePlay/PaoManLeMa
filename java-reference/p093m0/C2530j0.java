package p093m0;

import p022c4.AbstractC0398h;
import p034e0.C0619n;
import p060h5.AbstractC1804l;
import p068i5.AbstractC2080d;
import p085l0.C2335a;
import p085l0.C2350d2;
import p085l0.InterfaceC2343c;
import p145t0.C3179j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m0.j0 */
/* loaded from: classes.dex */
public final class C2530j0 extends AbstractC2080d {

    /* renamed from: b */
    public int f13890b;

    /* renamed from: d */
    public int f13892d;

    /* renamed from: f */
    public int f13894f;

    /* renamed from: a */
    public AbstractC0398h[] f13889a = new AbstractC0398h[16];

    /* renamed from: c */
    public int[] f13891c = new int[16];

    /* renamed from: e */
    public Object[] f13893e = new Object[16];

    /* renamed from: P */
    public final void m4073P() {
        this.f13890b = 0;
        this.f13892d = 0;
        AbstractC1804l.m3023P(this.f13893e, 0, this.f13894f);
        this.f13894f = 0;
    }

    /* renamed from: Q */
    public final void m4074Q(InterfaceC2343c interfaceC2343c, C2350d2 c2350d2, C3179j c3179j, InterfaceC2528i0 interfaceC2528i0) {
        if (m4076S()) {
            C0619n c0619n = new C0619n(this);
            C2530j0 c2530j0 = (C2530j0) c0619n.f2038e;
            while (true) {
                AbstractC0398h abstractC0398h = c2530j0.f13889a[c0619n.f2035b];
                C2335a mo874b = abstractC0398h.mo874b(c0619n);
                InterfaceC2343c interfaceC2343c2 = interfaceC2343c;
                C2350d2 c2350d22 = c2350d2;
                C3179j c3179j2 = c3179j;
                InterfaceC2528i0 interfaceC2528i02 = interfaceC2528i0;
                try {
                    abstractC0398h.mo873a(c0619n, interfaceC2343c2, c2350d22, c3179j2, interfaceC2528i02);
                    int i7 = c0619n.f2035b;
                    int i8 = c2530j0.f13890b;
                    if (i7 < i8) {
                        AbstractC0398h abstractC0398h2 = c2530j0.f13889a[i7];
                        c0619n.f2036c += abstractC0398h2.f1360b;
                        c0619n.f2037d += abstractC0398h2.f1361c;
                        int i9 = i7 + 1;
                        c0619n.f2035b = i9;
                        if (i9 >= i8) {
                            break;
                        }
                        interfaceC2343c = interfaceC2343c2;
                        c2350d2 = c2350d22;
                        c3179j = c3179j2;
                        interfaceC2528i0 = interfaceC2528i02;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        m4073P();
    }

    /* renamed from: R */
    public final boolean m4075R() {
        if (this.f13890b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public final boolean m4076S() {
        if (this.f13890b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public final void m4077T(AbstractC0398h abstractC0398h) {
        int i7;
        int i8;
        int i9 = this.f13890b;
        AbstractC0398h[] abstractC0398hArr = this.f13889a;
        int i10 = 1024;
        if (i9 == abstractC0398hArr.length) {
            if (i9 > 1024) {
                i8 = 1024;
            } else {
                i8 = i9;
            }
            AbstractC0398h[] abstractC0398hArr2 = new AbstractC0398h[i8 + i9];
            System.arraycopy(abstractC0398hArr, 0, abstractC0398hArr2, 0, i9);
            this.f13889a = abstractC0398hArr2;
        }
        int i11 = this.f13892d;
        int i12 = abstractC0398h.f1360b;
        int i13 = abstractC0398h.f1361c;
        int i14 = i11 + i12;
        int[] iArr = this.f13891c;
        int length = iArr.length;
        if (i14 > length) {
            if (length > 1024) {
                i7 = 1024;
            } else {
                i7 = length;
            }
            int i15 = i7 + length;
            if (i15 >= i14) {
                i14 = i15;
            }
            int[] iArr2 = new int[i14];
            AbstractC1804l.m3015H(iArr, iArr2, 0, 0, length);
            this.f13891c = iArr2;
        }
        int i16 = this.f13894f + i13;
        Object[] objArr = this.f13893e;
        int length2 = objArr.length;
        if (i16 > length2) {
            if (length2 <= 1024) {
                i10 = length2;
            }
            int i17 = i10 + length2;
            if (i17 >= i16) {
                i16 = i17;
            }
            Object[] objArr2 = new Object[i16];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f13893e = objArr2;
        }
        AbstractC0398h[] abstractC0398hArr3 = this.f13889a;
        int i18 = this.f13890b;
        this.f13890b = i18 + 1;
        abstractC0398hArr3[i18] = abstractC0398h;
        this.f13892d += abstractC0398h.f1360b;
        this.f13894f += i13;
    }
}
