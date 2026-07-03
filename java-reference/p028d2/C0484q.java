package p028d2;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import p050g2.C1587g;
import p077k.AbstractC2201l;
import p077k.C2184c0;
import p077k.C2221w;
import p077k.C2222x;
import p100n.C2673p1;
import p158u5.AbstractC3367j;
import p162v1.C3502g0;
import p170w1.C3728t;
import p183y0.C3834c;
import p183y0.C3835d;
import p183y0.C3842k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.q */
/* loaded from: classes.dex */
public final class C0484q {

    /* renamed from: a */
    public final C3502g0 f1700a;

    /* renamed from: b */
    public final C0471d f1701b;

    /* renamed from: c */
    public final AbstractC2201l f1702c;

    /* renamed from: d */
    public final C2184c0 f1703d = new C2184c0(2);

    public C0484q(C3502g0 c3502g0, C0471d c0471d, C2221w c2221w) {
        this.f1700a = c3502g0;
        this.f1701b = c0471d;
        this.f1702c = c2221w;
    }

    /* renamed from: a */
    public final C0482o m1055a() {
        return new C0482o(this.f1701b, false, this.f1700a, new C0477j());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1056b(C3502g0 c3502g0, C0477j c0477j) {
        String str;
        boolean z7;
        boolean z8;
        AutofillValue forText;
        C2184c0 c2184c0 = this.f1703d;
        Object[] objArr = c2184c0.f12628a;
        int i7 = c2184c0.f12629b;
        for (int i8 = 0; i8 < i7; i8++) {
            C3834c c3834c = (C3834c) objArr[i8];
            C2222x c2222x = c3834c.f18051g;
            C3728t c3728t = c3834c.f18047c;
            C2673p1 c2673p1 = c3834c.f18045a;
            C0477j m5449w = c3502g0.m5449w();
            int i9 = c3502g0.f16885f;
            String str2 = null;
            if (c0477j != null) {
                Object m3592g = c0477j.f1683e.m3592g(AbstractC0487t.f1728D);
                if (m3592g == null) {
                    m3592g = null;
                }
                C1587g c1587g = (C1587g) m3592g;
                if (c1587g != null) {
                    str = c1587g.f10239f;
                    if (m5449w != null) {
                        Object m3592g2 = m5449w.f1683e.m3592g(AbstractC0487t.f1728D);
                        if (m3592g2 == null) {
                            m3592g2 = null;
                        }
                        C1587g c1587g2 = (C1587g) m3592g2;
                        if (c1587g2 != null) {
                            str2 = c1587g2.f10239f;
                        }
                    }
                    z7 = true;
                    if (str != str2) {
                        if (str == null) {
                            c2673p1.m4286r(c3728t, i9, true);
                        } else if (str2 == null) {
                            c2673p1.m4286r(c3728t, i9, false);
                        } else if (AbstractC3367j.m5096a((C3835d) AbstractC0485r.m1060d(m5449w, AbstractC0487t.f1757r), C3842k.f18056a)) {
                            forText = AutofillValue.forText(str2.toString());
                            ((AutofillManager) c2673p1.f14390f).notifyValueChanged(c3728t, i9, forText);
                        }
                    }
                    if (c0477j == null && c0477j.f1683e.m3587b(AbstractC0487t.f1756q)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (m5449w != null || !m5449w.f1683e.m3587b(AbstractC0487t.f1756q)) {
                        z7 = false;
                    }
                    if (z8 != z7) {
                        if (z7) {
                            c2222x.m3653a(i9);
                        } else {
                            c2222x.m3657e(i9);
                        }
                    }
                }
            }
            str = null;
            if (m5449w != null) {
            }
            z7 = true;
            if (str != str2) {
            }
            if (c0477j == null) {
            }
            z8 = false;
            if (m5449w != null) {
            }
            z7 = false;
            if (z8 != z7) {
            }
        }
    }
}
