package p151t6;

import java.io.IOException;
import java.util.ArrayList;
import p006a7.C0130m;
import p006a7.C0138u;
import p014b5.C0288b;
import p060h5.AbstractC1804l;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.c */
/* loaded from: classes.dex */
public final class C3289c {

    /* renamed from: c */
    public final C0138u f16144c;

    /* renamed from: f */
    public int f16147f;

    /* renamed from: g */
    public int f16148g;

    /* renamed from: a */
    public int f16142a = 4096;

    /* renamed from: b */
    public final ArrayList f16143b = new ArrayList();

    /* renamed from: d */
    public C3287b[] f16145d = new C3287b[8];

    /* renamed from: e */
    public int f16146e = 7;

    public C3289c(C3304r c3304r) {
        this.f16144c = new C0138u(c3304r);
    }

    /* renamed from: a */
    public final int m4994a(int i7) {
        int i8;
        int i9 = 0;
        if (i7 > 0) {
            int length = this.f16145d.length;
            while (true) {
                length--;
                i8 = this.f16146e;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                C3287b c3287b = this.f16145d[length];
                AbstractC3367j.m5097b(c3287b);
                int i10 = c3287b.f16140c;
                i7 -= i10;
                this.f16148g -= i10;
                this.f16147f--;
                i9++;
            }
            C3287b[] c3287bArr = this.f16145d;
            System.arraycopy(c3287bArr, i8 + 1, c3287bArr, i8 + 1 + i9, this.f16147f);
            this.f16146e += i9;
        }
        return i9;
    }

    /* renamed from: b */
    public final C0130m m4995b(int i7) {
        if (i7 >= 0) {
            C3287b[] c3287bArr = AbstractC3291e.f16157a;
            if (i7 <= c3287bArr.length - 1) {
                return c3287bArr[i7].f16138a;
            }
        }
        int length = this.f16146e + 1 + (i7 - AbstractC3291e.f16157a.length);
        if (length >= 0) {
            C3287b[] c3287bArr2 = this.f16145d;
            if (length < c3287bArr2.length) {
                C3287b c3287b = c3287bArr2[length];
                AbstractC3367j.m5097b(c3287b);
                return c3287b.f16138a;
            }
        }
        throw new IOException("Header index too large " + (i7 + 1));
    }

    /* renamed from: c */
    public final void m4996c(C3287b c3287b) {
        this.f16143b.add(c3287b);
        int i7 = c3287b.f16140c;
        int i8 = this.f16142a;
        if (i7 > i8) {
            AbstractC1804l.m3023P(r7, 0, this.f16145d.length);
            this.f16146e = this.f16145d.length - 1;
            this.f16147f = 0;
            this.f16148g = 0;
            return;
        }
        m4994a((this.f16148g + i7) - i8);
        int i9 = this.f16147f + 1;
        C3287b[] c3287bArr = this.f16145d;
        if (i9 > c3287bArr.length) {
            C3287b[] c3287bArr2 = new C3287b[c3287bArr.length * 2];
            System.arraycopy(c3287bArr, 0, c3287bArr2, c3287bArr.length, c3287bArr.length);
            this.f16146e = this.f16145d.length - 1;
            this.f16145d = c3287bArr2;
        }
        int i10 = this.f16146e;
        this.f16146e = i10 - 1;
        this.f16145d[i10] = c3287b;
        this.f16147f++;
        this.f16148g += i7;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, a7.i] */
    /* renamed from: d */
    public final C0130m m4997d() {
        boolean z7;
        C0138u c0138u = this.f16144c;
        byte readByte = c0138u.readByte();
        byte[] bArr = AbstractC2721b.f14569a;
        int i7 = readByte & 255;
        int i8 = 0;
        if ((readByte & 128) == 128) {
            z7 = true;
        } else {
            z7 = false;
        }
        long m4998e = m4998e(i7, 127);
        if (z7) {
            ?? obj = new Object();
            int[] iArr = AbstractC3311y.f16260a;
            AbstractC3367j.m5100e(c0138u, "source");
            C0288b c0288b = AbstractC3311y.f16262c;
            C0288b c0288b2 = c0288b;
            int i9 = 0;
            for (long j6 = 0; j6 < m4998e; j6++) {
                byte readByte2 = c0138u.readByte();
                byte[] bArr2 = AbstractC2721b.f14569a;
                i8 = (i8 << 8) | (readByte2 & 255);
                i9 += 8;
                while (i9 >= 8) {
                    C0288b[] c0288bArr = (C0288b[]) c0288b2.f1049h;
                    AbstractC3367j.m5097b(c0288bArr);
                    c0288b2 = c0288bArr[(i8 >>> (i9 - 8)) & 255];
                    AbstractC3367j.m5097b(c0288b2);
                    if (((C0288b[]) c0288b2.f1049h) == null) {
                        obj.m272y(c0288b2.f1047f);
                        i9 -= c0288b2.f1048g;
                        c0288b2 = c0288b;
                    } else {
                        i9 -= 8;
                    }
                }
            }
            while (i9 > 0) {
                C0288b[] c0288bArr2 = (C0288b[]) c0288b2.f1049h;
                AbstractC3367j.m5097b(c0288bArr2);
                C0288b c0288b3 = c0288bArr2[(i8 << (8 - i9)) & 255];
                AbstractC3367j.m5097b(c0288b3);
                int i10 = c0288b3.f1048g;
                if (((C0288b[]) c0288b3.f1049h) != null || i10 > i9) {
                    break;
                }
                obj.m272y(c0288b3.f1047f);
                i9 -= i10;
                c0288b2 = c0288b;
            }
            return obj.mo257i(obj.f524f);
        }
        return c0138u.mo257i(m4998e);
    }

    /* renamed from: e */
    public final int m4998e(int i7, int i8) {
        int i9 = i7 & i8;
        if (i9 < i8) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte readByte = this.f16144c.readByte();
            byte[] bArr = AbstractC2721b.f14569a;
            int i11 = readByte & 255;
            if ((readByte & 128) != 0) {
                i8 += (readByte & Byte.MAX_VALUE) << i10;
                i10 += 7;
            } else {
                return i8 + (i11 << i10);
            }
        }
    }
}
