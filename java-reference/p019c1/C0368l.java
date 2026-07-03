package p019c1;

import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.p007ui.focus.FocusOwnerImpl$modifier$1;
import java.util.ArrayList;
import p001a0.C0037j;
import p019c1.C0368l;
import p027d1.C0465c;
import p028d2.AbstractC0476i;
import p028d2.C0477j;
import p035e1.AbstractC0659i0;
import p063i0.C1901g4;
import p077k.C2180a0;
import p077k.C2184c0;
import p101n0.C2705e;
import p102n1.AbstractC2710c;
import p102n1.InterfaceC2711d;
import p139s1.AbstractC3088a;
import p140s2.EnumC3103m;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.AbstractC3556y0;
import p162v1.C3490c1;
import p162v1.C3502g0;
import p170w1.AbstractC3681h0;
import p170w1.C3694k1;
import p170w1.C3728t;
import p177x0.AbstractC3809q;
import p183y0.C3833b;
import p183y0.C3834c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.l */
/* loaded from: classes.dex */
public final class C0368l implements InterfaceC0366j {

    /* renamed from: a */
    public final C3728t f1238a;

    /* renamed from: b */
    public final C3728t f1239b;

    /* renamed from: d */
    public final C0364h f1241d;

    /* renamed from: f */
    public C2180a0 f1243f;

    /* renamed from: h */
    public C0377u f1245h;

    /* renamed from: c */
    public final C0377u f1240c = new C0377u(null, 6);

