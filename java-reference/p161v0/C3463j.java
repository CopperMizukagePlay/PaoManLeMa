package p161v0;

import java.util.ArrayList;
import java.util.Iterator;
import p015b6.C0306m;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1807o;
import p077k.C2223y;
import p100n.C2673p1;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.j */
/* loaded from: classes.dex */
public final class C3463j implements Iterable, InterfaceC3594a {

    /* renamed from: i */
    public static final C3463j f16711i = new C3463j(0, 0, 0, null);

    /* renamed from: e */
    public final long f16712e;

    /* renamed from: f */
    public final long f16713f;

    /* renamed from: g */
    public final long f16714g;

    /* renamed from: h */
    public final long[] f16715h;

    public C3463j(long j6, long j7, long j8, long[] jArr) {
        this.f16712e = j6;
        this.f16713f = j7;
        this.f16714g = j8;
        this.f16715h = jArr;
    }

    /* renamed from: a */
    public final C3463j m5229a(C3463j c3463j) {
        C3463j c3463j2;
        long j6;
        long[] jArr;
        C3463j c3463j3 = f16711i;
        if (c3463j == c3463j3) {
            return this;
        }
        if (this == c3463j3) {
            return c3463j3;
        }
        long j7 = c3463j.f16714g;
        long j8 = c3463j.f16714g;
        long[] jArr2 = c3463j.f16715h;
        long j9 = c3463j.f16713f;
        long j10 = c3463j.f16712e;
        long j11 = this.f16714g;
        if (j7 == j11 && jArr2 == (jArr = this.f16715h)) {
            return new C3463j(this.f16712e & (~j10), this.f16713f & (~j9), j11, jArr);
        }
        if (jArr2 != null) {
            c3463j2 = this;
            for (long j12 : jArr2) {
                c3463j2 = c3463j2.m5230b(j12);
            }
        } else {
            c3463j2 = this;
        }
        long j13 = 0;
        if (j9 != 0) {
            int i7 = 0;
            while (i7 < 64) {
                if (((1 << i7) & j9) != j13) {
                    j6 = j13;
                    c3463j2 = c3463j2.m5230b(i7 + j8);
                } else {
                    j6 = j13;
                }
                i7++;
                j13 = j6;
            }
        }
        long j14 = j13;
        if (j10 != j14) {
            for (int i8 = 0; i8 < 64; i8++) {
                if (((1 << i8) & j10) != j14) {
                    c3463j2 = c3463j2.m5230b(i8 + j8 + 64);
                }
            }
        }
        return c3463j2;
    }

