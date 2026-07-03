package p151t6;

import java.util.ArrayList;
import java.util.Arrays;
import p006a7.C0126i;
import p006a7.C0130m;
import p060h5.AbstractC1804l;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.d */
/* loaded from: classes.dex */
public final class C3290d {

    /* renamed from: a */
    public final C0126i f16149a;

    /* renamed from: c */
    public boolean f16151c;

    /* renamed from: g */
    public int f16155g;

    /* renamed from: h */
    public int f16156h;

    /* renamed from: b */
    public int f16150b = Integer.MAX_VALUE;

    /* renamed from: d */
    public int f16152d = 4096;

    /* renamed from: e */
    public C3287b[] f16153e = new C3287b[8];

    /* renamed from: f */
    public int f16154f = 7;

    public C3290d(C0126i c0126i) {
        this.f16149a = c0126i;
    }

    /* renamed from: a */
    public final void m4999a(int i7) {
        int i8;
        if (i7 > 0) {
            int length = this.f16153e.length - 1;
            int i9 = 0;
            while (true) {
                i8 = this.f16154f;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                C3287b c3287b = this.f16153e[length];
                AbstractC3367j.m5097b(c3287b);
                i7 -= c3287b.f16140c;
                int i10 = this.f16156h;
                C3287b c3287b2 = this.f16153e[length];
                AbstractC3367j.m5097b(c3287b2);
                this.f16156h = i10 - c3287b2.f16140c;
                this.f16155g--;
                i9++;
                length--;
            }
            C3287b[] c3287bArr = this.f16153e;
            int i11 = i8 + 1;
            System.arraycopy(c3287bArr, i11, c3287bArr, i11 + i9, this.f16155g);
            C3287b[] c3287bArr2 = this.f16153e;
            int i12 = this.f16154f + 1;
            Arrays.fill(c3287bArr2, i12, i12 + i9, (Object) null);
            this.f16154f += i9;
        }
    }

    /* renamed from: b */
    public final void m5000b(C3287b c3287b) {
        int i7 = c3287b.f16140c;
        int i8 = this.f16152d;
        if (i7 > i8) {
            C3287b[] c3287bArr = this.f16153e;
            AbstractC1804l.m3023P(c3287bArr, 0, c3287bArr.length);
            this.f16154f = this.f16153e.length - 1;
            this.f16155g = 0;
            this.f16156h = 0;
            return;
        }
        m4999a((this.f16156h + i7) - i8);
        int i9 = this.f16155g + 1;
        C3287b[] c3287bArr2 = this.f16153e;
        if (i9 > c3287bArr2.length) {
            C3287b[] c3287bArr3 = new C3287b[c3287bArr2.length * 2];
            System.arraycopy(c3287bArr2, 0, c3287bArr3, c3287bArr2.length, c3287bArr2.length);
            this.f16154f = this.f16153e.length - 1;
            this.f16153e = c3287bArr3;
        }
        int i10 = this.f16154f;
        this.f16154f = i10 - 1;
        this.f16153e[i10] = c3287b;
        this.f16155g++;
        this.f16156h += i7;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, a7.i] */
    /* renamed from: c */
    public final void m5001c(C0130m c0130m) {
        AbstractC3367j.m5100e(c0130m, "data");
        int[] iArr = AbstractC3311y.f16260a;
        int mo286c = c0130m.mo286c();
        long j6 = 0;
        long j7 = 0;
        for (int i7 = 0; i7 < mo286c; i7++) {
            byte mo289f = c0130m.mo289f(i7);
            byte[] bArr = AbstractC2721b.f14569a;
            j7 += AbstractC3311y.f16261b[mo289f & 255];
        }
        int i8 = (int) ((j7 + 7) >> 3);
        int mo286c2 = c0130m.mo286c();
        C0126i c0126i = this.f16149a;
        if (i8 < mo286c2) {
            ?? obj = new Object();
            int[] iArr2 = AbstractC3311y.f16260a;
            int mo286c3 = c0130m.mo286c();
            int i9 = 0;
            for (int i10 = 0; i10 < mo286c3; i10++) {
                byte mo289f2 = c0130m.mo289f(i10);
                byte[] bArr2 = AbstractC2721b.f14569a;
                int i11 = mo289f2 & 255;
                int i12 = AbstractC3311y.f16260a[i11];
                byte b8 = AbstractC3311y.f16261b[i11];
                j6 = (j6 << b8) | i12;
                i9 += b8;
                while (i9 >= 8) {
                    i9 -= 8;
                    obj.m272y((int) (j6 >> i9));
                }
            }
            if (i9 > 0) {
                obj.m272y((int) ((j6 << (8 - i9)) | (255 >>> i9)));
            }
            C0130m mo257i = obj.mo257i(obj.f524f);
            m5003e(mo257i.mo286c(), 127, 128);
            c0126i.m268u(mo257i);
            return;
        }
        m5003e(c0130m.mo286c(), 127, 0);
        c0126i.m268u(c0130m);
    }

