package p001a0;

import p050g2.C1587g;
import p087l2.C2459w;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.r2 */
/* loaded from: classes.dex */
public final class C0072r2 {

    /* renamed from: a */
    public C0068q2 f356a;

    /* renamed from: b */
    public C0068q2 f357b;

    /* renamed from: c */
    public int f358c;

    /* renamed from: d */
    public Long f359d;

    /* renamed from: e */
    public boolean f360e;

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[LOOP:0: B:23:0x005f->B:28:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[EDGE_INSN: B:29:0x0074->B:30:0x0074 BREAK  A[LOOP:0: B:23:0x005f->B:28:0x006f], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m166a(C2459w c2459w) {
        C2459w c2459w2;
        String str;
        C0068q2 c0068q2;
        C0068q2 c0068q22;
        C1587g c1587g = c2459w.f13723a;
        this.f360e = false;
        C0068q2 c0068q23 = this.f356a;
        if (c0068q23 != null) {
            c2459w2 = (C2459w) c0068q23.f345g;
        } else {
            c2459w2 = null;
        }
        if (!c2459w.equals(c2459w2)) {
            String str2 = c1587g.f10239f;
            C0068q2 c0068q24 = this.f356a;
            if (c0068q24 != null) {
                str = ((C2459w) c0068q24.f345g).f13723a.f10239f;
            } else {
                str = null;
            }
            if (AbstractC3367j.m5096a(str2, str)) {
                C0068q2 c0068q25 = this.f356a;
                if (c0068q25 != null) {
                    c0068q25.f345g = c2459w;
                    return;
                }
                return;
            }
            this.f356a = new C0068q2(0, this.f356a, c2459w);
            this.f357b = null;
            int length = c1587g.f10239f.length() + this.f358c;
            this.f358c = length;
            if (length > 100000) {
                C0068q2 c0068q26 = this.f356a;
                if (c0068q26 != null) {
                    c0068q2 = (C0068q2) c0068q26.f344f;
                } else {
                    c0068q2 = null;
                }
                if (c0068q2 != null) {
                    while (true) {
                        if (c0068q26 != null) {
                            C0068q2 c0068q27 = (C0068q2) c0068q26.f344f;
                            if (c0068q27 != null) {
                                c0068q22 = (C0068q2) c0068q27.f344f;
                                if (c0068q22 != null) {
                                    break;
                                } else {
                                    c0068q26 = (C0068q2) c0068q26.f344f;
                                }
                            }
                        }
                        c0068q22 = null;
                        if (c0068q22 != null) {
                        }
                    }
                    if (c0068q26 != null) {
                        c0068q26.f344f = null;
                    }
                }
            }
        }
    }
}
