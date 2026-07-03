package p176x;

import p027d1.C0465c;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p068i5.AbstractC2080d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p101n0.C2705e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x.c */
/* loaded from: classes.dex */
public final class C3788c {

    /* renamed from: a */
    public final C2705e f17948a = new C2705e(new C3789d[16]);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (r8 < r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5819a(C0465c c0465c, AbstractC2583c abstractC2583c) {
        C3787b c3787b;
        int i7;
        int i8;
        C0465c c0465c2;
        int i9;
        Object[] objArr;
        if (abstractC2583c instanceof C3787b) {
            c3787b = (C3787b) abstractC2583c;
            int i10 = c3787b.f17947n;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3787b.f17947n = i10 - Integer.MIN_VALUE;
                Object obj = c3787b.f17945l;
                i7 = c3787b.f17947n;
                if (i7 == 0) {
                    if (i7 == 1) {
                        i9 = c3787b.f17944k;
                        i8 = c3787b.f17943j;
                        objArr = c3787b.f17942i;
                        C0465c c0465c3 = c3787b.f17941h;
                        AbstractC1793a0.m2972L(obj);
                        c0465c2 = c0465c3;
                        i9++;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2705e c2705e = this.f17948a;
                    i8 = c2705e.f14519g;
                    if (i8 > 0) {
                        Object[] objArr2 = c2705e.f14517e;
                        c0465c2 = c0465c;
                        i9 = 0;
                        objArr = objArr2;
                        C3789d c3789d = (C3789d) objArr[i9];
                        c3787b.f17941h = c0465c2;
                        c3787b.f17942i = objArr;
                        c3787b.f17943j = i8;
                        c3787b.f17944k = i9;
                        c3787b.f17947n = 1;
                        Object m3382J = AbstractC2080d.m3382J(c3789d, c0465c2, c3787b);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (m3382J == enumC2465a) {
                            return enumC2465a;
                        }
                        i9++;
                    }
                    return C1694m.f10482a;
                }
            }
        }
        c3787b = new C3787b(this, abstractC2583c);
        Object obj2 = c3787b.f17945l;
        i7 = c3787b.f17947n;
        if (i7 == 0) {
        }
    }
}