    /* renamed from: d */
    public final void m5002d(ArrayList arrayList) {
        int i7;
        int i8;
        if (this.f16151c) {
            int i9 = this.f16150b;
            if (i9 < this.f16152d) {
                m5003e(i9, 31, 32);
            }
            this.f16151c = false;
            this.f16150b = Integer.MAX_VALUE;
            m5003e(this.f16152d, 31, 32);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3287b c3287b = (C3287b) arrayList.get(i10);
            C0130m mo292i = c3287b.f16138a.mo292i();
            C0130m c0130m = c3287b.f16139b;
            Integer num = (Integer) AbstractC3291e.f16158b.get(mo292i);
            if (num != null) {
                int intValue = num.intValue();
                i8 = intValue + 1;
                if (2 <= i8 && i8 < 8) {
                    C3287b[] c3287bArr = AbstractC3291e.f16157a;
                    if (AbstractC3367j.m5096a(c3287bArr[intValue].f16139b, c0130m)) {
                        i7 = i8;
                    } else if (AbstractC3367j.m5096a(c3287bArr[i8].f16139b, c0130m)) {
                        i8 = intValue + 2;
                        i7 = i8;
                    }
                }
                i7 = i8;
                i8 = -1;
            } else {
                i7 = -1;
                i8 = -1;
            }
            if (i8 == -1) {
                int i11 = this.f16154f + 1;
                int length = this.f16153e.length;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    C3287b c3287b2 = this.f16153e[i11];
                    AbstractC3367j.m5097b(c3287b2);
                    if (AbstractC3367j.m5096a(c3287b2.f16138a, mo292i)) {
                        C3287b c3287b3 = this.f16153e[i11];
                        AbstractC3367j.m5097b(c3287b3);
                        if (AbstractC3367j.m5096a(c3287b3.f16139b, c0130m)) {
                            i8 = AbstractC3291e.f16157a.length + (i11 - this.f16154f);
                            break;
                        } else if (i7 == -1) {
                            i7 = (i11 - this.f16154f) + AbstractC3291e.f16157a.length;
                        }
                    }
                    i11++;
                }
            }
            if (i8 != -1) {
                m5003e(i8, 127, 128);
            } else if (i7 == -1) {
                this.f16149a.m272y(64);
                m5001c(mo292i);
                m5001c(c0130m);
                m5000b(c3287b);
            } else {
                C0130m c0130m2 = C3287b.f16132d;
                mo292i.getClass();
                AbstractC3367j.m5100e(c0130m2, "prefix");
                if (mo292i.mo290g(c0130m2.mo286c(), c0130m2) && !AbstractC3367j.m5096a(C3287b.f16137i, mo292i)) {
                    m5003e(i7, 15, 0);
                    m5001c(c0130m);
                } else {
                    m5003e(i7, 63, 64);
                    m5001c(c0130m);
                    m5000b(c3287b);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m5003e(int i7, int i8, int i9) {
        C0126i c0126i = this.f16149a;
        if (i7 < i8) {
            c0126i.m272y(i7 | i9);
            return;
        }
        c0126i.m272y(i9 | i8);
        int i10 = i7 - i8;
        while (i10 >= 128) {
            c0126i.m272y(128 | (i10 & 127));
            i10 >>>= 7;
        }
        c0126i.m272y(i10);
    }
}
