package p019c1;

import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.q */
/* loaded from: classes.dex */
public final class C0373q {

    /* renamed from: b */
    public static final C0373q f1261b = new C0373q();

    /* renamed from: c */
    public static final C0373q f1262c = new C0373q();

    /* renamed from: d */
    public static final C0373q f1263d = new C0373q();

    /* renamed from: a */
    public final C2705e f1264a = new C2705e(new InterfaceC0374r[16]);

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0046, code lost:
    
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m843a(InterfaceC3279c interfaceC3279c) {
        boolean m811i;
        boolean z7;
        boolean z8;
        if (this != f1261b) {
            if (this != f1262c) {
                C2705e c2705e = this.f1264a;
                int i7 = c2705e.f14519g;
                if (i7 == 0) {
                    System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                    return false;
                }
                Object[] objArr = c2705e.f14517e;
                boolean z9 = false;
                for (int i8 = 0; i8 < i7; i8++) {
                    AbstractC3809q abstractC3809q = (AbstractC3809q) ((InterfaceC0374r) objArr[i8]);
                    if (!abstractC3809q.f17992e.f18005r) {
                        AbstractC3088a.m4750b("visitChildren called on an unattached node");
                    }
                    C2705e c2705e2 = new C2705e(new AbstractC3809q[16]);
                    AbstractC3809q abstractC3809q2 = abstractC3809q.f17992e;
                    AbstractC3809q abstractC3809q3 = abstractC3809q2.f17997j;
                    if (abstractC3809q3 == null) {
                        AbstractC3498f.m5362b(c2705e2, abstractC3809q2);
                    } else {
                        c2705e2.m4300b(abstractC3809q3);
                    }
                    while (true) {
                        int i9 = c2705e2.f14519g;
                        if (i9 != 0) {
                            AbstractC3809q abstractC3809q4 = (AbstractC3809q) c2705e2.m4309k(i9 - 1);
                            if ((abstractC3809q4.f17995h & 1024) == 0) {
                                AbstractC3498f.m5362b(c2705e2, abstractC3809q4);
                            } else {
                                while (true) {
                                    if (abstractC3809q4 == null) {
                                        break;
                                    }
                                    if ((abstractC3809q4.f17994g & 1024) != 0) {
                                        C2705e c2705e3 = null;
                                        while (abstractC3809q4 != null) {
                                            if (abstractC3809q4 instanceof C0377u) {
                                                C0377u c0377u = (C0377u) abstractC3809q4;
                                                if (c0377u.m846L0().f1250a) {
                                                    m811i = ((Boolean) interfaceC3279c.mo23f(c0377u)).booleanValue();
                                                } else {
                                                    m811i = AbstractC0362f.m811i(c0377u, 7, interfaceC3279c);
                                                }
                                                if (m811i) {
                                                    z9 = true;
                                                    break;
                                                }
                                            } else {
                                                if ((abstractC3809q4.f17994g & 1024) != 0) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                if (z7 && (abstractC3809q4 instanceof AbstractC3519m)) {
                                                    int i10 = 0;
                                                    for (AbstractC3809q abstractC3809q5 = ((AbstractC3519m) abstractC3809q4).f16962t; abstractC3809q5 != null; abstractC3809q5 = abstractC3809q5.f17997j) {
                                                        if ((abstractC3809q5.f17994g & 1024) != 0) {
                                                            z8 = true;
                                                        } else {
                                                            z8 = false;
                                                        }
                                                        if (z8) {
                                                            i10++;
                                                            if (i10 == 1) {
                                                                abstractC3809q4 = abstractC3809q5;
                                                            } else {
                                                                if (c2705e3 == null) {
                                                                    c2705e3 = new C2705e(new AbstractC3809q[16]);
                                                                }
                                                                if (abstractC3809q4 != null) {
                                                                    c2705e3.m4300b(abstractC3809q4);
                                                                    abstractC3809q4 = null;
                                                                }
                                                                c2705e3.m4300b(abstractC3809q5);
                                                            }
                                                        }
                                                    }
                                                    if (i10 == 1) {
                                                    }
                                                }
                                            }
                                            abstractC3809q4 = AbstractC3498f.m5366f(c2705e3);
                                        }
                                    } else {
                                        abstractC3809q4 = abstractC3809q4.f17997j;
                                    }
                                }
                            }
                        }
                    }
                }
                return z9;
            }
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
    }
}
