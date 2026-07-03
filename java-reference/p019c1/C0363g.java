package p019c1;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import p012b3.AbstractC0273a;
import p018c0.C0349s;
import p029d3.AbstractC0495b;
import p039e5.C1001jm;
import p039e5.C1031kl;
import p039e5.C1219qn;
import p039e5.C1270sc;
import p039e5.C1451y7;
import p039e5.C1473yt;
import p053g5.C1694m;
import p077k.C2196i0;
import p139s1.AbstractC3088a;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3365h;
import p162v1.AbstractC3498f;
import p162v1.C3490c1;
import p162v1.C3502g0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0363g extends AbstractC3365h implements InterfaceC3277a {

    /* renamed from: m */
    public final /* synthetic */ int f1229m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0363g(int i7, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i7, obj, cls, str, str2, i8, i9);
        this.f1229m = i10;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        C3490c1 c3490c1;
        char c7;
        char c8;
        ContentCaptureSession m571a;
        switch (this.f1229m) {
            case 0:
                C0364h c0364h = (C0364h) this.f16432f;
                C2196i0 c2196i0 = c0364h.f1232c;
                C2196i0 c2196i02 = c0364h.f1233d;
                C0368l c0368l = c0364h.f1230a;
                C0377u c0377u = c0368l.f1245h;
                EnumC0376t enumC0376t = EnumC0376t.f1269h;
                if (c0377u == null) {
                    Object[] objArr = c2196i02.f12685b;
                    long[] jArr = c2196i02.f12684a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        char c9 = 7;
                        while (true) {
                            long j6 = jArr[i7];
                            if ((((~j6) << c9) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i7 - length)) >>> 31);
                                int i9 = 0;
                                while (i9 < i8) {
                                    if ((j6 & 255) < 128) {
                                        c8 = c9;
                                        ((InterfaceC0361e) objArr[(i7 << 3) + i9]).mo547h0(enumC0376t);
                                    } else {
                                        c8 = c9;
                                    }
                                    j6 >>= 8;
                                    i9++;
                                    c9 = c8;
                                }
                                c7 = c9;
                                if (i8 != 8) {
                                }
                            } else {
                                c7 = c9;
                            }
                            if (i7 != length) {
                                i7++;
                                c9 = c7;
                            }
                        }
                    }
                } else if (c0377u.f18005r) {
                    if (c2196i0.m3601c(c0377u)) {
                        c0377u.m848N0();
                    }
                    EnumC0376t m847M0 = c0377u.m847M0();
                    if (!c0377u.f17992e.f18005r) {
                        AbstractC3088a.m4750b("visitAncestors called on an unattached node");
                    }
                    AbstractC3809q abstractC3809q = c0377u.f17992e;
                    C3502g0 m5382v = AbstractC3498f.m5382v(c0377u);
                    int i10 = 0;
                    while (m5382v != null) {
                        if ((m5382v.f16872I.f16802f.f17995h & 5120) != 0) {
                            while (abstractC3809q != null) {
                                int i11 = abstractC3809q.f17994g;
                                if ((i11 & 5120) != 0) {
                                    if ((i11 & 1024) != 0) {
                                        i10++;
                                    }
                                    if ((abstractC3809q instanceof InterfaceC0361e) && c2196i02.m3601c(abstractC3809q)) {
                                        if (i10 <= 1) {
                                            ((InterfaceC0361e) abstractC3809q).mo547h0(m847M0);
                                        } else {
                                            ((InterfaceC0361e) abstractC3809q).mo547h0(EnumC0376t.f1267f);
                                        }
                                        c2196i02.m3609k(abstractC3809q);
                                    }
                                }
                                abstractC3809q = abstractC3809q.f17996i;
                            }
                        }
                        m5382v = m5382v.m5447u();
                        if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                            abstractC3809q = c3490c1.f16801e;
                        } else {
                            abstractC3809q = null;
                        }
                    }
                    Object[] objArr2 = c2196i02.f12685b;
                    long[] jArr2 = c2196i02.f12684a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j7 = jArr2[i12];
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if ((j7 & 255) < 128) {
                                        ((InterfaceC0361e) objArr2[(i12 << 3) + i14]).mo547h0(enumC0376t);
                                    }
                                    j7 >>= 8;
                                }
                                if (i13 != 8) {
                                }
                            }
                            if (i12 != length2) {
                                i12++;
                            }
                        }
                    }
                }
                if (c0368l.f1245h == null || c0368l.f1240c.m847M0() == enumC0376t) {
                    c0368l.m832c();
                }
                c2196i0.m3600b();
                c2196i02.m3600b();
                c0364h.f1234e = false;
                return C1694m.f10482a;
            case 1:
                ((C1001jm) this.f16432f).m1616b();
                return C1694m.f10482a;
            case 2:
                ((C1473yt) this.f16432f).m2435f();
                return C1694m.f10482a;
            case 3:
                ((C1031kl) this.f16432f).m1633o(true);
                return C1694m.f10482a;
            case 4:
                ((C1219qn) this.f16432f).m2154g(true);
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                ((C1451y7) this.f16432f).m2426d();
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                ((C1270sc) this.f16432f).m2331u();
                return C1694m.f10482a;
            case 7:
                ((C1270sc) this.f16432f).m2331u();
                return C1694m.f10482a;
            default:
                View view = (View) this.f16432f;
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 30) {
                    AbstractC0495b.m1076f(view);
                }
                if (i15 >= 29 && (m571a = AbstractC0273a.m571a(view)) != null) {
                    return new C0349s(m571a, view);
                }
                return null;
        }
    }
}