    /* renamed from: b */
    public final C3463j m5230b(long j6) {
        long[] jArr;
        int m5262c;
        long[] jArr2;
        long j7 = j6 - this.f16714g;
        long j8 = 0;
        if (AbstractC3367j.m5102g(j7, j8) >= 0 && AbstractC3367j.m5102g(j7, 64) < 0) {
            long j9 = 1 << ((int) j7);
            long j10 = this.f16713f;
            if ((j10 & j9) != 0) {
                return new C3463j(this.f16712e, j10 & (~j9), this.f16714g, this.f16715h);
            }
        } else if (AbstractC3367j.m5102g(j7, 64) >= 0 && AbstractC3367j.m5102g(j7, 128) < 0) {
            long j11 = 1 << (((int) j7) - 64);
            long j12 = this.f16712e;
            if ((j12 & j11) != 0) {
                return new C3463j(j12 & (~j11), this.f16713f, this.f16714g, this.f16715h);
            }
        } else if (AbstractC3367j.m5102g(j7, j8) < 0 && (jArr = this.f16715h) != null && (m5262c = AbstractC3470q.m5262c(jArr, j6)) >= 0) {
            int length = jArr.length;
            int i7 = length - 1;
            if (i7 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i7];
                if (m5262c > 0) {
                    AbstractC1804l.m3016I(jArr, jArr3, 0, 0, m5262c);
                }
                if (m5262c < i7) {
                    AbstractC1804l.m3016I(jArr, jArr3, m5262c, m5262c + 1, length);
                }
                jArr2 = jArr3;
            }
            return new C3463j(this.f16712e, this.f16713f, this.f16714g, jArr2);
        }
        return this;
    }

    /* renamed from: c */
    public final boolean m5231c(long j6) {
        long[] jArr;
        long j7 = j6 - this.f16714g;
        long j8 = 0;
        if (AbstractC3367j.m5102g(j7, j8) >= 0 && AbstractC3367j.m5102g(j7, 64) < 0) {
            if (((1 << ((int) j7)) & this.f16713f) == 0) {
                return false;
            }
            return true;
        }
        if (AbstractC3367j.m5102g(j7, 64) >= 0 && AbstractC3367j.m5102g(j7, 128) < 0) {
            if (((1 << (((int) j7) - 64)) & this.f16712e) == 0) {
                return false;
            }
            return true;
        }
        if (AbstractC3367j.m5102g(j7, j8) > 0 || (jArr = this.f16715h) == null || AbstractC3470q.m5262c(jArr, j6) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final C3463j m5232d(C3463j c3463j) {
        C3463j c3463j2;
        C3463j c3463j3;
        long[] jArr;
        C3463j c3463j4 = f16711i;
        if (c3463j == c3463j4) {
            return this;
        }
        if (this == c3463j4) {
            return c3463j;
        }
        long j6 = c3463j.f16714g;
        long j7 = c3463j.f16714g;
        long[] jArr2 = c3463j.f16715h;
        long j8 = c3463j.f16713f;
        long j9 = c3463j.f16712e;
        long j10 = this.f16714g;
        long j11 = this.f16713f;
        long j12 = this.f16712e;
        if (j6 == j10 && jArr2 == (jArr = this.f16715h)) {
            return new C3463j(j12 | j9, j11 | j8, j10, jArr);
        }
        int i7 = 0;
        long[] jArr3 = this.f16715h;
        if (jArr3 == null) {
            if (jArr3 != null) {
                c3463j3 = c3463j;
                for (long j13 : jArr3) {
                    c3463j3 = c3463j3.m5233e(j13);
                }
            } else {
                c3463j3 = c3463j;
            }
            long j14 = this.f16714g;
            if (j11 != 0) {
                for (int i8 = 0; i8 < 64; i8++) {
                    if (((1 << i8) & j11) != 0) {
                        c3463j3 = c3463j3.m5233e(i8 + j14);
                    }
                }
            }
            if (j12 != 0) {
                while (i7 < 64) {
                    if (((1 << i7) & j12) != 0) {
                        c3463j3 = c3463j3.m5233e(i7 + j14 + 64);
                    }
                    i7++;
                }
            }
            return c3463j3;
        }
        if (jArr2 != null) {
            c3463j2 = this;
            for (long j15 : jArr2) {
                c3463j2 = c3463j2.m5233e(j15);
            }
        } else {
            c3463j2 = this;
        }
        if (j8 != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if (((1 << i9) & j8) != 0) {
                    c3463j2 = c3463j2.m5233e(i9 + j7);
                }
            }
        }
        if (j9 != 0) {
            while (i7 < 64) {
                if (((1 << i7) & j9) != 0) {
                    c3463j2 = c3463j2.m5233e(i7 + j7 + 64);
                }
                i7++;
            }
        }
        return c3463j2;
    }

    /* renamed from: e */
    public final C3463j m5233e(long j6) {
        long[] jArr;
        long j7;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j8 = this.f16714g;
        long j9 = j6 - j8;
        long j10 = 0;
        int m5102g = AbstractC3367j.m5102g(j9, j10);
        long j11 = this.f16713f;
        int i7 = 64;
        long j12 = 0;
        if (m5102g >= 0 && AbstractC3367j.m5102g(j9, 64) < 0) {
            long j13 = 1 << ((int) j9);
            if ((j11 & j13) == 0) {
                return new C3463j(this.f16712e, j11 | j13, this.f16714g, this.f16715h);
            }
        } else {
            long j14 = 64;
            int m5102g2 = AbstractC3367j.m5102g(j9, j14);
            long j15 = this.f16712e;
            if (m5102g2 >= 0 && AbstractC3367j.m5102g(j9, 128) < 0) {
                long j16 = 1 << (((int) j9) - 64);
                if ((j15 & j16) == 0) {
                    return new C3463j(j15 | j16, this.f16713f, this.f16714g, this.f16715h);
                }
            } else {
                long j17 = 128;
                int m5102g3 = AbstractC3367j.m5102g(j9, j17);
                long[] jArr5 = this.f16715h;
                if (m5102g3 >= 0) {
                    if (!m5231c(j6)) {
                        long j18 = 1;
                        long j19 = ((j6 + j18) / j14) * j14;
                        if (AbstractC3367j.m5102g(j19, j10) < 0) {
                            j19 = (Long.MAX_VALUE - j17) + j18;
                        }
                        long j20 = j8;
                        long j21 = j15;
                        C2673p1 c2673p1 = null;
                        while (true) {
                            if (AbstractC3367j.m5102g(j20, j19) < 0) {
                                if (j11 != 0) {
                                    if (c2673p1 == null) {
                                        c2673p1 = new C2673p1(jArr5);
                                    }
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j11 & (1 << i8)) != 0) {
                                            jArr4 = jArr5;
                                            ((C2223y) c2673p1.f14390f).m3659a(i8 + j20);
                                        } else {
                                            jArr4 = jArr5;
                                        }
                                        i8++;
                                        jArr5 = jArr4;
                                        i7 = 64;
                                    }
                                }
                                long[] jArr6 = jArr5;
                                if (j21 == 0) {
                                    j7 = j19;
                                    jArr = jArr6;
                                    break;
                                }
                                j20 += j14;
                                jArr5 = jArr6;
                                j11 = j21;
                                i7 = 64;
                                j21 = 0;
                            } else {
                                jArr = jArr5;
                                j7 = j20;
                                j12 = j11;
                                break;
                            }
                        }
                        if (c2673p1 != null) {
                            C2223y c2223y = (C2223y) c2673p1.f14390f;
                            int i9 = c2223y.f12763b;
                            if (i9 == 0) {
                                jArr3 = null;
                            } else {
                                long[] jArr7 = new long[i9];
                                long[] jArr8 = c2223y.f12762a;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    jArr7[i10] = jArr8[i10];
                                }
                                jArr3 = jArr7;
                            }
                            if (jArr3 != null) {
                                jArr2 = jArr3;
                                return new C3463j(j21, j12, j7, jArr2).m5233e(j6);
                            }
                        }
                        jArr2 = jArr;
                        return new C3463j(j21, j12, j7, jArr2).m5233e(j6);
                    }
                } else {
                    if (jArr5 == null) {
                        return new C3463j(this.f16712e, this.f16713f, this.f16714g, new long[]{j6});
                    }
                    int m5262c = AbstractC3470q.m5262c(jArr5, j6);
                    if (m5262c < 0) {
                        int i11 = -(m5262c + 1);
                        int length = jArr5.length;
                        long[] jArr9 = new long[length + 1];
                        AbstractC1804l.m3016I(jArr5, jArr9, 0, 0, i11);
                        AbstractC1804l.m3016I(jArr5, jArr9, i11 + 1, i11, length);
                        jArr9[i11] = j6;
                        return new C3463j(this.f16712e, this.f16713f, this.f16714g, jArr9);
                    }
                }
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC3393k.m5155z(new C3462i(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(this));
        Iterator it = iterator();
        while (true) {
            C0306m c0306m = (C0306m) it;
            if (!c0306m.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) c0306m.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = arrayList.get(i8);
            boolean z7 = true;
            i7++;
            if (i7 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null) {
                z7 = obj instanceof CharSequence;
            }
            if (z7) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
