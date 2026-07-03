package p073j2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;
import androidx.compose.foundation.lazy.layout.AbstractC0158c;
import androidx.compose.p007ui.input.nestedscroll.AbstractC0170a;
import androidx.lifecycle.InterfaceC0213t;
import com.paoman.lema.R;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000a.AbstractC0000a;
import p001a0.AbstractC0094y0;
import p001a0.C0031h1;
import p001a0.C0033i;
import p001a0.C0076s2;
import p001a0.C0078t0;
import p005a6.InterfaceC0112c;
import p006a7.C0129l;
import p014b5.AbstractC0289c;
import p014b5.AbstractC0290d;
import p014b5.C0287a;
import p014b5.C0288b;
import p014b5.C0292f;
import p014b5.C0293g;
import p018c0.AbstractC0344n;
import p022c4.EnumC0395e;
import p027d1.C0464b;
import p027d1.C0465c;
import p028d2.AbstractC0479l;
import p028d2.AbstractC0487t;
import p028d2.C0469b;
import p028d2.C0482o;
import p032d6.InterfaceC0516a0;
import p034e0.C0593a;
import p037e3.C0690d;
import p037e3.C0691e;
import p039e5.C0837ef;
import p039e5.C0974ip;
import p039e5.C1009k;
import p058h2.AbstractC1774k;
import p058h2.C1772i;
import p059h3.C1782h;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.C1813u;
import p063i0.C1900g3;
import p063i0.C1922j;
import p063i0.C1990r3;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p067i4.AbstractC2076i;
import p067i4.C2068a;
import p067i4.C2069b;
import p067i4.C2073f;
import p067i4.EnumC2070c;
import p079k1.AbstractC2265d0;
import p079k1.C2260b;
import p079k1.C2261b0;
import p079k1.C2269f0;
import p079k1.C2270g;
import p081k4.C2308a;
import p081k4.C2309b;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.C2427z;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p088l3.C2463a;
import p092m.AbstractC2487d;
import p096m3.C2569s;
import p096m3.C2570t;
import p100n.AbstractC2647h;
import p102n1.C2708a;
import p107o.C2722a;
import p107o.C2746i;
import p109o1.InterfaceC2796a;
import p115p.AbstractC2829i;
import p115p.AbstractC2831k;
import p115p.C2823c;
import p115p.C2824d;
import p115p.C2828h;
import p115p.C2830j;
import p117p1.AbstractC2847c0;
import p117p1.AbstractC2866q;
import p117p1.C2846c;
import p117p1.C2868s;
import p118p3.AbstractC2879d;
import p118p3.C2878c;
import p122q.AbstractC2909h;
import p122q.EnumC2931o0;
import p122q.InterfaceC2900e;
import p124q1.C2982c;
import p124q1.C2983d;
import p129r.C3017f;
import p129r.C3022k;
import p137s.InterfaceC3080i;
import p139s1.AbstractC3088a;
import p140s2.C3091a;
import p140s2.EnumC3103m;
import p144t.AbstractC3144n;
import p144t.InterfaceC3135i0;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p148t3.C3253b;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p155u2.AbstractC3353a;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p160v.AbstractC3405d0;
import p160v.InterfaceC3435s0;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p168w.AbstractC3642y;
import p168w.C3621e;
import p168w.C3622e0;
import p168w.C3623f;
import p168w.C3624g;
import p168w.C3626i;
import p168w.C3627j;
import p168w.C3628k;
import p168w.C3632o;
import p168w.C3636s;
import p170w1.AbstractC3674f1;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3801i;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;
import p194z4.C3875f;
import p194z4.EnumC3871b;
import p194z4.EnumC3873d;
import p195z5.C3876a;
import p195z5.C3877b;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j2.e */
/* loaded from: classes.dex */
public abstract class AbstractC2168e {
    /* renamed from: A */
    public static final float m3507A(Layout layout, int i7, Paint paint) {
        float width;
        float width2;
        C1772i c1772i = AbstractC1774k.f10809a;
        if (layout.getEllipsisCount(i7) > 0) {
            int i8 = -1;
            if (layout.getParagraphDirection(i7) == -1 && layout.getWidth() < layout.getLineRight(i7)) {
                float measureText = paint.measureText("…") + (layout.getLineRight(i7) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)));
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
                if (paragraphAlignment != null) {
                    i8 = AbstractC2167d.f12573a[paragraphAlignment.ordinal()];
                }
                if (i8 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i7);
                    width2 = (layout.getWidth() - measureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i7);
                    width2 = layout.getWidth() - measureText;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    /* renamed from: B */
    public static final C2463a m3508B(View view) {
        C2463a c2463a = (C2463a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c2463a == null) {
            C2463a c2463a2 = new C2463a();
            view.setTag(R.id.pooling_container_listener_holder_tag, c2463a2);
            return c2463a2;
        }
        return c2463a;
    }

    /* renamed from: C */
    public static final void m3509C(float[] fArr, float[] fArr2, int i7, float[] fArr3) {
        float m3537x;
        if (i7 == 0) {
            AbstractC3088a.m4749a("At least one point must be provided");
        }
        int i8 = 2 >= i7 ? i7 - 1 : 2;
        int i9 = i8 + 1;
        float[][] fArr4 = new float[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            fArr4[i10] = new float[i7];
        }
        for (int i11 = 0; i11 < i7; i11++) {
            fArr4[0][i11] = 1.0f;
            for (int i12 = 1; i12 < i9; i12++) {
                fArr4[i12][i11] = fArr4[i12 - 1][i11] * fArr[i11];
            }
        }
        float[][] fArr5 = new float[i9];
        for (int i13 = 0; i13 < i9; i13++) {
            fArr5[i13] = new float[i7];
        }
        float[][] fArr6 = new float[i9];
        for (int i14 = 0; i14 < i9; i14++) {
            fArr6[i14] = new float[i9];
        }
        for (int i15 = 0; i15 < i9; i15++) {
            float[] fArr7 = fArr5[i15];
            float[] fArr8 = fArr4[i15];
            AbstractC3367j.m5100e(fArr8, "<this>");
            AbstractC3367j.m5100e(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i7);
            for (int i16 = 0; i16 < i15; i16++) {
                float[] fArr9 = fArr5[i16];
                float m3537x2 = m3537x(fArr7, fArr9);
                for (int i17 = 0; i17 < i7; i17++) {
                    fArr7[i17] = fArr7[i17] - (fArr9[i17] * m3537x2);
                }
            }
            float sqrt = (float) Math.sqrt(m3537x(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f7 = 1.0f / sqrt;
            for (int i18 = 0; i18 < i7; i18++) {
                fArr7[i18] = fArr7[i18] * f7;
            }
            float[] fArr10 = fArr6[i15];
            for (int i19 = 0; i19 < i9; i19++) {
                if (i19 < i15) {
                    m3537x = 0.0f;
                } else {
                    m3537x = m3537x(fArr7, fArr4[i19]);
                }
                fArr10[i19] = m3537x;
            }
        }
        for (int i20 = i8; -1 < i20; i20--) {
            float m3537x3 = m3537x(fArr5[i20], fArr2);
            float[] fArr11 = fArr6[i20];
            int i21 = i20 + 1;
            if (i21 <= i8) {
                int i22 = i8;
                while (true) {
                    m3537x3 -= fArr11[i22] * fArr3[i22];
                    if (i22 != i21) {
                        i22--;
                    }
                }
            }
            fArr3[i20] = m3537x3 / fArr11[i20];
        }
    }

    /* renamed from: D */
    public static final void m3510D(C0482o c0482o, C1782h c1782h) {
        int size;
        AccessibilityNodeInfo accessibilityNodeInfo = c1782h.f10826a;
        Object m3592g = c0482o.m1048k().f1683e.m3592g(AbstractC0487t.f1745f);
        Object obj = null;
        if (m3592g == null) {
            m3592g = null;
        }
        C0469b c0469b = (C0469b) m3592g;
        if (c0469b != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c0469b.f1640a, c0469b.f1641b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object m3592g2 = c0482o.m1048k().f1683e.m3592g(AbstractC0487t.f1744e);
        if (m3592g2 != null) {
            obj = m3592g2;
        }
        if (obj != null) {
            List m1038j = C0482o.m1038j(4, c0482o);
            int size2 = m1038j.size();
            for (int i7 = 0; i7 < size2; i7++) {
                C0482o c0482o2 = (C0482o) m1038j.get(i7);
                if (c0482o2.m1048k().f1683e.m3588c(AbstractC0487t.f1732H)) {
                    arrayList.add(c0482o2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean m3524k = m3524k(arrayList);
            int i8 = 1;
            if (m3524k) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (m3524k) {
                i8 = arrayList.size();
            }
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size, i8, false, 0));
        }
    }

    /* renamed from: E */
    public static final void m3511E(C0482o c0482o, C1782h c1782h) {
        int i7;
        int i8;
        Object m3592g = c0482o.m1048k().f1683e.m3592g(AbstractC0487t.f1746g);
        Object obj = null;
        if (m3592g == null) {
            m3592g = null;
        }
        if (m3592g == null) {
            C0482o m1049l = c0482o.m1049l();
            if (m1049l != null) {
                Object m3592g2 = m1049l.m1048k().f1683e.m3592g(AbstractC0487t.f1744e);
                if (m3592g2 == null) {
                    m3592g2 = null;
                }
                if (m3592g2 != null) {
                    Object m3592g3 = m1049l.m1048k().f1683e.m3592g(AbstractC0487t.f1745f);
                    if (m3592g3 != null) {
                        obj = m3592g3;
                    }
                    C0469b c0469b = (C0469b) obj;
                    if (c0469b == null || (c0469b.f1640a >= 0 && c0469b.f1641b >= 0)) {
                        if (c0482o.m1048k().f1683e.m3588c(AbstractC0487t.f1732H)) {
                            ArrayList arrayList = new ArrayList();
                            List m1038j = C0482o.m1038j(4, m1049l);
                            int size = m1038j.size();
                            int i9 = 0;
                            for (int i10 = 0; i10 < size; i10++) {
                                C0482o c0482o2 = (C0482o) m1038j.get(i10);
                                if (c0482o2.m1048k().f1683e.m3588c(AbstractC0487t.f1732H)) {
                                    arrayList.add(c0482o2);
                                    if (c0482o2.f1693c.m5448v() < c0482o.f1693c.m5448v()) {
                                        i9++;
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                boolean m3524k = m3524k(arrayList);
                                if (m3524k) {
                                    i7 = 0;
                                } else {
                                    i7 = i9;
                                }
                                if (m3524k) {
                                    i8 = i9;
                                } else {
                                    i8 = 0;
                                }
                                Object m3592g4 = c0482o.m1048k().f1683e.m3592g(AbstractC0487t.f1732H);
                                if (m3592g4 == null) {
                                    m3592g4 = Boolean.FALSE;
                                }
                                c1782h.f10826a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, 1, i8, 1, false, ((Boolean) m3592g4).booleanValue()));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new ClassCastException();
    }

    /* renamed from: F */
    public static C3877b m3512F(C3879d c3879d, int i7) {
        boolean z7;
        AbstractC3367j.m5100e(c3879d, "<this>");
        if (i7 > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        Integer valueOf = Integer.valueOf(i7);
        if (z7) {
            int i8 = c3879d.f18163e;
            int i9 = c3879d.f18164f;
            if (c3879d.f18165g <= 0) {
                i7 = -i7;
            }
            return new C3877b(i8, i9, i7);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [z5.b, z5.d] */
    /* renamed from: G */
    public static C3879d m3513G(int i7, int i8) {
        if (i8 <= Integer.MIN_VALUE) {
            C3879d c3879d = C3879d.f18170h;
            return C3879d.f18170h;
        }
        return new C3877b(i7, i8 - 1, 1);
    }

    /* renamed from: a */
    public static final void m3514a(C2830j c2830j, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, C0078t0 c0078t0, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(645832757);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(c2830j)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i8 |= i10;
        }
        int i12 = i8 | 384;
        if ((i7 & 3072) == 0) {
            if (c2395p.m3874i(c0078t0)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i12 |= i9;
        }
        if ((i12 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC2829i abstractC2829i = (AbstractC2829i) c2830j.f14902a.getValue();
            if (!(abstractC2829i instanceof C2828h)) {
                C2405r1 m3891u = c2395p.m3891u();
                if (m3891u != null) {
                    m3891u.f13542d = new C0593a(c2830j, interfaceC3277a, c0078t0, i7);
                    return;
                }
                return;
            }
            boolean m3870g = c2395p.m3870g(abstractC2829i);
            Object m3847O = c2395p.m3847O();
            if (m3870g || m3847O == C2375k.f13421a) {
                m3847O = new C2824d(AbstractC2064e.m3225F(((C2828h) abstractC2829i).f14901a));
                c2395p.m3877j0(m3847O);
            }
            AbstractC2831k.m4453c((C2824d) m3847O, interfaceC3277a, c0078t0, c2395p, i12 & 8176);
            interfaceC3810r = C3807o.f17991a;
        }
        InterfaceC3810r interfaceC3810r2 = interfaceC3810r;
        C2405r1 m3891u2 = c2395p.m3891u();
        if (m3891u2 != null) {
            m3891u2.f13542d = new C1922j(c2830j, interfaceC3277a, interfaceC3810r2, c0078t0, i7);
        }
    }

    /* renamed from: b */
    public static final void m3515b(C2830j c2830j, InterfaceC3277a interfaceC3277a, C0078t0 c0078t0, InterfaceC3810r interfaceC3810r, boolean z7, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        C0078t0 c0078t02;
        InterfaceC3810r interfaceC3810r2;
        InterfaceC3810r interfaceC3810r3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        c2395p.m3859a0(-84584070);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(c2830j)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i8 = i13 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i8 |= i12;
        }
        if ((i7 & 384) == 0) {
            c0078t02 = c0078t0;
            if (c2395p.m3874i(c0078t02)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i8 |= i11;
        } else {
            c0078t02 = c0078t0;
        }
        int i14 = i8 | 3072;
        if ((i7 & 24576) == 0) {
            if (c2395p.m3872h(z7)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i14 |= i10;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i14 |= i9;
        }
        if ((74899 & i14) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r2 = interfaceC3810r;
        } else {
            interfaceC3810r2 = C3807o.f17991a;
            if (z7) {
                interfaceC3810r3 = AbstractC2847c0.m4505a(interfaceC3810r2, C2823c.f14884a, new C2722a(c2830j, null, 4));
            } else {
                interfaceC3810r3 = interfaceC3810r2;
            }
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, true);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, interfaceC3810r3);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4853e, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            c3173d.mo22d(c2395p, Integer.valueOf((i14 >> 15) & 14));
            m3514a(c2830j, interfaceC3277a, null, c0078t02, c2395p, (i14 & 126) | ((i14 << 3) & 7168));
            c2395p.m3888r(true);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1900g3(c2830j, interfaceC3277a, c0078t0, interfaceC3810r2, z7, c3173d, i7);
        }
    }

    /* renamed from: c */
    public static final long m3516c(float f7, float f8) {
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    /* renamed from: d */
    public static final long m3517d(int i7) {
        long j6 = (i7 << 32) | (0 & 4294967295L);
        int i8 = C2708a.f14535p;
        return j6;
    }

    /* renamed from: e */
    public static final void m3518e(Boolean bool, Object obj, InterfaceC0213t interfaceC0213t, InterfaceC3279c interfaceC3279c, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(696924721);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(bool)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(obj)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i8 |= i10;
        }
        if ((i7 & 384) == 0) {
            i8 |= 128;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3874i(interfaceC3279c)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i8 |= i9;
        }
        if ((i8 & 1171) != 1170) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i8 & 1, z7)) {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
            } else {
                interfaceC0213t = (InterfaceC0213t) c2395p.m3878k(AbstractC2879d.f15050a);
            }
            int i12 = i8 & (-897);
            c2395p.m3889s();
            boolean m3870g = c2395p.m3870g(bool) | c2395p.m3870g(obj) | c2395p.m3870g(interfaceC0213t);
            Object m3847O = c2395p.m3847O();
            if (m3870g || m3847O == C2375k.f13421a) {
                m3847O = new C2878c(interfaceC0213t.mo415g());
                c2395p.m3877j0(m3847O);
            }
            m3519f(interfaceC0213t, (C2878c) m3847O, interfaceC3279c, c2395p, (i12 >> 3) & 896);
        } else {
            c2395p.m3852U();
        }
        InterfaceC0213t interfaceC0213t2 = interfaceC0213t;
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0837ef(bool, obj, interfaceC0213t2, interfaceC3279c, i7, 2);
        }
    }

    /* renamed from: f */
    public static final void m3519f(InterfaceC0213t interfaceC0213t, C2878c c2878c, InterfaceC3279c interfaceC3279c, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(228371534);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(interfaceC0213t)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(c2878c)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i8 |= i10;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3874i(interfaceC3279c)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i8 |= i9;
        }
        boolean z8 = false;
        if ((i8 & 147) != 146) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i8 & 1, z7)) {
            boolean m3874i = c2395p.m3874i(c2878c);
            if ((i8 & 896) == 256) {
                z8 = true;
            }
            boolean m3874i2 = m3874i | z8 | c2395p.m3874i(interfaceC0213t);
            Object m3847O = c2395p.m3847O();
            if (m3874i2 || m3847O == C2375k.f13421a) {
                m3847O = new C1009k(interfaceC0213t, c2878c, interfaceC3279c, 11);
                c2395p.m3877j0(m3847O);
            }
            AbstractC2418w.m3961c(interfaceC0213t, c2878c, (InterfaceC3279c) m3847O, c2395p);
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0974ip(interfaceC0213t, c2878c, interfaceC3279c, i7, 1);
        }
    }

    /* renamed from: g */
    public static final C3253b m3520g(BackEvent backEvent) {
        long j6;
        float m729a = AbstractC0344n.m729a(backEvent);
        float m747s = AbstractC0344n.m747s(backEvent);
        float m752x = AbstractC0344n.m752x(backEvent);
        int m734f = AbstractC0344n.m734f(backEvent);
        if (Build.VERSION.SDK_INT >= 36) {
            j6 = backEvent.getFrameTimeMillis();
        } else {
            j6 = 0;
        }
        return new C3253b(m734f, m752x, m729a, m747s, j6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x031d, code lost:
    
        if (r52.m3870g(r47) != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0363, code lost:
    
        if (r52.m3866e(r11) == false) goto L234;
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x048a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0340  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3521h(InterfaceC3810r interfaceC3810r, AbstractC3642y abstractC3642y, InterfaceC3135i0 interfaceC3135i0, C3017f c3017f, boolean z7, int i7, float f7, C3626i c3626i, InterfaceC2796a interfaceC2796a, C3801i c3801i, C3022k c3022k, C3173d c3173d, C2395p c2395p, int i8, int i9) {
        int i10;
        int i11;
        boolean z8;
        C3022k c3022k2;
        boolean z9;
        boolean z10;
        int i12;
        boolean z11;
        boolean m3870g;
        Object m3847O;
        EnumC2931o0 enumC2931o0;
        int i13;
        int i14;
        int i15;
        AbstractC3642y abstractC3642y2;
        InterfaceC0516a0 interfaceC0516a0;
        InterfaceC0112c interfaceC0112c;
        boolean m3872h;
        Object m3847O2;
        boolean z12;
        Object m3847O3;
        boolean m3870g2;
        Object m3847O4;
        boolean z13;
        InterfaceC3810r mo5829e;
        int i16;
        boolean z14;
        Object m3847O5;
        AbstractC3642y abstractC3642y3;
        InterfaceC2796a interfaceC2796a2;
        Object obj = C3795c.f17977r;
        c2395p.m3859a0(538371694);
        if ((i8 & 6) == 0) {
            i10 = i8 | (c2395p.m3870g(interfaceC3810r) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= c2395p.m3870g(abstractC3642y) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= c2395p.m3870g(interfaceC3135i0) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 |= c2395p.m3872h(false) ? 2048 : 1024;
        }
        int i17 = i8 & 24576;
        EnumC2931o0 enumC2931o02 = EnumC2931o0.f15241f;
        if (i17 == 0) {
            i10 |= c2395p.m3870g(enumC2931o02) ? 16384 : 8192;
        }
        if ((i8 & 196608) == 0) {
            i10 |= c2395p.m3870g(c3017f) ? 131072 : 65536;
        }
        if ((i8 & 1572864) == 0) {
            i10 |= c2395p.m3872h(z7) ? 1048576 : 524288;
        }
        if ((i8 & 12582912) == 0) {
            i10 |= c2395p.m3866e(i7) ? 8388608 : 4194304;
        }
        if ((i8 & 100663296) == 0) {
            i10 |= c2395p.m3864d(f7) ? 67108864 : 33554432;
        }
        if ((i8 & 805306368) == 0) {
            i10 |= c2395p.m3870g(c3626i) ? 536870912 : 268435456;
        }
        int i18 = i10;
        if ((i9 & 6) == 0) {
            i11 = i9 | (c2395p.m3874i(interfaceC2796a) ? 4 : 2);
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c2395p.m3874i(null) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= c2395p.m3870g(obj) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= c2395p.m3870g(c3801i) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i11 |= c2395p.m3870g(c3022k) ? 16384 : 8192;
        }
        if ((i9 & 196608) == 0) {
            i11 |= c2395p.m3874i(c3173d) ? 131072 : 65536;
        }
        if ((i18 & 306783379) == 306783378 && (i11 & 74899) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC2796a2 = interfaceC2796a;
            abstractC3642y3 = abstractC3642y;
            i12 = i7;
        } else if (i7 >= 0) {
            int i19 = i18 & 112;
            boolean z15 = true;
            boolean z16 = i19 == 32;
            Object m3847O6 = c2395p.m3847O();
            Object obj2 = C2375k.f13421a;
            if (z16 || m3847O6 == obj2) {
                m3847O6 = new C3623f(abstractC3642y, 1);
                c2395p.m3877j0(m3847O6);
            }
            Object obj3 = (InterfaceC3277a) m3847O6;
            int i20 = i18 >> 3;
            int i21 = i20 & 14;
            int i22 = i11 >> 12;
            int i23 = i21 | (i22 & 112) | ((i11 << 3) & 896);
            Object m3953A = AbstractC2418w.m3953A(c3173d, c2395p);
            Object m3953A2 = AbstractC2418w.m3953A(null, c2395p);
            boolean m3870g3 = ((((i23 & 14) ^ 6) > 4 && c2395p.m3870g(abstractC3642y)) || (i23 & 6) == 4) | c2395p.m3870g(m3953A) | c2395p.m3870g(m3953A2) | c2395p.m3870g(obj3);
            Object m3847O7 = c2395p.m3847O();
            if (m3870g3 || m3847O7 == obj2) {
                C2413u0 c2413u0 = C2413u0.f13573h;
                m3847O7 = new C1990r3(AbstractC2418w.m3973p(c2413u0, new C0033i(14, AbstractC2418w.m3973p(c2413u0, new C2746i(m3953A, m3953A2, obj3, 4)), abstractC3642y)), InterfaceC2390n2.class, "value", "getValue()Ljava/lang/Object;", 0, 3);
                c2395p.m3877j0(m3847O7);
            }
            InterfaceC0112c interfaceC0112c2 = (InterfaceC0112c) m3847O7;
            Object m3847O8 = c2395p.m3847O();
            if (m3847O8 == obj2) {
                Object c2427z = new C2427z(AbstractC2418w.m3971n(c2395p));
                c2395p.m3877j0(c2427z);
                m3847O8 = c2427z;
            }
            InterfaceC0516a0 interfaceC0516a02 = ((C2427z) m3847O8).f13636e;
            boolean z17 = i19 == 32;
            Object m3847O9 = c2395p.m3847O();
            if (z17 || m3847O9 == obj2) {
                m3847O9 = new C3623f(abstractC3642y, 0);
                c2395p.m3877j0(m3847O9);
            }
            InterfaceC3277a interfaceC3277a = (InterfaceC3277a) m3847O9;
            int i24 = i18 & 7168;
            int i25 = i18 >> 6;
            int i26 = (65520 & i18) | (i25 & 458752) | (i25 & 3670016) | (i25 & 29360128);
            int i27 = i11 << 18;
            int i28 = i26 | (i27 & 234881024) | (i27 & 1879048192);
            boolean z18 = ((((i28 & 896) ^ 384) > 256 && c2395p.m3870g(interfaceC3135i0)) || (i28 & 384) == 256) | ((((i28 & 112) ^ 48) > 32 && c2395p.m3870g(abstractC3642y)) || (i28 & 48) == 32) | ((((i28 & 7168) ^ 3072) > 2048 && c2395p.m3872h(false)) || (i28 & 3072) == 2048) | ((((57344 & i28) ^ 24576) > 16384 && c2395p.m3870g(enumC2931o02)) || (i28 & 24576) == 16384) | ((((i28 & 234881024) ^ 100663296) > 67108864 && c2395p.m3870g(obj)) || (i28 & 100663296) == 67108864) | ((((i28 & 1879048192) ^ 805306368) > 536870912 && c2395p.m3870g(c3801i)) || (i28 & 805306368) == 536870912) | ((((i28 & 3670016) ^ 1572864) > 1048576 && c2395p.m3864d(f7)) || (i28 & 1572864) == 1048576);
            if (((i28 & 29360128) ^ 12582912) <= 8388608) {
            }
            if ((i28 & 12582912) != 8388608) {
                z8 = false;
                boolean z19 = z18 | z8;
                if (((i22 & 14) ^ 6) <= 4) {
                    c3022k2 = c3022k;
                    if (c2395p.m3870g(c3022k2)) {
                        z9 = z19;
                        z10 = true;
                        boolean m3870g4 = z9 | z10 | c2395p.m3870g(interfaceC3277a);
                        if (((i28 & 458752) ^ 196608) <= 131072) {
                            i12 = i7;
                        } else {
                            i12 = i7;
                        }
                        if ((i28 & 196608) != 131072) {
                            z11 = false;
                            m3870g = m3870g4 | z11 | c2395p.m3870g(interfaceC0516a02);
                            m3847O = c2395p.m3847O();
                            if (!m3870g || m3847O == obj2) {
                                int i29 = i12;
                                enumC2931o0 = enumC2931o02;
                                i13 = i24;
                                i14 = 4;
                                i15 = i19;
                                Object c3636s = new C3636s(abstractC3642y, interfaceC3135i0, f7, c3626i, interfaceC0112c2, interfaceC3277a, c3801i, i29, c3022k2, interfaceC0516a02);
                                i12 = i29;
                                abstractC3642y2 = abstractC3642y;
                                interfaceC0516a0 = interfaceC0516a02;
                                interfaceC0112c = interfaceC0112c2;
                                c2395p.m3877j0(c3636s);
                                m3847O = c3636s;
                            } else {
                                abstractC3642y2 = abstractC3642y;
                                enumC2931o0 = enumC2931o02;
                                i13 = i24;
                                i14 = 4;
                                interfaceC0516a0 = interfaceC0516a02;
                                interfaceC0112c = interfaceC0112c2;
                                i15 = i19;
                            }
                            InterfaceC3281e interfaceC3281e = (InterfaceC3281e) m3847O;
                            m3872h = (((i21 ^ 6) <= i14 && c2395p.m3870g(abstractC3642y2)) || (i20 & 6) == i14) | c2395p.m3872h(false);
                            m3847O2 = c2395p.m3847O();
                            if (!m3872h || m3847O2 == obj2) {
                                m3847O2 = new C3624g(abstractC3642y2, false);
                                c2395p.m3877j0(m3847O2);
                            }
                            InterfaceC3435s0 interfaceC3435s0 = (InterfaceC3435s0) m3847O2;
                            z12 = (i15 == 32) | ((i18 & 458752) == 131072);
                            m3847O3 = c2395p.m3847O();
                            if (!z12 || m3847O3 == obj2) {
                                m3847O3 = new C3622e0(c3017f, abstractC3642y2);
                                c2395p.m3877j0(m3847O3);
                            }
                            C3622e0 c3622e0 = (C3622e0) m3847O3;
                            InterfaceC2900e interfaceC2900e = (InterfaceC2900e) c2395p.m3878k(AbstractC2909h.f15160a);
                            m3870g2 = (i15 == 32) | c2395p.m3870g(interfaceC2900e);
                            m3847O4 = c2395p.m3847O();
                            if (!m3870g2 || m3847O4 == obj2) {
                                m3847O4 = new C3628k(abstractC3642y2, interfaceC2900e);
                                c2395p.m3877j0(m3847O4);
                            }
                            C3628k c3628k = (C3628k) m3847O4;
                            InterfaceC3810r m369a = AbstractC0158c.m369a(interfaceC3810r.mo5829e(abstractC3642y2.f17417x).mo5829e(abstractC3642y2.f17415v), interfaceC0112c, interfaceC3435s0, enumC2931o0, z7);
                            C3807o c3807o = C3807o.f17991a;
                            if (z7) {
                                z13 = false;
                                mo5829e = m369a.mo5829e(AbstractC0479l.m1037a(c3807o, false, new C3632o(false, abstractC3642y2, interfaceC0516a0)));
                            } else {
                                z13 = false;
                                mo5829e = m369a.mo5829e(c3807o);
                            }
                            i16 = i21 | ((i18 >> 18) & 112);
                            boolean z20 = ((((i16 & 14) ^ 6) > i14 || !c2395p.m3870g(abstractC3642y2)) && (i16 & 6) != i14) ? z13 : true;
                            if ((((i16 & 112) ^ 48) > 32 || !c2395p.m3866e(i12)) && (i16 & 48) != 32) {
                                z15 = false;
                            }
                            z14 = z20 | z15;
                            m3847O5 = c2395p.m3847O();
                            if (!z14 || m3847O5 == obj2) {
                                m3847O5 = new C3627j(abstractC3642y2, i12);
                                c2395p.m3877j0(m3847O5);
                            }
                            EnumC2931o0 enumC2931o03 = enumC2931o0;
                            InterfaceC3810r m3343u = AbstractC2072e.m3343u(AbstractC3405d0.m5174k(mo5829e, (C3627j) m3847O5, abstractC3642y2.f17414u, (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n), enumC2931o03, z7, c2395p, 512 | i13 | ((i18 << 3) & 458752) | (i18 & 3670016)), abstractC3642y, enumC2931o03, z7, c3622e0, abstractC3642y2.f17410q, c3628k, c2395p, 0);
                            abstractC3642y3 = abstractC3642y;
                            interfaceC2796a2 = interfaceC2796a;
                            AbstractC3405d0.m5166a(interfaceC0112c, AbstractC0170a.m389a(m3343u.mo5829e(AbstractC2847c0.m4505a(c3807o, abstractC3642y3, new C2722a(abstractC3642y3, null, 8))), interfaceC2796a2, null), abstractC3642y3.f17413t, interfaceC3281e, c2395p, 0);
                        }
                        z11 = true;
                        m3870g = m3870g4 | z11 | c2395p.m3870g(interfaceC0516a02);
                        m3847O = c2395p.m3847O();
                        if (m3870g) {
                        }
                        int i292 = i12;
                        enumC2931o0 = enumC2931o02;
                        i13 = i24;
                        i14 = 4;
                        i15 = i19;
                        Object c3636s2 = new C3636s(abstractC3642y, interfaceC3135i0, f7, c3626i, interfaceC0112c2, interfaceC3277a, c3801i, i292, c3022k2, interfaceC0516a02);
                        i12 = i292;
                        abstractC3642y2 = abstractC3642y;
                        interfaceC0516a0 = interfaceC0516a02;
                        interfaceC0112c = interfaceC0112c2;
                        c2395p.m3877j0(c3636s2);
                        m3847O = c3636s2;
                        InterfaceC3281e interfaceC3281e2 = (InterfaceC3281e) m3847O;
                        m3872h = (((i21 ^ 6) <= i14 && c2395p.m3870g(abstractC3642y2)) || (i20 & 6) == i14) | c2395p.m3872h(false);
                        m3847O2 = c2395p.m3847O();
                        if (!m3872h) {
                        }
                        m3847O2 = new C3624g(abstractC3642y2, false);
                        c2395p.m3877j0(m3847O2);
                        InterfaceC3435s0 interfaceC3435s02 = (InterfaceC3435s0) m3847O2;
                        z12 = (i15 == 32) | ((i18 & 458752) == 131072);
                        m3847O3 = c2395p.m3847O();
                        if (!z12) {
                        }
                        m3847O3 = new C3622e0(c3017f, abstractC3642y2);
                        c2395p.m3877j0(m3847O3);
                        C3622e0 c3622e02 = (C3622e0) m3847O3;
                        InterfaceC2900e interfaceC2900e2 = (InterfaceC2900e) c2395p.m3878k(AbstractC2909h.f15160a);
                        m3870g2 = (i15 == 32) | c2395p.m3870g(interfaceC2900e2);
                        m3847O4 = c2395p.m3847O();
                        if (!m3870g2) {
                        }
                        m3847O4 = new C3628k(abstractC3642y2, interfaceC2900e2);
                        c2395p.m3877j0(m3847O4);
                        C3628k c3628k2 = (C3628k) m3847O4;
                        InterfaceC3810r m369a2 = AbstractC0158c.m369a(interfaceC3810r.mo5829e(abstractC3642y2.f17417x).mo5829e(abstractC3642y2.f17415v), interfaceC0112c, interfaceC3435s02, enumC2931o0, z7);
                        C3807o c3807o2 = C3807o.f17991a;
                        if (z7) {
                        }
                        i16 = i21 | ((i18 >> 18) & 112);
                        if (((i16 & 14) ^ 6) > i14) {
                        }
                        if (((i16 & 112) ^ 48) > 32) {
                        }
                        z15 = false;
                        z14 = z20 | z15;
                        m3847O5 = c2395p.m3847O();
                        if (!z14) {
                        }
                        m3847O5 = new C3627j(abstractC3642y2, i12);
                        c2395p.m3877j0(m3847O5);
                        EnumC2931o0 enumC2931o032 = enumC2931o0;
                        InterfaceC3810r m3343u2 = AbstractC2072e.m3343u(AbstractC3405d0.m5174k(mo5829e, (C3627j) m3847O5, abstractC3642y2.f17414u, (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n), enumC2931o032, z7, c2395p, 512 | i13 | ((i18 << 3) & 458752) | (i18 & 3670016)), abstractC3642y, enumC2931o032, z7, c3622e02, abstractC3642y2.f17410q, c3628k2, c2395p, 0);
                        abstractC3642y3 = abstractC3642y;
                        interfaceC2796a2 = interfaceC2796a;
                        AbstractC3405d0.m5166a(interfaceC0112c, AbstractC0170a.m389a(m3343u2.mo5829e(AbstractC2847c0.m4505a(c3807o2, abstractC3642y3, new C2722a(abstractC3642y3, null, 8))), interfaceC2796a2, null), abstractC3642y3.f17413t, interfaceC3281e2, c2395p, 0);
                    }
                } else {
                    c3022k2 = c3022k;
                }
                z9 = z19;
                if ((i22 & 6) != 4) {
                    z10 = false;
                    boolean m3870g42 = z9 | z10 | c2395p.m3870g(interfaceC3277a);
                    if (((i28 & 458752) ^ 196608) <= 131072) {
                    }
                    if ((i28 & 196608) != 131072) {
                    }
                    z11 = true;
                    m3870g = m3870g42 | z11 | c2395p.m3870g(interfaceC0516a02);
                    m3847O = c2395p.m3847O();
                    if (m3870g) {
                    }
                    int i2922 = i12;
                    enumC2931o0 = enumC2931o02;
                    i13 = i24;
                    i14 = 4;
                    i15 = i19;
                    Object c3636s22 = new C3636s(abstractC3642y, interfaceC3135i0, f7, c3626i, interfaceC0112c2, interfaceC3277a, c3801i, i2922, c3022k2, interfaceC0516a02);
                    i12 = i2922;
                    abstractC3642y2 = abstractC3642y;
                    interfaceC0516a0 = interfaceC0516a02;
                    interfaceC0112c = interfaceC0112c2;
                    c2395p.m3877j0(c3636s22);
                    m3847O = c3636s22;
                    InterfaceC3281e interfaceC3281e22 = (InterfaceC3281e) m3847O;
                    m3872h = (((i21 ^ 6) <= i14 && c2395p.m3870g(abstractC3642y2)) || (i20 & 6) == i14) | c2395p.m3872h(false);
                    m3847O2 = c2395p.m3847O();
                    if (!m3872h) {
                    }
                    m3847O2 = new C3624g(abstractC3642y2, false);
                    c2395p.m3877j0(m3847O2);
                    InterfaceC3435s0 interfaceC3435s022 = (InterfaceC3435s0) m3847O2;
                    z12 = (i15 == 32) | ((i18 & 458752) == 131072);
                    m3847O3 = c2395p.m3847O();
                    if (!z12) {
                    }
                    m3847O3 = new C3622e0(c3017f, abstractC3642y2);
                    c2395p.m3877j0(m3847O3);
                    C3622e0 c3622e022 = (C3622e0) m3847O3;
                    InterfaceC2900e interfaceC2900e22 = (InterfaceC2900e) c2395p.m3878k(AbstractC2909h.f15160a);
                    m3870g2 = (i15 == 32) | c2395p.m3870g(interfaceC2900e22);
                    m3847O4 = c2395p.m3847O();
                    if (!m3870g2) {
                    }
                    m3847O4 = new C3628k(abstractC3642y2, interfaceC2900e22);
                    c2395p.m3877j0(m3847O4);
                    C3628k c3628k22 = (C3628k) m3847O4;
                    InterfaceC3810r m369a22 = AbstractC0158c.m369a(interfaceC3810r.mo5829e(abstractC3642y2.f17417x).mo5829e(abstractC3642y2.f17415v), interfaceC0112c, interfaceC3435s022, enumC2931o0, z7);
                    C3807o c3807o22 = C3807o.f17991a;
                    if (z7) {
                    }
                    i16 = i21 | ((i18 >> 18) & 112);
                    if (((i16 & 14) ^ 6) > i14) {
                    }
                    if (((i16 & 112) ^ 48) > 32) {
                    }
                    z15 = false;
                    z14 = z20 | z15;
                    m3847O5 = c2395p.m3847O();
                    if (!z14) {
                    }
                    m3847O5 = new C3627j(abstractC3642y2, i12);
                    c2395p.m3877j0(m3847O5);
                    EnumC2931o0 enumC2931o0322 = enumC2931o0;
                    InterfaceC3810r m3343u22 = AbstractC2072e.m3343u(AbstractC3405d0.m5174k(mo5829e, (C3627j) m3847O5, abstractC3642y2.f17414u, (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n), enumC2931o0322, z7, c2395p, 512 | i13 | ((i18 << 3) & 458752) | (i18 & 3670016)), abstractC3642y, enumC2931o0322, z7, c3622e022, abstractC3642y2.f17410q, c3628k22, c2395p, 0);
                    abstractC3642y3 = abstractC3642y;
                    interfaceC2796a2 = interfaceC2796a;
                    AbstractC3405d0.m5166a(interfaceC0112c, AbstractC0170a.m389a(m3343u22.mo5829e(AbstractC2847c0.m4505a(c3807o22, abstractC3642y3, new C2722a(abstractC3642y3, null, 8))), interfaceC2796a2, null), abstractC3642y3.f17413t, interfaceC3281e22, c2395p, 0);
                }
                z10 = true;
                boolean m3870g422 = z9 | z10 | c2395p.m3870g(interfaceC3277a);
                if (((i28 & 458752) ^ 196608) <= 131072) {
                }
                if ((i28 & 196608) != 131072) {
                }
                z11 = true;
                m3870g = m3870g422 | z11 | c2395p.m3870g(interfaceC0516a02);
                m3847O = c2395p.m3847O();
                if (m3870g) {
                }
                int i29222 = i12;
                enumC2931o0 = enumC2931o02;
                i13 = i24;
                i14 = 4;
                i15 = i19;
                Object c3636s222 = new C3636s(abstractC3642y, interfaceC3135i0, f7, c3626i, interfaceC0112c2, interfaceC3277a, c3801i, i29222, c3022k2, interfaceC0516a02);
                i12 = i29222;
                abstractC3642y2 = abstractC3642y;
                interfaceC0516a0 = interfaceC0516a02;
                interfaceC0112c = interfaceC0112c2;
                c2395p.m3877j0(c3636s222);
                m3847O = c3636s222;
                InterfaceC3281e interfaceC3281e222 = (InterfaceC3281e) m3847O;
                m3872h = (((i21 ^ 6) <= i14 && c2395p.m3870g(abstractC3642y2)) || (i20 & 6) == i14) | c2395p.m3872h(false);
                m3847O2 = c2395p.m3847O();
                if (!m3872h) {
                }
                m3847O2 = new C3624g(abstractC3642y2, false);
                c2395p.m3877j0(m3847O2);
                InterfaceC3435s0 interfaceC3435s0222 = (InterfaceC3435s0) m3847O2;
                z12 = (i15 == 32) | ((i18 & 458752) == 131072);
                m3847O3 = c2395p.m3847O();
                if (!z12) {
                }
                m3847O3 = new C3622e0(c3017f, abstractC3642y2);
                c2395p.m3877j0(m3847O3);
                C3622e0 c3622e0222 = (C3622e0) m3847O3;
                InterfaceC2900e interfaceC2900e222 = (InterfaceC2900e) c2395p.m3878k(AbstractC2909h.f15160a);
                m3870g2 = (i15 == 32) | c2395p.m3870g(interfaceC2900e222);
                m3847O4 = c2395p.m3847O();
                if (!m3870g2) {
                }
                m3847O4 = new C3628k(abstractC3642y2, interfaceC2900e222);
                c2395p.m3877j0(m3847O4);
                C3628k c3628k222 = (C3628k) m3847O4;
                InterfaceC3810r m369a222 = AbstractC0158c.m369a(interfaceC3810r.mo5829e(abstractC3642y2.f17417x).mo5829e(abstractC3642y2.f17415v), interfaceC0112c, interfaceC3435s0222, enumC2931o0, z7);
                C3807o c3807o222 = C3807o.f17991a;
                if (z7) {
                }
                i16 = i21 | ((i18 >> 18) & 112);
                if (((i16 & 14) ^ 6) > i14) {
                }
                if (((i16 & 112) ^ 48) > 32) {
                }
                z15 = false;
                z14 = z20 | z15;
                m3847O5 = c2395p.m3847O();
                if (!z14) {
                }
                m3847O5 = new C3627j(abstractC3642y2, i12);
                c2395p.m3877j0(m3847O5);
                EnumC2931o0 enumC2931o03222 = enumC2931o0;
                InterfaceC3810r m3343u222 = AbstractC2072e.m3343u(AbstractC3405d0.m5174k(mo5829e, (C3627j) m3847O5, abstractC3642y2.f17414u, (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n), enumC2931o03222, z7, c2395p, 512 | i13 | ((i18 << 3) & 458752) | (i18 & 3670016)), abstractC3642y, enumC2931o03222, z7, c3622e0222, abstractC3642y2.f17410q, c3628k222, c2395p, 0);
                abstractC3642y3 = abstractC3642y;
                interfaceC2796a2 = interfaceC2796a;
                AbstractC3405d0.m5166a(interfaceC0112c, AbstractC0170a.m389a(m3343u222.mo5829e(AbstractC2847c0.m4505a(c3807o222, abstractC3642y3, new C2722a(abstractC3642y3, null, 8))), interfaceC2796a2, null), abstractC3642y3.f17413t, interfaceC3281e222, c2395p, 0);
            }
            z8 = true;
            boolean z192 = z18 | z8;
            if (((i22 & 14) ^ 6) <= 4) {
            }
            z9 = z192;
            if ((i22 & 6) != 4) {
            }
            z10 = true;
            boolean m3870g4222 = z9 | z10 | c2395p.m3870g(interfaceC3277a);
            if (((i28 & 458752) ^ 196608) <= 131072) {
            }
            if ((i28 & 196608) != 131072) {
            }
            z11 = true;
            m3870g = m3870g4222 | z11 | c2395p.m3870g(interfaceC0516a02);
            m3847O = c2395p.m3847O();
            if (m3870g) {
            }
            int i292222 = i12;
            enumC2931o0 = enumC2931o02;
            i13 = i24;
            i14 = 4;
            i15 = i19;
            Object c3636s2222 = new C3636s(abstractC3642y, interfaceC3135i0, f7, c3626i, interfaceC0112c2, interfaceC3277a, c3801i, i292222, c3022k2, interfaceC0516a02);
            i12 = i292222;
            abstractC3642y2 = abstractC3642y;
            interfaceC0516a0 = interfaceC0516a02;
            interfaceC0112c = interfaceC0112c2;
            c2395p.m3877j0(c3636s2222);
            m3847O = c3636s2222;
            InterfaceC3281e interfaceC3281e2222 = (InterfaceC3281e) m3847O;
            m3872h = (((i21 ^ 6) <= i14 && c2395p.m3870g(abstractC3642y2)) || (i20 & 6) == i14) | c2395p.m3872h(false);
            m3847O2 = c2395p.m3847O();
            if (!m3872h) {
            }
            m3847O2 = new C3624g(abstractC3642y2, false);
            c2395p.m3877j0(m3847O2);
            InterfaceC3435s0 interfaceC3435s02222 = (InterfaceC3435s0) m3847O2;
            z12 = (i15 == 32) | ((i18 & 458752) == 131072);
            m3847O3 = c2395p.m3847O();
            if (!z12) {
            }
            m3847O3 = new C3622e0(c3017f, abstractC3642y2);
            c2395p.m3877j0(m3847O3);
            C3622e0 c3622e02222 = (C3622e0) m3847O3;
            InterfaceC2900e interfaceC2900e2222 = (InterfaceC2900e) c2395p.m3878k(AbstractC2909h.f15160a);
            m3870g2 = (i15 == 32) | c2395p.m3870g(interfaceC2900e2222);
            m3847O4 = c2395p.m3847O();
            if (!m3870g2) {
            }
            m3847O4 = new C3628k(abstractC3642y2, interfaceC2900e2222);
            c2395p.m3877j0(m3847O4);
            C3628k c3628k2222 = (C3628k) m3847O4;
            InterfaceC3810r m369a2222 = AbstractC0158c.m369a(interfaceC3810r.mo5829e(abstractC3642y2.f17417x).mo5829e(abstractC3642y2.f17415v), interfaceC0112c, interfaceC3435s02222, enumC2931o0, z7);
            C3807o c3807o2222 = C3807o.f17991a;
            if (z7) {
            }
            i16 = i21 | ((i18 >> 18) & 112);
            if (((i16 & 14) ^ 6) > i14) {
            }
            if (((i16 & 112) ^ 48) > 32) {
            }
            z15 = false;
            z14 = z20 | z15;
            m3847O5 = c2395p.m3847O();
            if (!z14) {
            }
            m3847O5 = new C3627j(abstractC3642y2, i12);
            c2395p.m3877j0(m3847O5);
            EnumC2931o0 enumC2931o032222 = enumC2931o0;
            InterfaceC3810r m3343u2222 = AbstractC2072e.m3343u(AbstractC3405d0.m5174k(mo5829e, (C3627j) m3847O5, abstractC3642y2.f17414u, (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n), enumC2931o032222, z7, c2395p, 512 | i13 | ((i18 << 3) & 458752) | (i18 & 3670016)), abstractC3642y, enumC2931o032222, z7, c3622e02222, abstractC3642y2.f17410q, c3628k2222, c2395p, 0);
            abstractC3642y3 = abstractC3642y;
            interfaceC2796a2 = interfaceC2796a;
            AbstractC3405d0.m5166a(interfaceC0112c, AbstractC0170a.m389a(m3343u2222.mo5829e(AbstractC2847c0.m4505a(c3807o2222, abstractC3642y3, new C2722a(abstractC3642y3, null, 8))), interfaceC2796a2, null), abstractC3642y3.f17413t, interfaceC3281e2222, c2395p, 0);
        } else {
            throw new IllegalArgumentException(AbstractC2647h.m4256b("beyondViewportPageCount should be greater than or equal to 0, you selected ", i7).toString());
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C3621e(interfaceC3810r, abstractC3642y3, interfaceC3135i0, c3017f, z7, i12, f7, c3626i, interfaceC2796a2, c3801i, c3022k, c3173d, i8, i9);
        }
    }

    /* renamed from: i */
    public static final long m3522i(float f7, float f8) {
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    /* renamed from: j */
    public static final void m3523j(C2983d c2983d, C2868s c2868s) {
        C2982c c2982c = c2983d.f15414b;
        C2982c c2982c2 = c2983d.f15413a;
        boolean m4542a = AbstractC2866q.m4542a(c2868s);
        long j6 = c2868s.f15007b;
        long j7 = 0;
        if (m4542a) {
            AbstractC1804l.m3025R(c2982c2.f15408c);
            c2982c2.f15409d = 0;
            AbstractC1804l.m3025R(c2982c.f15408c);
            c2982c.f15409d = 0;
            c2983d.f15415c = 0L;
        }
        if (!AbstractC2866q.m4544c(c2868s)) {
            List list = c2868s.f15016k;
            if (list == null) {
                list = C1813u.f10860e;
            }
            int size = list.size();
            int i7 = 0;
            while (i7 < size) {
                C2846c c2846c = (C2846c) list.get(i7);
                long j8 = c2846c.f14938a;
                long m1011g = C0464b.m1011g(c2846c.f14940c, j7);
                c2982c2.m4639a(Float.intBitsToFloat((int) (m1011g >> 32)), j8);
                c2982c.m4639a(Float.intBitsToFloat((int) (m1011g & 4294967295L)), j8);
                i7++;
                j7 = 0;
            }
            long m1011g2 = C0464b.m1011g(c2868s.f15017l, 0L);
            c2982c2.m4639a(Float.intBitsToFloat((int) (m1011g2 >> 32)), j6);
            c2982c.m4639a(Float.intBitsToFloat((int) (m1011g2 & 4294967295L)), j6);
        }
        if (AbstractC2866q.m4544c(c2868s) && j6 - c2983d.f15415c > 40) {
            AbstractC1804l.m3025R(c2982c2.f15408c);
            c2982c2.f15409d = 0;
            AbstractC1804l.m3025R(c2982c.f15408c);
            c2982c.f15409d = 0;
            c2983d.f15415c = 0L;
        }
        c2983d.f15415c = j6;
    }

    /* renamed from: k */
    public static final boolean m3524k(ArrayList arrayList) {
        List list;
        long j6;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = C1813u.f10860e;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int m3066N = AbstractC1806n.m3066N(arrayList);
                int i7 = 0;
                while (i7 < m3066N) {
                    i7++;
                    Object obj2 = arrayList.get(i7);
                    C0482o c0482o = (C0482o) obj2;
                    C0482o c0482o2 = (C0482o) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (c0482o2.m1045g().m1014a() >> 32)) - Float.intBitsToFloat((int) (c0482o.m1045g().m1014a() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (c0482o2.m1045g().m1014a() & 4294967295L)) - Float.intBitsToFloat((int) (c0482o.m1045g().m1014a() & 4294967295L)));
                    arrayList2.add(new C0464b((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j6 = ((C0464b) AbstractC1805m.m3045i0(list)).f1623a;
            } else {
                if (list.isEmpty()) {
                    AbstractC3353a.m5087b("Empty collection can't be reduced.");
                }
                Object m3045i0 = AbstractC1805m.m3045i0(list);
                int m3066N2 = AbstractC1806n.m3066N(list);
                if (1 <= m3066N2) {
                    int i8 = 1;
                    while (true) {
                        m3045i0 = new C0464b(C0464b.m1011g(((C0464b) m3045i0).f1623a, ((C0464b) list.get(i8)).f1623a));
                        if (i8 == m3066N2) {
                            break;
                        }
                        i8++;
                    }
                }
                j6 = ((C0464b) m3045i0).f1623a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j6)) >= Float.intBitsToFloat((int) (j6 >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public static final void m3525l(long j6, EnumC2931o0 enumC2931o0) {
        if (enumC2931o0 == EnumC2931o0.f15240e) {
            if (C3091a.m4759g(j6) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (C3091a.m4760h(j6) != Integer.MAX_VALUE) {
        } else {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* renamed from: m */
    public static final void m3526m(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0000a.m7h(th, th2);
            }
        }
    }

    /* renamed from: n */
    public static int m3527n(int i7, int i8) {
        if (i7 < i8) {
            return i8;
        }
        return i7;
    }

    /* renamed from: o */
    public static double m3528o(double d7, double d8, double d9) {
        if (d8 <= d9) {
            if (d7 < d8) {
                return d8;
            }
            if (d7 > d9) {
                return d9;
            }
            return d7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d9 + " is less than minimum " + d8 + '.');
    }

    /* renamed from: p */
    public static float m3529p(float f7, float f8, float f9) {
        if (f8 <= f9) {
            if (f7 < f8) {
                return f8;
            }
            if (f7 > f9) {
                return f9;
            }
            return f7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f9 + " is less than minimum " + f8 + '.');
    }

    /* renamed from: q */
    public static int m3530q(int i7, int i8, int i9) {
        if (i8 <= i9) {
            if (i7 < i8) {
                return i8;
            }
            if (i7 > i9) {
                return i9;
            }
            return i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    /* renamed from: r */
    public static long m3531r(long j6, long j7, long j8) {
        if (j7 <= j8) {
            if (j6 < j7) {
                return j7;
            }
            if (j6 > j8) {
                return j8;
            }
            return j6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j8 + " is less than minimum " + j7 + '.');
    }

    /* renamed from: s */
    public static Comparable m3532s(Float f7, C3876a c3876a) {
        float f8 = c3876a.f18162b;
        float f9 = c3876a.f18161a;
        if (f9 <= f8) {
            if (C3876a.m5899a(f7, Float.valueOf(f9)) && !C3876a.m5899a(Float.valueOf(f9), f7)) {
                return Float.valueOf(f9);
            }
            if (C3876a.m5899a(Float.valueOf(f8), f7) && !C3876a.m5899a(f7, Float.valueOf(f8))) {
                return Float.valueOf(f8);
            }
            return f7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c3876a + '.');
    }

    /* renamed from: t */
    public static final InterfaceC2425y0 m3533t(InterfaceC3080i interfaceC3080i, C2395p c2395p, int i7) {
        boolean z7;
        Object m3847O = c2395p.m3847O();
        C2413u0 c2413u0 = C2375k.f13421a;
        if (m3847O == c2413u0) {
            m3847O = AbstractC2418w.m3980x(Boolean.FALSE);
            c2395p.m3877j0(m3847O);
        }
        InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
        if ((((i7 & 14) ^ 6) > 4 && c2395p.m3870g(interfaceC3080i)) || (i7 & 6) == 4) {
            z7 = true;
        } else {
            z7 = false;
        }
        Object m3847O2 = c2395p.m3847O();
        if (z7 || m3847O2 == c2413u0) {
            m3847O2 = new C2722a(interfaceC3080i, interfaceC2425y0, null, 6);
            c2395p.m3877j0(m3847O2);
        }
        AbstractC2418w.m3965g(interfaceC3080i, c2395p, (InterfaceC3281e) m3847O2);
        return interfaceC2425y0;
    }

    /* renamed from: u */
    public static final boolean m3534u(C0465c c0465c, float f7, float f8) {
        float f9 = c0465c.f1625a;
        if (f7 <= c0465c.f1627c && f9 <= f7) {
            float f10 = c0465c.f1626b;
            if (f8 <= c0465c.f1628d && f10 <= f8) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2570t m3535v(Context context) {
        C0129l c0129l;
        ProviderInfo providerInfo;
        C0690d c0690d;
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            c0129l = new C0129l(21);
        } else {
            c0129l = new C0129l(21);
        }
        PackageManager packageManager = context.getPackageManager();
        AbstractC3393k.m5139j(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (it.hasNext()) {
                providerInfo = it.next().providerInfo;
                if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                    break;
                }
            } else {
                providerInfo = null;
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] mo282h = c0129l.mo282h(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : mo282h) {
                    arrayList.add(signature.toByteArray());
                }
                c0690d = new C0690d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
            }
            if (c0690d != null) {
                return null;
            }
            return new C2570t(new C2569s(context, c0690d));
        }
        c0690d = null;
        if (c0690d != null) {
        }
    }

    /* renamed from: w */
    public static final void m3536w(C2260b c2260b, C2261b0 c2261b0) {
        ArrayList arrayList = c2261b0.f13114f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2265d0 abstractC2265d0 = (AbstractC2265d0) arrayList.get(i7);
            if (abstractC2265d0 instanceof C2269f0) {
                C2270g c2270g = new C2270g();
                C2269f0 c2269f0 = (C2269f0) abstractC2265d0;
                c2270g.f13154c = c2269f0.f13151e;
                c2270g.f13156e = true;
                c2270g.m3675c();
                c2270g.f13159h.f2151a.setFillType(Path.FillType.WINDING);
                c2270g.m3675c();
                c2270g.m3675c();
                c2270g.f13153b = c2269f0.f13152f;
                c2270g.m3675c();
                c2270g.m3675c();
                c2270g.m3675c();
                c2270g.m3675c();
                c2270g.m3675c();
                c2270g.m3675c();
                c2270g.m3675c();
                c2270g.m3675c();
                c2270g.f13157f = true;
                c2270g.m3675c();
                c2270g.f13155d = 1.0f;
                c2270g.f13157f = true;
                c2270g.m3675c();
                c2270g.f13157f = true;
                c2270g.m3675c();
                c2260b.m3669e(i7, c2270g);
            } else if (abstractC2265d0 instanceof C2261b0) {
                C2260b c2260b2 = new C2260b();
                C2261b0 c2261b02 = (C2261b0) abstractC2265d0;
                c2260b2.f13109k = "";
                c2260b2.m3675c();
                c2260b2.f13112n = true;
                c2260b2.m3675c();
                c2260b2.f13110l = 1.0f;
                c2260b2.f13112n = true;
                c2260b2.m3675c();
                c2260b2.f13111m = 1.0f;
                c2260b2.f13112n = true;
                c2260b2.m3675c();
                c2260b2.f13112n = true;
                c2260b2.m3675c();
                c2260b2.f13112n = true;
                c2260b2.m3675c();
                c2260b2.f13112n = true;
                c2260b2.m3675c();
                c2260b2.f13112n = true;
                c2260b2.m3675c();
                c2260b2.f13104f = c2261b02.f13113e;
                c2260b2.f13105g = true;
                c2260b2.m3675c();
                m3536w(c2260b2, c2261b02);
                c2260b.m3669e(i7, c2260b2);
            }
        }
    }

    /* renamed from: x */
    public static final float m3537x(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f7 = 0.0f;
        for (int i7 = 0; i7 < length; i7++) {
            f7 += fArr[i7] * fArr2[i7];
        }
        return f7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:247:0x060b, code lost:
    
        if (r3 != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x06d1, code lost:
    
        if (r7 == false) goto L342;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0541 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0757 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ca A[LOOP:2: B:57:0x02c8->B:58:0x02ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02db  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2069b m3538y(String str, Map map) {
        EnumC3871b enumC3871b;
        int i7;
        boolean z7;
        boolean z8;
        Charset forName;
        int i8;
        int i9;
        EnumC3873d enumC3873d;
        int i10;
        int i11;
        C3875f c3875f;
        int length;
        C3875f c3875f2;
        C2068a c2068a;
        EnumC2070c enumC2070c;
        int length2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        byte[][] bArr;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c7;
        int i17;
        int i18;
        if (!str.isEmpty()) {
            EnumC0395e enumC0395e = EnumC0395e.f1349e;
            if (map.containsKey(enumC0395e)) {
                enumC3871b = EnumC3871b.valueOf(map.get(enumC0395e).toString());
            } else {
                enumC3871b = EnumC3871b.f18134f;
            }
            EnumC0395e enumC0395e2 = EnumC0395e.f1351g;
            int i19 = 4;
            if (map.containsKey(enumC0395e2)) {
                i7 = Integer.parseInt(map.get(enumC0395e2).toString());
            } else {
                i7 = 4;
            }
            Charset charset = AbstractC0289c.f1051b;
            EnumC0395e enumC0395e3 = EnumC0395e.f1355k;
            int i20 = 1;
            int i21 = 0;
            if (map.containsKey(enumC0395e3) && Boolean.parseBoolean(map.get(enumC0395e3).toString())) {
                z7 = true;
            } else {
                z7 = false;
            }
            EnumC0395e enumC0395e4 = EnumC0395e.f1354j;
            if (map.containsKey(enumC0395e4) && Boolean.parseBoolean(map.get(enumC0395e4).toString())) {
                z8 = true;
            } else {
                z8 = false;
            }
            EnumC0395e enumC0395e5 = EnumC0395e.f1350f;
            boolean containsKey = map.containsKey(enumC0395e5);
            if (containsKey) {
                try {
                    forName = Charset.forName(map.get(enumC0395e5).toString());
                } catch (UnsupportedCharsetException unused) {
                }
                int i22 = 8;
                if (!z8) {
                    if (forName.equals(charset)) {
                        forName = null;
                    }
                    C0293g c0293g = new C0293g(str, forName, z7, enumC3871b);
                    EnumC3871b enumC3871b2 = (EnumC3871b) c0293g.f1070d;
                    C3875f[] c3875fArr = {C0293g.m648f(1), C0293g.m648f(2), C0293g.m648f(3)};
                    C0031h1[] c0031h1Arr = {c0293g.m651e(c3875fArr[0]), c0293g.m651e(c3875fArr[1]), c0293g.m651e(c3875fArr[2])};
                    int i23 = 0;
                    int i24 = -1;
                    int i25 = Integer.MAX_VALUE;
                    for (int i26 = 3; i23 < i26; i26 = 3) {
                        C0031h1 c0031h1 = c0031h1Arr[i23];
                        int i27 = i20;
                        int m108w = c0031h1.m108w((C3875f) c0031h1.f153g);
                        if (AbstractC0289c.m637c(m108w, c3875fArr[i23], enumC3871b2) && m108w < i25) {
                            i24 = i23;
                            i25 = m108w;
                        }
                        i23++;
                        i20 = i27;
                    }
                    i8 = i20;
                    if (i24 >= 0) {
                        C0031h1 c0031h12 = c0031h1Arr[i24];
                        C2068a c2068a2 = new C2068a();
                        ArrayList arrayList = (ArrayList) c0031h12.f152f;
                        int size = arrayList.size();
                        int i28 = 0;
                        while (i28 < size) {
                            Object obj = arrayList.get(i28);
                            i28++;
                            C0292f c0292f = (C0292f) obj;
                            int i29 = c0292f.f1064c;
                            C0031h1 c0031h13 = c0292f.f1066e;
                            int i30 = i21;
                            C0293g c0293g2 = (C0293g) c0031h13.f154h;
                            EnumC3873d enumC3873d2 = c0292f.f1062a;
                            c2068a2.m3303b(enumC3873d2.f18154f, i19);
                            int i31 = c0292f.f1065d;
                            if (i31 > 0) {
                                c2068a2.m3303b(c0292f.m645a(), enumC3873d2.m5895a((C3875f) c0031h13.f153g));
                            }
                            if (enumC3873d2 == EnumC3873d.ECI) {
                                c2068a2.m3303b(((EnumC2070c) EnumC2070c.f12263h.get(((C2073f) c0293g2.f1069c).f12278a[i29].charset().name())).f12265e[i30], 8);
                            } else if (i31 > 0) {
                                String str2 = (String) c0293g2.f1068b;
                                int i32 = c0292f.f1063b;
                                AbstractC0289c.m635a(str2.substring(i32, i31 + i32), enumC3873d2, c2068a2, ((C2073f) c0293g2.f1069c).f12278a[i29].charset());
                            }
                            i21 = i30;
                            i19 = 4;
                        }
                        i9 = i21;
                        c3875f2 = (C3875f) c0031h12.f153g;
                        c2068a = c2068a2;
                    } else {
                        throw new Exception("Data too big for any version");
                    }
                } else {
                    i8 = 1;
                    i9 = 0;
                    Charset charset2 = AbstractC2076i.f12295b;
                    EnumC3873d enumC3873d3 = EnumC3873d.BYTE;
                    if (charset2 != null && charset2.equals(forName) && AbstractC0289c.m636b(str)) {
                        enumC3873d = EnumC3873d.KANJI;
                    } else {
                        boolean z14 = false;
                        boolean z15 = false;
                        int i33 = 0;
                        while (true) {
                            if (i33 < str.length()) {
                                char charAt = str.charAt(i33);
                                if (charAt >= '0' && charAt <= '9') {
                                    z15 = true;
                                } else {
                                    int[] iArr = AbstractC0289c.f1050a;
                                    if (charAt < '`') {
                                        i10 = iArr[charAt];
                                    } else {
                                        i10 = -1;
                                    }
                                    if (i10 == -1) {
                                        break;
                                    }
                                    z14 = true;
                                }
                                i33++;
                            } else if (z14) {
                                enumC3873d = EnumC3873d.ALPHANUMERIC;
                            } else if (z15) {
                                enumC3873d = EnumC3873d.NUMERIC;
                            }
                        }
                        enumC3873d = enumC3873d3;
                    }
                    C2068a c2068a3 = new C2068a();
                    if (enumC3873d == enumC3873d3 && containsKey && (enumC2070c = (EnumC2070c) EnumC2070c.f12263h.get(forName.name())) != null) {
                        i11 = 4;
                        c2068a3.m3303b(7, 4);
                        c2068a3.m3303b(enumC2070c.f12265e[0], 8);
                    } else {
                        i11 = 4;
                    }
                    if (z7) {
                        c2068a3.m3303b(5, i11);
                    }
                    c2068a3.m3303b(enumC3873d.f18154f, i11);
                    C2068a c2068a4 = new C2068a();
                    AbstractC0289c.m635a(str, enumC3873d, c2068a4, forName);
                    EnumC0395e enumC0395e6 = EnumC0395e.f1352h;
                    if (map.containsKey(enumC0395e6)) {
                        c3875f = C3875f.m5898c(Integer.parseInt(map.get(enumC0395e6).toString()));
                        if (!AbstractC0289c.m637c(enumC3873d.m5895a(c3875f) + c2068a3.f12257f + c2068a4.f12257f, c3875f, enumC3871b)) {
                            throw new Exception("Data too big for requested version");
                        }
                    } else {
                        int m5895a = enumC3873d.m5895a(C3875f.m5898c(1)) + c2068a3.f12257f + c2068a4.f12257f;
                        int i34 = 1;
                        while (i34 <= 40) {
                            C3875f m5898c = C3875f.m5898c(i34);
                            if (AbstractC0289c.m637c(m5895a, m5898c, enumC3871b)) {
                                int m5895a2 = enumC3873d.m5895a(m5898c) + c2068a3.f12257f + c2068a4.f12257f;
                                int i35 = 1;
                                while (i35 <= 40) {
                                    C3875f m5898c2 = C3875f.m5898c(i35);
                                    if (AbstractC0289c.m637c(m5895a2, m5898c2, enumC3871b)) {
                                        c3875f = m5898c2;
                                    } else {
                                        i35++;
                                        i22 = 8;
                                    }
                                }
                                throw new Exception("Data too big");
                            }
                            i34++;
                            i22 = 8;
                        }
                        throw new Exception("Data too big");
                    }
                    C2068a c2068a5 = new C2068a();
                    int i36 = c2068a3.f12257f;
                    c2068a5.m3304c(i36);
                    for (int i37 = 0; i37 < i36; i37++) {
                        c2068a5.m3302a(c2068a3.m3305d(i37));
                    }
                    if (enumC3873d == enumC3873d3) {
                        length = c2068a4.m3308g();
                    } else {
                        length = str.length();
                    }
                    int m5895a3 = enumC3873d.m5895a(c3875f);
                    int i38 = 1 << m5895a3;
                    if (length < i38) {
                        c2068a5.m3303b(length, m5895a3);
                        int i39 = c2068a4.f12257f;
                        c2068a5.m3304c(c2068a5.f12257f + i39);
                        for (int i40 = 0; i40 < i39; i40++) {
                            c2068a5.m3302a(c2068a4.m3305d(i40));
                        }
                        c3875f2 = c3875f;
                        c2068a = c2068a5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(length);
                        sb.append(" is bigger than ");
                        sb.append(i38 - 1);
                        throw new Exception(sb.toString());
                    }
                }
                C0691e c0691e = c3875f2.f18159c[enumC3871b.ordinal()];
                int i41 = c3875f2.f18160d;
                int i42 = c0691e.f2244a;
                C0076s2[] c0076s2Arr = (C0076s2[]) c0691e.f2245b;
                length2 = c0076s2Arr.length;
                i12 = i9;
                int i43 = i12;
                while (i12 < length2) {
                    i43 += c0076s2Arr[i12].f374b;
                    i12++;
                }
                int i44 = i41 - (i43 * i42);
                i13 = i44 * 8;
                if (c2068a.f12257f > i13) {
                    for (int i45 = i9; i45 < 4 && c2068a.f12257f < i13; i45++) {
                        c2068a.m3302a(i9);
                    }
                    boolean z16 = i9;
                    int i46 = c2068a.f12257f & 7;
                    if (i46 > 0) {
                        while (i46 < i22) {
                            c2068a.m3302a(z16);
                            i46++;
                            z16 = 0;
                        }
                    }
                    int m3308g = i44 - c2068a.m3308g();
                    for (int i47 = 0; i47 < m3308g; i47++) {
                        if ((i47 & 1) == 0) {
                            i18 = 236;
                        } else {
                            i18 = 17;
                        }
                        c2068a.m3303b(i18, i22);
                    }
                    if (c2068a.f12257f == i13) {
                        int i48 = 0;
                        for (C0076s2 c0076s2 : c0076s2Arr) {
                            i48 += c0076s2.f374b;
                        }
                        if (c2068a.m3308g() == i44) {
                            ArrayList arrayList2 = new ArrayList(i48);
                            int i49 = 0;
                            int i50 = 0;
                            int i51 = 0;
                            int i52 = 0;
                            C2068a c2068a6 = c2068a;
                            while (i49 < i48) {
                                int i53 = i8;
                                int[] iArr2 = new int[i53];
                                int[] iArr3 = new int[i53];
                                if (i49 < i48) {
                                    int i54 = i41 % i48;
                                    int i55 = i7;
                                    int i56 = i48 - i54;
                                    int i57 = i41 / i48;
                                    int i58 = i44 / i48;
                                    int i59 = i58 + 1;
                                    int i60 = i57 - i58;
                                    int i61 = (i57 + 1) - i59;
                                    if (i60 == i61) {
                                        if (i48 == i56 + i54) {
                                            if (i41 == ((i59 + i61) * i54) + ((i58 + i60) * i56)) {
                                                if (i49 < i56) {
                                                    c7 = 0;
                                                    iArr2[0] = i58;
                                                    iArr3[0] = i60;
                                                } else {
                                                    c7 = 0;
                                                    iArr2[0] = i59;
                                                    iArr3[0] = i61;
                                                }
                                                int i62 = iArr2[c7];
                                                byte[] bArr2 = new byte[i62];
                                                int i63 = i50 * 8;
                                                int i64 = 0;
                                                while (i64 < i62) {
                                                    int i65 = i49;
                                                    int i66 = i48;
                                                    int i67 = i64;
                                                    int i68 = 0;
                                                    for (int i69 = 0; i69 < 8; i69++) {
                                                        if (c2068a6.m3305d(i63)) {
                                                            i68 |= 1 << (7 - i69);
                                                        }
                                                        i63++;
                                                    }
                                                    bArr2[i67] = (byte) i68;
                                                    i64 = i67 + 1;
                                                    i49 = i65;
                                                    i48 = i66;
                                                }
                                                int i70 = i49;
                                                int i71 = i48;
                                                int i72 = iArr3[0];
                                                int i73 = i62 + i72;
                                                int[] iArr4 = new int[i73];
                                                int i74 = 0;
                                                while (i74 < i62) {
                                                    iArr4[i74] = bArr2[i74] & 255;
                                                    i74++;
                                                    i73 = i73;
                                                }
                                                int i75 = i73;
                                                C2308a c2308a = C2308a.f13256l;
                                                ArrayList arrayList3 = new ArrayList();
                                                C2068a c2068a7 = c2068a6;
                                                EnumC3871b enumC3871b3 = enumC3871b;
                                                arrayList3.add(new C2309b(c2308a, new int[]{1}));
                                                if (i72 != 0) {
                                                    int i76 = i75 - i72;
                                                    if (i76 > 0) {
                                                        if (i72 >= arrayList3.size()) {
                                                            C2309b c2309b = (C2309b) arrayList3.get(arrayList3.size() - 1);
                                                            int size2 = arrayList3.size();
                                                            while (size2 <= i72) {
                                                                int i77 = size2;
                                                                c2309b = c2309b.m3689g(new C2309b(c2308a, new int[]{1, c2308a.f13260a[(i77 - 1) + c2308a.f13266g]}));
                                                                arrayList3.add(c2309b);
                                                                size2 = i77 + 1;
                                                                i41 = i41;
                                                                c3875f2 = c3875f2;
                                                            }
                                                        }
                                                        C3875f c3875f3 = c3875f2;
                                                        int i78 = i41;
                                                        C2309b c2309b2 = (C2309b) arrayList3.get(i72);
                                                        int[] iArr5 = new int[i76];
                                                        System.arraycopy(iArr4, 0, iArr5, 0, i76);
                                                        if (i76 != 0) {
                                                            if (i76 > 1 && iArr5[0] == 0) {
                                                                int i79 = 1;
                                                                while (i79 < i76 && iArr5[i79] == 0) {
                                                                    i79++;
                                                                }
                                                                if (i79 == i76) {
                                                                    iArr5 = new int[]{0};
                                                                } else {
                                                                    int i80 = i76 - i79;
                                                                    i17 = i76;
                                                                    int[] iArr6 = new int[i80];
                                                                    System.arraycopy(iArr5, i79, iArr6, 0, i80);
                                                                    iArr5 = iArr6;
                                                                    if (i72 < 0) {
                                                                        int length3 = iArr5.length;
                                                                        int[] iArr7 = new int[length3 + i72];
                                                                        int i81 = 0;
                                                                        while (i81 < length3) {
                                                                            iArr7[i81] = c2308a.m3682c(iArr5[i81], 1);
                                                                            i81++;
                                                                            iArr5 = iArr5;
                                                                        }
                                                                        C2309b c2309b3 = new C2309b(c2308a, iArr7);
                                                                        if (c2308a.equals(c2309b2.f13267a)) {
                                                                            if (!c2309b2.m3687e()) {
                                                                                C2309b c2309b4 = c2308a.f13262c;
                                                                                int m3681b = c2308a.m3681b(c2309b2.m3685c(c2309b2.m3686d()));
                                                                                while (c2309b3.m3686d() >= c2309b2.m3686d() && !c2309b3.m3687e()) {
                                                                                    int m3686d = c2309b3.m3686d() - c2309b2.m3686d();
                                                                                    int m3682c = c2308a.m3682c(c2309b3.m3685c(c2309b3.m3686d()), m3681b);
                                                                                    int i82 = m3681b;
                                                                                    C2309b m3690h = c2309b2.m3690h(m3686d, m3682c);
                                                                                    c2309b4 = c2309b4.m3683a(c2308a.m3680a(m3686d, m3682c));
                                                                                    c2309b3 = c2309b3.m3683a(m3690h);
                                                                                    m3681b = i82;
                                                                                }
                                                                                int[] iArr8 = new C2309b[]{c2309b4, c2309b3}[1].f13268b;
                                                                                int length4 = i72 - iArr8.length;
                                                                                for (int i83 = 0; i83 < length4; i83++) {
                                                                                    iArr4[i17 + i83] = 0;
                                                                                }
                                                                                System.arraycopy(iArr8, 0, iArr4, i17 + length4, iArr8.length);
                                                                                byte[] bArr3 = new byte[i72];
                                                                                for (int i84 = 0; i84 < i72; i84++) {
                                                                                    bArr3[i84] = (byte) iArr4[i62 + i84];
                                                                                }
                                                                                arrayList2.add(new C0287a(bArr2, bArr3));
                                                                                i51 = Math.max(i51, i62);
                                                                                i52 = Math.max(i52, i72);
                                                                                i50 += iArr2[0];
                                                                                i49 = i70 + 1;
                                                                                i7 = i55;
                                                                                i48 = i71;
                                                                                c2068a6 = c2068a7;
                                                                                enumC3871b = enumC3871b3;
                                                                                i41 = i78;
                                                                                c3875f2 = c3875f3;
                                                                                i8 = 1;
                                                                            } else {
                                                                                throw new IllegalArgumentException("Divide by 0");
                                                                            }
                                                                        } else {
                                                                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                                                        }
                                                                    } else {
                                                                        throw new IllegalArgumentException();
                                                                    }
                                                                }
                                                            }
                                                            i17 = i76;
                                                            if (i72 < 0) {
                                                            }
                                                        } else {
                                                            throw new IllegalArgumentException();
                                                        }
                                                    } else {
                                                        throw new IllegalArgumentException("No data bytes provided");
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("No error correction bytes");
                                                }
                                            } else {
                                                throw new Exception("Total bytes mismatch");
                                            }
                                        } else {
                                            throw new Exception("RS blocks mismatch");
                                        }
                                    } else {
                                        throw new Exception("EC bytes mismatch");
                                    }
                                } else {
                                    throw new Exception("Block ID too large");
                                }
                            }
                            C3875f c3875f4 = c3875f2;
                            EnumC3871b enumC3871b4 = enumC3871b;
                            int i85 = i7;
                            int i86 = i41;
                            if (i44 == i50) {
                                C2068a c2068a8 = new C2068a();
                                for (int i87 = 0; i87 < i51; i87++) {
                                    int size3 = arrayList2.size();
                                    int i88 = 0;
                                    while (i88 < size3) {
                                        Object obj2 = arrayList2.get(i88);
                                        i88++;
                                        byte[] bArr4 = ((C0287a) obj2).f1044a;
                                        if (i87 < bArr4.length) {
                                            c2068a8.m3303b(bArr4[i87], 8);
                                        }
                                    }
                                }
                                for (int i89 = 0; i89 < i52; i89++) {
                                    int size4 = arrayList2.size();
                                    int i90 = 0;
                                    while (i90 < size4) {
                                        Object obj3 = arrayList2.get(i90);
                                        i90++;
                                        byte[] bArr5 = ((C0287a) obj3).f1045b;
                                        if (i89 < bArr5.length) {
                                            c2068a8.m3303b(bArr5[i89], 8);
                                        }
                                    }
                                }
                                if (i86 == c2068a8.m3308g()) {
                                    int i91 = (c3875f4.f18157a * 4) + 17;
                                    C0288b c0288b = new C0288b(i91, i91, 0);
                                    int i92 = c0288b.f1048g;
                                    EnumC0395e enumC0395e7 = EnumC0395e.f1353i;
                                    if (map.containsKey(enumC0395e7)) {
                                        i14 = Integer.parseInt(map.get(enumC0395e7).toString());
                                        if (i14 >= 0 && i14 < 8) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                    }
                                    i14 = -1;
                                    int i93 = c0288b.f1047f;
                                    if (i14 == -1) {
                                        int i94 = -1;
                                        int i95 = 0;
                                        int i96 = Integer.MAX_VALUE;
                                        while (i95 < 8) {
                                            EnumC3871b enumC3871b5 = enumC3871b4;
                                            AbstractC0290d.m639b(c2068a8, enumC3871b5, c3875f4, i95, c0288b);
                                            int i97 = 0;
                                            int m638a = AbstractC0290d.m638a(c0288b, false) + AbstractC0290d.m638a(c0288b, true);
                                            byte[][] bArr6 = (byte[][]) c0288b.f1049h;
                                            int i98 = 0;
                                            int i99 = 0;
                                            while (i98 < i92 - 1) {
                                                byte[] bArr7 = bArr6[i98];
                                                int i100 = i99;
                                                int i101 = i97;
                                                while (i101 < i93 - 1) {
                                                    byte b8 = bArr7[i101];
                                                    int i102 = i101 + 1;
                                                    if (b8 == bArr7[i102]) {
                                                        byte[] bArr8 = bArr6[i98 + 1];
                                                        if (b8 == bArr8[i101] && b8 == bArr8[i102]) {
                                                            i100++;
                                                        }
                                                    }
                                                    i101 = i102;
                                                }
                                                i98++;
                                                i99 = i100;
                                                i97 = 0;
                                            }
                                            int i103 = (i99 * 3) + m638a;
                                            int i104 = 0;
                                            for (int i105 = 0; i105 < i92; i105++) {
                                                int i106 = 0;
                                                while (i106 < i93) {
                                                    byte[] bArr9 = bArr6[i105];
                                                    int i107 = i106 + 6;
                                                    int i108 = i104;
                                                    if (i107 < i93) {
                                                        i15 = i95;
                                                        byte b9 = 1;
                                                        if (bArr9[i106] == 1 && bArr9[i106 + 1] == 0 && bArr9[i106 + 2] == 1 && bArr9[i106 + 3] == 1 && bArr9[i106 + 4] == 1 && bArr9[i106 + 5] == 0 && bArr9[i107] == 1) {
                                                            int i109 = i106 - 4;
                                                            if (i109 >= 0 && bArr9.length >= i106) {
                                                                while (i109 < i106) {
                                                                    if (bArr9[i109] != b9) {
                                                                        i109++;
                                                                        b9 = 1;
                                                                    }
                                                                }
                                                                z11 = true;
                                                                if (!z11) {
                                                                    int i110 = i106 + 7;
                                                                    int i111 = i106 + 11;
                                                                    if (i110 >= 0 && bArr9.length >= i111) {
                                                                        while (i110 < i111) {
                                                                            int i112 = i110;
                                                                            if (bArr9[i110] != 1) {
                                                                                i110 = i112 + 1;
                                                                            }
                                                                        }
                                                                        z12 = true;
                                                                    }
                                                                    z12 = false;
                                                                    break;
                                                                }
                                                                i104 = i108 + 1;
                                                                i16 = i105 + 6;
                                                                if (i16 < i92) {
                                                                    byte b10 = 1;
                                                                    if (bArr6[i105][i106] == 1 && bArr6[i105 + 1][i106] == 0 && bArr6[i105 + 2][i106] == 1 && bArr6[i105 + 3][i106] == 1 && bArr6[i105 + 4][i106] == 1 && bArr6[i105 + 5][i106] == 0 && bArr6[i16][i106] == 1) {
                                                                        int i113 = i105 - 4;
                                                                        if (i113 >= 0 && bArr6.length >= i105) {
                                                                            while (i113 < i105) {
                                                                                if (bArr6[i113][i106] != b10) {
                                                                                    i113++;
                                                                                    b10 = 1;
                                                                                }
                                                                            }
                                                                            z9 = true;
                                                                            if (z9) {
                                                                                int i114 = i105 + 7;
                                                                                int i115 = i105 + 11;
                                                                                if (i114 < 0 || bArr6.length < i115) {
                                                                                    bArr = bArr6;
                                                                                } else {
                                                                                    while (i114 < i115) {
                                                                                        bArr = bArr6;
                                                                                        if (bArr6[i114][i106] != 1) {
                                                                                            i114++;
                                                                                            bArr6 = bArr;
                                                                                        }
                                                                                    }
                                                                                    bArr = bArr6;
                                                                                    z10 = true;
                                                                                    if (!z10) {
                                                                                        i106++;
                                                                                        bArr6 = bArr;
                                                                                        i95 = i15;
                                                                                    }
                                                                                }
                                                                                z10 = false;
                                                                                if (!z10) {
                                                                                }
                                                                            } else {
                                                                                bArr = bArr6;
                                                                            }
                                                                            i104++;
                                                                            i106++;
                                                                            bArr6 = bArr;
                                                                            i95 = i15;
                                                                        }
                                                                        z9 = false;
                                                                        if (z9) {
                                                                        }
                                                                        i104++;
                                                                        i106++;
                                                                        bArr6 = bArr;
                                                                        i95 = i15;
                                                                    }
                                                                }
                                                                bArr = bArr6;
                                                                i106++;
                                                                bArr6 = bArr;
                                                                i95 = i15;
                                                            }
                                                            z11 = false;
                                                            if (!z11) {
                                                            }
                                                            i104 = i108 + 1;
                                                            i16 = i105 + 6;
                                                            if (i16 < i92) {
                                                            }
                                                            bArr = bArr6;
                                                            i106++;
                                                            bArr6 = bArr;
                                                            i95 = i15;
                                                        }
                                                    } else {
                                                        i15 = i95;
                                                    }
                                                    i104 = i108;
                                                    i16 = i105 + 6;
                                                    if (i16 < i92) {
                                                    }
                                                    bArr = bArr6;
                                                    i106++;
                                                    bArr6 = bArr;
                                                    i95 = i15;
                                                }
                                            }
                                            byte[][] bArr10 = bArr6;
                                            int i116 = i95;
                                            int i117 = (i104 * 40) + i103;
                                            int i118 = 0;
                                            for (int i119 = 0; i119 < i92; i119++) {
                                                byte[] bArr11 = bArr10[i119];
                                                for (int i120 = 0; i120 < i93; i120++) {
                                                    if (bArr11[i120] == 1) {
                                                        i118++;
                                                    }
                                                }
                                            }
                                            int i121 = i92 * i93;
                                            int abs = (((Math.abs((i118 * 2) - i121) * 10) / i121) * 10) + i117;
                                            if (abs < i96) {
                                                i96 = abs;
                                                i94 = i116;
                                            }
                                            i95 = i116 + 1;
                                            enumC3871b4 = enumC3871b5;
                                        }
                                        i14 = i94;
                                    }
                                    AbstractC0290d.m639b(c2068a8, enumC3871b4, c3875f4, i14, c0288b);
                                    int i122 = i85 * 2;
                                    int i123 = i93 + i122;
                                    int i124 = i122 + i92;
                                    int max = Math.max(512, i123);
                                    int max2 = Math.max(512, i124);
                                    int min = Math.min(max / i123, max2 / i124);
                                    int i125 = (max - (i93 * min)) / 2;
                                    int i126 = (max2 - (i92 * min)) / 2;
                                    C2069b c2069b = new C2069b(max, max2);
                                    int i127 = 0;
                                    while (i127 < i92) {
                                        int i128 = i125;
                                        int i129 = 0;
                                        while (i129 < i93) {
                                            if (c0288b.m633r(i129, i127) == 1) {
                                                c2069b.m3320i(i128, i126, min, min);
                                            }
                                            i129++;
                                            i128 += min;
                                        }
                                        i127++;
                                        i126 += min;
                                    }
                                    return c2069b;
                                }
                                StringBuilder m188o = AbstractC0094y0.m188o(i86, "Interleaving error: ", " and ");
                                m188o.append(c2068a8.m3308g());
                                m188o.append(" differ.");
                                throw new Exception(m188o.toString());
                            }
                            throw new Exception("Data bytes does not match offset");
                        }
                        throw new Exception("Number of bits and data bytes does not match");
                    }
                    throw new Exception("Bits size does not equal capacity");
                }
                throw new Exception("data bits cannot fit in the QR Code" + c2068a.f12257f + " > " + i13);
            }
            forName = charset;
            int i222 = 8;
            if (!z8) {
            }
            C0691e c0691e2 = c3875f2.f18159c[enumC3871b.ordinal()];
            int i412 = c3875f2.f18160d;
            int i422 = c0691e2.f2244a;
            C0076s2[] c0076s2Arr2 = (C0076s2[]) c0691e2.f2245b;
            length2 = c0076s2Arr2.length;
            i12 = i9;
            int i432 = i12;
            while (i12 < length2) {
            }
            int i442 = i412 - (i432 * i422);
            i13 = i442 * 8;
            if (c2068a.f12257f > i13) {
            }
        } else {
            throw new IllegalArgumentException("Found empty contents");
        }
    }

    /* renamed from: z */
    public static final float m3539z(Layout layout, int i7, Paint paint) {
        int i8;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i7);
        C1772i c1772i = AbstractC1774k.f10809a;
        if (layout.getEllipsisCount(i7) <= 0 || layout.getParagraphDirection(i7) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
        if (paragraphAlignment == null) {
            i8 = -1;
        } else {
            i8 = AbstractC2167d.f12573a[paragraphAlignment.ordinal()];
        }
        if (i8 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }
}
