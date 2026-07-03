package p031d5;

import java.util.ArrayList;
import java.util.Arrays;
import p001a0.AbstractC0094y0;
import p067i4.C2069b;
import p077k.AbstractC2202l0;
import p077k.C2182b0;
import p099m6.EnumC2624y;
import p100n.AbstractC2647h;
import p101n0.C2705e;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3283g;
import p158u5.AbstractC3367j;
import p160v.AbstractC3405d0;
import p160v.C3408f;
import p160v.C3412h;
import p160v.InterfaceC3415i0;
import p160v.InterfaceC3438u;
import p170w1.InterfaceC3679g2;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d5.l */
/* loaded from: classes.dex */
public final class C0512l implements InterfaceC3415i0 {

    /* renamed from: a */
    public final /* synthetic */ int f1834a;

    /* renamed from: b */
    public int f1835b;

    /* renamed from: c */
    public Object f1836c;

    /* renamed from: d */
    public Object f1837d;

    public /* synthetic */ C0512l(int i7) {
        this.f1834a = i7;
    }

    /* renamed from: a */
    public void m1097a(int i7, InterfaceC3438u interfaceC3438u) {
        if (i7 >= 0) {
            if (i7 == 0) {
                return;
            }
            C3412h c3412h = new C3412h(this.f1835b, i7, interfaceC3438u);
            this.f1835b += i7;
            ((C2705e) this.f1836c).m4300b(c3412h);
            return;
        }
        throw new IllegalArgumentException(AbstractC2647h.m4256b("size should be >=0, but was ", i7).toString());
    }

    @Override // p160v.InterfaceC3415i0
    /* renamed from: b */
    public int mo1098b(Object obj) {
        C2182b0 c2182b0 = (C2182b0) this.f1836c;
        int m3551d = c2182b0.m3551d(obj);
        if (m3551d >= 0) {
            return c2182b0.f12623c[m3551d];
        }
        return -1;
    }

    /* renamed from: c */
    public void m1099c(int i7) {
        if (i7 >= 0 && i7 < this.f1835b) {
            return;
        }
        StringBuilder m188o = AbstractC0094y0.m188o(i7, "Index ", ", size ");
        m188o.append(this.f1835b);
        throw new IndexOutOfBoundsException(m188o.toString());
    }

    /* renamed from: d */
    public C3412h m1100d(int i7) {
        m1099c(i7);
        C3412h c3412h = (C3412h) this.f1837d;
        if (c3412h != null) {
            int i8 = c3412h.f16551a;
            if (i7 < c3412h.f16552b + i8 && i8 <= i7) {
                return c3412h;
            }
        }
        C2705e c2705e = (C2705e) this.f1836c;
        C3412h c3412h2 = (C3412h) c2705e.f14517e[AbstractC3405d0.m5170e(i7, c2705e)];
        this.f1837d = c3412h2;
        return c3412h2;
    }

    /* renamed from: e */
    public Object m1101e(int i7) {
        Object[] objArr = (Object[]) this.f1837d;
        int i8 = i7 - this.f1835b;
        if (i8 >= 0) {
            AbstractC3367j.m5100e(objArr, "<this>");
            if (i8 <= objArr.length - 1) {
                return objArr[i8];
            }
            return null;
        }
        return null;
    }

