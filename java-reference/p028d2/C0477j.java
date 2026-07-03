package p028d2;

import java.util.Iterator;
import p053g5.InterfaceC1684c;
import p077k.AbstractC2210p0;
import p077k.C2194h0;
import p077k.C2195i;
import p077k.C2217t;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;
import p170w1.AbstractC3681h0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.j */
/* loaded from: classes.dex */
public final class C0477j implements Iterable, InterfaceC3594a {

    /* renamed from: e */
    public final C2194h0 f1683e;

    /* renamed from: f */
    public C2217t f1684f;

    /* renamed from: g */
    public boolean f1685g;

    /* renamed from: h */
    public boolean f1686h;

    public C0477j() {
        long[] jArr = AbstractC2210p0.f12722a;
        this.f1683e = new C2194h0();
    }

    /* renamed from: a */
    public final C0477j m1033a() {
        C0477j c0477j = new C0477j();
        c0477j.f1685g = this.f1685g;
        c0477j.f1686h = this.f1686h;
        C2194h0 c2194h0 = c0477j.f1683e;
        c2194h0.getClass();
        C2194h0 c2194h02 = this.f1683e;
        AbstractC3367j.m5100e(c2194h02, "from");
        Object[] objArr = c2194h02.f12677b;
        Object[] objArr2 = c2194h02.f12678c;
        long[] jArr = c2194h02.f12676a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128) {
                            int i10 = (i7 << 3) + i9;
                            c2194h0.m3598m(objArr[i10], objArr2[i10]);
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return c0477j;
    }

    /* renamed from: b */
    public final Object m1034b(C0490w c0490w) {
        Object m3592g = this.f1683e.m3592g(c0490w);
        if (m3592g != null) {
            return m3592g;
        }
        throw new IllegalStateException("Key not present: " + c0490w + " - consider getOrElse or getOrNull");
    }

    /* renamed from: c */
    public final void m1035c(C0477j c0477j) {
        C2194h0 c2194h0 = c0477j.f1683e;
        Object[] objArr = c2194h0.f12677b;
        Object[] objArr2 = c2194h0.f12678c;
        long[] jArr = c2194h0.f12676a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128) {
                            int i10 = (i7 << 3) + i9;
                            Object obj = objArr[i10];
                            Object obj2 = objArr2[i10];
                            C0490w c0490w = (C0490w) obj;
                            C2194h0 c2194h02 = this.f1683e;
                            Object m3592g = c2194h02.m3592g(c0490w);
                            AbstractC3367j.m5098c(c0490w, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                            Object mo22d = c0490w.f1770b.mo22d(m3592g, obj2);
                            if (mo22d != null) {
                                c2194h02.m3598m(c0490w, mo22d);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        return;
                    }
                }
                if (i7 != length) {
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final void m1036d(C0490w c0490w, Object obj) {
        boolean z7 = obj instanceof C0468a;
        C2194h0 c2194h0 = this.f1683e;
        if (z7 && c2194h0.m3588c(c0490w)) {
            Object m3592g = c2194h0.m3592g(c0490w);
            AbstractC3367j.m5098c(m3592g, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            C0468a c0468a = (C0468a) m3592g;
            C0468a c0468a2 = (C0468a) obj;
            String str = c0468a2.f1638a;
            if (str == null) {
                str = c0468a.f1638a;
            }
            InterfaceC1684c interfaceC1684c = c0468a2.f1639b;
            if (interfaceC1684c == null) {
                interfaceC1684c = c0468a.f1639b;
            }
            c2194h0.m3598m(c0490w, new C0468a(str, interfaceC1684c));
        } else {
            c2194h0.m3598m(c0490w, obj);
        }
        c0490w.getClass();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0477j) {
                C0477j c0477j = (C0477j) obj;
                if (!AbstractC3367j.m5096a(this.f1683e, c0477j.f1683e) || this.f1685g != c0477j.f1685g || this.f1686h != c0477j.f1686h) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1686h) + AbstractC2487d.m4040d(this.f1683e.hashCode() * 31, 31, this.f1685g);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2217t c2217t = this.f1684f;
        if (c2217t == null) {
            C2194h0 c2194h0 = this.f1683e;
            c2194h0.getClass();
            C2217t c2217t2 = new C2217t(c2194h0);
            this.f1684f = c2217t2;
            c2217t = c2217t2;
        }
        return ((C2195i) c2217t.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f1685g) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f1686h) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        C2194h0 c2194h0 = this.f1683e;
        Object[] objArr = c2194h0.f12677b;
        Object[] objArr2 = c2194h0.f12678c;
        long[] jArr = c2194h0.f12676a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128) {
                            int i10 = (i7 << 3) + i9;
                            Object obj = objArr[i10];
                            Object obj2 = objArr2[i10];
                            sb.append(str);
                            sb.append(((C0490w) obj).f1769a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return AbstractC3681h0.m5699z(this) + "{ " + ((Object) sb) + " }";
    }
}
