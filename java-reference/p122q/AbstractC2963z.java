package p122q;

import p024c6.C0441h;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2581a;
import p098m5.AbstractC2583c;
import p117p1.AbstractC2866q;
import p117p1.C2855g0;
import p117p1.C2859j;
import p117p1.C2861l;
import p117p1.C2867r;
import p117p1.C2868s;
import p117p1.EnumC2860k;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.C3378u;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.z */
/* loaded from: classes.dex */
public abstract class AbstractC2963z {

    /* renamed from: a */
    public static final float f15361a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (p027d1.C0464b.m1006b(p117p1.AbstractC2866q.m4546e(r6, true), 0) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5, types: [u5.u, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005c -> B:10:0x005f). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4603a(C2855g0 c2855g0, long j6, AbstractC2583c abstractC2583c) {
        C2945t c2945t;
        int i7;
        C3378u c3378u;
        C2855g0 c2855g02;
        Object m4514a;
        Object obj;
        Object obj2;
        Object obj3;
        if (abstractC2583c instanceof C2945t) {
            C2945t c2945t2 = (C2945t) abstractC2583c;
            int i8 = c2945t2.f15281k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2945t2.f15281k = i8 - Integer.MIN_VALUE;
                c2945t = c2945t2;
                Object obj4 = c2945t.f15280j;
                i7 = c2945t.f15281k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        C3378u c3378u2 = c2945t.f15279i;
                        C2855g0 c2855g03 = c2945t.f15278h;
                        AbstractC1793a0.m2972L(obj4);
                        C3378u c3378u3 = c3378u2;
                        C2855g0 c2855g04 = c2855g03;
                        C2859j c2859j = (C2859j) obj4;
                        ?? r14 = c2859j.f14991a;
                        int size = r14.size();
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                obj2 = r14.get(i10);
                                if (C2867r.m4548a(((C2868s) obj2).f15006a, c3378u3.f16450e)) {
                                    break;
                                }
                                i10++;
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        C2868s c2868s = (C2868s) obj2;
                        if (c2868s == null) {
                            if (AbstractC2866q.m4544c(c2868s)) {
                                ?? r142 = c2859j.f14991a;
                                int size2 = r142.size();
                                while (true) {
                                    if (i9 < size2) {
                                        obj3 = r142.get(i9);
                                        if (((C2868s) obj3).f15009d) {
                                            break;
                                        }
                                        i9++;
                                    } else {
                                        obj3 = null;
                                        break;
                                    }
                                }
                                C2868s c2868s2 = (C2868s) obj3;
                                if (c2868s2 != null) {
                                    c3378u3.f16450e = c2868s2.f15006a;
                                    c3378u = c3378u3;
                                    c2855g02 = c2855g04;
                                    c2945t.f15278h = c2855g02;
                                    c2945t.f15279i = c3378u;
                                    c2945t.f15281k = 1;
                                    m4514a = c2855g02.m4514a(EnumC2860k.f14996f, c2945t);
                                    obj = EnumC2465a.f13750e;
                                    if (m4514a != obj) {
                                        return obj;
                                    }
                                    C3378u c3378u4 = c3378u;
                                    obj4 = m4514a;
                                    c3378u3 = c3378u4;
                                    c2855g04 = c2855g02;
                                }
                            }
                            C2859j c2859j2 = (C2859j) obj4;
                            ?? r143 = c2859j2.f14991a;
                            int size3 = r143.size();
                            int i92 = 0;
                            int i102 = 0;
                            while (true) {
                                if (i102 >= size3) {
                                }
                                i102++;
                            }
                            C2868s c2868s3 = (C2868s) obj2;
                            if (c2868s3 == null) {
                                c2868s3 = null;
                            }
                        }
                        if (c2868s3 == null || c2868s3.m4551b()) {
                            return null;
                        }
                        return c2868s3;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj4);
                if (!m4606d(c2855g0.f14969j.f14986x, j6)) {
                    ?? obj5 = new Object();
                    obj5.f16450e = j6;
                    c2855g02 = c2855g0;
                    c3378u = obj5;
                    c2945t.f15278h = c2855g02;
                    c2945t.f15279i = c3378u;
                    c2945t.f15281k = 1;
                    m4514a = c2855g02.m4514a(EnumC2860k.f14996f, c2945t);
                    obj = EnumC2465a.f13750e;
                    if (m4514a != obj) {
                    }
                }
                return null;
            }
        }
        c2945t = new AbstractC2583c(abstractC2583c);
        Object obj42 = c2945t.f15280j;
        i7 = c2945t.f15281k;
        if (i7 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, u5.v, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, u5.v, java.io.Serializable] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4604b(C2855g0 c2855g0, long j6, AbstractC2581a abstractC2581a) {
        C2948u c2948u;
        int i7;
        Object obj;
        C2868s c2868s;
        C3379v c3379v;
        C2868s c2868s2;
        if (abstractC2581a instanceof C2948u) {
            C2948u c2948u2 = (C2948u) abstractC2581a;
            int i8 = c2948u2.f15293k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2948u2.f15293k = i8 - Integer.MIN_VALUE;
                c2948u = c2948u2;
                Object obj2 = c2948u.f15292j;
                i7 = c2948u.f15293k;
                InterfaceC2313c interfaceC2313c = null;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c3379v = c2948u.f15291i;
                        c2868s = c2948u.f15290h;
                        try {
                            AbstractC1793a0.m2972L(obj2);
                            return null;
                        } catch (C2861l unused) {
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj2);
                    if (!m4606d(c2855g0.f14969j.f14986x, j6)) {
                        ?? r11 = c2855g0.f14969j.f14986x.f14991a;
                        int size = r11.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 < size) {
                                obj = r11.get(i9);
                                if (C2867r.m4548a(((C2868s) obj).f15006a, j6)) {
                                    break;
                                }
                                i9++;
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        c2868s = (C2868s) obj;
                        if (c2868s != null) {
                            ?? obj3 = new Object();
                            ?? obj4 = new Object();
                            obj4.f16451e = c2868s;
                            long mo5293c = c2855g0.m4517f().mo5293c();
                            try {
                                InterfaceC3281e c0441h = new C0441h(obj4, obj3, interfaceC2313c, 1);
                                c2948u.f15290h = c2868s;
                                c2948u.f15291i = obj3;
                                c2948u.f15293k = 1;
                                Object m4519g = c2855g0.m4519g(mo5293c, c0441h, c2948u);
                                Object obj5 = EnumC2465a.f13750e;
                                if (m4519g == obj5) {
                                    return obj5;
                                }
                            } catch (C2861l unused2) {
                                c3379v = obj3;
                            }
                        }
                    }
                    return null;
                }
                c2868s2 = (C2868s) c3379v.f16451e;
                if (c2868s2 == null) {
                    return c2868s2;
                }
                return c2868s;
            }
        }
        c2948u = new AbstractC2583c(abstractC2581a);
        Object obj22 = c2948u.f15292j;
        i7 = c2948u.f15293k;
        InterfaceC2313c interfaceC2313c2 = null;
        if (i7 == 0) {
        }
        c2868s2 = (C2868s) c3379v.f16451e;
        if (c2868s2 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4605c(C2855g0 c2855g0, long j6, InterfaceC3279c interfaceC3279c, AbstractC2581a abstractC2581a) {
        C2960y c2960y;
        int i7;
        EnumC2465a enumC2465a;
        C2868s c2868s;
        if (abstractC2581a instanceof C2960y) {
            C2960y c2960y2 = (C2960y) abstractC2581a;
            int i8 = c2960y2.f15356k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2960y2.f15356k = i8 - Integer.MIN_VALUE;
                c2960y = c2960y2;
                Object obj = c2960y.f15355j;
                i7 = c2960y.f15356k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        InterfaceC3279c interfaceC3279c2 = c2960y.f15354i;
                        C2855g0 c2855g02 = c2960y.f15353h;
                        AbstractC1793a0.m2972L(obj);
                        interfaceC3279c = interfaceC3279c2;
                        c2855g0 = c2855g02;
                        c2868s = (C2868s) obj;
                        if (c2868s == null) {
                            if (AbstractC2866q.m4544c(c2868s)) {
                                return Boolean.TRUE;
                            }
                            interfaceC3279c.mo23f(c2868s);
                            j6 = c2868s.f15006a;
                            c2960y.f15353h = c2855g0;
                            c2960y.f15354i = interfaceC3279c;
                            c2960y.f15356k = 1;
                            obj = m4603a(c2855g0, j6, c2960y);
                            enumC2465a = EnumC2465a.f13750e;
                            if (obj == enumC2465a) {
                                return enumC2465a;
                            }
                            c2868s = (C2868s) obj;
                            if (c2868s == null) {
                                return Boolean.FALSE;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c2960y.f15353h = c2855g0;
                    c2960y.f15354i = interfaceC3279c;
                    c2960y.f15356k = 1;
                    obj = m4603a(c2855g0, j6, c2960y);
                    enumC2465a = EnumC2465a.f13750e;
                    if (obj == enumC2465a) {
                    }
                    c2868s = (C2868s) obj;
                    if (c2868s == null) {
                    }
                }
            }
        }
        c2960y = new AbstractC2583c(abstractC2581a);
        Object obj2 = c2960y.f15355j;
        i7 = c2960y.f15356k;
        if (i7 == 0) {
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.lang.Object] */
    /* renamed from: d */
    public static final boolean m4606d(C2859j c2859j, long j6) {
        Object obj;
        ?? r62 = c2859j.f14991a;
        int size = r62.size();
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                obj = r62.get(i7);
                if (C2867r.m4548a(((C2868s) obj).f15006a, j6)) {
                    break;
                }
                i7++;
            } else {
                obj = null;
                break;
            }
        }
        C2868s c2868s = (C2868s) obj;
        if (c2868s != null && c2868s.f15009d) {
            z7 = true;
        }
        return true ^ z7;
    }
}