    /* renamed from: e */
    public final FocusOwnerImpl$modifier$1 f1242e = new AbstractC3556y0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return false;
        }

        @Override // p162v1.AbstractC3556y0
        /* renamed from: h */
        public final AbstractC3809q mo312h() {
            return C0368l.this.f1240c;
        }

        public final int hashCode() {
            return C0368l.this.f1240c.hashCode();
        }

        @Override // p162v1.AbstractC3556y0
        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo313i(AbstractC3809q abstractC3809q) {
        }
    };

    /* renamed from: g */
    public final C2184c0 f1244g = new C2184c0(1);

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public C0368l(C3728t c3728t, C3728t c3728t2) {
        this.f1238a = c3728t;
        this.f1239b = c3728t2;
        this.f1241d = new C0364h(this, c3728t2);
    }

    /* renamed from: a */
    public final boolean m830a(boolean z7) {
        C3490c1 c3490c1;
        C0377u c0377u = this.f1245h;
        if (c0377u != null) {
            m836g(null);
            EnumC0376t enumC0376t = EnumC0376t.f1266e;
            EnumC0376t enumC0376t2 = EnumC0376t.f1269h;
            c0377u.m845K0(enumC0376t, enumC0376t2);
            if (!c0377u.f17992e.f18005r) {
                AbstractC3088a.m4750b("visitAncestors called on an unattached node");
            }
            AbstractC3809q abstractC3809q = c0377u.f17992e.f17996i;
            C3502g0 m5382v = AbstractC3498f.m5382v(c0377u);
            while (m5382v != null) {
                if ((m5382v.f16872I.f16802f.f17995h & 1024) != 0) {
                    while (abstractC3809q != null) {
                        if ((abstractC3809q.f17994g & 1024) != 0) {
                            C2705e c2705e = null;
                            AbstractC3809q abstractC3809q2 = abstractC3809q;
                            while (abstractC3809q2 != null) {
                                if (abstractC3809q2 instanceof C0377u) {
                                    ((C0377u) abstractC3809q2).m845K0(EnumC0376t.f1267f, enumC0376t2);
                                } else if ((abstractC3809q2.f17994g & 1024) != 0 && (abstractC3809q2 instanceof AbstractC3519m)) {
                                    int i7 = 0;
                                    for (AbstractC3809q abstractC3809q3 = ((AbstractC3519m) abstractC3809q2).f16962t; abstractC3809q3 != null; abstractC3809q3 = abstractC3809q3.f17997j) {
                                        if ((abstractC3809q3.f17994g & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                abstractC3809q2 = abstractC3809q3;
                                            } else {
                                                if (c2705e == null) {
                                                    c2705e = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3809q2 != null) {
                                                    c2705e.m4300b(abstractC3809q2);
                                                    abstractC3809q2 = null;
                                                }
                                                c2705e.m4300b(abstractC3809q3);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC3809q2 = AbstractC3498f.m5366f(c2705e);
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
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m831b(int i7, boolean z7, boolean z8) {
        boolean z9 = true;
        if (!z7) {
            int ordinal = AbstractC0362f.m821s(this.f1240c, i7).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    throw new RuntimeException();
                }
                z9 = false;
            } else {
                m830a(z7);
            }
        } else {
            m830a(z7);
        }
        if (z9 && z8) {
            m832c();
        }
        return z9;
    }

    /* renamed from: c */
    public final void m832c() {
        C3728t c3728t = this.f1238a;
        if (!c3728t.isFocused() && !c3728t.hasFocus()) {
            if (c3728t.hasFocus()) {
                View findFocus = c3728t.findFocus();
                if (findFocus != null) {
                    findFocus.clearFocus();
                }
                c3728t.clearFocus();
                return;
            }
            return;
        }
        c3728t.clearFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x0032, B:18:0x0038, B:19:0x003d, B:21:0x0045, B:23:0x004a, B:25:0x0050, B:29:0x0056, B:34:0x016a, B:36:0x0170, B:37:0x0173, B:39:0x017e, B:42:0x018a, B:46:0x0194, B:81:0x019a, B:82:0x019f, B:75:0x01d9, B:48:0x01a3, B:50:0x01a9, B:52:0x01ad, B:54:0x01b5, B:56:0x01bb, B:62:0x01c3, B:64:0x01cc, B:65:0x01d0, B:60:0x01d3, B:84:0x01de, B:87:0x01e1, B:89:0x01e7, B:96:0x01eb, B:101:0x01f2, B:103:0x01fa, B:111:0x0211, B:113:0x0216, B:147:0x021a, B:142:0x025c, B:115:0x0226, B:117:0x022c, B:119:0x0230, B:121:0x0238, B:123:0x023e, B:129:0x0246, B:131:0x024f, B:132:0x0253, B:127:0x0256, B:153:0x0261, B:157:0x0271, B:159:0x0276, B:193:0x027a, B:188:0x02bc, B:161:0x0286, B:163:0x028c, B:165:0x0290, B:167:0x0298, B:169:0x029e, B:175:0x02a6, B:177:0x02af, B:178:0x02b3, B:173:0x02b6, B:200:0x02c3, B:202:0x02ca, B:215:0x005e, B:217:0x0064, B:218:0x0067, B:220:0x006f, B:223:0x007b, B:227:0x0085, B:262:0x00d8, B:264:0x00dc, B:229:0x008a, B:231:0x0090, B:233:0x0094, B:235:0x009c, B:237:0x00a2, B:243:0x00aa, B:245:0x00b3, B:246:0x00b7, B:241:0x00ba, B:252:0x00c0, B:266:0x00c5, B:269:0x00c8, B:271:0x00ce, B:278:0x00d2, B:283:0x00e2, B:285:0x00e8, B:286:0x00eb, B:288:0x00f5, B:291:0x0101, B:295:0x010b, B:330:0x015e, B:332:0x0162, B:297:0x0110, B:299:0x0116, B:301:0x011a, B:303:0x0122, B:305:0x0128, B:311:0x0130, B:313:0x0139, B:314:0x013d, B:309:0x0140, B:320:0x0146, B:335:0x014b, B:338:0x014e, B:340:0x0154, B:347:0x0158), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r15v5, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r15v9, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v35, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m833d(KeyEvent keyEvent, InterfaceC3277a interfaceC3277a) {
        Object obj;
        AbstractC3809q abstractC3809q;
        C3490c1 c3490c1;
        Object obj2;
        C3490c1 c3490c12;
        int size;
        C3490c1 c3490c13;
        C0377u c0377u = this.f1240c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f1241d.f1234e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!m837h(keyEvent)) {
                return false;
            }
            C0377u m809g = AbstractC0362f.m809g(c0377u);
            if (m809g != null) {
                if (!m809g.f17992e.f18005r) {
                    AbstractC3088a.m4750b("visitLocalDescendants called on an unattached node");
                }
                AbstractC3809q abstractC3809q2 = m809g.f17992e;
                if ((abstractC3809q2.f17995h & 9216) != 0) {
                    abstractC3809q = null;
                    for (AbstractC3809q abstractC3809q3 = abstractC3809q2.f17997j; abstractC3809q3 != null; abstractC3809q3 = abstractC3809q3.f17997j) {
                        int i7 = abstractC3809q3.f17994g;
                        if ((i7 & 9216) != 0) {
                            if ((i7 & 1024) != 0) {
                                break;
                            }
                            abstractC3809q = abstractC3809q3;
                        }
                    }
                } else {
                    abstractC3809q = null;
                }
            }
            if (m809g != null) {
                if (!m809g.f17992e.f18005r) {
                    AbstractC3088a.m4750b("visitAncestors called on an unattached node");
                }
                AbstractC3809q abstractC3809q4 = m809g.f17992e;
                C3502g0 m5382v = AbstractC3498f.m5382v(m809g);
                loop11: while (true) {
                    if (m5382v != null) {
                        if ((m5382v.f16872I.f16802f.f17995h & 8192) != 0) {
                            while (abstractC3809q4 != null) {
                                if ((abstractC3809q4.f17994g & 8192) != 0) {
                                    C2705e c2705e = null;
                                    AbstractC3809q abstractC3809q5 = abstractC3809q4;
                                    while (abstractC3809q5 != null) {
                                        if (abstractC3809q5 instanceof InterfaceC2711d) {
                                            obj2 = abstractC3809q5;
                                            break loop11;
                                        }
                                        if ((abstractC3809q5.f17994g & 8192) != 0 && (abstractC3809q5 instanceof AbstractC3519m)) {
                                            AbstractC3809q abstractC3809q6 = ((AbstractC3519m) abstractC3809q5).f16962t;
                                            int i8 = 0;
                                            abstractC3809q5 = abstractC3809q5;
                                            c2705e = c2705e;
                                            while (abstractC3809q6 != null) {
                                                if ((abstractC3809q6.f17994g & 8192) != 0) {
                                                    i8++;
                                                    c2705e = c2705e;
                                                    if (i8 == 1) {
                                                        abstractC3809q5 = abstractC3809q6;
                                                    } else {
                                                        if (c2705e == null) {
                                                            c2705e = new C2705e(new AbstractC3809q[16]);
                                                        }
                                                        if (abstractC3809q5 != null) {
                                                            c2705e.m4300b(abstractC3809q5);
                                                            abstractC3809q5 = null;
                                                        }
                                                        c2705e.m4300b(abstractC3809q6);
                                                    }
                                                }
                                                abstractC3809q6 = abstractC3809q6.f17997j;
                                                abstractC3809q5 = abstractC3809q5;
                                                c2705e = c2705e;
                                            }
                                            if (i8 == 1) {
                                            }
                                        }
                                        abstractC3809q5 = AbstractC3498f.m5366f(c2705e);
                                    }
                                }
                                abstractC3809q4 = abstractC3809q4.f17996i;
                            }
                        }
                        m5382v = m5382v.m5447u();
                        if (m5382v != null && (c3490c12 = m5382v.f16872I) != null) {
                            abstractC3809q4 = c3490c12.f16801e;
                        } else {
                            abstractC3809q4 = null;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Object obj3 = (InterfaceC2711d) obj2;
                if (obj3 != null) {
                    abstractC3809q = ((AbstractC3809q) obj3).f17992e;
                    if (abstractC3809q != null) {
                        if (!abstractC3809q.f17992e.f18005r) {
                            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
                        }
                        AbstractC3809q abstractC3809q7 = abstractC3809q.f17992e.f17996i;
                        C3502g0 m5382v2 = AbstractC3498f.m5382v(abstractC3809q);
                        ArrayList arrayList = null;
                        while (m5382v2 != null) {
                            if ((m5382v2.f16872I.f16802f.f17995h & 8192) != 0) {
                                while (abstractC3809q7 != null) {
                                    if ((abstractC3809q7.f17994g & 8192) != 0) {
                                        AbstractC3809q abstractC3809q8 = abstractC3809q7;
                                        C2705e c2705e2 = null;
                                        while (abstractC3809q8 != null) {
                                            if (abstractC3809q8 instanceof InterfaceC2711d) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(abstractC3809q8);
                                            } else if ((abstractC3809q8.f17994g & 8192) != 0 && (abstractC3809q8 instanceof AbstractC3519m)) {
                                                int i9 = 0;
                                                for (AbstractC3809q abstractC3809q9 = ((AbstractC3519m) abstractC3809q8).f16962t; abstractC3809q9 != null; abstractC3809q9 = abstractC3809q9.f17997j) {
                                                    if ((abstractC3809q9.f17994g & 8192) != 0) {
                                                        i9++;
                                                        if (i9 == 1) {
                                                            abstractC3809q8 = abstractC3809q9;
                                                        } else {
                                                            if (c2705e2 == null) {
                                                                c2705e2 = new C2705e(new AbstractC3809q[16]);
                                                            }
                                                            if (abstractC3809q8 != null) {
                                                                c2705e2.m4300b(abstractC3809q8);
                                                                abstractC3809q8 = null;
                                                            }
                                                            c2705e2.m4300b(abstractC3809q9);
                                                        }
                                                    }
                                                }
                                                if (i9 == 1) {
                                                }
                                            }
                                            abstractC3809q8 = AbstractC3498f.m5366f(c2705e2);
                                        }
                                    }
                                    abstractC3809q7 = abstractC3809q7.f17996i;
                                }
                            }
                            m5382v2 = m5382v2.m5447u();
                            if (m5382v2 != null && (c3490c13 = m5382v2.f16872I) != null) {
                                abstractC3809q7 = c3490c13.f16801e;
                            } else {
                                abstractC3809q7 = null;
                            }
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i10 = size - 1;
                                if (((InterfaceC2711d) arrayList.get(size)).mo4354j(keyEvent)) {
                                    return true;
                                }
                                if (i10 < 0) {
                                    break;
                                }
                                size = i10;
                            }
                        }
                        AbstractC3519m abstractC3519m = abstractC3809q.f17992e;
                        ?? r12 = 0;
                        while (abstractC3519m != 0) {
                            if (abstractC3519m instanceof InterfaceC2711d) {
                                if (((InterfaceC2711d) abstractC3519m).mo4354j(keyEvent)) {
                                    return true;
                                }
                            } else if ((abstractC3519m.f17994g & 8192) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                AbstractC3809q abstractC3809q10 = abstractC3519m.f16962t;
                                int i11 = 0;
                                abstractC3519m = abstractC3519m;
                                r12 = r12;
                                while (abstractC3809q10 != null) {
                                    if ((abstractC3809q10.f17994g & 8192) != 0) {
                                        i11++;
                                        r12 = r12;
                                        if (i11 == 1) {
                                            abstractC3519m = abstractC3809q10;
                                        } else {
                                            if (r12 == 0) {
                                                r12 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3519m != 0) {
                                                r12.m4300b(abstractC3519m);
                                                abstractC3519m = 0;
                                            }
                                            r12.m4300b(abstractC3809q10);
                                        }
                                    }
                                    abstractC3809q10 = abstractC3809q10.f17997j;
                                    abstractC3519m = abstractC3519m;
                                    r12 = r12;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC3519m = AbstractC3498f.m5366f(r12);
                        }
                        if (((Boolean) interfaceC3277a.mo52a()).booleanValue()) {
                            return true;
                        }
                        AbstractC3519m abstractC3519m2 = abstractC3809q.f17992e;
                        ?? r02 = 0;
                        while (abstractC3519m2 != 0) {
                            if (abstractC3519m2 instanceof InterfaceC2711d) {
                                if (((InterfaceC2711d) abstractC3519m2).mo4353V(keyEvent)) {
                                    return true;
                                }
                            } else if ((abstractC3519m2.f17994g & 8192) != 0 && (abstractC3519m2 instanceof AbstractC3519m)) {
                                AbstractC3809q abstractC3809q11 = abstractC3519m2.f16962t;
                                int i12 = 0;
                                r02 = r02;
                                abstractC3519m2 = abstractC3519m2;
                                while (abstractC3809q11 != null) {
                                    if ((abstractC3809q11.f17994g & 8192) != 0) {
                                        i12++;
                                        r02 = r02;
                                        if (i12 == 1) {
                                            abstractC3519m2 = abstractC3809q11;
                                        } else {
                                            if (r02 == 0) {
                                                r02 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3519m2 != 0) {
                                                r02.m4300b(abstractC3519m2);
                                                abstractC3519m2 = 0;
                                            }
                                            r02.m4300b(abstractC3809q11);
                                        }
                                    }
                                    abstractC3809q11 = abstractC3809q11.f17997j;
                                    r02 = r02;
                                    abstractC3519m2 = abstractC3519m2;
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC3519m2 = AbstractC3498f.m5366f(r02);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                if (((InterfaceC2711d) arrayList.get(i13)).mo4353V(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!c0377u.f17992e.f18005r) {
                AbstractC3088a.m4750b("visitAncestors called on an unattached node");
            }
            AbstractC3809q abstractC3809q12 = c0377u.f17992e.f17996i;
            C3502g0 m5382v3 = AbstractC3498f.m5382v(c0377u);
            loop15: while (true) {
                if (m5382v3 != null) {
                    if ((m5382v3.f16872I.f16802f.f17995h & 8192) != 0) {
                        while (abstractC3809q12 != null) {
                            if ((abstractC3809q12.f17994g & 8192) != 0) {
                                AbstractC3809q abstractC3809q13 = abstractC3809q12;
                                C2705e c2705e3 = null;
                                while (abstractC3809q13 != null) {
                                    if (abstractC3809q13 instanceof InterfaceC2711d) {
                                        obj = abstractC3809q13;
                                        break loop15;
                                    }
                                    if ((abstractC3809q13.f17994g & 8192) != 0 && (abstractC3809q13 instanceof AbstractC3519m)) {
                                        AbstractC3809q abstractC3809q14 = ((AbstractC3519m) abstractC3809q13).f16962t;
                                        int i14 = 0;
                                        abstractC3809q13 = abstractC3809q13;
                                        c2705e3 = c2705e3;
                                        while (abstractC3809q14 != null) {
                                            if ((abstractC3809q14.f17994g & 8192) != 0) {
                                                i14++;
                                                c2705e3 = c2705e3;
                                                if (i14 == 1) {
                                                    abstractC3809q13 = abstractC3809q14;
                                                } else {
                                                    if (c2705e3 == null) {
                                                        c2705e3 = new C2705e(new AbstractC3809q[16]);
                                                    }
                                                    if (abstractC3809q13 != null) {
                                                        c2705e3.m4300b(abstractC3809q13);
                                                        abstractC3809q13 = null;
                                                    }
                                                    c2705e3.m4300b(abstractC3809q14);
                                                }
                                            }
                                            abstractC3809q14 = abstractC3809q14.f17997j;
                                            abstractC3809q13 = abstractC3809q13;
                                            c2705e3 = c2705e3;
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    abstractC3809q13 = AbstractC3498f.m5366f(c2705e3);
                                }
                            }
                            abstractC3809q12 = abstractC3809q12.f17996i;
                        }
                    }
                    m5382v3 = m5382v3.m5447u();
                    if (m5382v3 != null && (c3490c1 = m5382v3.f16872I) != null) {
                        abstractC3809q12 = c3490c1.f16801e;
                    } else {
                        abstractC3809q12 = null;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Object obj4 = (InterfaceC2711d) obj;
            if (obj4 != null) {
                abstractC3809q = ((AbstractC3809q) obj4).f17992e;
            } else {
                abstractC3809q = null;
            }
            if (abstractC3809q != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13, types: [v1.y1] */
    /* JADX WARN: Type inference failed for: r3v8, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r5v11, types: [c1.u] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11, types: [t5.c, u5.k] */
    /* JADX WARN: Type inference failed for: r6v17, types: [t5.c, u5.k] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [n0.e] */
    /* renamed from: e */
    public final Boolean m834e(int i7, C0465c c0465c, InterfaceC3279c interfaceC3279c) {
        Boolean bool;
        boolean m803a;
        Boolean bool2;
        C3490c1 c3490c1;
        C0377u c0377u = this.f1240c;
        C0377u m809g = AbstractC0362f.m809g(c0377u);
        int i8 = 4;
        C3728t c3728t = this.f1239b;
        if (m809g != null) {
            EnumC3103m layoutDirection = c3728t.getLayoutDirection();
            bool = null;
            C0371o m846L0 = m809g.m846L0();
            C0373q c0373q = m846L0.f1257h;
            C0373q c0373q2 = m846L0.f1258i;
            if (i7 == 1) {
                c0373q = m846L0.f1251b;
            } else if (i7 == 2) {
                c0373q = m846L0.f1252c;
            } else if (i7 == 5) {
                c0373q = m846L0.f1253d;
            } else if (i7 == 6) {
                c0373q = m846L0.f1254e;
            } else if (i7 == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        c0373q = c0373q2;
                    } else {
                        throw new RuntimeException();
                    }
                }
                if (c0373q == C0373q.f1261b) {
                    c0373q = null;
                }
                if (c0373q == null) {
                    c0373q = m846L0.f1255f;
                }
            } else if (i7 == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        throw new RuntimeException();
                    }
                } else {
                    c0373q = c0373q2;
                }
                if (c0373q == C0373q.f1261b) {
                    c0373q = null;
                }
                if (c0373q == null) {
                    c0373q = m846L0.f1256g;
                }
            } else if (i7 == 7 || i7 == 8) {
                C0357a c0357a = new C0357a(i7);
                C0368l c0368l = (C0368l) ((C3728t) AbstractC3498f.m5383w(m809g)).getFocusOwner();
                C0377u c0377u2 = c0368l.f1245h;
                if (i7 == 7) {
                    m846L0.f1259j.mo23f(c0357a);
                } else {
                    m846L0.f1260k.mo23f(c0357a);
                }
                if (c0357a.f1220b) {
                    c0373q = C0373q.f1262c;
                } else if (c0377u2 != c0368l.f1245h) {
                    c0373q = C0373q.f1263d;
                } else {
                    c0373q = C0373q.f1261b;
                }
            } else {
                throw new IllegalStateException("invalid FocusDirection");
            }
            if (!AbstractC3367j.m5096a(c0373q, C0373q.f1262c)) {
                if (AbstractC3367j.m5096a(c0373q, C0373q.f1263d)) {
                    C0377u m809g2 = AbstractC0362f.m809g(c0377u);
                    if (m809g2 != null) {
                        return (Boolean) interfaceC3279c.mo23f(m809g2);
                    }
                } else if (!AbstractC3367j.m5096a(c0373q, C0373q.f1261b)) {
                    return Boolean.valueOf(c0373q.m843a(interfaceC3279c));
                }
            }
            return bool;
        }
        bool = null;
        m809g = null;
        EnumC3103m layoutDirection2 = c3728t.getLayoutDirection();
        C0037j c0037j = new C0037j(m809g, this, interfaceC3279c);
        if (i7 == 1 || i7 == 2) {
            if (i7 == 1) {
                m803a = AbstractC0362f.m813k(c0377u, c0037j);
            } else if (i7 == 2) {
                m803a = AbstractC0362f.m803a(c0377u, c0037j);
            } else {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            return Boolean.valueOf(m803a);
        }
        if (i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6) {
            return AbstractC0362f.m802E(i7, c0037j, c0377u, c0465c);
        }
        if (i7 == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 == 1) {
                    i8 = 3;
                } else {
                    throw new RuntimeException();
                }
            }
            C0377u m809g3 = AbstractC0362f.m809g(c0377u);
            if (m809g3 != null) {
                return AbstractC0362f.m802E(i8, c0037j, m809g3, c0465c);
            }
            return bool;
        }
        if (i7 == 8) {
            C0377u m809g4 = AbstractC0362f.m809g(c0377u);
            boolean z7 = false;
            if (m809g4 != null) {
                if (!m809g4.f17992e.f18005r) {
                    AbstractC3088a.m4750b("visitAncestors called on an unattached node");
                }
                ?? r32 = m809g4.f17992e.f17996i;
                C3502g0 m5382v = AbstractC3498f.m5382v(m809g4);
                loop0: while (m5382v != null) {
                    if ((m5382v.f16872I.f16802f.f17995h & 1024) != 0) {
                        for (AbstractC3809q abstractC3809q = r32; abstractC3809q != null; abstractC3809q = abstractC3809q.f17996i) {
                            if ((abstractC3809q.f17994g & 1024) != 0) {
                                AbstractC3519m abstractC3519m = abstractC3809q;
                                ?? r62 = bool;
                                while (abstractC3519m != 0) {
                                    if (abstractC3519m instanceof C0377u) {
                                        ?? r52 = (C0377u) abstractC3519m;
                                        if (r52.m846L0().f1250a) {
                                            bool2 = r52;
                                            break loop0;
                                        }
                                    } else if ((abstractC3519m.f17994g & 1024) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                        AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t;
                                        int i9 = 0;
                                        abstractC3519m = abstractC3519m;
                                        r62 = r62;
                                        while (abstractC3809q2 != null) {
                                            if ((abstractC3809q2.f17994g & 1024) != 0) {
                                                i9++;
                                                r62 = r62;
                                                if (i9 == 1) {
                                                    abstractC3519m = abstractC3809q2;
                                                } else {
                                                    if (r62 == 0) {
                                                        r62 = new C2705e(new AbstractC3809q[16]);
                                                    }
                                                    if (abstractC3519m != 0) {
                                                        r62.m4300b(abstractC3519m);
                                                        abstractC3519m = bool;
                                                    }
                                                    r62.m4300b(abstractC3809q2);
                                                }
                                            }
                                            abstractC3809q2 = abstractC3809q2.f17997j;
                                            abstractC3519m = abstractC3519m;
                                            r62 = r62;
                                        }
                                        if (i9 == 1) {
                                        }
                                    }
                                    abstractC3519m = AbstractC3498f.m5366f(r62);
                                }
                            }
                        }
                    }
                    m5382v = m5382v.m5447u();
                    if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                        r32 = c3490c1.f16801e;
                    } else {
                        r32 = bool;
                    }
                }
            }
            bool2 = bool;
            if (bool2 != null && !bool2.equals(c0377u)) {
                z7 = ((Boolean) c0037j.mo23f(bool2)).booleanValue();
            }
            return Boolean.valueOf(z7);
        }
        throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C0360d.m797a(i7))).toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u5.v] */
    /* renamed from: f */
    public final boolean m835f(int i7) {
        boolean z7;
        boolean z8;
        Rect rect;
        ?? obj = new Object();
        obj.f16451e = Boolean.FALSE;
        C0377u c0377u = this.f1245h;
        C3728t c3728t = this.f1238a;
        Boolean m834e = m834e(i7, c3728t.getEmbeddedViewFocusRect(), new C1901g4(i7, 2, obj));
        if (!AbstractC3367j.m5096a(m834e, Boolean.TRUE) || c0377u == this.f1245h) {
            if (m834e != null && obj.f16451e != null) {
                if (!m834e.booleanValue() || !((Boolean) obj.f16451e).booleanValue()) {
                    View view = null;
                    if (i7 == 1 || i7 == 2) {
                        if (m831b(i7, false, false)) {
                            Boolean m834e2 = m834e(i7, null, new C0367k(i7, 0));
                            if (m834e2 != null) {
                                z7 = m834e2.booleanValue();
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                            }
                        }
                    } else {
                        if (i7 != 7 && i7 != 8) {
                            Integer m800C = AbstractC0362f.m800C(i7);
                            if (m800C != null) {
                                int intValue = m800C.intValue();
                                C0465c embeddedViewFocusRect = c3728t.getEmbeddedViewFocusRect();
                                if (embeddedViewFocusRect != null) {
                                    rect = AbstractC0659i0.m1423w(embeddedViewFocusRect);
                                } else {
                                    rect = null;
                                }
                                Object obj2 = C3694k1.f17581f.get();
                                AbstractC3367j.m5097b(obj2);
                                C3694k1 c3694k1 = (C3694k1) obj2;
                                if (rect == null) {
                                    view = c3694k1.m5705b(c3728t, c3728t.findFocus(), intValue);
                                } else {
                                    c3694k1.f17582a.set(rect);
                                    Rect rect2 = c3694k1.f17582a;
                                    ArrayList<View> arrayList = c3694k1.f17586e;
                                    try {
                                        arrayList.clear();
                                        if (Build.VERSION.SDK_INT < 26) {
                                            AbstractC3681h0.m5684k(c3728t, arrayList, c3728t.isInTouchMode());
                                        } else {
                                            c3728t.addFocusables(arrayList, intValue, c3728t.isInTouchMode() ? 1 : 0);
                                        }
                                        if (!arrayList.isEmpty()) {
                                            view = c3694k1.m5704a(intValue, rect2, null, c3728t, arrayList);
                                        }
                                        arrayList.clear();
                                    } catch (Throwable th) {
                                        arrayList.clear();
                                        throw th;
                                    }
                                }
                                if (view != null) {
                                    z8 = AbstractC0362f.m827y(view, Integer.valueOf(intValue), rect);
                                    if (!z8) {
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Invalid focus direction");
                            }
                        }
                        z8 = false;
                        if (!z8) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m836g(C0377u c0377u) {
        C3502g0 m5382v;
        C0477j m5449w;
        C3502g0 m5382v2;
        C0477j m5449w2;
        C0377u c0377u2 = this.f1245h;
        this.f1245h = c0377u;
        C2184c0 c2184c0 = this.f1244g;
        Object[] objArr = c2184c0.f12628a;
        int i7 = c2184c0.f12629b;
        for (int i8 = 0; i8 < i7; i8++) {
            C3834c c3834c = (C3834c) objArr[i8];
            c3834c.getClass();
            if (c0377u2 != null && (m5382v2 = AbstractC3498f.m5382v(c0377u2)) != null && (m5449w2 = m5382v2.m5449w()) != null && m5449w2.f1683e.m3587b(AbstractC0476i.f1663g)) {
                ((AutofillManager) c3834c.f18045a.f14390f).notifyViewExited(c3834c.f18047c, m5382v2.f16885f);
            }
            if (c0377u != null && (m5382v = AbstractC3498f.m5382v(c0377u)) != null && (m5449w = m5382v.m5449w()) != null && m5449w.f1683e.m3587b(AbstractC0476i.f1663g)) {
                int i9 = m5382v.f16885f;
                c3834c.f18048d.f2217a.m1103g(i9, new C3833b(c3834c, i9));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0349, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x034b, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        r3 = r4.m3546b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r4.f12615e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (((r4.f12611a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        r3 = r4.f12613c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        if (java.lang.Long.compare((r4.f12614d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e3, code lost:
    
        r3 = r4.f12611a;
        r8 = r4.f12613c;
        r9 = r4.f12612b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f1, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0111, code lost:
    
        r32 = r6;
        r22 = r15;
        r5 = p060h5.AbstractC1804l.m3027T(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0132, code lost:
    
        if (r5 == r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0134, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0141, code lost:
    
        if (r13 != r22) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0148, code lost:
    
        if (r13 == 254) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014b, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.m3546b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016a, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016c, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & 127) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018a, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018d, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019e, code lost:
    
        if (((r34 >> r6) & 255) != r22) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a0, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & 127) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r22 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01df, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c4, code lost:
    
        r3[r5] = ((r13 & 127) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0143, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ed, code lost:
    
        r33 = r7;
        r4.f12615e = p077k.AbstractC2210p0.m3618a(r4.f12613c) - r4.f12614d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027d, code lost:
    
        r3 = r4.m3546b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0281, code lost:
    
        r32 = r3;
        r4.f12614d++;
        r3 = r4.f12615e;
        r5 = r4.f12611a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029b, code lost:
    
        if (((r7 >> r9) & 255) != r22) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x029d, code lost:
    
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x029f, code lost:
    
        r4.f12615e = r3 - r21;
        r3 = r4.f12613c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fe, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0200, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0208, code lost:
    
        r3 = p077k.AbstractC2210p0.m3619b(r4.f12613c);
        r5 = r4.f12611a;
        r6 = r4.f12612b;
        r7 = r4.f12613c;
        r4.m3547c(r3);
        r3 = r4.f12611a;
        r8 = r4.f12612b;
        r9 = r4.f12613c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021f, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022e, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0230, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.m3546b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r19 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0274, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026e, code lost:
    
        r16 = r3;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0205, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c0, code lost:
    
        r33 = true;
        r22 = 128;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m837h(KeyEvent keyEvent) {
        int i7;
        long j6;
        boolean z7;
        int i8;
        long m4345s = AbstractC2710c.m4345s(keyEvent);
        int m4320C = AbstractC2710c.m4320C(keyEvent);
        int i9 = -862048943;
        long j7 = 0;
        int i10 = 8;
        int i11 = 0;
        boolean z8 = true;
        if (m4320C == 2) {
            C2180a0 c2180a0 = this.f1243f;
            if (c2180a0 == null) {
                c2180a0 = new C2180a0(3);
                this.f1243f = c2180a0;
            }
            C2180a0 c2180a02 = c2180a0;
            int hashCode = Long.hashCode(m4345s) * (-862048943);
            int i12 = hashCode ^ (hashCode << 16);
            int i13 = i12 >>> 7;
            int i14 = i12 & 127;
            int i15 = c2180a02.f12613c;
            int i16 = i13 & i15;
            int i17 = 0;
            loop0: while (true) {
                long[] jArr = c2180a02.f12611a;
                int i18 = i16 >> 3;
                int i19 = i9;
                int i20 = (i16 & 7) << 3;
                long j8 = (jArr[i18] >>> i20) | ((jArr[i18 + 1] << (64 - i20)) & ((-i20) >> 63));
                long j9 = i14;
                long j10 = j8 ^ (j9 * 72340172838076673L);
                long j11 = (j10 - 72340172838076673L) & (~j10) & (-9187201950435737472L);
                while (true) {
                    if (j11 == j7) {
                        break;
                    }
                    i8 = (i16 + (Long.numberOfTrailingZeros(j11) >> 3)) & i15;
                    long j12 = j7;
                    if (c2180a02.f12612b[i8] == m4345s) {
                        z7 = true;
                        break loop0;
                    }
                    j11 &= j11 - 1;
                    j7 = j12;
                }
                i17 += 8;
                i16 = (i16 + i17) & i15;
                i10 = i10;
                i9 = i19;
                j7 = j6;
            }
            c2180a02.f12612b[i8] = m4345s;
            return z7;
        }
        if (m4320C != 1) {
            return true;
        }
        C2180a0 c2180a03 = this.f1243f;
        if (c2180a03 == null || !c2180a03.m3545a(m4345s)) {
            return false;
        }
        C2180a0 c2180a04 = this.f1243f;
        if (c2180a04 != null) {
            int hashCode2 = Long.hashCode(m4345s) * (-862048943);
            int i21 = hashCode2 ^ (hashCode2 << 16);
            int i22 = i21 & 127;
            int i23 = c2180a04.f12613c;
            int i24 = i21 >>> 7;
            loop5: while (true) {
                int i25 = i24 & i23;
                long[] jArr2 = c2180a04.f12611a;
                int i26 = i25 >> 3;
                int i27 = (i25 & 7) << 3;
                long j13 = ((jArr2[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr2[i26] >>> i27);
                long j14 = (i22 * 72340172838076673L) ^ j13;
                long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j15 == 0) {
                        break;
                    }
                    i7 = ((Long.numberOfTrailingZeros(j15) >> 3) + i25) & i23;
                    if (c2180a04.f12612b[i7] == m4345s) {
                        break loop5;
                    }
                    j15 &= j15 - 1;
                }
                i11 += 8;
                i24 = i25 + i11;
            }
            if (i7 >= 0) {
                c2180a04.f12614d--;
                long[] jArr3 = c2180a04.f12611a;
                int i28 = c2180a04.f12613c;
                int i29 = i7 >> 3;
                int i30 = (i7 & 7) << 3;
                long j16 = (jArr3[i29] & (~(255 << i30))) | (254 << i30);
                jArr3[i29] = j16;
                jArr3[(((i7 - 7) & i28) + (i28 & 7)) >> 3] = j16;
                return true;
            }
        }
        return true;
    }
}
