package p085l0;

import java.util.ArrayList;
import java.util.HashMap;
import p060h5.AbstractC1804l;
import p077k.AbstractC2205n;
import p077k.C2184c0;
import p077k.C2220v;
import p077k.C2221w;
import p077k.C2222x;
import p084l.AbstractC2334a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.d2 */
/* loaded from: classes.dex */
public final class C2350d2 {

    /* renamed from: a */
    public final C2338a2 f13359a;

    /* renamed from: b */
    public int[] f13360b;

    /* renamed from: c */
    public Object[] f13361c;

    /* renamed from: d */
    public ArrayList f13362d;

    /* renamed from: e */
    public HashMap f13363e;

    /* renamed from: f */
    public C2221w f13364f;

    /* renamed from: g */
    public int f13365g;

    /* renamed from: h */
    public int f13366h;

    /* renamed from: i */
    public int f13367i;

    /* renamed from: j */
    public int f13368j;

    /* renamed from: k */
    public int f13369k;

    /* renamed from: l */
    public int f13370l;

    /* renamed from: m */
    public int f13371m;

    /* renamed from: n */
    public int f13372n;

    /* renamed from: o */
    public int f13373o;

    /* renamed from: p */
    public final C2388n0 f13374p;

    /* renamed from: q */
    public final C2388n0 f13375q;

    /* renamed from: r */
    public final C2388n0 f13376r;

    /* renamed from: s */
    public C2221w f13377s;

    /* renamed from: t */
    public int f13378t;

    /* renamed from: u */
    public int f13379u;

    /* renamed from: v */
    public int f13380v;

    /* renamed from: w */
    public boolean f13381w;

    /* renamed from: x */
    public C2220v f13382x;

    public C2350d2(C2338a2 c2338a2) {
        this.f13359a = c2338a2;
        int[] iArr = c2338a2.f13329e;
        this.f13360b = iArr;
        Object[] objArr = c2338a2.f13331g;
        this.f13361c = objArr;
        this.f13362d = c2338a2.f13337m;
        this.f13363e = c2338a2.f13338n;
        this.f13364f = c2338a2.f13339o;
        int i7 = c2338a2.f13330f;
        this.f13365g = i7;
        this.f13366h = (iArr.length / 5) - i7;
        int i8 = c2338a2.f13332h;
        this.f13369k = i8;
        this.f13370l = objArr.length - i8;
        this.f13371m = i7;
        this.f13374p = new C2388n0();
        this.f13375q = new C2388n0();
        this.f13376r = new C2388n0();
        this.f13379u = i7;
        this.f13380v = -1;
    }

    /* renamed from: i */
    public static int m3743i(int i7, int i8, int i9, int i10) {
        if (i7 > i8) {
            return -(((i10 - i9) - i7) + 1);
        }
        return i7;
    }

