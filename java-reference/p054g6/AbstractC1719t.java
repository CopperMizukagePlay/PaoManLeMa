package p054g6;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import p001a0.C0019e1;
import p001a0.C0068q2;
import p018c0.C0334d;
import p032d6.AbstractC0515a;
import p032d6.AbstractC0525d0;
import p032d6.C0544j1;
import p032d6.EnumC0519b0;
import p034e0.C0600d0;
import p039e5.C1279sl;
import p047f6.C1547b;
import p047f6.C1551f;
import p047f6.C1560o;
import p047f6.EnumC1546a;
import p047f6.InterfaceC1552g;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p061h6.AbstractC1821c;
import p061h6.C1819a;
import p061h6.C1828j;
import p061h6.C1833o;
import p069i6.C2090c;
import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g6.t */
/* loaded from: classes.dex */
public abstract class AbstractC1719t {

    /* renamed from: a */
    public static final C1279sl f10555a = new C1279sl("NO_VALUE", 1);

    /* renamed from: b */
    public static final C1279sl f10556b = new C1279sl("NONE", 1);

    /* renamed from: c */
    public static final C1279sl f10557c = new C1279sl("PENDING", 1);

    /* renamed from: a */
    public static C1718s m2770a(int i7, EnumC1546a enumC1546a) {
        int i8;
        int i9 = 0;
        if ((i7 & 1) != 0) {
            i8 = 0;
        } else {
            i8 = 1;
        }
        if ((i7 & 2) == 0) {
            i9 = 16;
        }
        if (i8 <= 0 && i9 <= 0 && enumC1546a != EnumC1546a.f10128e) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC1546a).toString());
        }
        int i10 = i9 + i8;
        if (i10 < 0) {
            i10 = Integer.MAX_VALUE;
        }
        return new C1718s(i8, i10, enumC1546a);
    }

    /* renamed from: b */
    public static final C1701c0 m2771b(Object obj) {
        if (obj == null) {
            obj = AbstractC1821c.f10872b;
        }
        return new C1701c0(obj);
    }

    /* renamed from: c */
    public static final void m2772c(Object[] objArr, long j6, Object obj) {
        objArr[((int) j6) & (objArr.length - 1)] = obj;
    }

    /* renamed from: d */
    public static final Object m2773d(InterfaceC1702d interfaceC1702d, InterfaceC3281e interfaceC3281e, AbstractC2590j abstractC2590j) {
        int i7 = AbstractC1709j.f10523a;
        C1708i c1708i = new C1708i(interfaceC3281e, null);
        C2319i c2319i = C2319i.f13273e;
        EnumC1546a enumC1546a = EnumC1546a.f10128e;
        Object mo35f = new C1828j(c1708i, interfaceC1702d, c2319i, -2, enumC1546a).mo2753m(c2319i, 0, enumC1546a).mo35f(C1833o.f10896e, abstractC2590j);
        C1694m c1694m = C1694m.f10482a;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (mo35f != enumC2465a) {
            mo35f = c1694m;
        }
        if (mo35f == enumC2465a) {
            return mo35f;
        }
        return c1694m;
    }

    /* renamed from: e */
    public static final InterfaceC1702d m2774e(InterfaceC1702d interfaceC1702d) {
        if (interfaceC1702d instanceof InterfaceC1697a0) {
            return interfaceC1702d;
        }
        if (interfaceC1702d instanceof C1700c) {
            return interfaceC1702d;
        }
        return new C1700c(interfaceC1702d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (r10 == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0052, B:20:0x0067, B:22:0x006f, B:32:0x0047, B:34:0x004e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v2, types: [g6.f, k5.c, m5.c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v9, types: [f6.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g6.e] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [f6.q] */
    /* JADX WARN: Type inference failed for: r8v7, types: [f6.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2775f(InterfaceC1704e interfaceC1704e, C1560o c1560o, boolean z7, AbstractC2583c abstractC2583c) {
        ?? r02;
        int i7;
        CancellationException cancellationException;
        C1560o c1560o2;
        C1547b c1547b;
        ?? r12;
        ?? r10;
        Object m2476b;
        try {
            if (abstractC2583c instanceof C1705f) {
                C1705f c1705f = (C1705f) abstractC2583c;
                int i8 = c1705f.f10509m;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c1705f.f10509m = i8 - Integer.MIN_VALUE;
                    r02 = c1705f;
                    Object obj = r02.f10508l;
                    i7 = r02.f10509m;
                    cancellationException = null;
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (i7 == 0) {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                z7 = r02.f10507k;
                                c1547b = r02.f10506j;
                                ?? r8 = r02.f10505i;
                                InterfaceC1704e interfaceC1704e2 = r02.f10504h;
                                AbstractC1793a0.m2972L(obj);
                                InterfaceC1704e interfaceC1704e3 = interfaceC1704e2;
                                C1560o c1560o3 = r8;
                                r10 = c1547b;
                                interfaceC1704e = interfaceC1704e3;
                                c1560o = c1560o3;
                                r02.f10504h = interfaceC1704e;
                                r02.f10505i = c1560o;
                                r02.f10506j = r10;
                                r02.f10507k = z7;
                                r02.f10509m = 1;
                                m2476b = r10.m2476b(r02);
                                if (m2476b == enumC2465a) {
                                    r12 = interfaceC1704e;
                                    c1547b = r10;
                                    obj = m2476b;
                                    c1560o2 = c1560o;
                                    if (!((Boolean) obj).booleanValue()) {
                                        Object m2477c = c1547b.m2477c();
                                        r02.f10504h = r12;
                                        r02.f10505i = c1560o2;
                                        r02.f10506j = c1547b;
                                        r02.f10507k = z7;
                                        r02.f10509m = 2;
                                        Object mo160h = r12.mo160h(m2477c, r02);
                                        interfaceC1704e3 = r12;
                                        c1560o3 = c1560o2;
                                    } else {
                                        if (z7) {
                                            c1560o2.mo2489c(null);
                                        }
                                        return C1694m.f10482a;
                                    }
                                } else {
                                    return enumC2465a;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            z7 = r02.f10507k;
                            c1547b = r02.f10506j;
                            ?? r82 = r02.f10505i;
                            InterfaceC1704e interfaceC1704e4 = r02.f10504h;
                            AbstractC1793a0.m2972L(obj);
                            r12 = interfaceC1704e4;
                            c1560o2 = r82;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        C1547b it = c1560o.iterator();
                        c1560o = c1560o;
                        r10 = it;
                        r02.f10504h = interfaceC1704e;
                        r02.f10505i = c1560o;
                        r02.f10506j = r10;
                        r02.f10507k = z7;
                        r02.f10509m = 1;
                        m2476b = r10.m2476b(r02);
                        if (m2476b == enumC2465a) {
                        }
                    }
                }
            }
            if (i7 == 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z7) {
                    if (th instanceof CancellationException) {
                        cancellationException = th;
                    }
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    c1560o.mo2489c(cancellationException);
                }
                throw th2;
            }
        }
        r02 = new AbstractC2583c(abstractC2583c);
        Object obj2 = r02.f10508l;
        i7 = r02.f10509m;
        cancellationException = null;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, u5.v] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2776g(InterfaceC1702d interfaceC1702d, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        C1711l c1711l;
        int i7;
        InterfaceC3281e interfaceC3281e2;
        C3379v c3379v;
        C1819a e7;
        C0600d0 c0600d0;
        Object obj;
        C1279sl c1279sl = AbstractC1821c.f10872b;
        if (abstractC2583c instanceof C1711l) {
            C1711l c1711l2 = (C1711l) abstractC2583c;
            int i8 = c1711l2.f10533l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1711l2.f10533l = i8 - Integer.MIN_VALUE;
                c1711l = c1711l2;
                Object obj2 = c1711l.f10532k;
                i7 = c1711l.f10533l;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c0600d0 = c1711l.f10531j;
                        c3379v = c1711l.f10530i;
                        interfaceC3281e2 = (InterfaceC3281e) c1711l.f10529h;
                        try {
                            AbstractC1793a0.m2972L(obj2);
                        } catch (C1819a e8) {
                            e7 = e8;
                            if (e7.f10866e != c0600d0) {
                                throw e7;
                            }
                            obj = c3379v.f16451e;
                            if (obj == c1279sl) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj2);
                    ?? obj3 = new Object();
                    obj3.f16451e = c1279sl;
                    C0600d0 c0600d02 = new C0600d0(2, interfaceC3281e, (Object) obj3);
                    try {
                        c1711l.f10529h = (AbstractC2590j) interfaceC3281e;
                        c1711l.f10530i = obj3;
                        c1711l.f10531j = c0600d02;
                        c1711l.f10533l = 1;
                        Object mo35f = interfaceC1702d.mo35f(c0600d02, c1711l);
                        Object obj4 = EnumC2465a.f13750e;
                        if (mo35f == obj4) {
                            return obj4;
                        }
                        interfaceC3281e2 = interfaceC3281e;
                        c3379v = obj3;
                    } catch (C1819a e9) {
                        interfaceC3281e2 = interfaceC3281e;
                        c3379v = obj3;
                        e7 = e9;
                        c0600d0 = c0600d02;
                        if (e7.f10866e != c0600d0) {
                        }
                        obj = c3379v.f16451e;
                        if (obj == c1279sl) {
                        }
                    }
                }
                obj = c3379v.f16451e;
                if (obj == c1279sl) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + interfaceC3281e2);
            }
        }
        c1711l = new AbstractC2583c(abstractC2583c);
        Object obj22 = c1711l.f10532k;
        i7 = c1711l.f10533l;
        if (i7 == 0) {
        }
        obj = c3379v.f16451e;
        if (obj == c1279sl) {
        }
    }

    /* renamed from: h */
    public static final C1715p m2777h(C0019e1 c0019e1, C2090c c2090c, C1725z c1725z, Float f7) {
        EnumC0519b0 enumC0519b0;
        AbstractC0515a abstractC0515a;
        InterfaceC1552g.f10167a.getClass();
        C1551f c1551f = C1551f.f10165a;
        C0068q2 c0068q2 = new C0068q2(8, c0019e1, C2319i.f13273e);
        C1701c0 m2771b = m2771b(f7);
        InterfaceC2318h interfaceC2318h = (InterfaceC2318h) c0068q2.f345g;
        InterfaceC1702d interfaceC1702d = (InterfaceC1702d) c0068q2.f344f;
        if (c1725z.equals(C1722w.f10564a)) {
            enumC0519b0 = EnumC0519b0.f1844e;
        } else {
            enumC0519b0 = EnumC0519b0.f1847h;
        }
        C0334d c0334d = new C0334d(c1725z, interfaceC1702d, m2771b, f7, (InterfaceC2313c) null, 19);
        InterfaceC2318h m1142t = AbstractC0525d0.m1142t(c2090c, interfaceC2318h);
        if (enumC0519b0 == EnumC0519b0.f1845f) {
            abstractC0515a = new C0544j1(m1142t, c0334d);
        } else {
            abstractC0515a = new AbstractC0515a(m1142t, true);
        }
        abstractC0515a.m1110l0(enumC0519b0, abstractC0515a, c0334d);
        return new C1715p(m2771b);
    }
}