    /* renamed from: f */
    public void m1102f(int i7, int i8, int i9, int i10, int i11, int i12, boolean z7, boolean z8) {
        long[] jArr = (long[]) this.f1836c;
        int i13 = this.f1835b;
        int i14 = i13 + 3;
        this.f1835b = i14;
        int length = jArr.length;
        if (length <= i14) {
            int max = Math.max(length * 2, i14);
            long[] copyOf = Arrays.copyOf(jArr, max);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            this.f1836c = copyOf;
            long[] copyOf2 = Arrays.copyOf((long[]) this.f1837d, max);
            AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
            this.f1837d = copyOf2;
        }
        long[] jArr2 = (long[]) this.f1836c;
        jArr2[i13] = (i8 << 32) | (i9 & 4294967295L);
        jArr2[i13 + 1] = (i10 << 32) | (i11 & 4294967295L);
        int i15 = i12 & 67108863;
        jArr2[i13 + 2] = ((z8 ? 1L : 0L) << 63) | ((z7 ? 1L : 0L) << 62) | (1 << 61) | (0 << 52) | (i15 << 26) | (i7 & 67108863);
        if (i12 >= 0) {
            for (int i16 = i13 - 3; i16 >= 0; i16 -= 3) {
                int i17 = i16 + 2;
                long j6 = jArr2[i17];
                if ((((int) j6) & 67108863) == i15) {
                    jArr2[i17] = (j6 & (-2301339409586323457L)) | (((i13 - i16) & 511) << 52);
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public void m1103g(int i7, InterfaceC3283g interfaceC3283g) {
        int i8 = i7 & 67108863;
        long[] jArr = (long[]) this.f1836c;
        int i9 = this.f1835b;
        for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
            if ((((int) jArr[i10 + 2]) & 67108863) == i8) {
                long j6 = jArr[i10];
                long j7 = jArr[i10 + 1];
                interfaceC3283g.mo1493i(Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) j6), Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) j7));
                return;
            }
        }
    }

    public String toString() {
        switch (this.f1834a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                if (((EnumC2624y) this.f1836c) == EnumC2624y.f14222f) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f1835b);
                sb.append(' ');
                sb.append((String) this.f1837d);
                String sb2 = sb.toString();
                AbstractC3367j.m5099d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C0512l(EnumC2624y enumC2624y, int i7, String str) {
        this.f1834a = 3;
        this.f1836c = enumC2624y;
        this.f1835b = i7;
        this.f1837d = str;
    }

    public C0512l(C2069b c2069b, ArrayList arrayList, int i7) {
        this.f1834a = 7;
        this.f1836c = c2069b;
        this.f1837d = arrayList;
        this.f1835b = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r9 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0512l(C3879d c3879d, AbstractC3405d0 abstractC3405d0) {
        Object c3408f;
        this.f1834a = 5;
        C0512l mo5053i = abstractC3405d0.mo5053i();
        int i7 = c3879d.f18163e;
        if (i7 >= 0) {
            int min = Math.min(c3879d.f18164f, mo5053i.f1835b - 1);
            if (min < i7) {
                C2182b0 c2182b0 = AbstractC2202l0.f12710a;
                AbstractC3367j.m5098c(c2182b0, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                this.f1836c = c2182b0;
                this.f1837d = new Object[0];
                this.f1835b = 0;
                return;
            }
            int i8 = (min - i7) + 1;
            this.f1837d = new Object[i8];
            this.f1835b = i7;
            C2182b0 c2182b02 = new C2182b0(i8);
            C2705e c2705e = (C2705e) mo5053i.f1836c;
            mo5053i.m1099c(i7);
            mo5053i.m1099c(min);
            if (min >= i7) {
                int m5170e = AbstractC3405d0.m5170e(i7, c2705e);
                int i9 = ((C3412h) c2705e.f14517e[m5170e]).f16551a;
                while (i9 <= min) {
                    C3412h c3412h = (C3412h) c2705e.f14517e[m5170e];
                    InterfaceC3279c key = c3412h.f16553c.getKey();
                    int i10 = c3412h.f16551a;
                    int max = Math.max(i7, i10);
                    int min2 = Math.min(min, (c3412h.f16552b + i10) - 1);
                    if (max <= min2) {
                        while (true) {
                            if (key != null) {
                                c3408f = key.mo23f(Integer.valueOf(max - i10));
                            }
                            c3408f = new C3408f(max);
                            c2182b02.m3555h(max, c3408f);
                            ((Object[]) this.f1837d)[max - this.f1835b] = c3408f;
                            max = max != min2 ? max + 1 : max;
                        }
                    }
                    i9 += c3412h.f16552b;
                    m5170e++;
                }
                this.f1836c = c2182b02;
                return;
            }
            throw new IllegalArgumentException(("toIndex (" + min + ") should be not smaller than fromIndex (" + i7 + ')').toString());
        }
        throw new IllegalStateException("negative nearestRange.first");
    }

    public C0512l() {
        this.f1834a = 4;
        this.f1836c = new C2705e(new C3412h[16]);
    }

    public C0512l(InterfaceC3679g2 interfaceC3679g2) {
        this.f1834a = 1;
        this.f1836c = interfaceC3679g2;
    }
}
