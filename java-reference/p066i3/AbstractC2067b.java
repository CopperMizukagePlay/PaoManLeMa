package p066i3;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.foundation.C0151g;
import androidx.compose.foundation.lazy.layout.AbstractC0158c;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p001a0.AbstractC0094y0;
import p001a0.C0059o1;
import p001a0.C0065q;
import p001a0.C0068q2;
import p005a6.InterfaceC0111b;
import p005a6.InterfaceC0112c;
import p006a7.C0129l;
import p012b3.AbstractC0275c;
import p024c6.AbstractC0444k;
import p027d1.C0465c;
import p028d2.AbstractC0476i;
import p028d2.C0468a;
import p028d2.C0482o;
import p028d2.C0483p;
import p028d2.C0491x;
import p029d3.AbstractC0495b;
import p032d6.InterfaceC0516a0;
import p035e1.C0677s;
import p035e1.InterfaceC0682x;
import p050g2.C1602n0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.C1990r3;
import p067i4.AbstractC2072e;
import p080k2.C2290a;
import p080k2.C2294e;
import p080k2.C2301l;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2350d2;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.C2427z;
import p085l0.InterfaceC2343c;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p087l2.C2459w;
import p090l5.EnumC2465a;
import p098m5.AbstractC2581a;
import p098m5.AbstractC2583c;
import p107o.C2746i;
import p107o.C2769p1;
import p107o.C2774r0;
import p117p1.C2855g0;
import p117p1.C2857h0;
import p117p1.C2859j;
import p117p1.C2868s;
import p117p1.EnumC2860k;
import p117p1.InterfaceC2872w;
import p122q.C2928n0;
import p122q.EnumC2931o0;
import p122q.InterfaceC2925m0;
import p140s2.C3095e;
import p140s2.C3101k;
import p140s2.C3104n;
import p140s2.EnumC3103m;
import p144t.InterfaceC3132h;
import p144t.InterfaceC3135i0;
import p147t2.AbstractC3249b;
import p147t2.InterfaceC3248a;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p152u.C3314b;
import p152u.C3316d;
import p152u.C3318f;
import p152u.C3323k;
import p152u.C3330r;
import p153u0.AbstractC3344k;
import p158u5.AbstractC3367j;
import p158u5.C3362e;
import p158u5.InterfaceC3361d;
import p160v.AbstractC3405d0;
import p160v.C3417j0;
import p160v.InterfaceC3435s0;
import p168w.C3625h;
import p168w.C3635r;
import p170w1.AbstractC3674f1;
import p177x0.AbstractC3793a;
import p177x0.C3801i;
import p177x0.InterfaceC3796d;
import p177x0.InterfaceC3810r;
import p183y0.C3836e;
import p183y0.InterfaceC3844m;
import p191z0.ViewOnAttachStateChangeListenerC3864c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i3.b */
/* loaded from: classes.dex */
public abstract class AbstractC2067b {
    /* renamed from: A */
    public static final long m3273A(float f7, long j6) {
        return AbstractC1793a0.m2973a(Math.max(0.0f, Float.intBitsToFloat((int) (j6 >> 32)) - f7), Math.max(0.0f, Float.intBitsToFloat((int) (j6 & 4294967295L)) - f7));
    }

    /* renamed from: B */
    public static final ExtractedText m3274B(C2459w c2459w) {
        ExtractedText extractedText = new ExtractedText();
        String str = c2459w.f13723a.f10239f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j6 = c2459w.f13724b;
        extractedText.selectionStart = C1602n0.m2589e(j6);
        extractedText.selectionEnd = C1602n0.m2588d(j6);
        extractedText.flags = !AbstractC0444k.m929S(c2459w.f13723a.f10239f, '\n') ? 1 : 0;
        return extractedText;
    }

    /* renamed from: C */
    public static InterfaceC3810r m3275C(InterfaceC3810r interfaceC3810r, C2769p1 c2769p1) {
        return AbstractC3793a.m5821a(interfaceC3810r, new C0151g(c2769p1, true));
    }

    /* renamed from: a */
    public static final C3836e m3276a(String str) {
        return new C3836e(AbstractC1793a0.m2970J(str));
    }