    /* renamed from: y */
    public static void m3744y(C2350d2 c2350d2) {
        int i7 = c2350d2.f13380v;
        int m3781r = c2350d2.m3781r(i7);
        int[] iArr = c2350d2.f13360b;
        int i8 = (m3781r * 5) + 1;
        int i9 = iArr[i8];
        if ((i9 & 134217728) == 0) {
            int i10 = (i9 & (-134217729)) | 134217728;
            iArr[i8] = i10;
            if ((67108864 & i10) != 0) {
                return;
            }
            c2350d2.m3763S(c2350d2.m3748D(iArr, i7));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.f13360b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        p060h5.AbstractC1804l.m3015H(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        p060h5.AbstractC1804l.m3015H(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3745A(int i7) {
        int m3779p;
        C2335a c2335a;
        int i8;
        C2335a c2335a2;
        int i9;
        int i10;
        int i11 = this.f13366h;
        int i12 = this.f13365g;
        if (i12 != i7) {
            if (!this.f13362d.isEmpty()) {
                int m3778o = m3778o() - this.f13366h;
                if (i12 < i7) {
                    for (int m3732b = AbstractC2346c2.m3732b(this.f13362d, i12, m3778o); m3732b < this.f13362d.size() && (i9 = (c2335a2 = (C2335a) this.f13362d.get(m3732b)).f13325a) < 0 && (i10 = i9 + m3778o) < i7; m3732b++) {
                        c2335a2.f13325a = i10;
                    }
                } else {
                    for (int m3732b2 = AbstractC2346c2.m3732b(this.f13362d, i7, m3778o); m3732b2 < this.f13362d.size() && (i8 = (c2335a = (C2335a) this.f13362d.get(m3732b2)).f13325a) >= 0; m3732b2++) {
                        c2335a.f13325a = -(m3778o - i8);
                    }
                }
            }
            if (i7 < i12) {
                i12 = i7 + i11;
            }
            int m3778o2 = m3778o();
            if (i12 >= m3778o2) {
                AbstractC2399q.m3900c("Check failed");
            }
            while (i12 < m3778o2) {
                int i13 = (i12 * 5) + 2;
                int i14 = this.f13360b[i13];
                if (i14 > -2) {
                    m3779p = i14;
                } else {
                    m3779p = (m3779p() + i14) - (-2);
                }
                if (m3779p >= i7) {
                    m3779p = -((m3779p() - m3779p) - (-2));
                }
                if (m3779p != i14) {
                    this.f13360b[i13] = m3779p;
                }
                i12++;
                if (i12 == i7) {
                    i12 += i11;
                }
            }
        }
        this.f13365g = i7;
    }

    /* renamed from: B */
    public final void m3746B(int i7, int i8) {
        boolean z7;
        boolean z8;
        int i9 = this.f13370l;
        int i10 = this.f13369k;
        int i11 = this.f13371m;
        if (i10 != i7) {
            Object[] objArr = this.f13361c;
            if (i7 < i10) {
                System.arraycopy(objArr, i7, objArr, i7 + i9, i10 - i7);
            } else {
                int i12 = i10 + i9;
                System.arraycopy(objArr, i12, objArr, i10, (i7 + i9) - i12);
            }
        }
        int min = Math.min(i8 + 1, m3779p());
        if (i11 != min) {
            int length = this.f13361c.length - i9;
            if (min < i11) {
                int m3781r = m3781r(min);
                int m3781r2 = m3781r(i11);
                int i13 = this.f13365g;
                while (m3781r < m3781r2) {
                    int i14 = (m3781r * 5) + 4;
                    int i15 = this.f13360b[i14];
                    if (i15 >= 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z8) {
                        AbstractC2399q.m3900c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f13360b[i14] = -((length - i15) + 1);
                    m3781r++;
                    if (m3781r == i13) {
                        m3781r += this.f13366h;
                    }
                }
            } else {
                int m3781r3 = m3781r(i11);
                int m3781r4 = m3781r(min);
                while (m3781r3 < m3781r4) {
                    int i16 = (m3781r3 * 5) + 4;
                    int i17 = this.f13360b[i16];
                    if (i17 < 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!z7) {
                        AbstractC2399q.m3900c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f13360b[i16] = i17 + length + 1;
                    m3781r3++;
                    if (m3781r3 == this.f13365g) {
                        m3781r3 += this.f13366h;
                    }
                }
            }
            this.f13371m = min;
        }
        this.f13369k = i7;
    }

    /* renamed from: C */
    public final Object m3747C(int i7) {
        int m3781r = m3781r(i7);
        int[] iArr = this.f13360b;
        if ((iArr[(m3781r * 5) + 1] & 1073741824) != 0) {
            return this.f13361c[m3772h(m3771g(iArr, m3781r))];
        }
        return null;
    }

    /* renamed from: D */
    public final int m3748D(int[] iArr, int i7) {
        int i8 = iArr[(m3781r(i7) * 5) + 2];
        if (i8 > -2) {
            return i8;
        }
        return (m3779p() + i8) - (-2);
    }

    /* renamed from: E */
    public final Object m3749E(Object obj) {
        if (this.f13372n > 0) {
            m3786w(1, this.f13380v);
        }
        Object[] objArr = this.f13361c;
        int i7 = this.f13367i;
        this.f13367i = i7 + 1;
        Object obj2 = objArr[m3772h(i7)];
        if (this.f13367i > this.f13368j) {
            AbstractC2399q.m3900c("Writing to an invalid slot");
        }
        this.f13361c[m3772h(this.f13367i - 1)] = obj;
        return obj2;
    }

    /* renamed from: F */
    public final void m3750F() {
        int i7;
        int i8;
        C2220v c2220v = this.f13382x;
        if (c2220v != null) {
            while (c2220v.f12755b != 0) {
                int m3956E = AbstractC2418w.m3956E(c2220v);
                int m3781r = m3781r(m3956E);
                int i9 = m3956E + 1;
                int m3783t = m3783t(m3956E) + m3956E;
                while (true) {
                    i7 = 0;
                    if (i9 < m3783t) {
                        if ((this.f13360b[(m3781r(i9) * 5) + 1] & 201326592) != 0) {
                            i8 = 1;
                            break;
                        }
                        i9 += m3783t(i9);
                    } else {
                        i8 = 0;
                        break;
                    }
                }
                int[] iArr = this.f13360b;
                int i10 = (m3781r * 5) + 1;
                int i11 = iArr[i10];
                if ((67108864 & i11) != 0) {
                    i7 = 1;
                }
                if (i7 != i8) {
                    iArr[i10] = (i8 << 26) | ((-67108865) & i11);
                    int m3748D = m3748D(iArr, m3956E);
                    if (m3748D >= 0) {
                        AbstractC2418w.m3968j(c2220v, m3748D);
                    }
                }
            }
        }
    }

    /* renamed from: G */
    public final boolean m3751G() {
        boolean z7;
        if (this.f13372n == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2399q.m3900c("Cannot remove group while inserting");
        }
        int i7 = this.f13378t;
        int i8 = this.f13367i;
        int m3771g = m3771g(this.f13360b, m3781r(i7));
        int m3755K = m3755K();
        m3758N(this.f13380v);
        C2220v c2220v = this.f13382x;
        if (c2220v != null) {
            while (true) {
                int i9 = c2220v.f12755b;
                if (i9 == 0) {
                    break;
                }
                if (i9 != 0) {
                    if (c2220v.f12754a[0] < i7) {
                        break;
                    }
                    AbstractC2418w.m3956E(c2220v);
                } else {
                    AbstractC2334a.m3714e("IntList is empty.");
                    throw null;
                }
            }
        }
        boolean m3752H = m3752H(i7, this.f13378t - i7);
        m3753I(m3771g, this.f13367i - m3771g, i7 - 1);
        this.f13378t = i7;
        this.f13367i = i8;
        this.f13373o -= m3755K;
        return m3752H;
    }

    /* renamed from: H */
    public final boolean m3752H(int i7, int i8) {
        boolean z7 = false;
        if (i8 > 0) {
            ArrayList arrayList = this.f13362d;
            m3745A(i7);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f13363e;
                int i9 = i7 + i8;
                int m3732b = AbstractC2346c2.m3732b(this.f13362d, i9, m3778o() - this.f13366h);
                if (m3732b >= this.f13362d.size()) {
                    m3732b--;
                }
                int i10 = m3732b + 1;
                int i11 = 0;
                while (m3732b >= 0) {
                    C2335a c2335a = (C2335a) this.f13362d.get(m3732b);
                    int m3767c = m3767c(c2335a);
                    if (m3767c < i7) {
                        break;
                    }
                    if (m3767c < i9) {
                        c2335a.f13325a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i11 == 0) {
                            i11 = m3732b + 1;
                        }
                        i10 = m3732b;
                    }
                    m3732b--;
                }
                if (i10 < i11) {
                    z7 = true;
                }
                if (z7) {
                    this.f13362d.subList(i10, i11).clear();
                }
            }
            this.f13365g = i7;
            this.f13366h += i8;
            int i12 = this.f13371m;
            if (i12 > i7) {
                this.f13371m = Math.max(i7, i12 - i8);
            }
            int i13 = this.f13379u;
            if (i13 >= this.f13365g) {
                this.f13379u = i13 - i8;
            }
            int i14 = this.f13380v;
            if (i14 >= 0 && (this.f13360b[(m3781r(i14) * 5) + 1] & 67108864) != 0) {
                m3763S(i14);
            }
        }
        return z7;
    }

    /* renamed from: I */
    public final void m3753I(int i7, int i8, int i9) {
        if (i8 > 0) {
            int i10 = this.f13370l;
            int i11 = i7 + i8;
            m3746B(i11, i9);
            this.f13369k = i7;
            this.f13370l = i10 + i8;
            AbstractC1804l.m3023P(this.f13361c, i7, i11);
            int i12 = this.f13368j;
            if (i12 >= i7) {
                this.f13368j = i12 - i8;
            }
        }
    }

    /* renamed from: J */
    public final Object m3754J(int i7, int i8, Object obj) {
        int m3757M = m3757M(this.f13360b, m3781r(i7));
        int m3771g = m3771g(this.f13360b, m3781r(i7 + 1));
        int i9 = m3757M + i8;
        if (i9 < m3757M || i9 >= m3771g) {
            AbstractC2399q.m3900c("Write to an invalid slot index " + i8 + " for group " + i7);
        }
        int m3772h = m3772h(i9);
        Object[] objArr = this.f13361c;
        Object obj2 = objArr[m3772h];
        objArr[m3772h] = obj;
        return obj2;
    }

    /* renamed from: K */
    public final int m3755K() {
        int m3781r = m3781r(this.f13378t);
        int m3731a = AbstractC2346c2.m3731a(this.f13360b, m3781r) + this.f13378t;
        this.f13378t = m3731a;
        this.f13367i = m3771g(this.f13360b, m3781r(m3731a));
        int i7 = this.f13360b[(m3781r * 5) + 1];
        if ((1073741824 & i7) != 0) {
            return 1;
        }
        return i7 & 67108863;
    }

    /* renamed from: L */
    public final void m3756L() {
        int i7 = this.f13379u;
        this.f13378t = i7;
        this.f13367i = m3771g(this.f13360b, m3781r(i7));
    }

    /* renamed from: M */
    public final int m3757M(int[] iArr, int i7) {
        if (i7 >= m3778o()) {
            return this.f13361c.length - this.f13370l;
        }
        int m3733c = AbstractC2346c2.m3733c(iArr, i7);
        int i8 = this.f13370l;
        int length = this.f13361c.length;
        if (m3733c < 0) {
            return (length - i8) + m3733c + 1;
        }
        return m3733c;
    }

    /* renamed from: N */
    public final AbstractC2384m0 m3758N(int i7) {
        C2335a m3761Q;
        HashMap hashMap = this.f13363e;
        if (hashMap == null || (m3761Q = m3761Q(i7)) == null) {
            return null;
        }
        return (AbstractC2384m0) hashMap.get(m3761Q);
    }

    /* renamed from: O */
    public final void m3759O() {
        if (this.f13372n != 0) {
            AbstractC2399q.m3900c("Key must be supplied when inserting");
        }
        C2413u0 c2413u0 = C2375k.f13421a;
        m3760P(c2413u0, c2413u0, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public final void m3760P(Object obj, Object obj2, boolean z7, int i7) {
        Object[] objArr;
        int i8;
        int i9;
        int i10;
        int i11 = this.f13380v;
        if (this.f13372n > 0) {
            objArr = true;
        } else {
            objArr = false;
        }
        this.f13376r.m3823c(this.f13373o);
        C2413u0 c2413u0 = C2375k.f13421a;
        if (objArr != false) {
            int i12 = this.f13378t;
            int m3771g = m3771g(this.f13360b, m3781r(i12));
            m3785v(1);
            this.f13367i = m3771g;
            this.f13368j = m3771g;
            int m3781r = m3781r(i12);
            if (obj != c2413u0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (!z7 && obj2 != c2413u0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            int m3743i = m3743i(m3771g, this.f13369k, this.f13370l, this.f13361c.length);
            if (m3743i >= 0 && this.f13371m < i12) {
                m3743i = -(((this.f13361c.length - this.f13370l) - m3743i) + 1);
            }
            int[] iArr = this.f13360b;
            int i13 = this.f13380v;
            int i14 = m3781r * 5;
            iArr[i14] = i7;
            iArr[i14 + 1] = ((z7 ? 1 : 0) << 30) | (i9 << 29) | (i10 << 28);
            iArr[i14 + 2] = i13;
            iArr[i14 + 3] = 0;
            iArr[i14 + 4] = m3743i;
            int i15 = (z7 ? 1 : 0) + i9 + i10;
            if (i15 > 0) {
                m3786w(i15, i12);
                Object[] objArr2 = this.f13361c;
                int i16 = this.f13367i;
                if (z7) {
                    objArr2[i16] = obj2;
                    i16++;
                }
                if (i9 != 0) {
                    objArr2[i16] = obj;
                    i16++;
                }
                if (i10 != 0) {
                    objArr2[i16] = obj2;
                    i16++;
                }
                this.f13367i = i16;
            }
            this.f13373o = 0;
            i8 = i12 + 1;
            this.f13380v = i12;
            this.f13378t = i8;
            if (i11 >= 0) {
                m3758N(i11);
            }
        } else {
            this.f13374p.m3823c(i11);
            this.f13375q.m3823c((m3778o() - this.f13366h) - this.f13379u);
            int i17 = this.f13378t;
            int m3781r2 = m3781r(i17);
            if (!AbstractC3367j.m5096a(obj2, c2413u0)) {
                if (z7) {
                    m3764T(this.f13378t, obj2);
                } else {
                    m3762R(obj2);
                }
            }
            this.f13367i = m3757M(this.f13360b, m3781r2);
            this.f13368j = m3771g(this.f13360b, m3781r(this.f13378t + 1));
            int[] iArr2 = this.f13360b;
            int i18 = m3781r2 * 5;
            this.f13373o = iArr2[i18 + 1] & 67108863;
            this.f13380v = i17;
            this.f13378t = i17 + 1;
            i8 = i17 + iArr2[i18 + 3];
        }
        this.f13379u = i8;
    }

    /* renamed from: Q */
    public final C2335a m3761Q(int i7) {
        ArrayList arrayList;
        int m3735e;
        if (i7 < 0 || i7 >= m3779p() || (m3735e = AbstractC2346c2.m3735e((arrayList = this.f13362d), i7, m3779p())) < 0) {
            return null;
        }
        return (C2335a) arrayList.get(m3735e);
    }

    /* renamed from: R */
    public final void m3762R(Object obj) {
        int m3781r = m3781r(this.f13378t);
        int i7 = (m3781r * 5) + 1;
        if ((this.f13360b[i7] & 268435456) == 0) {
            AbstractC2399q.m3900c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f13361c;
        int[] iArr = this.f13360b;
        objArr[m3772h(Integer.bitCount(iArr[i7] >> 29) + m3771g(iArr, m3781r))] = obj;
    }

    /* renamed from: S */
    public final void m3763S(int i7) {
        if (i7 >= 0) {
            C2220v c2220v = this.f13382x;
            if (c2220v == null) {
                c2220v = new C2220v();
                this.f13382x = c2220v;
            }
            AbstractC2418w.m3968j(c2220v, i7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3764T(int i7, Object obj) {
        boolean z7;
        int m3781r = m3781r(i7);
        int[] iArr = this.f13360b;
        if (m3781r < iArr.length) {
            z7 = true;
        }
        z7 = false;
        if (!z7) {
            AbstractC2399q.m3900c("Updating the node of a group at " + i7 + " that was not created with as a node group");
        }
        this.f13361c[m3772h(m3771g(this.f13360b, m3781r))] = obj;
    }

    /* renamed from: a */
    public final void m3765a(int i7) {
        boolean z7;
        boolean z8;
        boolean z9 = false;
        if (i7 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2399q.m3900c("Cannot seek backwards");
        }
        if (this.f13372n <= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            AbstractC2389n1.m3829b("Cannot call seek() while inserting");
        }
        if (i7 == 0) {
            return;
        }
        int i8 = this.f13378t + i7;
        if (i8 >= this.f13380v && i8 <= this.f13379u) {
            z9 = true;
        }
        if (!z9) {
            AbstractC2399q.m3900c("Cannot seek outside the current group (" + this.f13380v + '-' + this.f13379u + ')');
        }
        this.f13378t = i8;
        int m3771g = m3771g(this.f13360b, m3781r(i8));
        this.f13367i = m3771g;
        this.f13368j = m3771g;
    }

    /* renamed from: b */
    public final C2335a m3766b(int i7) {
        ArrayList arrayList = this.f13362d;
        int m3735e = AbstractC2346c2.m3735e(arrayList, i7, m3779p());
        if (m3735e < 0) {
            if (i7 > this.f13365g) {
                i7 = -(m3779p() - i7);
            }
            C2335a c2335a = new C2335a(i7);
            arrayList.add(-(m3735e + 1), c2335a);
            return c2335a;
        }
        return (C2335a) arrayList.get(m3735e);
    }

    /* renamed from: c */
    public final int m3767c(C2335a c2335a) {
        int i7 = c2335a.f13325a;
        if (i7 < 0) {
            return m3779p() + i7;
        }
        return i7;
    }

    /* renamed from: d */
    public final void m3768d() {
        int i7 = this.f13372n;
        this.f13372n = i7 + 1;
        if (i7 == 0) {
            this.f13375q.m3823c((m3778o() - this.f13366h) - this.f13379u);
        }
    }

    /* renamed from: e */
    public final void m3769e(boolean z7) {
        this.f13381w = true;
        if (z7 && this.f13374p.f13459b == 0) {
            m3745A(m3779p());
            m3746B(this.f13361c.length - this.f13370l, this.f13365g);
            int i7 = this.f13369k;
            AbstractC1804l.m3023P(this.f13361c, i7, this.f13370l + i7);
            m3750F();
        }
        int[] iArr = this.f13360b;
        int i8 = this.f13365g;
        Object[] objArr = this.f13361c;
        int i9 = this.f13369k;
        ArrayList arrayList = this.f13362d;
        HashMap hashMap = this.f13363e;
        C2221w c2221w = this.f13364f;
        C2338a2 c2338a2 = this.f13359a;
        if (!c2338a2.f13335k) {
            AbstractC2389n1.m3828a("Unexpected writer close()");
        }
        c2338a2.f13335k = false;
        c2338a2.f13329e = iArr;
        c2338a2.f13330f = i8;
        c2338a2.f13331g = objArr;
        c2338a2.f13332h = i9;
        c2338a2.f13337m = arrayList;
        c2338a2.f13338n = hashMap;
        c2338a2.f13339o = c2221w;
    }

    /* renamed from: f */
    public final int m3770f(int i7) {
        return m3771g(this.f13360b, m3781r(i7));
    }

    /* renamed from: g */
    public final int m3771g(int[] iArr, int i7) {
        if (i7 >= m3778o()) {
            return this.f13361c.length - this.f13370l;
        }
        int i8 = iArr[(i7 * 5) + 4];
        int i9 = this.f13370l;
        int length = this.f13361c.length;
        if (i8 < 0) {
            return (length - i9) + i8 + 1;
        }
        return i8;
    }

    /* renamed from: h */
    public final int m3772h(int i7) {
        int i8;
        int i9 = this.f13370l;
        if (i7 < this.f13369k) {
            i8 = 0;
        } else {
            i8 = 1;
        }
        return (i9 * i8) + i7;
    }

    /* renamed from: j */
    public final void m3773j() {
        boolean z7;
        boolean z8;
        int i7;
        int m3781r;
        C2184c0 c2184c0;
        int i8 = 0;
        if (this.f13372n > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i9 = this.f13378t;
        int i10 = this.f13379u;
        int i11 = this.f13380v;
        int m3781r2 = m3781r(i11);
        int i12 = this.f13373o;
        int i13 = i9 - i11;
        int i14 = m3781r2 * 5;
        int i15 = i14 + 1;
        if ((this.f13360b[i15] & 1073741824) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        C2388n0 c2388n0 = this.f13376r;
        if (z7) {
            C2221w c2221w = this.f13377s;
            if (c2221w != null && (c2184c0 = (C2184c0) c2221w.m3612b(i11)) != null) {
                Object[] objArr = c2184c0.f12628a;
                int i16 = c2184c0.f12629b;
                for (int i17 = 0; i17 < i16; i17++) {
                    m3749E(objArr[i17]);
                }
            }
            int[] iArr = this.f13360b;
            iArr[i14 + 3] = i13;
            AbstractC2346c2.m3734d(m3781r2, i12, iArr);
            int m3822b = c2388n0.m3822b();
            if (z8) {
                i12 = 1;
            }
            this.f13373o = m3822b + i12;
            int m3748D = m3748D(this.f13360b, i11);
            this.f13380v = m3748D;
            if (m3748D < 0) {
                m3781r = m3779p();
            } else {
                m3781r = m3781r(m3748D + 1);
            }
            if (m3781r >= 0) {
                i8 = m3771g(this.f13360b, m3781r);
            }
            this.f13367i = i8;
            this.f13368j = i8;
            return;
        }
        if (i9 != i10) {
            AbstractC2399q.m3900c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f13360b;
        int i18 = i14 + 3;
        int i19 = iArr2[i18];
        int i20 = iArr2[i15] & 67108863;
        iArr2[i18] = i13;
        AbstractC2346c2.m3734d(m3781r2, i12, iArr2);
        int m3822b2 = this.f13374p.m3822b();
        this.f13379u = (m3778o() - this.f13366h) - this.f13375q.m3822b();
        this.f13380v = m3822b2;
        int m3748D2 = m3748D(this.f13360b, i11);
        int m3822b3 = c2388n0.m3822b();
        this.f13373o = m3822b3;
        if (m3748D2 == m3822b2) {
            if (!z8) {
                i8 = i12 - i20;
            }
            this.f13373o = m3822b3 + i8;
            return;
        }
        int i21 = i13 - i19;
        if (z8) {
            i7 = 0;
        } else {
            i7 = i12 - i20;
        }
        if (i21 != 0 || i7 != 0) {
            while (m3748D2 != 0 && m3748D2 != m3822b2 && (i7 != 0 || i21 != 0)) {
                int m3781r3 = m3781r(m3748D2);
                if (i21 != 0) {
                    int[] iArr3 = this.f13360b;
                    int i22 = (m3781r3 * 5) + 3;
                    iArr3[i22] = iArr3[i22] + i21;
                }
                if (i7 != 0) {
                    int[] iArr4 = this.f13360b;
                    AbstractC2346c2.m3734d(m3781r3, (iArr4[(m3781r3 * 5) + 1] & 67108863) + i7, iArr4);
                }
                int[] iArr5 = this.f13360b;
                if ((iArr5[(m3781r3 * 5) + 1] & 1073741824) != 0) {
                    i7 = 0;
                }
                m3748D2 = m3748D(iArr5, m3748D2);
            }
        }
        this.f13373o += i7;
    }

    /* renamed from: k */
    public final void m3774k() {
        if (this.f13372n <= 0) {
            AbstractC2389n1.m3829b("Unbalanced begin/end insert");
        }
        int i7 = this.f13372n - 1;
        this.f13372n = i7;
        if (i7 == 0) {
            if (this.f13376r.f13459b != this.f13374p.f13459b) {
                AbstractC2399q.m3900c("startGroup/endGroup mismatch while inserting");
            }
            this.f13379u = (m3778o() - this.f13366h) - this.f13375q.m3822b();
        }
    }

    /* renamed from: l */
    public final void m3775l(int i7) {
        boolean z7;
        boolean z8 = false;
        if (this.f13372n <= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2399q.m3900c("Cannot call ensureStarted() while inserting");
        }
        int i8 = this.f13380v;
        if (i8 != i7) {
            if (i7 >= i8 && i7 < this.f13379u) {
                z8 = true;
            }
            if (!z8) {
                AbstractC2399q.m3900c("Started group at " + i7 + " must be a subgroup of the group at " + i8);
            }
            int i9 = this.f13378t;
            int i10 = this.f13367i;
            int i11 = this.f13368j;
            this.f13378t = i7;
            m3759O();
            this.f13378t = i9;
            this.f13367i = i10;
            this.f13368j = i11;
        }
    }

    /* renamed from: m */
    public final void m3776m(int i7, int i8, int i9) {
        if (i7 >= this.f13365g) {
            i7 = -((m3779p() - i7) + 2);
        }
        while (i9 < i8) {
            this.f13360b[(m3781r(i9) * 5) + 2] = i7;
            int i10 = this.f13360b[(m3781r(i9) * 5) + 3] + i9;
            m3776m(i9, i10, i9 + 1);
            i9 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
    
        throw null;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3777n(int i7, InterfaceC3281e interfaceC3281e) {
        int i8;
        int i9;
        int i10;
        C2335a c2335a;
        InterfaceC3281e interfaceC3281e2 = interfaceC3281e;
        int m3748D = m3748D(this.f13360b, i7);
        int m3779p = m3779p();
        int m3783t = m3783t(i7) + i7;
        int i11 = i7;
        C2222x c2222x = null;
        C2220v c2220v = null;
        loop0: while (i11 < m3783t) {
            int i12 = i11 + 1;
            int m3770f = m3770f(i12);
            for (int m3770f2 = m3770f(i11); m3770f2 < m3770f; m3770f2++) {
                Object obj = this.f13361c[m3772h(m3770f2)];
                if ((obj instanceof C2420w1) && (c2335a = ((C2420w1) obj).f13626b) != null && c2335a.m3715a()) {
                    int m3767c = m3767c(c2335a);
                    if (c2222x == null) {
                        int[] iArr = AbstractC2205n.f12714a;
                        c2222x = new C2222x();
                    }
                    if (c2220v == null) {
                        c2220v = new C2220v();
                    }
                    c2222x.m3653a(m3767c);
                    c2220v.m3643a(m3767c);
                    c2220v.m3643a(m3770f2);
                } else {
                    interfaceC3281e2.mo22d(Integer.valueOf(m3770f2), obj);
                }
            }
            if (i12 < m3779p) {
                i8 = m3748D(this.f13360b, i12);
            } else {
                i8 = -1;
            }
            if (i8 != i11) {
                while (true) {
                    if (c2220v != null && c2222x != null && c2222x.m3657e(i11)) {
                        int i13 = c2220v.f12755b;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int i18 = m3779p;
                            int m3645c = c2220v.m3645c(i17);
                            if (m3645c == i11) {
                                int m3645c2 = c2220v.m3645c(i17 + 1);
                                interfaceC3281e2.mo22d(Integer.valueOf(m3645c2), this.f13361c[m3772h(m3645c2)]);
                            } else if (i17 != i16) {
                                int i19 = i16 + 1;
                                c2220v.m3647e(i16, m3645c);
                                i16 += 2;
                                c2220v.m3647e(i19, c2220v.m3645c(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            interfaceC3281e2 = interfaceC3281e;
                            m3779p = i18;
                        }
                        i9 = m3779p;
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i10 = c2220v.f12755b) || i13 < 0 || i13 > i10) {
                                break loop0;
                            }
                            if (i13 >= i16) {
                                if (i13 != i16) {
                                    if (i13 < i10) {
                                        int[] iArr2 = c2220v.f12754a;
                                        AbstractC1804l.m3015H(iArr2, iArr2, i16, i13, i10);
                                    }
                                    c2220v.f12755b -= i13 - i16;
                                }
                            } else {
                                AbstractC2334a.m3712c("The end index must be < start index");
                                throw null;
                            }
                        }
                    } else {
                        i9 = m3779p;
                    }
                    if (i11 != i7 && m3748D != i8) {
                        i11 = m3748D;
                        m3779p = i9;
                        m3748D = m3748D(this.f13360b, m3748D);
                        interfaceC3281e2 = interfaceC3281e;
                    }
                }
            } else {
                i9 = m3779p;
            }
            interfaceC3281e2 = interfaceC3281e;
            m3748D = i8;
            i11 = i12;
            m3779p = i9;
        }
    }

    /* renamed from: o */
    public final int m3778o() {
        return this.f13360b.length / 5;
    }

    /* renamed from: p */
    public final int m3779p() {
        return m3778o() - this.f13366h;
    }

    /* renamed from: q */
    public final Object m3780q(int i7) {
        int m3781r = m3781r(i7);
        int[] iArr = this.f13360b;
        int i8 = (m3781r * 5) + 1;
        if ((iArr[i8] & 268435456) != 0) {
            return this.f13361c[Integer.bitCount(iArr[i8] >> 29) + m3771g(iArr, m3781r)];
        }
        return C2375k.f13421a;
    }

    /* renamed from: r */
    public final int m3781r(int i7) {
        int i8;
        int i9 = this.f13366h;
        if (i7 < this.f13365g) {
            i8 = 0;
        } else {
            i8 = 1;
        }
        return (i9 * i8) + i7;
    }

    /* renamed from: s */
    public final Object m3782s(int i7) {
        int m3781r = m3781r(i7);
        int[] iArr = this.f13360b;
        int i8 = m3781r * 5;
        int i9 = iArr[i8 + 1];
        if ((536870912 & i9) != 0) {
            return this.f13361c[Integer.bitCount(i9 >> 30) + iArr[i8 + 4]];
        }
        return null;
    }

    /* renamed from: t */
    public final int m3783t(int i7) {
        return AbstractC2346c2.m3731a(this.f13360b, m3781r(i7));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f13378t + " end=" + this.f13379u + " size = " + m3779p() + " gap=" + this.f13365g + '-' + (this.f13365g + this.f13366h) + ')';
    }

    /* renamed from: u */
    public final boolean m3784u(int i7, int i8) {
        int m3778o;
        int m3783t;
        if (i8 == this.f13380v) {
            m3778o = this.f13379u;
        } else {
            C2388n0 c2388n0 = this.f13374p;
            if (i8 > c2388n0.m3821a(0)) {
                m3783t = m3783t(i8);
            } else {
                int[] iArr = c2388n0.f13458a;
                int min = Math.min(iArr.length, c2388n0.f13459b);
                int i9 = 0;
                while (true) {
                    if (i9 < min) {
                        if (iArr[i9] == i8) {
                            break;
                        }
                        i9++;
                    } else {
                        i9 = -1;
                        break;
                    }
                }
                if (i9 < 0) {
                    m3783t = m3783t(i8);
                } else {
                    m3778o = (m3778o() - this.f13366h) - this.f13375q.f13458a[i9];
                }
            }
            m3778o = m3783t + i8;
        }
        if (i7 <= i8 || i7 >= m3778o) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final void m3785v(int i7) {
        int i8;
        if (i7 > 0) {
            int i9 = this.f13378t;
            m3745A(i9);
            int i10 = this.f13365g;
            int i11 = this.f13366h;
            int[] iArr = this.f13360b;
            int length = iArr.length / 5;
            int i12 = length - i11;
            int i13 = 0;
            if (i11 < i7) {
                int max = Math.max(Math.max(length * 2, i12 + i7), 32);
                int[] iArr2 = new int[max * 5];
                int i14 = max - i12;
                AbstractC1804l.m3015H(iArr, iArr2, 0, 0, i10 * 5);
                AbstractC1804l.m3015H(iArr, iArr2, (i10 + i14) * 5, (i11 + i10) * 5, length * 5);
                this.f13360b = iArr2;
                i11 = i14;
            }
            int i15 = this.f13379u;
            if (i15 >= i10) {
                this.f13379u = i15 + i7;
            }
            int i16 = i10 + i7;
            this.f13365g = i16;
            this.f13366h = i11 - i7;
            if (i12 > 0) {
                i8 = m3770f(i9 + i7);
            } else {
                i8 = 0;
            }
            if (this.f13371m >= i10) {
                i13 = this.f13369k;
            }
            int m3743i = m3743i(i8, i13, this.f13370l, this.f13361c.length);
            for (int i17 = i10; i17 < i16; i17++) {
                this.f13360b[(i17 * 5) + 4] = m3743i;
            }
            int i18 = this.f13371m;
            if (i18 >= i10) {
                this.f13371m = i18 + i7;
            }
        }
    }

    /* renamed from: w */
    public final void m3786w(int i7, int i8) {
        if (i7 > 0) {
            m3746B(this.f13367i, i8);
            int i9 = this.f13369k;
            int i10 = this.f13370l;
            if (i10 < i7) {
                Object[] objArr = this.f13361c;
                int length = objArr.length;
                int i11 = length - i10;
                int max = Math.max(Math.max(length * 2, i11 + i7), 32);
                Object[] objArr2 = new Object[max];
                for (int i12 = 0; i12 < max; i12++) {
                    objArr2[i12] = null;
                }
                int i13 = max - i11;
                int i14 = i10 + i9;
                System.arraycopy(objArr, 0, objArr2, 0, i9);
                System.arraycopy(objArr, i14, objArr2, i9 + i13, length - i14);
                this.f13361c = objArr2;
                i10 = i13;
            }
            int i15 = this.f13368j;
            if (i15 >= i9) {
                this.f13368j = i15 + i7;
            }
            this.f13369k = i9 + i7;
            this.f13370l = i10 - i7;
        }
    }

    /* renamed from: x */
    public final boolean m3787x(int i7) {
        if ((this.f13360b[(m3781r(i7) * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final void m3788z(C2338a2 c2338a2, int i7) {
        if (this.f13372n <= 0) {
            AbstractC2399q.m3900c("Check failed");
        }
        if (i7 == 0 && this.f13378t == 0 && this.f13359a.f13330f == 0) {
            int[] iArr = c2338a2.f13329e;
            int i8 = iArr[(i7 * 5) + 3];
            int i9 = c2338a2.f13330f;
            if (i8 == i9) {
                int[] iArr2 = this.f13360b;
                Object[] objArr = this.f13361c;
                ArrayList arrayList = this.f13362d;
                HashMap hashMap = this.f13363e;
                C2221w c2221w = this.f13364f;
                Object[] objArr2 = c2338a2.f13331g;
                int i10 = c2338a2.f13332h;
                HashMap hashMap2 = c2338a2.f13338n;
                C2221w c2221w2 = c2338a2.f13339o;
                this.f13360b = iArr;
                this.f13361c = objArr2;
                this.f13362d = c2338a2.f13337m;
                this.f13365g = i9;
                this.f13366h = (iArr.length / 5) - i9;
                this.f13369k = i10;
                this.f13370l = objArr2.length - i10;
                this.f13371m = i9;
                this.f13363e = hashMap2;
                this.f13364f = c2221w2;
                c2338a2.f13329e = iArr2;
                c2338a2.f13330f = 0;
                c2338a2.f13331g = objArr;
                c2338a2.f13332h = 0;
                c2338a2.f13337m = arrayList;
                c2338a2.f13338n = hashMap;
                c2338a2.f13339o = c2221w;
                return;
            }
        }
        C2350d2 m3721d = c2338a2.m3721d();
        try {
            AbstractC2418w.m3977u(m3721d, i7, this, true, true, false);
            m3721d.m3769e(true);
        } catch (Throwable th) {
            m3721d.m3769e(false);
            throw th;
        }
    }
}