    /* renamed from: b */
    public static final C3095e m3277b(Context context) {
        float f7 = context.getResources().getConfiguration().fontScale;
        float f8 = context.getResources().getDisplayMetrics().density;
        InterfaceC3248a m4961a = AbstractC3249b.m4961a(f7);
        if (m4961a == null) {
            m4961a = new C3104n(f7);
        }
        return new C3095e(f8, f7, m4961a);
    }

    /* renamed from: c */
    public static final C3101k m3278c(long j6, long j7) {
        int i7 = (int) (j6 >> 32);
        int i8 = (int) (j6 & 4294967295L);
        return new C3101k(i7, i8, ((int) (j7 >> 32)) + i7, ((int) (j7 & 4294967295L)) + i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x023f, code lost:
    
        if (r39.m3872h(false) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025d, code lost:
    
        if (r39.m3872h(true) == false) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0331 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0260  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, u.c] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3279d(int i7, int i8, C2395p c2395p, InterfaceC2925m0 interfaceC2925m0, InterfaceC3132h interfaceC3132h, InterfaceC3135i0 interfaceC3135i0, InterfaceC3279c interfaceC3279c, C3330r c3330r, InterfaceC3796d interfaceC3796d, InterfaceC3810r interfaceC3810r, boolean z7) {
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean m3870g;
        int i11;
        Object c3323k;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Object m3847O;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        c2395p.m3859a0(620764179);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i9 = i26 | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(c3330r)) {
                i25 = 32;
            } else {
                i25 = 16;
            }
            i9 |= i25;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(interfaceC3135i0)) {
                i24 = 256;
            } else {
                i24 = 128;
            }
            i9 |= i24;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3872h(false)) {
                i23 = 2048;
            } else {
                i23 = 1024;
            }
            i9 |= i23;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3872h(true)) {
                i22 = 16384;
            } else {
                i22 = 8192;
            }
            i9 |= i22;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3870g(interfaceC2925m0)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i9 |= i21;
        }
        if ((i7 & 1572864) == 0) {
            if (c2395p.m3872h(z7)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i9 |= i20;
        }
        int i27 = i9 | 12582912;
        if ((i7 & 100663296) == 0) {
            if (c2395p.m3870g(interfaceC3796d)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i27 |= i19;
        }
        if ((i7 & 805306368) == 0) {
            if (c2395p.m3870g(interfaceC3132h)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i27 |= i18;
        }
        int i28 = i8 | 54;
        if ((i8 & 384) == 0) {
            if (c2395p.m3874i(interfaceC3279c)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i28 |= i17;
        }
        int i29 = i28;
        if ((i27 & 306783379) == 306783378 && (i29 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            int i30 = (i27 >> 3) & 14;
            int i31 = i30 | ((i29 >> 3) & 112);
            InterfaceC2425y0 m3953A = AbstractC2418w.m3953A(interfaceC3279c, c2395p);
            if ((((i31 & 14) ^ 6) > 4 && c2395p.m3870g(c3330r)) || (i31 & 6) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object m3847O2 = c2395p.m3847O();
            Object obj = C2375k.f13421a;
            if (!z8 && m3847O2 != obj) {
                i10 = i29;
            } else {
                ?? obj2 = new Object();
                i10 = i29;
                obj2.f16278a = new C2349d1(Integer.MAX_VALUE);
                obj2.f16279b = new C2349d1(Integer.MAX_VALUE);
                C2413u0 c2413u0 = C2413u0.f13573h;
                m3847O2 = new C1990r3(AbstractC2418w.m3973p(c2413u0, new C2746i(AbstractC2418w.m3973p(c2413u0, new C0065q(m3953A, 3)), c3330r, obj2, 3)), InterfaceC2390n2.class, "value", "getValue()Ljava/lang/Object;", 0, 2);
                c2395p.m3877j0(m3847O2);
            }
            InterfaceC0112c interfaceC0112c = (InterfaceC0112c) m3847O2;
            int i32 = i30 | ((i27 >> 9) & 112);
            if ((((i32 & 14) ^ 6) > 4 && c2395p.m3870g(c3330r)) || (i32 & 6) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((((i32 & 112) ^ 48) > 32 && c2395p.m3872h(true)) || (i32 & 48) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z19 = z10 | z9;
            Object m3847O3 = c2395p.m3847O();
            if (z19 || m3847O3 == obj) {
                m3847O3 = new C3316d(c3330r);
                c2395p.m3877j0(m3847O3);
            }
            InterfaceC3435s0 interfaceC3435s0 = (InterfaceC3435s0) m3847O3;
            Object m3847O4 = c2395p.m3847O();
            if (m3847O4 == obj) {
                Object c2427z = new C2427z(AbstractC2418w.m3971n(c2395p));
                c2395p.m3877j0(c2427z);
                m3847O4 = c2427z;
            }
            InterfaceC0516a0 interfaceC0516a0 = ((C2427z) m3847O4).f13636e;
            InterfaceC0682x interfaceC0682x = (InterfaceC0682x) c2395p.m3878k(AbstractC3674f1.f17516g);
            boolean z20 = !((Boolean) c2395p.m3878k(AbstractC3674f1.f17531v)).booleanValue();
            int i33 = i27 & 7168;
            int i34 = i27 >> 6;
            int i35 = i10 << 21;
            int i36 = i27;
            int i37 = (i27 & 65520) | (i34 & 458752) | (i34 & 3670016) | (i35 & 29360128) | (i35 & 234881024) | (i27 & 1879048192);
            if ((((i37 & 112) ^ 48) > 32 && c2395p.m3870g(c3330r)) || (i37 & 48) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z21 = z11;
            if ((((i37 & 896) ^ 384) > 256 && c2395p.m3870g(interfaceC3135i0)) || (i37 & 384) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z22 = z21 | z12;
            if (((i37 & 7168) ^ 3072) <= 2048) {
            }
            if ((i37 & 3072) != 2048) {
                z13 = false;
                boolean z23 = z22 | z13;
                if (((57344 & i37) ^ 24576) <= 16384) {
                }
                if ((i37 & 24576) != 16384) {
                    z14 = false;
                    boolean z24 = z23 | z14;
                    if ((((i37 & 3670016) ^ 1572864) <= 1048576 && c2395p.m3870g(interfaceC3796d)) || (i37 & 1572864) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z25 = z15 | z24;
                    if (((i37 & 29360128) ^ 12582912) <= 8388608 && c2395p.m3870g(null)) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z26 = z16 | z25;
                    if (((i37 & 234881024) ^ 100663296) <= 67108864 && c2395p.m3870g(null)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z27 = z26 | z17;
                    if ((((i37 & 1879048192) ^ 805306368) <= 536870912 && c2395p.m3870g(interfaceC3132h)) || (i37 & 805306368) == 536870912) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    m3870g = z27 | z18 | c2395p.m3870g(interfaceC0682x) | c2395p.m3872h(z20);
                    Object m3847O5 = c2395p.m3847O();
                    if (!m3870g || m3847O5 == obj) {
                        i11 = 0;
                        i12 = 1;
                        i13 = 32;
                        c3323k = new C3323k(c3330r, interfaceC3135i0, interfaceC0112c, interfaceC3132h, z20, interfaceC0516a0, interfaceC0682x, interfaceC3796d);
                        c2395p.m3877j0(c3323k);
                    } else {
                        c3323k = m3847O5;
                        i12 = 1;
                        i13 = 32;
                        i11 = 0;
                    }
                    InterfaceC3281e interfaceC3281e = (InterfaceC3281e) c3323k;
                    InterfaceC3810r mo5829e = interfaceC3810r.mo5829e(c3330r.f16371l).mo5829e(c3330r.f16372m);
                    EnumC2931o0 enumC2931o0 = EnumC2931o0.f15240e;
                    InterfaceC3810r m369a = AbstractC0158c.m369a(mo5829e, interfaceC0112c, interfaceC3435s0, enumC2931o0, z7);
                    i14 = i30 | ((i36 >> 18) & 112);
                    if ((((i14 & 14) ^ 6) <= 4 && c2395p.m3870g(c3330r)) || (i14 & 6) == 4) {
                        i15 = i12;
                    } else {
                        i15 = i11;
                    }
                    if (((i14 & 112) ^ 48) > i13 && c2395p.m3866e(i11)) {
                        i11 = i12;
                    }
                    i16 = i15 | i11;
                    m3847O = c2395p.m3847O();
                    if (i16 == 0 || m3847O == obj) {
                        m3847O = new C3318f(c3330r);
                        c2395p.m3877j0(m3847O);
                    }
                    AbstractC3405d0.m5166a(interfaceC0112c, AbstractC2072e.m3343u(AbstractC3405d0.m5174k(m369a, (C3318f) m3847O, c3330r.f16374o, (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n), enumC2931o0, z7, c2395p, 512 | i33 | (i36 & 3670016)).mo5829e(c3330r.f16373n.f686k), c3330r, enumC2931o0, z7, interfaceC2925m0, c3330r.f16366g, null, c2395p, 64), c3330r.f16375p, interfaceC3281e, c2395p, 0);
                }
                z14 = true;
                boolean z242 = z23 | z14;
                if (((i37 & 3670016) ^ 1572864) <= 1048576) {
                }
                z15 = false;
                boolean z252 = z15 | z242;
                if (((i37 & 29360128) ^ 12582912) <= 8388608) {
                }
                z16 = false;
                boolean z262 = z16 | z252;
                if (((i37 & 234881024) ^ 100663296) <= 67108864) {
                }
                z17 = false;
                boolean z272 = z262 | z17;
                if (((i37 & 1879048192) ^ 805306368) <= 536870912) {
                }
                z18 = false;
                m3870g = z272 | z18 | c2395p.m3870g(interfaceC0682x) | c2395p.m3872h(z20);
                Object m3847O52 = c2395p.m3847O();
                if (!m3870g) {
                }
                i11 = 0;
                i12 = 1;
                i13 = 32;
                c3323k = new C3323k(c3330r, interfaceC3135i0, interfaceC0112c, interfaceC3132h, z20, interfaceC0516a0, interfaceC0682x, interfaceC3796d);
                c2395p.m3877j0(c3323k);
                InterfaceC3281e interfaceC3281e2 = (InterfaceC3281e) c3323k;
                InterfaceC3810r mo5829e2 = interfaceC3810r.mo5829e(c3330r.f16371l).mo5829e(c3330r.f16372m);
                EnumC2931o0 enumC2931o02 = EnumC2931o0.f15240e;
                InterfaceC3810r m369a2 = AbstractC0158c.m369a(mo5829e2, interfaceC0112c, interfaceC3435s0, enumC2931o02, z7);
                i14 = i30 | ((i36 >> 18) & 112);
                if (((i14 & 14) ^ 6) <= 4) {
                }
                i15 = i11;
                if (((i14 & 112) ^ 48) > i13) {
                    i11 = i12;
                }
                i16 = i15 | i11;
                m3847O = c2395p.m3847O();
                if (i16 == 0) {
                }
                m3847O = new C3318f(c3330r);
                c2395p.m3877j0(m3847O);
                AbstractC3405d0.m5166a(interfaceC0112c, AbstractC2072e.m3343u(AbstractC3405d0.m5174k(m369a2, (C3318f) m3847O, c3330r.f16374o, (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n), enumC2931o02, z7, c2395p, 512 | i33 | (i36 & 3670016)).mo5829e(c3330r.f16373n.f686k), c3330r, enumC2931o02, z7, interfaceC2925m0, c3330r.f16366g, null, c2395p, 64), c3330r.f16375p, interfaceC3281e2, c2395p, 0);
            }
            z13 = true;
            boolean z232 = z22 | z13;
            if (((57344 & i37) ^ 24576) <= 16384) {
            }
            if ((i37 & 24576) != 16384) {
            }
            z14 = true;
            boolean z2422 = z232 | z14;
            if (((i37 & 3670016) ^ 1572864) <= 1048576) {
            }
            z15 = false;
            boolean z2522 = z15 | z2422;
            if (((i37 & 29360128) ^ 12582912) <= 8388608) {
            }
            z16 = false;
            boolean z2622 = z16 | z2522;
            if (((i37 & 234881024) ^ 100663296) <= 67108864) {
            }
            z17 = false;
            boolean z2722 = z2622 | z17;
            if (((i37 & 1879048192) ^ 805306368) <= 536870912) {
            }
            z18 = false;
            m3870g = z2722 | z18 | c2395p.m3870g(interfaceC0682x) | c2395p.m3872h(z20);
            Object m3847O522 = c2395p.m3847O();
            if (!m3870g) {
            }
            i11 = 0;
            i12 = 1;
            i13 = 32;
            c3323k = new C3323k(c3330r, interfaceC3135i0, interfaceC0112c, interfaceC3132h, z20, interfaceC0516a0, interfaceC0682x, interfaceC3796d);
            c2395p.m3877j0(c3323k);
            InterfaceC3281e interfaceC3281e22 = (InterfaceC3281e) c3323k;
            InterfaceC3810r mo5829e22 = interfaceC3810r.mo5829e(c3330r.f16371l).mo5829e(c3330r.f16372m);
            EnumC2931o0 enumC2931o022 = EnumC2931o0.f15240e;
            InterfaceC3810r m369a22 = AbstractC0158c.m369a(mo5829e22, interfaceC0112c, interfaceC3435s0, enumC2931o022, z7);
            i14 = i30 | ((i36 >> 18) & 112);
            if (((i14 & 14) ^ 6) <= 4) {
            }
            i15 = i11;
            if (((i14 & 112) ^ 48) > i13) {
            }
            i16 = i15 | i11;
            m3847O = c2395p.m3847O();
            if (i16 == 0) {
            }
            m3847O = new C3318f(c3330r);
            c2395p.m3877j0(m3847O);
            AbstractC3405d0.m5166a(interfaceC0112c, AbstractC2072e.m3343u(AbstractC3405d0.m5174k(m369a22, (C3318f) m3847O, c3330r.f16374o, (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n), enumC2931o022, z7, c2395p, 512 | i33 | (i36 & 3670016)).mo5829e(c3330r.f16373n.f686k), c3330r, enumC2931o022, z7, interfaceC2925m0, c3330r.f16366g, null, c2395p, 64), c3330r.f16375p, interfaceC3281e22, c2395p, 0);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C3314b(interfaceC3810r, c3330r, interfaceC3135i0, interfaceC2925m0, z7, interfaceC3796d, interfaceC3132h, interfaceC3279c, i7, i8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m3280e(int i7, int i8, int i9, boolean z7) {
        if (i8 >= i9) {
            if (z7) {
                return 0;
            }
            return i9 - i8;
        }
        if (!z7) {
            if (z7 ? i9 - i8 > i7 : i8 <= i7) {
                if (z7) {
                    return i7 - i8;
                }
            } else {
                if (!z7) {
                    return 0;
                }
                return i9 - i8;
            }
        } else if (z7) {
            if (!z7) {
            }
        } else if (!z7) {
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:10:0x0059). Please report as a decompilation issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3281f(C2855g0 c2855g0, AbstractC2581a abstractC2581a) {
        C2928n0 c2928n0;
        int i7;
        Object obj;
        int size;
        int i8;
        if (abstractC2581a instanceof C2928n0) {
            C2928n0 c2928n02 = (C2928n0) abstractC2581a;
            int i9 = c2928n02.f15228j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2928n02.f15228j = i9 - Integer.MIN_VALUE;
                c2928n0 = c2928n02;
                Object obj2 = c2928n0.f15227i;
                i7 = c2928n0.f15228j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        C2855g0 c2855g02 = c2928n0.f15226h;
                        AbstractC1793a0.m2972L(obj2);
                        c2855g0 = c2855g02;
                        ?? r7 = ((C2859j) obj2).f14991a;
                        size = r7.size();
                        i8 = 0;
                        while (i8 < size) {
                            if (((C2868s) r7.get(i8)).f15009d) {
                                c2928n0.f15226h = c2855g0;
                                c2928n0.f15228j = 1;
                                obj2 = c2855g0.m4514a(EnumC2860k.f14997g, c2928n0);
                                obj = EnumC2465a.f13750e;
                                c2855g0 = c2855g0;
                                if (obj2 == obj) {
                                    return obj;
                                }
                                ?? r72 = ((C2859j) obj2).f14991a;
                                size = r72.size();
                                i8 = 0;
                                while (i8 < size) {
                                }
                            } else {
                                i8++;
                            }
                        }
                        return C1694m.f10482a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj2);
                ?? r73 = c2855g0.f14969j.f14986x.f14991a;
                int size2 = r73.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    if (((C2868s) r73.get(i10)).f15009d) {
                        c2928n0.f15226h = c2855g0;
                        c2928n0.f15228j = 1;
                        obj2 = c2855g0.m4514a(EnumC2860k.f14997g, c2928n0);
                        obj = EnumC2465a.f13750e;
                        c2855g0 = c2855g0;
                        if (obj2 == obj) {
                        }
                        ?? r722 = ((C2859j) obj2).f14991a;
                        size = r722.size();
                        i8 = 0;
                        while (i8 < size) {
                        }
                        return C1694m.f10482a;
                    }
                }
                return C1694m.f10482a;
            }
        }
        c2928n0 = new AbstractC2583c(abstractC2581a);
        Object obj22 = c2928n0.f15227i;
        i7 = c2928n0.f15228j;
        if (i7 == 0) {
        }
    }

    /* renamed from: g */
    public static final Object m3282g(InterfaceC2872w interfaceC2872w, InterfaceC3281e interfaceC3281e, InterfaceC2313c interfaceC2313c) {
        Object m4533K0 = ((C2857h0) interfaceC2872w).m4533K0(new C0059o1(interfaceC2313c.mo662j(), interfaceC3281e, null), interfaceC2313c);
        if (m4533K0 == EnumC2465a.f13750e) {
            return m4533K0;
        }
        return C1694m.f10482a;
    }

    /* renamed from: h */
    public static C0491x m3283h(InterfaceC3279c... interfaceC3279cArr) {
        if (interfaceC3279cArr.length > 0) {
            return new C0491x(1, interfaceC3279cArr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: i */
    public static int m3284i(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: j */
    public static final C2294e m3285j(Context context) {
        int i7;
        C0129l c0129l = new C0129l(15);
        context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 31) {
            i7 = C2301l.f13238a.m3679a(context);
        } else {
            i7 = 0;
        }
        return new C2294e(c0129l, new C2290a(i7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3286k(ViewOnAttachStateChangeListenerC3864c viewOnAttachStateChangeListenerC3864c, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C0483p c0483p;
        C0482o c0482o;
        InterfaceC3279c interfaceC3279c;
        int size = longSparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            long keyAt = longSparseArray.keyAt(i7);
            ViewTranslationResponse m600p = AbstractC0275c.m600p(longSparseArray.get(keyAt));
            if (m600p != null && value != null && text != null && (c0483p = (C0483p) viewOnAttachStateChangeListenerC3864c.m5876g().m3612b((int) keyAt)) != null && (c0482o = c0483p.f1698a) != null) {
                Object m3592g = c0482o.f1694d.f1683e.m3592g(AbstractC0476i.f1667k);
                if (m3592g == null) {
                    m3592g = null;
                }
                C0468a c0468a = (C0468a) m3592g;
                if (c0468a != null && (interfaceC3279c = (InterfaceC3279c) c0468a.f1639b) != null) {
                }
            }
        }
    }

    /* renamed from: l */
    public static final C3625h m3287l(C3417j0 c3417j0, int i7, long j6, C3635r c3635r, long j7, EnumC2931o0 enumC2931o0, InterfaceC3796d interfaceC3796d, C3801i c3801i, EnumC3103m enumC3103m, boolean z7, int i8) {
        return new C3625h(i7, i8, c3417j0.m5178a(i7, j6), j7, c3635r.mo5057c(i7), enumC2931o0, interfaceC3796d, c3801i, enumC3103m, z7);
    }

    /* renamed from: m */
    public static final String[] m3288m(InterfaceC3844m interfaceC3844m) {
        AbstractC3367j.m5098c(interfaceC3844m, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((C3836e) interfaceC3844m).f18053b.toArray(new String[0]);
    }

    /* renamed from: n */
    public static Set m3289n() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* renamed from: o */
    public static final Class m3290o(C3362e c3362e) {
        Class mo5092a = c3362e.mo5092a();
        AbstractC3367j.m5098c(mo5092a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return mo5092a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    /* renamed from: p */
    public static final Class m3291p(InterfaceC0111b interfaceC0111b) {
        AbstractC3367j.m5100e(interfaceC0111b, "<this>");
        Class mo5092a = ((InterfaceC3361d) interfaceC0111b).mo5092a();
        if (mo5092a.isPrimitive()) {
            String name = mo5092a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return mo5092a;
    }

    /* renamed from: q */
    public static final Bundle m3292q(String str, Bundle bundle) {
        AbstractC3367j.m5100e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(AbstractC0094y0.m185l("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    /* renamed from: r */
    public static InterfaceC3810r m3293r(InterfaceC3810r interfaceC3810r, C2769p1 c2769p1) {
        return AbstractC3793a.m5821a(interfaceC3810r, new C0151g(c2769p1, false));
    }

    /* renamed from: s */
    public static final long m3294s(float f7, long j6) {
        if (!Float.isNaN(f7) && f7 < 1.0f) {
            return C0677s.m1453b(C0677s.m1455d(j6) * f7, j6);
        }
        return j6;
    }

    /* renamed from: t */
    public static final void m3295t(C2350d2 c2350d2, InterfaceC2343c interfaceC2343c, int i7) {
        while (true) {
            int i8 = c2350d2.f13380v;
            if (i7 <= i8 || i7 >= c2350d2.f13379u) {
                if (i8 == 0 && i7 == 0) {
                    return;
                }
                c2350d2.m3756L();
                if (c2350d2.m3787x(c2350d2.f13380v)) {
                    interfaceC2343c.mo103q();
                }
                c2350d2.m3773j();
            } else {
                return;
            }
        }
    }

    /* renamed from: u */
    public static final String m3296u(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        AbstractC3367j.m5099d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    /* renamed from: v */
    public static final C2769p1 m3297v(C2395p c2395p) {
        int i7 = 0;
        Object[] objArr = new Object[0];
        C0068q2 c0068q2 = C2769p1.f14744i;
        boolean m3866e = c2395p.m3866e(0);
        Object m3847O = c2395p.m3847O();
        if (m3866e || m3847O == C2375k.f13421a) {
            m3847O = new C2774r0(i7, 2);
            c2395p.m3877j0(m3847O);
        }
        return (C2769p1) AbstractC3344k.m5081d(objArr, c0068q2, (InterfaceC3277a) m3847O, c2395p, 0, 4);
    }

    /* renamed from: w */
    public static final C3101k m3298w(C0465c c0465c) {
        return new C3101k(Math.round(c0465c.f1625a), Math.round(c0465c.f1626b), Math.round(c0465c.f1627c), Math.round(c0465c.f1628d));
    }

    /* renamed from: x */
    public static void m3299x(EditorInfo editorInfo, CharSequence charSequence) {
        int i7;
        int i8;
        CharSequence subSequence;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            AbstractC0495b.m1077g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i9 >= 30) {
            AbstractC0495b.m1077g(editorInfo, charSequence);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        if (i10 > i11) {
            i7 = i11;
        } else {
            i7 = i10;
        }
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = charSequence.length();
        if (i7 >= 0 && i10 <= length) {
            int i12 = editorInfo.inputType & 4095;
            if (i12 != 129 && i12 != 225 && i12 != 18) {
                if (length <= 2048) {
                    m3301z(editorInfo, charSequence, i7, i10);
                    return;
                }
                int i13 = i10 - i7;
                if (i13 > 1024) {
                    i8 = 0;
                } else {
                    i8 = i13;
                }
                int i14 = 2048 - i8;
                int min = Math.min(charSequence.length() - i10, i14 - Math.min(i7, (int) (i14 * 0.8d)));
                int min2 = Math.min(i7, i14 - min);
                int i15 = i7 - min2;
                if (Character.isLowSurrogate(charSequence.charAt(i15))) {
                    i15++;
                    min2--;
                }
                if (Character.isHighSurrogate(charSequence.charAt((i10 + min) - 1))) {
                    min--;
                }
                int i16 = min2 + i8;
                int i17 = i16 + min;
                if (i8 != i13) {
                    subSequence = TextUtils.concat(charSequence.subSequence(i15, i15 + min2), charSequence.subSequence(i10, min + i10));
                } else {
                    subSequence = charSequence.subSequence(i15, i17 + i15);
                }
                m3301z(editorInfo, subSequence, min2, i16);
                return;
            }
            m3301z(editorInfo, null, 0, 0);
            return;
        }
        m3301z(editorInfo, null, 0, 0);
    }

    /* renamed from: y */
    public static void m3300y(EditorInfo editorInfo, boolean z7) {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC2066a.m3272a(editorInfo, z7);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z7);
    }

    /* renamed from: z */
    public static void m3301z(EditorInfo editorInfo, CharSequence charSequence, int i7, int i8) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i7);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i8);
    }
}
